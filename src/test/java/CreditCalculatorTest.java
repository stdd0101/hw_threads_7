import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditCalculatorTest {

    @Test
    public void testGetMonthlyPayment()
    {
        CreditCalculator calculator =  new CreditCalculator(1000000, 36, 20);
        assertTrue(33214 == (int) calculator.getMonthlyPayment());
    }

    @Test
    public void testGetTotalAmount()
    {
        CreditCalculator calculator =  new CreditCalculator(1000000, 36, 20);
        assertTrue(1195704 == (int) calculator.getTotalAmount());
    }

    @Test
    public void testGetOverpayment()
    {
        CreditCalculator calculator =  new CreditCalculator(1000000, 36, 20);
        assertTrue(195704 == (int) calculator.getOverpayment());
    }
}
