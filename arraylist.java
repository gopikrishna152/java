import java.util.*;

//import javax.print.attribute.HashDocAttributeSet;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        int i = 10;
        for (int j = 0; j < i; j++) {
            al.add(j);
        }
        System.out.println(al);

        // al.clear();
        // System.out.println(al); // to clear all the elements in the arraylist

        ArrayList<Integer> clone = (ArrayList<Integer>) al.clone();
        clone.add(12);
        clone.add(13);
        System.out.println(clone);
        System.out.println(al.contains(1));// it checks whether the element or object present in the arraylist
        System.out.println(al.get(9));

        try {
            System.out.println(al.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("sorry limit exceeded");
        }
        System.out.println(al.indexOf(8));// get the element of the index using the object

        clone.removeAll(al);
        System.out.println(clone);

        HashSet<Integer> hs = new HashSet<>();
        for (int j = 0; j < 10; j++) {
            hs.add(j);
        }
        hs.add(3);
        al.add(3);
        System.out.println(hs);
        System.out.println(al);
        al.remove(10);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        // al.clear();
        System.out.println(al.isEmpty());
        System.out.println(al.subList(0, 6));

        ArrayList<String> arrays = new ArrayList<>();
        arrays.add("python");
        arrays.add("java");
        arrays.add("html");
        arrays.add("css");
        arrays.add("javascript ");
        arrays.set(2, "swift");
        arrays.toArray();
        System.out.println(arrays);
        arrays.replaceAll(e -> e.toUpperCase());
        System.out.println(arrays);
        arrays.forEach((e) -> {
            e += " Gopi";
            System.out.println(e);
        });
        System.out.println(arrays);
    }
}