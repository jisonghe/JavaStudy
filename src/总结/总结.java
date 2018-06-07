package 总结;


public class 总结 {

    /*
    * java8 新特性：
    *   1、lambda表达式
    *   2、方法引用
    *   3、Stream流
    * */

    public static void main(String[] args) {
        LambdaDemo(a -> Integer.parseInt (a) );
        LambdaDemo((a) -> {return Integer.parseInt (a);} );
    }

    public static void LambdaDemo(interDemo interDemo ){
        System.out.println ("13");
    }

}


@FunctionalInterface
 interface interDemo{
    int printInt(String str);
}

interface ArrayLambdaDemo{
    void selectOne(int [] arr);
}

