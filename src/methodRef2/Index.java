package methodRef2;

public class Index {
    public static void main(String[] args) {
        //lambda 标准表达式
        userMonitor (str -> System.out.println (str));
        userMonitor (System.out::println);
    }

    public static void userMonitor(Monitor monitor){
        monitor.show ("Monitor show!!!");
    }
}
