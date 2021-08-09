public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(228));
    }


    public static boolean isPalindrome(int num){
        if(num < 0) return  false;
        int reversed = 0, remainder, original = num;
        while(num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num  /= 10;
        }
        System.out.println(reversed);
        // palindrome if original and reversed are equal
        return original == reversed;
    }


}

