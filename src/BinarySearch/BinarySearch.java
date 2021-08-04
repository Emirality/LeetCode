package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();
        humans.add(new Human(2,"Silver"));
        humans.add(new Human(1,"Vlad"));
        humans.add(new Human(3,"emy"));
        Collections.sort(humans);

        int index = Collections.binarySearch(humans, new Human(3,"dk"));
        System.out.println(index);

    }
}


class Human implements Comparable<Human>{
    int id;
    String name;
    Human(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Human human) {
        return this.id - human.id;
    }
}
