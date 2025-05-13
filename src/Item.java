public class Item {
    private String name;
    private int cost;

    /**
     * Creates a new Item with the specified name; and sets the cost of the item
     * @param name - name of the item
     * @param cost - cost of the item
     */
    public Item(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    /**
     * returns the name of the item
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * returns the cost of the item
     * @return
     */
    public int getCost(){
        return cost;
    }

    /**
     * returns a description of the item
     */
    public String toString(){
        return "This fancy " + name + " costs a fine " + cost + " Starcoins!";
    }
}
