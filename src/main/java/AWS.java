import java.util.Arrays;

public class AWS {
    private static final int FILLER_VALUE = Integer.MIN_VALUE;
    private int[] values;

    public int[] getValues() {
        return Arrays.copyOf(values, values.length);
    }

    public void setValues(int[] values) {
        this.values = Arrays.copyOf(values, values.length);
    }

    @Override
    public String toString() {
        return "AWS [values=" + Arrays.toString(values) + "]";
    }

    public AWS(int[] values) {
        super();
        setValues(values);
    }

    public int remove(int i) {

        int value = FILLER_VALUE;
        if (i >= 0 && i < values.length) {
            value = values[i];
            for(int index = i; index < values.length - 1; ++index) {
                values[index] = values[index+1];
            }
            values[values.length-1] = FILLER_VALUE;
        }
        return value;
    }

    public void fillAndExpand(int position, int nt) {
        int numberOfTimes = Math.abs(nt);
        int[] newArray = new int[values.length + numberOfTimes];
        for(int i = 0; i <=position; ++i) {
            newArray[i] = values[i];
        }
        for(int i = position; i<=numberOfTimes + position; ++i) {
            newArray[i] = newArray[position];
        }
        // Make examples, so it is easier to visualize your methods
        //   p 1 2
        // a b c
        // a b b b c

        for(int i = position+1; i <values.length; ++i ) {
            newArray[i+ numberOfTimes] = values[i];
        }
        values = newArray;
    }
    //Added New method which returns the sum of the elements upto the mentioned position.
    public int sumToPlace(int place){
        int[] actual=getValues();
        int sum = 0;
        if (place > actual.length){
            return 0;
        }
        for(int i=0; i<=place; ++i){
            sum+=actual[i];
        }
        return sum;
    }
    //Added method that returns the count of the removed values that are bigger than threshold value
    public int removeBiggerThan(int threshold){
        int[] value=getValues();
        int removedValues=0;
        for(int i=0;i<value.length;i++){
            if(value[i]>threshold){
                removedValues+=1;
                value[i]=FILLER_VALUE;
            }
        }

       return removedValues;
    }
    //Method that step multiplies the values between different ranges
    public int[] stepMultipier(){
        int[] original=getValues();
        for(int i=0;i<original.length;i++){
            if(original[i]>0&& original[i]<10){
                original[i]=original[i]*2;
            }
            else if(original[i]>=10&& original[i]<20){
                original[i]=original[i]*4;
            }
            else if(original[i]>=20&& original[i]<100){
                original[i]=original[i]*100;
            }

        }
        return original;
    }
}