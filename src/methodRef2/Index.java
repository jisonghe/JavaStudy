package methodRef2;

public class Index {
    public static void main(String[] args) {
        //lambda ��׼���ʽ
        userMonitor (str -> System.out.println (str));
        userMonitor (System.out::println);
    }

    public static void userMonitor(Monitor monitor){
        monitor.show ("Monitor show!!!");
    }
}
