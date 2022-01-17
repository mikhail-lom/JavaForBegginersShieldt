package chapter8;

import qpack.*;
import qpack.ICharQ;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
        //Insertion of symbol row into fixed queue
        for (i=0; i < 10; i++)
            iQ.put((char) ('A' + i));

        //Displaying of queue content
        System.out.print("Content of fixed queue: ");
        for (i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        //Insertion of symbol row into dynamic queue
        for (i=0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        //Displaying of queue content
        System.out.print("Content of dynamic queue: ");
        for (i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = q3;
        //Insertion of symbol row into circular queue
        for (i=0; i < 10; i++)
            iQ.put((char) ('A' + i));

        //Displaying of queue content
        System.out.print("Content of circular queue: ");

        for (i =0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }

        


        System.out.println();

        //Insertion of additional symbols into circular queue
        for (i=10; i < 20; i++)
            iQ.put((char) ('A' + i));

        //Displaying of queue content
        System.out.print("Content of circular queue: ");
        for (i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\n Save and usage of circular queue data");

        //Symbols insertion into circular queue with
        //the subsequent extraction
        for (i=0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}

