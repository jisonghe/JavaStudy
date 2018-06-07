package interfaceDemo;

import java.io.*;
import java.util.ArrayList;

public class Index {
    public static void main(String[] args) throws IOException {
        /*Human h = new Asian ();
        h.eat ();
        h.active ();

        Human h2 = new African ();
        h2.active ();
        h2.eat ();*/
        ArrayList<String> list = new ArrayList<> ();
        method((a , b) -> a + b);

    }

    public static void CopyPanL(ArrayList <String> list) throws IOException {

        FileInputStream fis = new FileInputStream ("C:\\Users\\Administrator\\Desktop\\123.txt");
        InputStreamReader isr = new InputStreamReader (fis, "GBK");
        BufferedReader br = new BufferedReader (isr);
        String line;
        while ((line = br.readLine ()) != null){
            System.out.println (line.replace ("һ","1"));
            list.add (line.replace ("һ","1"));
        }

        /*FileOutputStream fos = new FileOutputStream ("C:\\Users\\Administrator\\Desktop\\zx.txt");
        OutputStreamWriter osw = new OutputStreamWriter (fos, "GBK");
        BufferedWriter bw  = new BufferedWriter (osw );*/

        BufferedWriter bw = new BufferedWriter (new FileWriter ("C:\\Users\\Administrator\\Desktop\\zx.txt"));

        for (int i = 0; i < list.size (); i++) {
            System.out.println (list.get (i));
            bw.write (list.get (i));
            bw.newLine ();
        }
        br.close ();
        bw.close ();
    }

    public static void method(LambdaDemo ld){
        int abc = ld.SUM (1, 2);
        System.out.println (abc);
    }

}
