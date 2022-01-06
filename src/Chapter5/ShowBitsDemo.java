package Chapter5;

/**
 * Exercise 5.3
 * Bits show class creation
 *
 */
public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 in bits view: ");
        b.show(123);

        System.out.println("\n87987 in bits view: ");
        i.show(87987);

        System.out.println("\n237658768 in bits view: ");
        li.show(237658768);

        //We can also show least significant bits
        //Of any value
        System.out.println("\nLeast 8 bits of 87987 value" +
                "in bits view: ");
        b.show(87987);

    }
}

class ShowBits {
    int numbits;

    ShowBits(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;

        //Left shift of 1 value to required position
        mask <<= numbits-1;

        int spacer = 0;
        for(; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
