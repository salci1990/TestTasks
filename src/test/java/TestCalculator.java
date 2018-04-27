import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

   StringCalculator calc;


   @Before
   public void setupTest(){
       calc = new StringCalculator();
   }
    @Test
    public void testEmptyString() {
        int result = calc.add("");
        assertEquals(0, result);
    }
    @Test
    public void testOneNumber() {
        int result = calc.add("7");
        assertEquals(7, result);
    }
    @Test
    public void testTwoNumber() {
        int result = calc.add("3,5");
        assertEquals(8, result);
    }
    @Test
    public void testFiveNumbers() {
       int result = calc.add("3,4,2,1,4");
       assertEquals(14, result);
    }
    @Test

    public void testDelimeterChar() {
       int result = calc.add("1\n2,3");
       assertEquals(6, result);
    }
    @Test(expected = NegativNumberException.class)
    public void testExceptionForNegativNumbers(){
        int result = calc.add("1,2,3,-4");



    }
}
