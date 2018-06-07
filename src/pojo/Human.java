package pojo;

public class Human {
    private String hName;
    private int age;

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String hName, int age) {
        this.hName = hName;
        this.age = age;
    }

    public Human() {
    }

    public void call(String who){
        System.out.println(who+"，你好！"+"我叫，"+ hName);
    }
}
