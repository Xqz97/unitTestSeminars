package seminar2Test.hw;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminar2.hw.Car;
import seminar2.hw.Motorcycle;
import seminar2.hw.Vehicle;
import seminar2.task0.Cart;
import seminar2.task0.Shop;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class VehicleTest {


    @Test
    public void testCarIsInstanceOfVehicle() {
        Vehicle car = new Car("Tesla", "X", 2012);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarNumOfVehicle() {
        Car car = new Car("Tesla", "X", 2012);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "215", 20120);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testCarSpeed() {
        Car car = new Car("Tesla", "X", 2012);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testMotorcycleSpeed() {
        Motorcycle moto = new Motorcycle("Yamaha", "215", 20120);
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testCarParSpeed() {
        Car car = new Car("Tesla", "X", 2012);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testMotorcycleParkSpeed() {
        Motorcycle moto = new Motorcycle("Yamaha", "215", 20120);
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}
