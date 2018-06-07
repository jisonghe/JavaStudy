package methodRef;

import java.util.function.Consumer;

public class Index {
    public static void main(String[] args) {
/*        hireSitter ( (food) -> {
            System.out.println ("main：那什么什么做饭" + food);
        } );*/

        Consumer<String> makeFood = Cook::makeFood;
        makeFood.accept ("yangxiaojie");


    }

    public static void hireSitter(Sitter sitter){
        sitter.makeFood ("油菜");
    }
}
