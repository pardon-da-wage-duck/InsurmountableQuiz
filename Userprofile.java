import java.util.Scanner;
public class Userprofile {
    private String name;
    private int age;
    private int wins = 0;
    private int losses = 0;
    private Scanner scan = new Scanner(System.in);

    public void createprofile(String n, int a){
        name = n;
        age = a;
    }
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void addWin() {
        wins++;
    }
    public void addLosses(){
        losses++;
    }
    public int getWins(){
        return wins;
    }
    public int getLosses(){
        return losses;
    }
}

