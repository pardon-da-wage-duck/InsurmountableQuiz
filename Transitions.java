public class Transitions {
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
}
