import java.util.ArrayList;

public class Player{
    public static int days = 0;
    public static int money = 2000;
    public static ArrayList<Item> inventory = new ArrayList<>();
    private Occupation occupation;
    private Building building;

    public Player(Occupation occupation){
        this.occupation = occupation;
    }

    public Occupation getOccupation(){
        return occupation;
    }

    public Building getBuilding(){
        return building;
    }

    public void addToInventory(Item o){
        inventory.add(o);
    }

    public void addProductToInventory(Item o){
        inventory.add(0, o);
    }
    //public static void incrementActions(){} <- put in main class(where the event loop is)

    public void sell(Item ob){
        money = money + ob.getCost();
        inventory.remove(ob);
    }

    public void purchase(Item obj){
        money = money - obj.getCost();
        inventory.add(obj);
    }

    public String stats(){
        return "Starcoins: " + money + "\n" + "Days played: " + days + "\n" + "Job: " + occupation.getJob() + "\n" + "Building: " + building + "\n" + "Items in inventory: " + inventory.size();
    }

    public String toString(){
        return "Our wonderous player, is a " + occupation.getJob() + " who resides within a " + building +" has " + inventory.size() + " items in their inventory and has " + money + " starcoins in the bank! They have played for a magnificent " + days + " days!";
    }
}