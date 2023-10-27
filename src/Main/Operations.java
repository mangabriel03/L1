package Main;

public class Operations {
    public double[] arr = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
    public int length = arr.length;

    public Operations() {
        this.arr = arr;
    }

    public double getMax( double[] arr){
        if (arr.length == 0)
            throw new RuntimeException();
        double max = 0;
        for(int i = 0;i< length;i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public double getMin(double[] arr){
        if (arr.length == 0)
            throw new RuntimeException();
        double min = Integer.MAX_VALUE;
        for(int i = 0;i< length;i++){
            if(min > this.arr[i])
                min = this.arr[i];
        }
        return min;
    }

    public double maxSum(double[] arr){
        if (arr.length == 0)
            throw new RuntimeException();
        double sum=0;
        for(int i = 0;i< length;i++){
            if(this.arr[i]!=getMin(arr))
                sum = sum+ this.arr[i];
        }
        return sum;
    }

    public double minSum(double[] arr){
        if (arr.length == 0)
            throw new RuntimeException();
        double sum=0;
        for(int i = 0;i< length;i++){
            if(this.arr[i]!=getMax(arr))
                sum = sum+ this.arr[i];
        }
        return sum;
    }
}
