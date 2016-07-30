import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tests {
    private static final int VALUE = 5;
    private Clazz clazz = new Clazz();
    
    @Test
    public void getterMustReturnWhatWasSet() {
        clazz.setNum(VALUE);
        int num = clazz.getNum();
        assertEquals("The num must be "+VALUE, VALUE, num);
    }

    @Test
    public void shouldReturnPositive() {
        int result = clazz.compareWithThreshold(156);
        assertEquals("The result of compareWithThreshold() must be positive", 1, result);
    }
    
    @Test
    public void shouldReturnNil() {
        int result = clazz.compareWithThreshold(55);
        assertEquals("The result of compareWithThreshold() must be nil", 0, result);
    }
    
    @Test
    public void shouldReturnNegative() {
        int result = clazz.compareWithThreshold(11);
        assertEquals("The result of compareWithThreshold() must be negative", -1, result);
    }

    //Tests induced by the mutating tests
    //@Test
    //public void shouldReturnPositiveOnTheEdge() {
    //    clazz.setNum(55);
    //    int result = clazz.compareWithThreshold();
    //    assertEquals("The result of compareWithThreshold() must be positive", 1, result);
    //}
}
