import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz {

    private Scanner scan = new Scanner(System.in);
    public static int random(int min, int max){
        return (int)(Math.random()*(max-min)) + min;
    }

    public void quizScreen(Userprofile profile){
        getQuestions();

    }

    public void getQuestions(){
        File questions = new File("Questions.txt");
        try {

            Scanner sc = new Scanner(questions);

            while (sc.hasNextLine()) {
                String i = sc.nextLine();
                System.out.println(i);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
