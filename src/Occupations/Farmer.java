//able to sell crops and animal products
public class Farmer extends Occupation{
    int crops;

    public Farmer(String job, int crops){
        super("farmer");
        this.crops = crops;
    }

    public void farmCrop(){
        crops += 1;
    }
}