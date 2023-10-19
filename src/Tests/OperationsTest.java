package Tests;
import Main.Operations;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OperationsTest {

    private static final String SHOULD_BE_EQUAL = "Should be equal";
    private static final String SHOULD_THROW_EXCEPTION = "Should throw exception";
    private final int[] EMPTY_ARRAY = new int[0];

    @Test
    void getMaxTest(){
        //    public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
        Operations operations = new Operations();
        assertEquals(operations.arr[7],operations.getMax());
        try{
            assertEquals(operations.arr[1], operations.getMax());
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
        //assertThrows(RuntimeException.class, () -> operations.getMax(), SHOULD_BE_EQUAL);
    }

    @Test
    void getMinTest(){
        //public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};

        Operations operations = new Operations();
        assertEquals(operations.arr[0],operations.getMin());
        try{
            assertEquals(operations.arr[1], operations.getMin());
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
        //assertThrows(RuntimeException.class, () -> operations.getMin(), SHOULD_BE_EQUAL);
    }

    @Test
    void maxSumTest(){
        //public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};

        Operations operations = new Operations();
        assertEquals(141.8,operations.maxSum());
        try{
            assertEquals(1993, operations.maxSum());
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
        //assertThrows(RuntimeException.class, () -> operations.maxSumTest(), SHOULD_BE_EQUAL);
    }

    @Test
    void minSumTest(){
        //public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};

        Operations operations = new Operations();
        assertEquals(42.5,operations.minSum());
        try{
            assertEquals(-123, operations.minSum());
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
        //assertThrows(RuntimeException.class, () -> operations.minSumTest(), SHOULD_BE_EQUAL);
    }

}
