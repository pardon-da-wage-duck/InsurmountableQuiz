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
        displayQuestions(profile);

    }

    public void displayQuestions(Userprofile profile){
        quizQuestions = csvTo2dArray("QuizQuestions.csv", 3, 6);
        for (int i = 1; i < quizQuestions.length; i++){
            boolean validAnswer = false;
            while (!validAnswer){
                System.out.println("Questions answered correctly: " + profile.getWins() + "\nQuestions answer incorrectly: " + profile.getLosses());
                System.out.println("Questions #" + i);
                System.out.println(quizQuestions[i][0]);
                System.out.println("(A) " + quizQuestions[i][1]);
                System.out.println("(B) " + quizQuestions[i][2]);
                System.out.println("(C) " + quizQuestions[i][3]);
                System.out.println("(D) " + quizQuestions[i][4]);
                System.out.println("Your answer: ");
                String answer = scan.nextLine().toUpperCase();
                if (answerValidity(answer)) {
                    validAnswer = true;
                    if (answer.equals(quizQuestions[i][5])) profile.addWin();
                    else profile.addLosses();
                }
                Transitions.clearScreen();
            }
        }
    }

    public String[][] csvTo2dArray(String filename, int rows, int columns){
        //https://stackoverflow.com/questions/72531009/read-csv-file-into-2d-array
        //thanks to g00se from stackoverflow for reference
        //Scans csv file and converts it into a 2D array
        String[][] array = new String[rows][columns];

        int rowNum = 0;
        try (Scanner myFileReader = new Scanner(new File(filename))) {
            while (myFileReader.hasNextLine()) {
                String line = myFileReader.nextLine(); //line
                Scanner sCol = new Scanner(line); //scan line
                sCol.useDelimiter(",");

                int colNum = 0;
                while (sCol.hasNext()) {
                    array[rowNum][colNum++] = sCol.next();
                }
                rowNum++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return array;
    }

    public boolean answerValidity(String str){
        if (str.length() != 1) return false;
        String[] choices = {"A", "B", "C", "D"};
        int valid = 0;
        for (int i = 0; i< choices.length; i++){
            if (!str.equals(choices[i])) valid++;
        }
        return valid < 4;
    }
}
