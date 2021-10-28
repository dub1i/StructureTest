import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void sum_of_two_numbers() {

        //Arrange
        double first = 10;
        double second = 20;
        var sut = new Calculator();

        //Act
        double result = sut.sum(first, second);

        //Assert
        Assertions.assertEquals(30, result);
    }


    @Test
    public void sum_of_two_numbersOne() {


        double first = 10;
        double second = 20;
        var calc = new Calculator();

        double result = calc.sum(first, second);

        Assertions.assertEquals(30, result);
    }
}
