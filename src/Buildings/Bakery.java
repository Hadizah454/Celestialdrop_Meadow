public class Bakery extends Building{
    private int ovens;
    private int displayWindows;
    public static int totalBakes = 0; //total items made
    private int threshold = 0; //product threshold

    /**
     *  Creates a new Bakery with the specified color, name; and the specified number of ovens, Display Windows, windows, and doors
     * @param color - color of the bakery
     * @param windows - number of windows the bakery has
     * @param doors - number of doors the bakery has
     * @param name - name of the bakery
     * @param ovens - number of ovens the bakery has
     * @param displayWindows - number of display windows the bakery has
     */
    public Bakery(String color, int windows, int doors, String name, int ovens, int displayWindows){
        super(color, windows, doors, name);
        this.ovens = ovens;
        this.displayWindows = displayWindows;
    }

    /**
     * Determines how many bakedGoods can be produced in one day based on how many ovens the bakery has
     */
    public void ovenBehavior(){
        if(ovens == 1){
            threshold = 5;
        }else if(ovens == 2){
            threshold = 10;
        }else if(ovens == 3){
            threshold = 15;
        }else{
            threshold = 0;
        }
    }

    /**
     * returns the number of ovens the bakery has
     * @return
     */
    public int getOvens(){
        return ovens;
    }

    /**
     * returns the threshold of the bakery[how many baked goods it can make in one day]
     * @return
     */
    public int getThreshold(){
        return threshold;
    }

    /**
     * returns the number of display windows the bakery has
     * @return
     */
    public int getDisplayWindows(){
        return displayWindows;
    }

    /**
     * returns a discription of the bakery
     */
    @Override
    public String toString(){
        return "The beautiful bakery " + super.getName() + " is a wonderful " + super.getColor() + " establishment, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, " + ovens + " ovens, and " + displayWindows + " magnificent display windows!";
    }
}