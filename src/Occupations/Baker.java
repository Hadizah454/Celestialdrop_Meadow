//able to sell baked goods
public class Baker extends Occupation{
    private int bakedGoods;

    /**
     * Creates a new Baker with the job set to baker; and the specified number of baked goods
     * @param job - the name of the job[preset to baker]
     * @param bakedGoods - the number of baked Goods the baker has
     */
    public Baker(String job, int bakedGoods){
        super("baker");
        this.bakedGoods = bakedGoods;
    }

    /**
     * returns the number of baked goods the baker has
     * @return
     */
    public int getBakedGoods(){
        return bakedGoods;
    }

    /**
     * makes a new pastry and adds it to the baked goods that the baker has
     */
    public void bakePastry(){
        bakedGoods += 1;
    }

}