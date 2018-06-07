package pojo;

import java.util.Objects;

public class Person {
    private String pName;
    private int age;

    public String getpName(){
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(){}

    public Person(String pName, int age) {
        this.pName = pName;
        this.age = age;
    }

    public void call(String who){
        System.out.println(who+" ，你好！"+"我叫"+pName);
    }
}

