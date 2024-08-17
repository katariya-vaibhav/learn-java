import java.util.ArrayList;
import java.util.Collections;

public class array_list {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        // ArrayList <Float> list2 = new ArrayList<Float>();
        // ArrayList <String> list3 = new ArrayList<String>();


        // adding elements
        list.add(0);
        list.add(1);
        // list2.add(1.5);
        // list3.add("Hello");
        // list3.add("World");

        System.out.println(list);
        System.out.println(list.size());

        // accessing elements
        System.out.println(list.get(1));

        // add elements in between
        list.add(2,5);
        System.out.println(list);


        // set elements 
        list.set(0, 4);
        System.out.println(list);

        // remove elements
        list.remove(1);
        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // sort
        Collections.sort(list);
        System.out.println(list);
    }
}
