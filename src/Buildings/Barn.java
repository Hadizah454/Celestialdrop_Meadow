public class Barn extends Building{

    int sections;
    boolean stables;

    public Barn(String color, int windows, int doors, String name, int sections, boolean stables){
        super(color, windows, doors, name);
        this.sections = sections;
        this.stables = stables;
    }

    //make a class the adds the different types of animals one can have in this order:
    //1 section = chickens
    //2 sections = chickens, and cows
    //3 sections = chickens, and cows and ducks.
    //4 sections = chickens cows ducks and sheep.
    //5 sections = chickens cows ducks sheep and goats.
    //max sections you can have is 5
    //make sure this class lets the player know which animals they have at this moment, also each animal produces 3 units of their product per day

    //make a class that lets the player know how many horses they have and allows them to buy more if they would like

   
    //make tostring
}