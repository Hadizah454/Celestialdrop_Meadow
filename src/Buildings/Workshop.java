public class Workshop extends Building{

    private int anvil;
    private int forgeSize;

    public Workshop(String color, int windows, int doors, String name, int anvil, int forgeSize){
        super(color, windows, doors, name);
        this.anvil = anvil;
        this.forgeSize = forgeSize;
    }

    
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

    public int getAnvil(){
        return anvil;
    }

    public int getForgeSize(){
        return forgeSize;
    }

    
    @Override
    public String toString(){
        return "The wonderous workshop " + super.getName() + " is a wonderful " + super.getColor() + " establishment, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, " + anvil + " anvils, and a forge with a size " + forgeSize + " times the standard size!";
    }
}