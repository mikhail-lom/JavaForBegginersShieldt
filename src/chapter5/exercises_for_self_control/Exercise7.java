package chapter5.exercises_for_self_control;

public class Exercise7 {
    static class Encode {
        public static void main(String[] args) {
        String msg = "This is only a test";
        String encmsg = "";
        String decmsg = "";
        String key = "12345678";
        int j;


            System.out.print("Initial message: ");
            System.out.println(msg);

            //Encrypting of message
            j = 0;
            for (int i = 0; i < msg.length(); i++) {
                encmsg = encmsg + (char) ( key.charAt(j) ^ msg.charAt(i));
                j++;
                if (j == 8) j = 0;

            }

            System.out.print("Encrypted message: ");
            System.out.println(encmsg);

            // Decryption of message
            j = 0;
            for (int i = 0; i < msg.length(); i++) {
                decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
                j++;
                if (j == 8) j = 0;
            }



            System.out.print("Decrypted message: ");
            System.out.println(decmsg);
        }
    }
}
