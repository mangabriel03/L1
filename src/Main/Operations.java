package Main;

public class Operations {
    public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
    public int length = arr.length;

    public Operations() {
        this.arr = arr;
    }

    public double getMax(){
        double max = 0;
        for(int i = 0;i< length;i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public double getMin(){
        double min = 100000;
        for(int i = 0;i< length;i++){
            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public double maxSum(){
        double sum=0;
        for(int i = 0;i< length;i++){
            if(arr[i]!=getMin())
                sum = sum+ arr[i];
        }
        return sum;
    }

    public double minSum(){
        double sum=0;
        for(int i = 0;i< length;i++){
            if(arr[i]!=getMax())
                sum = sum+ arr[i];
        }
        return sum;
    }
}
