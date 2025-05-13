import java.util.ArrayList;

public class Player{
    public static int days = 0;
    public static int money = 2000;
    public static ArrayList<Item> inventory = new ArrayList<>();
    private Occupation occupation;
    private Building building;

    /**
     * Creates a new Player and gives it the specified occupation
     * @param occupation - the occupation of the player
     */
    public Player(Occupation occupation){
        this.occupation = occupation;
    }

    /**
     * returns the occupation of the player
     * @return
     */
    public Occupation getOccupation(){
        return occupation;
    }

    /**
     * returns the building the player owns
     * @return
     */
    public Building getBuilding(){
        return building;
    }

    /**
     * adds an item to the inventory
     * @param o - an item
     */
    public void addToInventory(Item o){
        inventory.add(o);
    }

    /**
     * adds a product of the player to the inventory
     * @param o - the product
     */
    public void addProductToInventory(Item o){
        inventory.add(0, o);
    }

    /**
     * simulates the sale of an item made by the player
     * @param ob - the item being sold
     */
    public void sell(Item ob){
        money = money + ob.getCost();
        inventory.remove(ob);
    }

    /**
     * simulates the purchase of an item made by the player
     * @param obj - the item being bought
     */
    public void purchase(Item obj){
        money = money - obj.getCost();
        inventory.add(obj);
    }

    /**
     * returns the stats of the player
     * @return
     */
    public String stats(){
        return "Starcoins: " + money + "\n" + "Days played: " + days + "\n" + "Job: " + occupation.getJob() + "\n" + "Building: " + building + "\n" + "Items in inventory: " + inventory.size();
    }

    /**
     * returns a description of the player
     */
    public String toString(){
        return "Our wonderous player, is a " + occupation.getJob() + " who resides within a " + building +" has " + inventory.size() + " items in their inventory and has " + money + " starcoins in the bank! They have played for a magnificent " + days + " days!";
    }
}