import java.util.Arrays;

public class FibonacciSubSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSubSequence(generateFibonacciSequence(5), 2, 10)));
    }

    public static int[] generateFibonacciSequence(int size){

        int currentElement = 0;
        int nextElement = 1;
        int[] fibonacciSequence = new int[size];
        fibonacciSequence[0] = currentElement;
        fibonacciSequence[1] = nextElement;

        for (int i = 2; i < size; i++) {
            fibonacciSequence[i] = currentElement + nextElement;
            currentElement = nextElement;
            nextElement = fibonacciSequence[i];
        }

        return fibonacciSequence;

    }

    public static int[] getSubSequence(int[] fibonacciSequence, int from, int to){
        try{
            if (fibonacciSequence.length<to){
                throw new IllegalArgumentException("parameter TO more than array size");
            }
            return Arrays.copyOfRange(fibonacciSequence,from,to+1);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
        return new int[]{0};
    }
}