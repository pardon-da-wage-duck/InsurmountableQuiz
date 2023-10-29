import java.util.Scanner;
public class Trivia {
    private boolean runtrivia = true;
    Scanner scan = new Scanner(System.in);

    public void triviaScreen(Userprofile userprofile){
        while (runtrivia == true){
            System.out.println("What kind of trivia would you like to learn?: " +
                    "\n (1) History & Geography\n (2) Literature \n (3) Science \n (4) Movies & TV \n (5) Music" +
                    "\n (6) Games \n (7) Food & Drinks \n (8) Government, Law, & Politics \n (9) Mathematics \n (10) Jokes & Riddles" +
                    "\n (11) Yourself \n (12) Return to Home Screen");
            System.out.println("Select a number: ");
            scan = new Scanner(System.in);
            String input = scan.nextLine();
            Transitions.clearScreen();
            if (input.equals("1")){
            }
            if (input.equals("2")){
            }
            if (input.equals("3")){
            }
            if (input.equals("4")){
            }
            if (input.equals("5")){
            }
            if (input.equals("6")){
            }
            if (input.equals("7")){
            }
            if (input.equals("8")){
            }
            if (input.equals("9")){
            }
            if (input.equals("10")){
            }
            if (input.equals("11")){
                usertrivia(userprofile.getAge());
            }
            if (input.equals("12")){
                runtrivia = false;
            }
            else{
                System.out.println("Please enter a valid number. ");
                Transitions.Sleep(1000);
            }
        }
    }


    public void usertrivia(int a){
        final double earth_age = 45430000000.0;
        double ageindays = a*365.0;
        ageindays = (int)(ageindays + 0.5); //casting variable as an integer
        System.out.println("\nJudging by your registered age, you are at least " + ageindays + " days old.");

        scan = new Scanner(System.in);
        System.out.println("Would you like learn a piece of trivia regarding yourself? (y/n)");
        String choice = scan.nextLine();

        System.out.println("Actually it doesn't matter what you say, I'll feed you trivia anyways.");
        //int earth_age = 45430000000; this would result in an integer overflow
        System.out.print("The earth's age is estimated to be around " + earth_age + " years old.");

        try {
          double agerelative2earth = (a/ (earth_age * 365.0)) * 100;
          //compound expression
          System.out.print("That'll mean your age is around " + agerelative2earth + "% of Earth's age.");
        }
        catch (ArithmeticException zero) {
          System.out.println("Please disregard this piece of trivia since a division by zero occured.");
        }

        System.out.println("\nPress enter to continue");
        String resume = scan.nextLine();
        Transitions.clearScreen();
    }
}
