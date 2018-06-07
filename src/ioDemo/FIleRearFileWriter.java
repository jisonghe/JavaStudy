package ioDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FIleRearFileWriter {
    public static void main(String[] args) throws Exception {
        IOTools it = new IOTools ();
       /* it.BufferWriterDemo ();

        List<String> list = new ArrayList<> ();
        list.add ("abc");
        list.add ("sdf");
        it.FromListToFile (list);*/

        FileReader fr = new FileReader ("file03.txt");
        FileWriter fw = new FileWriter ("file04.txt");
        it.FileBackWrite (fr , fw);
    }

}

class IOTools {


    public void FileWriterDemo() throws IOException {
        FileWriter fw = new FileWriter ("file01.txt");
        fw.write ("abc\n");
        fw.close ();
    }

    public void FileReaderDemo() throws IOException {
        FileReader fr = new FileReader ("file01.txt");

        int ch;
        while ((ch = fr.read ()) != -1) {
            System.out.println (ch);
        }
        fr.close ();
    }

    //随机数 6个
    public void RandomB() {
        String str = "";
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            long a = Math.round (Math.random () * 10 - 1);
            arr[i] = (int) Math.round (Math.random () * 10 - 1);
            System.out.print (arr[i]);
            str += a;
        }
        System.out.println ();
        System.out.println (str);
    }

    public void BufferWriterDemo() throws Exception {
        FileWriter fw = new FileWriter ("file02.txt");
        BufferedWriter br = new BufferedWriter (fw);
        br.write ("abc");
        br.close ();
    }

    //将字符串集合中的字符输出到文件中，每个字符一行
    public void FromListToFile(List<String> list) throws IOException {
        Iterator iterator = list.iterator ();
        BufferedWriter bw = new BufferedWriter (new FileWriter ("file03.txt"));
        while (iterator.hasNext ()){
            bw.write ((String) iterator.next ());
            bw.newLine ();
        }
        bw.close ();
    }

    //将文件中的字反转
    public void FileBackWrite(FileReader fr , FileWriter fw) throws IOException {
        BufferedReader br = new BufferedReader (fr);
        ArrayList < String > list = new ArrayList<> ();
        String line ;
        while ( (line = br.readLine ()) != null) {
            list.add (line);
        }

        BufferedWriter bw = new BufferedWriter (fw);

        for (int i = list.size () -1 ; i >-1 ; i--) {
            bw.write (list.get (i).replace ("中","f"));
            bw.newLine ();
        }

        br.close ();
        bw.close ();
    }


}
