package �ܽ�;


public class �ܽ� {

    /*
    * java8 �����ԣ�
    *   1��lambda���ʽ
    *   2����������
    *   3��Stream��
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

