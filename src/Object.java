public class Object {
    private String name;
    private int cost;

    public Object(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName(){
        return name;
    }

    public int getCost(){
        return cost;
    }

    public String toString(){
        return "This fancy " + name + " costs a fine " + cost + " Starcoins!";
    }
}
