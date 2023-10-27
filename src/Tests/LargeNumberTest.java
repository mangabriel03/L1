package Tests;
import Main.LargeNumber;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class LargeNumberTest {
    LargeNumber lg = new LargeNumber();
    int[] nr1 = new int[] {1,2,3,6};
    int[] nr2 = new int[] {5,3,8,9};

    int nr3 = 3;

    private int[] arrayException;

    @Test
    public void testSumWithInvalidData() {
        int[] nr1 = {1, 2, 3};
        int[] nr2 = {};
        assertThrows(IllegalArgumentException.class, () -> lg.sum(nr1, nr2));
    }

    @Test
    public void testDifWithInvalidData() {
        int[] nr1 = {5, 6, 7, 8};
        int[] nr2 = {};
        assertThrows(IllegalArgumentException.class, () -> lg.dif(nr1, nr2));
    }

    @Test
    public void testMulWithInvalidData() {
        int[] nr1 = {2, 3, 4, 5};
        int nr2 = -2;
        assertThrows(IllegalArgumentException.class, () -> lg.mul(nr1, nr2));
    }

    @Test
    public void testDivWithInvalidData() {
        int[] nr1 = {6, 7, 8, 9};
        int nr2 = 0;
        assertThrows(IllegalArgumentException.class, () -> lg.div(nr1, nr2));
    }


    @Test
    public void sumTest(){
//        LargeNumber lg = new LargeNumber();
//        int[] nr1 = new int[] {1,2,3,6};
//        int[] nr2 = new int[] {5,3,8,9};
        int[] sum = {6,6,2,5};
        assertEquals(Arrays.toString(sum), Arrays.toString(lg.sum(nr1,nr2)) );
//        int[] sumGresita = {1,1,1,1};
//        try{
//            assertEquals((Arrays.toString(sumGresita)),Arrays.toString(lg.sum(nr1,nr2)));
//        } catch (AssertionError e ){
//            System.out.println(e.getMessage());
//        }
    }

    @Test
    public void difTest(){
        LargeNumber lg = new LargeNumber();
        int[] nr1 = new int[] {9,5,9,9};
        int[] nr2 = new int[] {5,3,8,9};
        int[] dif = {4,2,1,0};
        assertEquals(Arrays.toString(dif), Arrays.toString(lg.dif(nr1,nr2)) );
        int[] difGresita = {1,1,1,1};
        try{
            assertEquals((Arrays.toString(difGresita)),Arrays.toString(lg.sum(nr1,nr2)));
        } catch (AssertionError e ){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void mulTest(){
        LargeNumber lg = new LargeNumber();
        int[] nr1 = new int[] {1,2,3,6};
        int nr2 = 2;
        int[] mul = {2,4,7,2};
        assertEquals(Arrays.toString(mul), Arrays.toString(lg.mul(nr1,nr2)) );
        int[] mulGreita = {1,1,1,1};
        try{
            assertEquals(mulGreita,lg.mul(nr1,nr2));
        } catch (AssertionError e ) {
            System.out.println(e.getMessage());
        }
//        try{
//            assertEquals((Arrays.toString(mulGreita)),Arrays.toString(lg.sum(nr1,nr2)));
//        } catch (AssertionError e ){
//            System.out.println(e.getMessage());
//        }
    }

    @Test
    public void divTest() {
        LargeNumber lg = new LargeNumber();
        int[] nr1 = new int[]{1, 2, 3, 6};
        int nr2 = 2;
        int[] div = {6, 1, 8};
        assertEquals(Arrays.toString(div), Arrays.toString(lg.div(nr1, nr2)));
        int[] mulGreita = {1, 1, 1, 1};
        try {
            assertEquals(mulGreita, lg.div(nr1, nr2));
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

}
