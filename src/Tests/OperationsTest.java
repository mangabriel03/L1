package Tests;
import Main.Operations;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest {

    private static final String SHOULD_BE_EQUAL = "Should be equal";
    private static final String SHOULD_THROW_EXCEPTION = "Should throw exception";
    private final int[] EMPTY_ARRAY = new int[0];

    Operations operations = new Operations();

    public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
    public int length = arr.length;


    @Test
    void getMaxTest(){
        //    public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
        Operations operations = new Operations();
        assertEquals(operations.arr[7],operations.getMax());
    }

    @Test
    void getMinTest(){
        //public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};

        Operations operations = new Operations();
        assertEquals(operations.arr[0],operations.getMin());
    }



    @Test
    void maxSumTest(){
        //public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};

        Operations operations = new Operations();
        assertEquals(141.8,operations.maxSum());
    }
    @Test
    void minSumTest(){
        //public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};

        Operations operations = new Operations();
        assertEquals(42.5,operations.minSum());

    }

}
