package Tests;


public class TestRunner {

    public static void run(){

            OperationsTest operations = new OperationsTest();
            operations.testGetMax();
            System.out.println("Operations test max done!! yuhuuu");
            operations.testGetMin();
            System.out.println("Operations test min done");
            operations.testMaxSum();
            System.out.println("Op test sum max done");
            operations.testMinSum();
            System.out.println("op test sum min done");


            LargeNumberTest largeNumberTest = new LargeNumberTest();
            largeNumberTest.sumTest();
            largeNumberTest.difTest();
            largeNumberTest.mulTest();
            largeNumberTest.difTest();


            ShopTest shopTest = new ShopTest();
            shopTest.billigsteTastaturTest();;
            shopTest.teuersteGegenstandTest();
            shopTest.teuersteUsbTest();
            shopTest.geldbetragTest();
            System.out.println("O trecut toate TESTELEEEE");



        }
    }
//    public static void main(String[] args){
//        OperationsTest operations = new OperationsTest();
//        operations.getMaxTest();
//        System.out.println("Operations test max done!! yuhuuu");
//        operations.getMinTest();
//        System.out.println("Operations test min done");
//        operations.maxSumTest();
//        System.out.println("Op test sum max done");
//        operations.minSumTest();
//        System.out.println("op test sum min done");
//
//        LargeNumberTest largeNumberTest = new LargeNumberTest();
//        largeNumberTest.sumTest();
//        largeNumberTest.difTest();
//        largeNumberTest.mulTest();
//        largeNumberTest.difTest();
//
//        ShopTest shopTest = new ShopTest();
//        shopTest.billigsteTastaturTest();;
//        shopTest.teuersteGegenstandTest();
//        shopTest.teuersteUsbTest();
//        shopTest.geldbetragTest();
//        System.out.println("O trecut toate TESTELEEEE");
//
//
//
//    }

