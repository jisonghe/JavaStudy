package methodRef;

import java.util.function.Consumer;

public class Index {
    public static void main(String[] args) {
/*        hireSitter ( (food) -> {
            System.out.println ("main����ʲôʲô����" + food);
        } );*/

        Consumer<String> makeFood = Cook::makeFood;
        makeFood.accept ("yangxiaojie");


    }

    public static void hireSitter(Sitter sitter){
        sitter.makeFood ("�Ͳ�");
    }
}
