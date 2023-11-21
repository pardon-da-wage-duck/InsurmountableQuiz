import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class Quiz {
    private Scanner scan = new Scanner(System.in);
    private String [][] quizQuestions = csvTo2dArray("QuizQuestions.csv", 3, 6);
    private boolean runQuiz = true;

    public static int random(int min, int max){
        return (int)(Math.random()*(max-min)) + min;
    }

    public void quizScreen(Userprofile profile) {
        int i = 1;
        while (runQuiz) {
            boolean validAnswer = false;
            System.out.println("Questions answered correctly: " + profile.getWins() + "\nQuestions answer incorrectly: " + profile.getLosses());
            System.out.println("\nQuestions #" + i);
            System.out.println(quizQuestions[i][0]);
            System.out.println("(A) " + quizQuestions[i][1]);
            System.out.println("(B) " + quizQuestions[i][2]);
            System.out.println("(C) " + quizQuestions[i][3]);
            System.out.println("(D) " + quizQuestions[i][4]);
            System.out.println("\nYour Options: " +
                    "\n (1) Answer the Question " +
                    "\n (2) Use an Item " +
                    "\n (3) Skip this Question " +
                    "\n (4) Quit session");
            System.out.println("Please enter a number: ");
            scan = new Scanner(System.in);
            String userInput = scan.nextLine();
            if (userInput.equals("1")) {
                boolean answering = true;
                while (answering){
                    System.out.println("Enter your answer: ");
                    String answer = scan.nextLine().toUpperCase();
                    if (answer.equals(quizQuestions[i][5])) {
                        answering = false;
                        profile.addWin();
                    }
                    else if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")) {
                        answering = false;
                        profile.addLosses();
                    }
                }
                i++;
                if (i == quizQuestions.length) endQuiz();
            }
            else if (userInput.equals("2")) ;
            else if (userInput.equals("3")) validAnswer = true;
            else if (userInput.equals("4")) {
                System.out.println("Are you sure that you want to quit? (y/n)");
                scan = new Scanner(System.in);
                String userInput2 = scan.nextLine().toLowerCase();
                if (userInput2.equals("y")) endQuiz();
            }
            Transitions.clearScreen();
        }
    }

    public boolean endQuiz(){
        return runQuiz = false;
    }

    public String[][] csvTo2dArray(String filename, int rows, int columns){
        //https://stackoverflow.com/questions/72531009/read-csv-file-into-2d-array
        //thanks to g00se from stackoverflow for reference
        //Scans csv file and converts it into a 2D array
        String[][] array = new String[rows][columns];
        int rowNum = 0;
        try (Scanner myFileReader = new Scanner(new File(filename))) {
            while (myFileReader.hasNextLine()) {
                String line = myFileReader.nextLine();
                Scanner sCol = new Scanner(line);
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

}
