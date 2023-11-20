import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class Quiz {
    private Scanner scan = new Scanner(System.in);
    private String [][] quizQuestions;
    public static int random(int min, int max){
        return (int)(Math.random()*(max-min)) + min;
    }
    public void quizScreen(Userprofile profile){
//        getQuestions("QuizQuestions.csv");
        displayQuestions();

    }

    public String[][] getQuestions(String filename){
        String[][] array = new String[3][6];
        int rowNum = 0;
        try (Scanner myFileReader = new Scanner(new File(filename))) {
            while (myFileReader.hasNextLine()) {
                String line = myFileReader.nextLine();
                Scanner sRow = new Scanner(line);
                sRow.useDelimiter(",");
                int colNum = 0;
                while (sRow.hasNextLine()) {
                    array[rowNum][colNum++] = sRow.nextLine();
                }
                rowNum++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return array;
    }

    public void displayQuestions(){
        quizQuestions = getQuestions("QuizQuestions.csv");
        for (int i = 0; i < quizQuestions.length; i++){
            for (int j = 0; j< quizQuestions[i].length; i++){
                System.out.println(quizQuestions[i][j]);
            }
        }
        scan.nextLine();
    }

}
