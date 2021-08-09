public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));;


    }

    public static int reverse2(int x){
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        long reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reverse : reverse);
    }

    public static int reverse(int x) {
        int reverse=0; //32
        while (x !=0){
            int remainder = x%10;
            reverse = reverse*10+remainder;
            x = x/10;
        }
        return reverse;
    }
}

