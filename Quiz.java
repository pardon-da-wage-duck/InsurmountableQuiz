import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {

    private Scanner scan = new Scanner(System.in);
    private List<List<String>> quizQuestions= new ArrayList<List<String>>();

    public static int random(int min, int max){
        return (int)(Math.random()*(max-min)) + min;
    }

    public void quizScreen(Userprofile profile){
        getQuestions();
        displayQuestions();

    }

    public void getQuestions(){
        File questions = new File("QuizQuestions.csv");
        try {
            Scanner sc = new Scanner(questions);

            while (sc.hasNextLine()) {
                List<String> questionSet = new ArrayList<String>();
                questionSet.add(sc.nextLine());
                quizQuestions.add(questionSet);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void displayQuestions(){
        for (int i = 0; i < quizQuestions.size(); i++){
            for (int j = 0; j< quizQuestions.get(i).size(); j++){
                System.out.println(quizQuestions.get(i).get(j));
            }
        }
    }

}
