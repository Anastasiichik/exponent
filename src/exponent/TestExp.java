package exponent;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * @author Anastasia
 */
public class TestExp {
    @Test(expected = Exception.class)
    public void testE(){
        exp val1 = new exp(2);
        exp val2 = new exp(3);
        exp ex = new exp(8);
        exp res = val1.st(val2);
        
        
        assertEquals(res,ex);
        assertEquals(new exp(4).st(new exp(2)),new exp(16));
        assertNotNull(val1);
        assertNotNull(val2);
       
    }
}
