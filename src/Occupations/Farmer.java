//able to sell crops and animal products
public class Farmer extends Occupation{
    private int crops;

    /**
     * Creates a new Farmer with the job set to farmer; and the specified number of crops
     * @param job - the name of the job[preset to farmer]
     * @param crops - the number of crops the farmer has
     */
    public Farmer(String job, int crops){
        super("farmer");
        this.crops = crops;
    }

    /**
     * returns the number of crops the farmer has
     * @return
     */
    public int getCrops(){
        return crops;
    }

    /**
     * harvests a new crop and adds it to the crops that the farmer has
     */
    public void farmCrop(){
        crops += 1;
    }
}