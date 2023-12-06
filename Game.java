import java.util.Scanner;

public class Game {
    public Userprofile profile = null;
    private boolean running = true;
    private Scanner scan = new Scanner(System.in);

    public void runGame() {
//      The run button is pressed and the magic follows. Petal to the metal!!
        startProgram();
        registerProfile();
        while (running) {
            homeScreen();
        }
        scan.close();
    }

    public void startProgram(){
        //Opening loading screen, please standby while we retrieve some files
//        boolean run = true;
//        System.out.println("Verifying program files...");
//        System.out.println("Program is running: " + run);
//        System.out.println("Starting program in: ");
//        int countdown = 3; //initialize and assign int
//        while (countdown >= 0) {
//            System.out.println(countdown + "...");
//            countdown -= 1; //compound subtraction operator
//            Transitions.Sleep(1000);
//        }
//        Transitions.clearScreen();
    }

    public void homeScreen() {
//        System.out.println("The Insurmountable Quiz! \n");
//        System.out.println("Options: \n (1) Play Game \n (2) Open Shop \n (3) View Player Profile \n (4) Exit Game ");
//        scan = new Scanner(System.in);
//        System.out.println("Select a number: ");
//        String input = scan.nextLine();
//        Transitions.clearScreen();
//        if (input.equals("1")){
//            startQuiz();
//        } else if (input.equals("2")){
//            startShop();
//        } else if(input.equals("3")){
//            viewProfile();
//        } else if (input.equals("4")) {
//            running = false;
//        } else{
//            System.out.println("Please enter a valid number");
//            Transitions.Sleep(1000);
//        }

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

    public void startShop(){
        Shop shop = new Shop();
        shop.shopScren(profile);
    }
}