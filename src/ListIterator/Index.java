package ListIterator;

import java.util.ArrayList;

public class Index {
    public static void main(String[] args) {
        Index i = new Index ();
//        i.ArrayListDemo ();
    }

    /*
    * 一个Arraylist集合数组 数据结构如下，"艾希，21"
    * 打印输出所有年龄大于30的英雄
    *
    * 1、创建数据 添加数据
    * 2、遍历数组
    * 3、截取年龄
    * 4、将年龄转换为 int
    * 5、判断 年龄大于30的
    * */
    //写法1
    public void ArrayListDemo(){
        ArrayList<String> list = new ArrayList<> ();
        list.add ("艾希，21");
        list.add ("纳尔，212");
        list.add ("雷恩加尔，25");
        for (int i = 0; i < list.size (); i++) {
            String [] array = list.get (i).split ("，");
            int age = Integer.parseInt (array[1]);
            if (age <30){
                System.out.println (list.get (i));
            }
        }

    }
    //写法2
    public void ArrayListDemo2(){
        ArrayList<String> strList = new ArrayList<> ();
        strList.add ("艾希，21");
        strList.add ("纳尔，212");
        strList.add ("雷恩加尔，25");
        
        ArrayList<String> arrayList = new ArrayList<> ();
        for (int i = 0; i < strList.size (); i++) {
            String [] arr = strList.get (i).split ("，");
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
    //写法3
    public static void arrayListStream(String a){
        ArrayList<String> strList = new ArrayList<> ();
        strList.add ("艾希，21");
        strList.add ("纳尔，212");
        strList.add ("雷恩加尔，25");



        strList.stream ().map (str -> str.split ("，")[1]).map (Integer::parseInt).
                filter ( age -> age >30).forEach (System.out::println);

    }

    public void ABC(){
       String a="123";
        ArrayList<Object> objects = new ArrayList<> ();


    }


}
