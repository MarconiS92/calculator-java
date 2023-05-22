import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {

    public static void main(String[] args) {
        testCalculate();
    }

    public static void testCalculate() {
        List<Float> numbers = new ArrayList<>(Arrays.asList(4.0f, 5.0f));
        List<String> operations = new ArrayList<>(Arrays.asList("+"));

        // Pozivamo metodu Calculate direktno iz klase Calculator
        // Morao sam u klasi Calculator da ispravim metodu Calculate iz private u public kako bih uspeo da je pozovem.
        
        Calculator.Calculate(numbers, operations);

        // Provera rezultata
        float expected = 9.0f;
        float actual = Calculator.finalResult;

        if (expected == actual) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }
}