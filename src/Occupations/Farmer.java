//able to sell crops and animal products
public class Farmer extends Occupation{
    private int crops;

    public Farmer(String job, int crops){
        super("farmer");
        this.crops = crops;
    }

    public int getCrops(){
        return crops;
    }

    public void farmCrop(){
        crops += 1;
    }
}