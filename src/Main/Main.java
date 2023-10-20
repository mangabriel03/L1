//package Main;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}

package Main;

import Tests.TestRunner;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        TestRunner.run();


        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };

        System.out.println(Arrays.toString(notenProzessor.nichtAusreichendeNoten(noten)));
        System.out.println(notenProzessor.Durchschnittswert(noten));
        System.out.println(Arrays.toString(notenProzessor.abgerundeteNote(noten)));
        System.out.println(notenProzessor.Maximale(noten));
        Operations op = new Operations();
        //    public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
        System.out.println(op.getMax());
        System.out.println(op.getMin());
        System.out.println(op.minSum());
        System.out.println(op.maxSum());
        int[] nr1Array = {1,0,3,0,5,8,0,7,0,1};
        int[] nr2Array = {5,0,0,9,5,3,1,4,1,2};
        LargeNumber nr1 = new LargeNumber();
        System.out.println(Arrays.toString(nr1.sum(nr1Array, nr2Array)));
        System.out.println(Arrays.toString(nr1.dif(nr1Array, nr2Array)));
        int nr3 = 3;
        System.out.println(Arrays.toString(nr1.div(nr1Array, nr3)));
        System.out.println(Arrays.toString(nr1.div(nr2Array, nr3)));
        int[] n = {1,3,9};
        System.out.println(Arrays.toString(nr1.div(n,nr3)));
        System.out.println(Arrays.toString(nr1.div(nr1Array,nr3)));
        Shop shop = new Shop();
        int[] tastaturen = {40, 35, 70, 15, 45};
        int[] usb = {15, 20, 10, 35};
        int budget = 60;
        System.out.println(shop.billigsteTastatur(tastaturen));
        System.out.println(shop.teuersteGegenstand(tastaturen, usb));
        System.out.println(shop.teuersteUsb(usb, budget));
        Arrays.sort(tastaturen);
        System.out.println(Arrays.toString(tastaturen));
        Arrays.sort(usb);
        System.out.println(Arrays.toString(usb));
        System.out.println(shop.geldbetrag(tastaturen, usb, budget));
    }

}