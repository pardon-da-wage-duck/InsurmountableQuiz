public class Shop {
    public void displayItem(Items item){
        System.out.println(item.toString());
    }

    public void shop(String[] args){
        Items item1 = new Items();
        displayItem(item1);
    }

}
