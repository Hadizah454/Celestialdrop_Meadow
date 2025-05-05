import java.util.ArrayList;

public class Player{
    public static int days = 0;
    public static int money = 2000;
    private ArrayList<String> inventory;
    private Occupation occupation;
    private Building building;

    public Player(Occupation occupation){
        this.occupation = occupation;
        this.building = building;
        this.inventory = new ArrayList<>();
    }

    public Occupation getOccupation(){
        return occupation;
    }

    public Building getBuilding(){
        return building;
    }

    //public static void incrementActions(){} <- put in main class(where the event loop is)

    //public void build(Building b){
       // if(occupation.canBuild(b.getName()) == true){
          //  this.building = b;
        //    System.out.println("You have successfully built a very fine " + b.getName() + "!");
      //  }
   // }

    public void sell(){}

    public void purchase(){}

    public static void stats(){}

    //what else should this class have?
}