package chapter9.exercise9_1;



public class QExcDemo {
    public static void main(String[] args) {
        FixedQueueClone q = new FixedQueueClone(10);
        char ch;
        int i;

        try {
            //Queue overflow
            for (i=0; i<11; i++) {
                System.out.print("Save attempt: " + (char)
                        ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            //Symbol extraction attempt from empty queue
            for (i=0; i<11; i++) {
                System.out.print("Symbol getting: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

    }
}
