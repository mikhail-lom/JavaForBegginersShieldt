package chapter16;
import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        //Create new JFrame container
        JFrame jfrm = new JFrame("Simple swing application");

        //Set initial dimensions of frame
        jfrm.setSize(275,100);

        //Finish app work, when user close app
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create text label
        JLabel jlab = new JLabel("Interface programming with Swing");

        //Add label on the container panel
        jfrm.add(jlab);

        //Align label on container
        jlab.setHorizontalAlignment(SwingConstants.CENTER);

        //Show frame
        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        //Create frame in action dispatcher's thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }

}
