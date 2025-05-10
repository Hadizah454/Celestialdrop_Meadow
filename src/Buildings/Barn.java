public class Barn extends Building{

    int sections;
    boolean stables;
    int chickens;
    int cows;
    int ducks;
    int sheep;
    int goats;

    public Barn(String color, int windows, int doors, String name, int sections, boolean stables){
        super(color, windows, doors, name);
        this.sections = sections;
        this.stables = stables;
    }


    public void animals(){
        if(sections == 1){
            chickens = 10;
            cows = 0;
            ducks = 0;
            sheep = 0;
            goats = 0;
            System.out.println("You have " + chickens + " chickens!");
        }else if(sections == 2){
            chickens = 5;
            cows = 5;
            ducks = 0;
            sheep = 0;
            goats = 0;
            System.out.println("You have " + chickens + " chickens, and " + cows + " cows!");
        }else if(sections == 3){
            chickens = 5;
            cows = 5;
            ducks = 5;
            sheep = 0;
            goats = 0;
            System.out.println("You have " + chickens + " chickens, " + cows + " cows, and " + ducks + " ducks!");
        }else if(sections == 4){
            chickens = 5;
            cows = 5;
            ducks = 5;
            sheep = 5;
            goats = 0;
            System.out.println("You have " + chickens + " chickens, " + cows + " cows, " + ducks + " ducks, and " + sheep + " sheep!");
        }else{
            chickens = 5;
            cows = 5;
            ducks = 5;
            sheep = 5;
            goats = 5;
            System.out.println("You have " + chickens + " chickens, " + cows + " cows, " + ducks + " ducks, " + sheep + " sheep, and " + goats + "goats!");
        }
    }
    
    public void horses(){
        if(stables == true){
            System.out.println("You have 5 horses!");
        }else{
            System.out.println("You have no horses...");
        }
    }


    public String toString(){
        if(stables == true){
            return "The beauteous barn " + name + " is a wonderful " + color + " establishment, with " + windows + " windows, " + doors + " doors, and " + sections + " sections complete with its very own stable";
        }else{
            return "The beauteous barn " + name + " is a wonderful " + color + " establishment, with " + windows + " windows, " + doors + " doors, and " + sections + " sections";
        }
        
    }
}