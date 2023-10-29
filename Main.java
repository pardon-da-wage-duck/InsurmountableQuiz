import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;
public class GUI extends Frame {
    public GUI() {
        addWindowListener(new WindowAdapter() {
                              public void windowClosing(WindowEvent we) {
                                  dispose();
                              }
                          }
        );

        Frame window = new Frame("Name of Window");
        Label text = new Label("Sample Text");

        text.setBounds(100, 100, 100, 30);
        window.add(text);
        window.setSize(400, 400);
        window.setLayout(null);
        window.setVisible(true);

        public static void main (String args[])
        {


        }
    }
}

//    public class Main
//{
//  public static void main(String[] args)
//  {
//   Game start = new Game();
//            start.runGame();
//  }
//}

//whoever runs this, run the program in terminal so the screen clears actually work.
