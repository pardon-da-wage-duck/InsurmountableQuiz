import java.util.Scanner;
public class Userprofile {
    private String name;
    private int age;
    private int wins;
    private int losses;
    private Scanner scan = new Scanner(System.in);

    public Userprofile(String n, int a){
        name = n;
        age = a;
        wins = 0;
        losses = 0;
    }

    public int getAge(){
        return age;
    }
    public String toString(){
        return name;
    }
    public int getWins(){
        return wins;
    }
    public int getLosses(){
        return losses;
    }
    public void addWin() {
        wins++;
    }
    public void addLosses(){
        losses++;
    }
    public double calcAccuracy(){
        return ((double)wins/(wins+losses))*100;
    }

    public void getProfile(){
        System.out.println("Player name: "+ name);
        System.out.println("Player age: " + age);
        System.out.println("Total number of questions answered: " + (wins + losses));
        System.out.println("Total questions answered correctly: " + wins);
        System.out.println("Total questions answered incorrectly: " + losses);
        System.out.println("Average accuracy: " + calcAccuracy());
        System.out.println("Press enter to return to title screen. ");
        scan.nextLine();
        Transitions.clearScreen();
    }
}

