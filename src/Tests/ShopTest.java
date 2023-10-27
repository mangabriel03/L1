package Tests;
import Main.Shop;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ShopTest {

    private Shop shop;

    @BeforeEach
    public void setup() {
        shop = new Shop();
    }

    int[] tastaturen3 = {40, 60, -30, 80}; // Date neașteptate
    int[] usb3 = {20, 50, 70, 40};
    int budget3 = 100;

    @Test
    public void testUnexpectedBilligsteTastatur() {
        int[] tastaturen = {};
        assertThrows(RuntimeException.class, () -> shop.billigsteTastatur(tastaturen));
    }

    @Test
    public void testUnexpectedTeuersteGegenstand() {
        int[] tastaturen = {50, 60, 70};
        int[] usb = {};
        assertThrows(RuntimeException.class, () -> shop.teuersteGegenstand(tastaturen, usb));
    }

    @Test
    public void testUnexpectedTeuersteUsb() {
        int[] usb = {};
        int budget = 100;
        assertThrows(RuntimeException.class, () -> shop.teuersteUsb(usb, budget));
    }

    @Test
    public void testUnexpectedGeldbetrag() {
        int[] tastaturen = {50, 60};
        int[] usb = {40, 70};
        int budget = 0;
        assertThrows(RuntimeException.class, () -> shop.geldbetrag(tastaturen, usb, budget));
    }


    @Test
    public void billigsteTastaturTest(){
        Shop shop = new Shop();
        int[] tastaturen = {40, 35, 70, 15, 45};
        assertEquals(15, shop.billigsteTastatur(tastaturen));
    }


    @Test
    public void teuersteGegenstandTest(){
        Shop shop = new Shop();
        int[] tastaturen = {40, 35, 70, 15, 45};
        int[] usb = {15, 20, 10, 35};
        assertEquals(70, shop.teuersteGegenstand(tastaturen, usb));
    }

    @Test
    public void teuersteUsbTest(){
        Shop shop = new Shop();
        int[] usb = {15, 20, 10, 35, 70};
        int budget = 60;
        assertEquals(35, shop.teuersteUsb(usb, budget));
    }

    @Test
    public void geldbetragTest(){
        Shop shop = new Shop();
        int[] tastaturen = {40, 35, 70, 15, 45};
        int[] usb = {15, 20, 10, 35};
        int budget = 60;
        assertEquals(60, shop.geldbetrag(tastaturen, usb,budget));

        //unexpected
        int[] tastaturen4 = null; // Date neașteptate
        int[] usb4 = {20, 50, 70, 40};
        int budget4 = 100;
        assertThrows(RuntimeException.class, () -> shop.geldbetrag(tastaturen4, usb4, budget4));
    }


}
