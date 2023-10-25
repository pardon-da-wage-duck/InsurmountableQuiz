import java.util.Scanner;
public class Userprofile {
    private String name;
    private int age;
    private int wins;
    private int losses;

    public Userprofile(String n, int a){
        name = n;
        age = a;
        wins = 0;
        losses = 0;
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

