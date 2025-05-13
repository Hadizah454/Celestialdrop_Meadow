public class Workshop extends Building{

    private int anvil;
    private int forgeSize;

    /**
     * Creates a new Workshop with the specified color, name; the size of the forge; and the specified number of anvils, windows, and doors
     * @param color - the color of the workshop
     * @param windows - the number of windows the workshop has
     * @param doors - the number of doors the workshop has
     * @param name - the name of the workshop
     * @param anvil - the number of anvils the workshop has
     * @param forgeSize - the size of the forge
     */
    public Workshop(String color, int windows, int doors, String name, int anvil, int forgeSize){
        super(color, windows, doors, name);
        this.anvil = anvil;
        this.forgeSize = forgeSize;
    }

    
    /**
     * determines how many tools can be made in one day depending on the forge size and returns how many can be made daily
     * @return
     */
    public int productivity(){
        int toolsPerDay;
        if(forgeSize == 1){
            toolsPerDay = 3;
        }else if(forgeSize == 2){
            toolsPerDay = 6;
        }else{
            toolsPerDay = 9;
        }
        return toolsPerDay;
    }

    /**
     * returns the number of anvils the workshop has
     * @return
     */
    public int getAnvil(){
        return anvil;
    }

    /**
     * returns the size of the forge
     * @return
     */
    public int getForgeSize(){
        return forgeSize;
    }

    /**
     * returns a description of the workshop
     */
    @Override
    public String toString(){
        return "The wonderous workshop " + super.getName() + " is a wonderful " + super.getColor() + " establishment, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, " + anvil + " anvils, and a forge with a size " + forgeSize + " times the standard size!";
    }
}