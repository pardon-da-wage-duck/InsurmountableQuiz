import javax.swing.*;
import java.awt.Font;

public class Main{
    public Main() {
        JFrame window = new JFrame("The Insurmountable Quiz");
        window.setSize(1200, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setVisible(true);


//        Game start = new Game();
//        start.runGame();

        JLabel title = new JLabel("The Insurmountable Quiz");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Verdana", Font.PLAIN, 30));
        window.add(title);
    }
    public static void main(String[] args) {
        new Main();
      }
    }

    //whoever runs this, run the program in terminal so the screen clears actually work.
