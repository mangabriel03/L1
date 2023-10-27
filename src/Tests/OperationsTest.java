package Tests;//package Tests;
//import Main.Operations;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class OperationsTest {
//
//    private static final String SHOULD_BE_EQUAL = "Should be equal";
//    private static final String SHOULD_THROW_EXCEPTION = "Should throw exception";
//    private final int[] EMPTY_ARRAY = new int[0];
//
//    Operations operations = new Operations();
//
//    public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
//    public int length = arr.length;
//
//
//    @Test
//    void getMaxTest(){
//        //    public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
//        Operations operations = new Operations();
//        assertEquals(operations.arr[7],operations.getMax(EMPTY_ARRAY));
//        assertThrows(RuntimeException.class, () -> operations.getMax(EMPTY_ARRAY), SHOULD_THROW_EXCEPTION);
//    }
//
//    @Test
//    void getMinTest(){
//        //public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
//
//        Operations operations = new Operations();
//        assertEquals(operations.arr[0],operations.getMin());
//    }
//
//
//
//    @Test
//    void maxSumTest(){
//        //public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
//
//        Operations operations = new Operations();
//        assertEquals(141.8,operations.maxSum());
//    }
//    @Test
//    void minSumTest(){
//        //public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
//
//        Operations operations = new Operations();
//        assertEquals(42.5,operations.minSum());
//
//    }
//
//}



import Main.Operations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperationsTest {
    private Operations operations;

    @BeforeEach
    public void setUp() {
        operations = new Operations();
    }

    @Test
    public void testGetMax() {
        double[] testArray = {1, 2.5, 4.2, 4.3, 9, 1.1, 13, 100.3, 7.4};
        double expectedMax = 100.3;
        double actualMax = operations.getMax(testArray);
        assertEquals(expectedMax, actualMax, 0.01); // Folosim 0.01 pentru a trata erorile de virgulă mobilă
    }

    @Test
    public void testGetMin() {
        double[] testArray = {1, 2.5, 4.2, 4.3, 9, 1.1, 13, 100.3, 7.4};
        double expectedMin = 1.0;
        double actualMin = operations.getMin(testArray);
        assertEquals(expectedMin, actualMin, 0.01);
    }

    @Test
    public void testMaxSum() {
        double[] testArray = {1, 2.5, 4.2, 4.3, 9, 1.1, 13, 100.3, 7.4};
        double expectedSum = 141.8; // (2.5 + 4.2 + 4.3 + 9 + 1.1 + 13 + 7.4)
        double actualSum = operations.maxSum(testArray);
        assertEquals(expectedSum, actualSum, 0.01);
    }

    @Test
    public void testMinSum() {
        double[] testArray = {1, 2.5, 4.2, 4.3, 9, 1.1, 13, 100.3, 7.4};
        double expectedSum = 42.5; // (2.5 + 4.2 + 4.3 + 9 + 1.1 + 13 + 100.3)
        double actualSum = operations.minSum(testArray);
        assertEquals(expectedSum, actualSum, 0.01);
    }

    @Test
    public void testInvalidGetMax() {
        double[] testArray = {};
        assertThrows(RuntimeException.class, () -> operations.getMax(testArray));
    }

    @Test
    public void testInvalidGetMin() {
        double[] testArray = {};
        assertThrows(RuntimeException.class, () -> operations.getMin(testArray));
    }

    @Test
    public void testInvalidMaxSum() {
        double[] testArray = {};
        assertThrows(RuntimeException.class, () -> operations.maxSum(testArray));
    }

    @Test
    public void testInvalidMinSum() {
        double[] testArray = {};
        assertThrows(RuntimeException.class, () -> operations.minSum(testArray));
    }

}

