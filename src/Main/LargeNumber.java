package Main;

public class LargeNumber {
//    public int size;
//    public int[] zahl;

//        LargeNumber(int size2, int[] arr){
//            size = size2;
//            zahl = new int[size];
//            zahl = arr;
//        }
    public int[] sum(int[] nr1, int[] nr2) {
        if (nr2.length == 0)
            throw new IllegalArgumentException();
        int[] result = new int[nr1.length];
        int temp = 0;
        for (int i = nr1.length - 1; i >= 0; i--) {
            result[i] = (nr1[i] + nr2[i] + temp) % 10;
            temp = (nr1[i] + nr2[i] + temp) / 10;
        }
        if (temp > 0) {
            result = extend(result, temp);
        }
        return result;
    }

    public int[] extend(int[] number, int carry) {
        int[] result = new int[number.length + 1];
        result[0] = carry;
        for (int i = 0; i < number.length; i++) {
            result[i + 1] = number[i];
        }
        return result;
    }

    public int[] dif(int[] nr1, int[] nr2) {
        if (nr2.length == 0)
            throw new IllegalArgumentException();
        int[] result = new int[nr1.length];
        int temp = 0;
        int dif = 0;
        for (int i = nr1.length - 1; i >= 0; i--) {

            dif = nr1[i] - nr2[i] - temp;
            if (dif < 0) {
                dif = dif + 10;
                temp = 1;
            } else
                temp = 0;

            result[i] = dif;
        }
        return result;
    }

    public int[] mul(int[] nr1, int nr2) {
        if (nr2 < 0)
            throw new IllegalArgumentException();
        int[] result = new int[nr1.length];
        int temp = 0;
        for (int i = nr1.length - 1; i >= 0; i--){
            if (nr1[i] * nr2 > 10){
                temp = nr1[i] * nr2 / 10;
                result[i] = nr1[i] * nr2 %10;
            }
            else
            {
                result[i] = nr1[i] * nr2 + temp;
                temp = 0;
            }
        }
        return result;
    }

    public int[] div(int[] nr1, int nr2) {
        if (nr2 == 0)
            throw new IllegalArgumentException();
        int[] result = new int[nr1.length];
        int temp = 0;
        for (int i = 0; i <= nr1.length - 1; i++){

            int digit = nr1[i] + temp * 10;
            result[i] = digit / nr2;
            temp = digit % nr2;
        }
        int k = 0;
        while(k < result.length && result[k] == 0)
            k ++;
        if (k > 0)
        {
            int[] corectResult = new int[result.length - k];
            for (int i = 0; i < corectResult.length ; i++)
                corectResult[i] = result[i + k];
            return corectResult;
        }
        else
            return result;
    }
}