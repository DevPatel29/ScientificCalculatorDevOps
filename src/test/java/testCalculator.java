import static org.junit.Assert.*;
import org.junit.Test;

public class testCalculator {
    private static final double DELTA = 1e-15;
    Calculator cal;

    @Test
    public void SQrootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, cal.SquareRoot(4), DELTA);
        assertEquals("Finding square root for True Positive", 1, cal.SquareRoot(1), DELTA);
    }

    @Test
    public void SQrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, cal.SquareRoot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, cal.SquareRoot(4), DELTA);
    }

    @Test
    public void FactorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 120, cal.Factorial(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, cal.Factorial(4), DELTA);
    }

    @Test
    public void factoriaFactorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, cal.Factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, cal.Factorial(3), DELTA);
    }

    @Test
    public void NaturalLogTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, cal.NaturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, cal.NaturalLog(1), DELTA);
    }

    @Test
    public void NaturalLogFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, cal.NaturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, cal.NaturalLog(2.1), DELTA);
    }

    @Test
    public void PowerTruePositive(){
        assertEquals("Finding power for True Positive", 8, cal.Power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, cal.Power(4, 3), DELTA);
    }

    @Test
    public void PowerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, cal.Power(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, cal.Power(2, 3), DELTA);
    }
}