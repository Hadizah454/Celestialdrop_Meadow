//able to sell baked goods
public class Baker extends Occupation{
    private int bakedGoods;

    public Baker(String job, int bakedGoods){
        super("baker");
        this.bakedGoods = bakedGoods;
    }

    public int getBakedGoods(){
        return bakedGoods;
    }

    public void bakePastry(){
        bakedGoods += 1;
    }

}