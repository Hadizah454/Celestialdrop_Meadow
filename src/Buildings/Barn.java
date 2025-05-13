public class Barn extends Building{

    private int sections;
    private boolean stables;
    private int chickens;
    private int cows;
    private int ducks;
    private int sheep;
    private int goats;

    /**
     * Creates a new Barn with the specified color, name; whether or not it has stables; and the specified number of sections, windows, and doors
     * @param color - color of the barn
     * @param windows - number of windows the barn has
     * @param doors - number of doors the barn has
     * @param name - name of the barn
     * @param sections - number of sections the barn has
     * @param stables - whether or not the barn has stables
     */
    public Barn(String color, int windows, int doors, String name, int sections, boolean stables){
        super(color, windows, doors, name);
        this.sections = sections;
        this.stables = stables;
    }


    /**
     * determines how many of each animal the player has depending on how mnay sections the barn has
     */
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
    
    /**
     * tells the player how many horses they have depending on if they have stables or not
     */
    public void horses(){
        if(stables == true){
            System.out.println("You have 5 horses!");
        }else{
            System.out.println("You have no horses...");
        }
    }

    /**
     * returns the number of chickens the player has
     * @return
     */
    public int getChickens(){
        return chickens;
    }

    /**
     * returns the number of cows the player has
     */
    public int getCows(){
        return cows;
    }

    /**
     * returns the number of ducks the player has
     * @return
     */
    public int getDucks(){
        return ducks;
    }

    /**
     * returns the number of sheep the player has
     * @return
     */
    public int getSheep(){
        return sheep;
    }

    /**
     * returns the number of goats the player has
     * @return
     */
    public int getGoats(){
        return goats;
    }

    /**
     * returns the number of sections the barn has
     * @return
     */
    public int getSections(){
        return sections;
    }

    /**
     * returns the boolean that represents whether or not the barn has stables
     * @return
     */
    public boolean hasStables(){
        return stables;
    }


    /**
     * returns a description of the barn depending on if it has stables or not
     */
    @Override
    public String toString(){
        if(stables == true){
            return "The beauteous barn " + super.getName() + " is a wonderful " + super.getColor() + " establishment, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, and " + sections + " sections complete with its very own stable";
        }else{
            return "The beauteous barn " + super.getName() + " is a wonderful " + super.getColor() + " establishment, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, and " + sections + " sections";
        }
        
    }
}