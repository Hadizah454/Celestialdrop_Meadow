public class Barn extends Building{

    private int sections;
    private boolean stables;
    private int chickens;
    private int cows;
    private int ducks;
    private int sheep;
    private int goats;

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

    public int getChickens(){
        return chickens;
    }

    public int getCows(){
        return cows;
    }

    public int getDucks(){
        return ducks;
    }

    public int getSheep(){
        return sheep;
    }

    public int getGoats(){
        return goats;
    }

    public int getSections(){
        return sections;
    }

    public boolean hasStables(){
        return stables;
    }


    public String toString(){
        if(stables == true){
            return "The beauteous barn " + super.getName() + " is a wonderful " + super.getColor() + " establishment, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, and " + sections + " sections complete with its very own stable";
        }else{
            return "The beauteous barn " + super.getName() + " is a wonderful " + super.getColor() + " establishment, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, and " + sections + " sections";
        }
        
    }
}