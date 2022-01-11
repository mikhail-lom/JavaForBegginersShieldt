package chapter6;

public class TestOfShellClasses {
    public static void main(String[] args) {
        TestShell ob = new TestShell('V');
        System.out.println(ob.character);

        ob.change(ob);
        System.out.println();

        System.out.println(ob.character);


    }
}

class TestShell {
    char character;


    TestShell(char ch) {
        character = ch;

    }


//    void noChange(char cht) {
//        char i = cht;
//        i -= 32;
//        System.out.println(i);
//    }

    void change(TestShell ob) {
        ob.character = (char)(ob.character + 32);
        System.out.println();
    }

}

