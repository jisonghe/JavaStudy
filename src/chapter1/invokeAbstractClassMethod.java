package chapter1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class invokeAbstractClassMethod {
    public static void main(String[] args) {
//        System.out.println(Tools.addGoodMorningBefore("Tom"));
        int arr [] = {1,5,6,4,45,6,7};
        Tools.DemoLogin();

        byte b1 ,b2 ,b;
        b1 = 3;
        b2 = 4;
//        b = b1 + b2; //编译错误
        b = 3 + 4;

        b = (byte)130 ;
        System.out.println (b);

        byte by  = 10;
        by ++;
    }

}

abstract class Tools {
    public static String addGoodMorningBefore(String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        String dateNow = sdf.format(new Date());
        System.out.println(dateNow);
        Integer dateInt = Integer.valueOf(dateNow);
        if (dateInt < 9) {
            return String.format("Good Morning , %s", name);
        } else if (dateInt >= 9 && dateInt < 19) {
            return String.format("Good Afternoon ,%s", name);
        } else if (dateInt >= 19) {
            return String.format("Good Evening ,%s", name);
        }
        return String.format("Good Nignt ,%s", name);
    }

    public static void DemoScannerTest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int num = sc.nextInt();
        System.out.println("结果:" + num);

        System.out.println("请输入字符串:");
        String str = sc.next();
        System.out.println("str：" + str);
    }

    public static void ThreeNumCompare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int num3 = sc.nextInt();

        int max;
        if (num1 >= num2) {
            if (num1 >= num3) {
                max = num1;
            } else {
                max = num3;
            }
        } else {
            if (num2 >= num3) {
                max = num2;
            } else {
                max = num3;
            }
        }
        System.out.println("最大值为：" + max);
    }

    public static void TimeLoop() {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if (i < 10) {
                    if (j < 10) {
                        System.out.println("0" + i + " : 0" + j);
                    } else {
                        System.out.println("0" + i + " : " + j);
                    }
                } else {
                    if (j < 10) {
                        System.out.println(i + " : 0" + j);
                    } else {
                        System.out.println(i + " : " + j);
                    }
                }

            }
        }
    }

    public static void ChengFaBiao() {
        for (int i = 1; i <= 9; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
        }
    }

    //    求一个数组中最大值或最小值；
    public static void ArrayMaxOrMin() {
        int[] abc = {3, 5, -1,6,8};
        int max = abc[0];
        int min = abc[0];
        for (int i = 1; i < abc.length; i++) {
            if (max < abc[i]) {
                max = abc[i];
            }
        }
        for (int i = 1; i < abc.length; i++) {
            if (min > abc[i]) {
                min = abc[i];
            }
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
    }

    //    求数组元素总和
    public static void ArraySum() {
        int[] sumArray = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < sumArray.length; i++) {
            sum += sumArray[i];
        }
        System.out.println(sum);
    }

    //        三角形
    public static void SanJiao() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //        等边三角
    public static void DengBianSanJiao() {
        for (int i = 0; i < 7; i++) {
            for(int k = i+1; k < 7; k++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void 菱形(){
        //空心菱形
        System.out.println("空心菱形");
        for(int i=0;i<5;i++){
            for(int k=i+1;k<5;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int x=0;x<5;x++){
            for(int y=0;y<=x;y++){
                System.out.print(" ");
            }
            for(int z=x+1;z<5;z++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        //实心菱形
        System.out.println("实心菱形");
        for(int t=0;t<5;t++){
            for(int q=t+1;q<5;q++){
                System.out.print(" ");
            }
            for(int w=0;w<=t;w++){
                System.out.print("*");
            }
            for(int e=0;e<t;e++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a=0;a<5;a++){
            for(int b=0;b<=a;b++){
                System.out.print(" ");
            }
            for(int c=a+1;c<5;c++){
                System.out.print("*");
            }
            for(int d=a+1;d<5-1;d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ArraysSoft(int [] arr){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }

    public static void DemoLogin(){
        String registUsername = "abc";
        String registPassword = "123";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String username = sc.next();
        if(registUsername.equals(username)){
            System.out.println("请输入密码：");
            String password = sc.next();
            if(registPassword.equals(password)){
                System.out.println("欢迎您"+registUsername);
            }else{
                System.out.println("密码错误，请重新输入!");
                Tools.DemoLogin();
            }

        }else{
            System.out.println("账号不存在，请重新输入");
            Tools.DemoLogin();
        }
    }

    abstract void process();
}