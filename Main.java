import javax.swing.*;

public class Main{
    public Main() {
        JFrame window = new JFrame("The Insurmountable Quiz");
        JLabel text = new JLabel("Sample Text");

        window.setSize(800, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setVisible(true);

        text.setBounds(100, 100, 100, 30);
        window.add(text);
    }
    public static void main(String[] args) {
        new Main();
        Game start = new Game();
        start.runGame();
      }
    }

    //whoever runs this, run the program in terminal so the screen clears actually work.
