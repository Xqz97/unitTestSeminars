package seminar3Test.task1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminar3.task1.SomeService;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class SomeServiceTest {

    SomeService fizzB;
    // Каждый раз перед тестом создаем новый экземпляр класса.
    @BeforeEach
    public void initEach(){
        fizzB = new SomeService();
    }

    @ParameterizedTest
    @ValueSource(ints = {33, 6, 12 , 3})
    void fizzBuzzWorksCorrectlyWithThree(int i){
        assertThat(fizzB.fizzBuzzСonditions(i)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 25, 40})
    void fizzBuzzWorksCorrectlyWithFive(int i){
        assertThat(fizzB.fizzBuzzСonditions(i)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {30, 45, 75, 90})
    void fizzBuzzWorksCorrectlyWithFifteen(int i){
        assertThat(fizzB.fizzBuzzСonditions(i)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 22, 19})
    void fizzBuzzWorksCorrectlyWithNo(int i){
        assertThat(fizzB.fizzBuzzСonditions(i)).isEqualTo(String.valueOf(i));
    }

    @Test
    void firstLast6WorksCorrectlyWithFirst(){
        int[] arr = new int[] {6,2,3,4,1};
        assertThat(fizzB.firstOrLast6(arr)).isTrue();
    }

    @Test
    void firstLast6WorksCorrectlyWithLust(){
        int[] arr = new int[] {1,2,3,4,6};
        assertThat(fizzB.firstOrLast6(arr)).isTrue();
    }

    @Test
    void firstLast6WorksCorrectlyWithNo6(){
        int[] arr = new int[] {1,2,3,4,1};
        assertThat(fizzB.firstOrLast6(arr)).isFalse();
    }

    @Test
    void luckySumTest1(){
        assertThat(fizzB.luckySum(1,13,1)).isEqualTo(2);
    }
}

