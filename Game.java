import java.util.Scanner;

public class Game {
    public Userprofile profile = null;
    private boolean running = true;
    private boolean registered = false;
    private Scanner scan = new Scanner(System.in);

    public void runGame() {
//      The run button is pressed and the magic follows. Petal to the metal!!
//        startProgram();
        registerProfile();
        while (running == true) {
            homeScreen();
        }
        scan.close();
    }

    public boolean endGame(){
        //Looks like somebody slammed the brakes.
        return running = false;
    }

    public void startProgram(){
        //Countdown for start of program, please standby while we retrieve some files
        boolean run = true;
        System.out.println("Verifying program files...");
        System.out.println("Program is running: " + run);
        System.out.println("Starting program in: ");
        int countdown = 3; //initialize and assign int
        while (countdown >= 0) {
            System.out.println(countdown + "...");
            countdown -= 1; //compound subtraction operator
            Transitions.Sleep(1000);
        }
        Transitions.clearScreen();
    }

    public void homeScreen() {
        System.out.println("The Insurmountable Quiz! \n");
        System.out.println("Options: \n (1) Play Game \n (2) Learn Trivia \n (3) View Player Profile \n (4) Exit Game ");
        scan = new Scanner(System.in);
        System.out.println("Select a number: ");
        String input = scan.nextLine();
        Transitions.clearScreen();
        if (input.equals("1")){
            startQuiz();
        }
        else if (input.equals("2")){
            startTrivia();
        }
        else if(input.equals("3")){
            viewProfile();
        }
        else if (input.equals("4")) {
            endGame();
        }
        else{
            System.out.println("Please enter a valid number");
            Transitions.Sleep(1000);
        }
    }

    public boolean foundLetters(String s){
        //detects if a string contains only letters
        String digits = "1234567890 ";
        int letters = 0;
        for (int i=0; i == s.length(); i++) {
            for (int x = 0; x == digits.length(); x++) {
                if (!(s.substring(i, i++)).equals(digits.substring(x, x++)) == true) {
                    letters++;
                }
            }
        }
        return (letters > 0);
    }

    Integer age;
    public int registerAge(){
        String a;
        System.out.println("What is your age?: ");
        a = scan.nextLine();
        try{
            Integer.parseInt(a);
        }
        catch(NumberFormatException e){
            System.out.println("Please enter a valid whole number for your age.");
            System.out.println("What is your age?: ");
            a = scan.nextLine();
        }
        age = Integer.parseInt(a);
        return age;
    }

    public void registerProfile(){
        scan = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String username = scan.nextLine();
        age = registerAge();
        profile = new Userprofile(username, age);
        try{
            System.out.println(profile);
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        Transitions.clearScreen();
    }

    public void viewProfile(){
        profile.getProfile();
    }

    public void startQuiz() {
        Quiz quiz = new Quiz();
        quiz.quizScreen(profile);
    }

    public void startTrivia(){
        Trivia spit_facts = new Trivia();
        spit_facts.triviaScreen(profile);
    }
}