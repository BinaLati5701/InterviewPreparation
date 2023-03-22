package MinMaxValue;

import java.util.ArrayList;

public class MinMaxValue {

    public int minValue(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public int maxValue(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public int[] minAndMaxValue(int[] arr){
        int min = arr[0];
        int max = arr[0];
        //ArrayList<Integer> newArr = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){
            if(min > arr[i]){
                min = arr[i];
            }
            else if(max < arr[i]){
                max = arr[i];

            }
        }
        int newArr[] = {min, max};
        return newArr;
    }

}
