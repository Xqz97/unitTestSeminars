package seminar4.card;

import org.junit.jupiter.api.Test;
import seminar4.card.CreditCard;

import static org.mockito.Mockito.*;

class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */

    @Test
    void testPaymentForm(){
        CreditCard card = mock(CreditCard.class);
        when(card.getCardNumber()).thenReturn("12345678");
        when(card.getCardHolder()).thenReturn("Test Name");
        when(card.getExpiryDate()).thenReturn("65/25");
        when(card.getCvv()).thenReturn("123");

        PaymentForm paymentForm = new PaymentForm(card);
        paymentForm.pay(100);
        // проверка поведения mock объекта. Реально ли с карты списалась нужна сумма.
        // times  показывает сколько раз произвести функцию.
        verify(card, times(1)).charge(100);
    }


}