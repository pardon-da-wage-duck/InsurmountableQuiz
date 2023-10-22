public class Items {
    private String name;
    private String effects;
    private String description;
    private double cost;
    private int amount;


    public void createItem(String n, String e, double c, int a){
        name = n;
        effects = e;
        cost = c;
        amount = a;
    }

    public void createItem(String n, String e, String d, double c, int a){
        name = n;
        effects = e;
        description = d;
        cost = c;
        amount = a;
    }

    public String toString(){
        return name + "\n" + effects + "\n" + description;
    }
}
