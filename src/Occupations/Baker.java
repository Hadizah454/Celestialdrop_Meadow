//able to sell baked goods
public class Baker extends Occupation{
    int bakedGoods;

    public Baker(String job, int bakedGoods){
        super("baker");
        this.bakedGoods = bakedGoods;
    }

    @Override
    public boolean canBuild(String building){
        return building.equals("bakery");
    }
}