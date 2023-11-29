import java.util.Scanner;

public class Shop {
    private Scanner scan = new Scanner(System.in);

    public void shopScren(Userprofile profile){
        System.out.println("Welcome to the in-game Shop!");
        scan.nextLine();
        Transitions.clearScreen();
    }

    public void displayItem(Items item){
        System.out.println(item.toString());
    }

}
