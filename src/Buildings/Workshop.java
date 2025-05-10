public class Workshop extends Building{

    int anvil;
    int forgeSize;

    public Workshop(String color, int windows, int doors, String name, int anvil, int forgeSize){
        super(color, windows, doors, name);
        this.anvil = anvil;
        this.forgeSize = forgeSize;
    }

    //make method that shows how many products can be made per day depending on the forge size
    //forge size 1 == 3 products
    //forge size 2 == 6 prodcuts
    //forge size 3 == 9 products

    //also please make sure that the range that the forge size can be chosen is between 1 and 3

    //make toString
    @Override
    public String toString(){
        return "The wonderous workshop " + name + " is a wonderful " + color + " establishment, with " + windows + " windows, " + doors + " doors, " + anvil + " anvils, and a forge with a size " + forgeSize + " times the standard size!";
    }
}