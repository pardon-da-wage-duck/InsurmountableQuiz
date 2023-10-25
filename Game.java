import java.util.Scanner;

public class Game {
    public Userprofile profile;
    private boolean running = true;
    private boolean registered = false;
    private Scanner scan = new Scanner(System.in);

    public static void clearScreen() {
        //borrowed this from stack overflow
        //https://stackoverflow.com/questions/2979383/how-to-clear-the-console-using-java
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void Sleep(int ms){
        //once again the guys over at stack overflow clutch up
        //https://stackoverflow.com/questions/24104313/how-do-i-make-a-delay-in-java
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void runGame() {
        //The run button is pressed and the magic follows. Petal to the metal!!
        startProgram();
        registerProfile();
        while (running == true) {
            HomeScreen();
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
            Sleep(1000);
        }
        clearScreen();
    }

    public void HomeScreen() {
        System.out.println("The Insurmountable Quiz! \n");
        System.out.println("Options: \n (1) Play Game \n (2) Learn Trivia \n (3) Exit Game ");
        scan = new Scanner(System.in);
        System.out.println("Select a number: ");
        String input = scan.nextLine();
        clearScreen();
        if (input.equals("1")){
            startGame();
        }
        else if (input.equals("2")){
            startTrivia();
        }
        else if (input.equals("3")) {
            endGame();
        }
        else{
            System.out.println("Please enter a valid number");
            Sleep(1000);
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
        if (letters > 0) return true;
        return false;
    }

    int age;
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

//        while (registered == false){
//
//            if (foundLetters(a) == true){
//
//            }
//            else{
//                age = Integer.parseInt(a);
//                registered = true;
//            }
//        }
        age = Integer.parseInt(a);
        return age;
    }

    public void registerProfile(){
        scan = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String username = scan.nextLine();
        age = registerAge();
        profile = new Userprofile(username, age);
        clearScreen();
    }

    public void startGame() {

    }

    public void startTrivia(){
        Trivia spit_facts = new Trivia();
        spit_facts.triviaScreen(profile);
    }
}
