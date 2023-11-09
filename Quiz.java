import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {

    private Scanner scan = new Scanner(System.in);
    private String quizQuestions[] = {};
    public static int random(int min, int max){
        return (int)(Math.random()*(max-min)) + min;
    }

    public void quizScreen(Userprofile profile){
        getQuestions();

    }

    public void getQuestions(){
        File questions = new File("QuizQuestions.csv");
        try {

            Scanner sc = new Scanner(questions);

            while (sc.hasNextLine()) {
                quizQuestions[].add(sc.nextLine());
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
