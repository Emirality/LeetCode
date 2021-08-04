import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {
    public static void main(String[] args) {

        String s = "MADAM";
        System.out.println(isPalindrome(s));

    }

    private static boolean isPalindrome(final String s){
        List<Character> characterList = new ArrayList<>();
        for (char c : s.toCharArray()){
            characterList.add(c);
        }
        ListIterator<Character> fromBeginningIterator = characterList.listIterator();
        ListIterator<Character> fromEndIterator = characterList.listIterator(characterList.size());

        boolean isPalindrome = true;

        while (fromBeginningIterator.hasNext() && fromEndIterator.hasPrevious()){
            if (fromBeginningIterator.next() == fromEndIterator.previous()){
                continue;
            }
            isPalindrome = false;
        }
        return isPalindrome;
    }
}
