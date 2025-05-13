//able to sell tools
public class Blacksmith extends Occupation{
    private int tools;

    public Blacksmith(String job, int tools){
        super("blacksmith");
        this.tools = tools;
    }

    public int getTools(){
        return tools;
    }

    public void forgeTool(){
        tools += 1;
    }

}