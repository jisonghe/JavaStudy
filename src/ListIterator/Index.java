package ListIterator;

import java.util.ArrayList;

public class Index {
    public static void main(String[] args) {
        Index i = new Index ();
//        i.ArrayListDemo ();
    }

    /*
    * һ��Arraylist�������� ���ݽṹ���£�"��ϣ��21"
    * ��ӡ��������������30��Ӣ��
    *
    * 1���������� �������
    * 2����������
    * 3����ȡ����
    * 4��������ת��Ϊ int
    * 5���ж� �������30��
    * */
    //д��1
    public void ArrayListDemo(){
        ArrayList<String> list = new ArrayList<> ();
        list.add ("��ϣ��21");
        list.add ("�ɶ���212");
        list.add ("�׶��Ӷ���25");
        for (int i = 0; i < list.size (); i++) {
            String [] array = list.get (i).split ("��");
            int age = Integer.parseInt (array[1]);
            if (age <30){
                System.out.println (list.get (i));
            }
        }

    }
    //д��2
    public void ArrayListDemo2(){
        ArrayList<String> strList = new ArrayList<> ();
        strList.add ("��ϣ��21");
        strList.add ("�ɶ���212");
        strList.add ("�׶��Ӷ���25");
        
        ArrayList<String> arrayList = new ArrayList<> ();
        for (int i = 0; i < strList.size (); i++) {
            String [] arr = strList.get (i).split ("��");
            arrayList.add (arr[1]);
        }

        ArrayList<Integer> intList = new ArrayList<> ();
        for (int i = 0; i < arrayList.size (); i++) {
            String ageStr = arrayList.get (i);
            int age = Integer.parseInt (ageStr);
            intList.add (age);
        }

        ArrayList<Integer> result = new ArrayList<> ();
        for (int i = 0; i <intList.size () ; i++) {
            if (intList.get (i) < 30){
                result.add (intList.get (i));
            }
        }

        for (int i = 0; i < result.size (); i++) {
            System.out.println (result.get (i));
        }
        
    }
    //д��3
    public static void arrayListStream(String a){
        ArrayList<String> strList = new ArrayList<> ();
        strList.add ("��ϣ��21");
        strList.add ("�ɶ���212");
        strList.add ("�׶��Ӷ���25");



        strList.stream ().map (str -> str.split ("��")[1]).map (Integer::parseInt).
                filter ( age -> age >30).forEach (System.out::println);

    }

    public void ABC(){
       String a="123";
        ArrayList<Object> objects = new ArrayList<> ();


    }


}
