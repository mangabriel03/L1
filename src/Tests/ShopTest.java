package Tests;
import Main.Shop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ShopTest {

    @Test
    public void billigsteTastaturTest(){
        Shop shop = new Shop();
        int[] tastaturen = {40, 35, 70, 15, 45};
        assertEquals(15, shop.billigsteTastatur(tastaturen));
        try{
            assertEquals(20, shop.billigsteTastatur(tastaturen));
        } catch(AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void teuersteGegenstandTest(){
        Shop shop = new Shop();
        int[] tastaturen = {40, 35, 70, 15, 45};
        int[] usb = {15, 20, 10, 35};
        assertEquals(70, shop.teuersteGegenstand(tastaturen, usb));
        try{
            assertEquals(20, shop.teuersteGegenstand(tastaturen, usb));
        } catch(AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void teuersteUsbTest(){
        Shop shop = new Shop();
        int[] usb = {15, 20, 10, 35, 70};
        int budget = 60;
        assertEquals(35, shop.teuersteUsb(usb, budget));
        try{
            assertEquals(70, shop.teuersteUsb(usb, budget));
        } catch(AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void geldbetragTest(){
        Shop shop = new Shop();
        int[] tastaturen = {40, 35, 70, 15, 45};
        int[] usb = {15, 20, 10, 35};
        int budget = 60;
        assertEquals(60, shop.geldbetrag(tastaturen, usb,budget));
        try{
            assertEquals(70, shop.geldbetrag(tastaturen,usb ,budget));
        } catch(AssertionError e){
            System.out.println(e.getMessage());
        }
    }


}
