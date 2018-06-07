package collection;

import java.util.ArrayList;

public class collectionDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<> ();
        list.add ("古力娜扎");
        list.add ("迪丽热巴");
        boolean b = list.add ("马尔扎哈");
        System.out.println (b);

        System.out.println (list.hashCode ());
        for (int i = 0; i < list.size (); i++) {
            String s = list.get (i);
            System.out.println (s);
        }


        System.out.println ("===========================");

        for (String s : list) {
            System.out.println (s.toString ());
        }

        System.out.println ("===========================");

        int[] arr = {1, 2, 3, 4};
        System.out.println (arr);
        System.out.println (arr.hashCode ());
    }
}

