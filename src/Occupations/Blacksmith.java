//able to sell tools
public class Blacksmith extends Occupation{
    private int tools;

    /**
     * Creates a new Blacksmith with the job set to blacksmith; and the specified number of tools
     * @param job - the name of the job[preset to blacksmith]
     * @param tools - the number of tools the blacksmith has
     */
    public Blacksmith(String job, int tools){
        super("blacksmith");
        this.tools = tools;
    }

    /**
     * returns the number of tools the blacksmith has
     * @return
     */
    public int getTools(){
        return tools;
    }

    /**
     * makes a new tool and adds it to the tools the blacksmith has
     */
    public void forgeTool(){
        tools += 1;
    }

}