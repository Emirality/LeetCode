import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);

        System.out.println( isContain(list));
        System.out.println( isContainMethod2(list));
    }
    public static <T> boolean isContain(List<T> list){
        Set<T> mySet = new HashSet<>();
        for (T i : list){
            if (mySet.contains(i)){
                return true;
            }
            mySet.add(i);
        }
        return false;
    }

    public static <T> boolean isContainMethod2(List<T> list){
        Set<T> mySet = new HashSet<>(list);
        return mySet.size() != list.size();
    }
}
