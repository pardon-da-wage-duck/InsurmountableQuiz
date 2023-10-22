import java.util.Scanner;

public class Game {
    public Userprofile profile = new Userprofile();

    private boolean running = true;
    private boolean registered = false;

    private Scanner scan = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void Sleep(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void runGame() {
        startProgram();
        registerProfile();
        while (running == true) {
            HomeScreen();
        }
        scan.close();
    }

    public boolean endGame(){
        return running = false;
    }

    public void startProgram(){
        //countdown for start of program
        boolean run = true;
        System.out.println("Verifying program files...");
        System.out.println("Program is running: " + run);
        System.out.println("Starting program in: ");
        int countdown = 3; //initialize and assign int
        while (countdown >= 0) {
            System.out.println(countdown + "...");
            countdown -= 1; //compound subtraction operator
            Sleep(1);
        }
        clearScreen();
    }

    public void HomeScreen() {
        System.out.println("The Insurmountable Quiz! \n");
        System.out.println("Options: \n (1) Play Game \n (2) Learn Trivia \n (3) Exit Game ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a number: ");
        String input = scan.nextLine();
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
        }
        clearScreen();

    }

    public boolean foundLetters(String s){
        String digits = "1234567890";
        for (int i=0; i == s.length()-1; i++) {
            for (int x = 0; x == digits.length() - 1; x++) {
                if (!(s.substring(i, i++)).equals(digits.substring(x, x++)) == true) {
                    return false;
                }
            }
        }
        return true;
    }

    int age;
    public int registerAge(){

        while (registered == false){
            System.out.println("What is your age?: ");
            String a = scan.nextLine();
            if (foundLetters(a) == false){
                System.out.println("Please enter a valid whole number for your age.");
            }
            registered = true;
            age = Integer.parseInt(a);
        }
        return age; //auuuufu
    }

    public Userprofile registerProfile(){
        //plz me just fix this thing already
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String username = scan.nextLine();
        int age = registerAge();
        profile.createprofile(username, age);
        clearScreen();
        return profile;
    }

    public Userprofile getProfile(){

        return profile;
    }

    public void startGame() {

    }

    public void startTrivia(){
        Trivia spit_facts = new Trivia();
        spit_facts.triviaScreen();
    }

}
