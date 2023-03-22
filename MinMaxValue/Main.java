package MinMaxValue;

public class Main {
    public static  void main(String[] args){
        MinMaxValue value = new MinMaxValue();
        int [] arr = {3, 34, 5, 49, -1, 0, 15};
        System.out.println(value.minValue(arr));
        System.out.println(value.maxValue(arr));


        System.out.println(value.minAndMaxValue(arr));
    }
}
