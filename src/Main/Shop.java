package Main;

import java.util.Arrays;

public class Shop {
    public int billigsteTastatur(int[] tastaturen){
        if (tastaturen.length == 0)
            throw new IllegalArgumentException();
        Arrays.sort(tastaturen);
        return tastaturen[0];
    }

    public int teuersteGegenstand(int[] tastaturen, int[] usb){
        if (usb.length == 0 || tastaturen.length == 0)
            throw new IllegalArgumentException();
        int maxTastaturen = -1;
        int maxUsb = -1;
        for (int i = 0; i <= tastaturen.length-1; i++)
            if (tastaturen[i] > maxTastaturen)
                maxTastaturen = tastaturen[i];

        for (int i = 0; i<= usb.length-1; i ++)
            if (usb[i] > maxUsb)
                maxUsb = usb[i];

        return Math.max(maxTastaturen, maxUsb);
    }

    public int teuersteUsb(int[] usb, int budget){
        if (usb.length == 0 || budget <= 0)
            throw new IllegalArgumentException();
        Arrays.sort(usb);
        int teuerste = 0;
        for (int i = usb.length - 1; i >= 0; i--)
            if (usb[i] <= budget){
                teuerste = usb[i];
                break;
            }
        return teuerste;
    }

    public int geldbetrag(int[] tastaturen, int[] usb, int budget){
        if (tastaturen.length == 0 || usb.length == 0 || budget <= 0)
            throw new IllegalArgumentException();
        Arrays.sort(tastaturen);
        Arrays.sort(usb);
        int max = 0;
        if (tastaturen[0] + usb[0] > budget)
            return -1;
        else {
            for (int i = 0 ; i <= tastaturen.length - 1; i++)
                for (int j = 0 ; j <= usb.length - 1; j++){
                    if (tastaturen[i] + usb[j] <= budget){
                        max = tastaturen[i] + usb[j];
                    }
                }
        }
        return max;
    }
}

