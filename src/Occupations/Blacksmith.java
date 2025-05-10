//able to sell tools
public class Blacksmith extends Occupation{
    public int tools;

    public Blacksmith(String job, int tools){
        super("blacksmith");
        this.tools = tools;
    }

    public void forgeTool(){
        tools += 1;
    }

}