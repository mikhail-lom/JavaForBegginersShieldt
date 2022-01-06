package Chapter6;

/**
 * My Stack creation and filling program
 */
public class MyStackDemo {
    public static void main(String[] args) {
        MyObject ob = new MyObject(58,'y',true);
        MyObject objectFromStack1 = new MyObject(87,'t',true);
        MyObject objectFromStack2 = new MyObject(98,'M',false);
        MyObject objectFromStack3 = new MyObject(32,'.',true);
        MyObject objectFromStack4 = new MyObject(65,'8',false);

        MyStack stack1 = new MyStack(4);

        stack1.push(objectFromStack1);
        stack1.push(objectFromStack2);
        stack1.push(objectFromStack3);
        stack1.push(objectFromStack4);
        stack1.push(ob);
        stack1.push(objectFromStack1);

        System.out.println();

        stack1.pop(5);

    }
}

/**
 * Stack of objects
 */
class MyStack {
    MyObject[] stackOfMyObjects;
    int fillnessSensor, countOfElements;


    //Stack creation
    MyStack(int sizeOfStack) {
        stackOfMyObjects = new MyObject[sizeOfStack];
        fillnessSensor = 0;
    }

    void stackErr() {
        System.out.println("Stack error");
    }

    /*Insert values into stack*/

    void push(MyObject objectFromStack) {
        if (fillnessSensor >= stackOfMyObjects.length) {
            System.out.println("Error in stack");
        } else {
            stackOfMyObjects[fillnessSensor] = objectFromStack;
            fillnessSensor++;
            System.out.println("success record");
        }
    }


    /*Get values from stack*/
    void pop(int count) {
        countOfElements = count;
        if (countOfElements > stackOfMyObjects.length) {
            System.out.println("Required count of elements out of stack's bound! " +
                    "The count of values will be max for this stack");
            countOfElements = stackOfMyObjects.length;
        }

        System.out.print("Required elements are: ");

        do {
            if (fillnessSensor == 0 && stackOfMyObjects[fillnessSensor] == null) {
                countOfElements = 0;
                System.out.println("Stack is empty");
            } else if (fillnessSensor == stackOfMyObjects.length){
                fillnessSensor--;
            } else {
                MyObject temporary = stackOfMyObjects[fillnessSensor];
                stackOfMyObjects[fillnessSensor] = null;
                fillnessSensor--;
                countOfElements--;
                System.out.print(temporary + " ");
            }
        } while (countOfElements > 0);
        System.out.println("End of required stack");
    }

}
class MyObject {
    private int integer;
    private char character;
    private boolean bool;

    MyObject(int i, char ch, boolean b) {
        integer = i;
        character = ch;
        bool = b;

    }

    void getValues() {
        System.out.print("int is: " + integer + " ");
        System.out.print("char is: " + character + " ");
        System.out.println("boolean is: " + bool + " ");

    }
}
