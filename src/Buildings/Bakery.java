public class Bakery extends Building{
    int ovens;
    int displayWindows;
    static int totalBakes = 0; //total items made
    int threshold = 0; //product threshold

    public Bakery(String color, int windows, int doors, String name, int ovens, int displayWindows){
        super(color, windows, doors, name);
        this.ovens = ovens;
        this.displayWindows = displayWindows;
    }

    //make sure the player knows the max amount of ovens that can be added is 3
    //can choose how much product they want to sell as long as it is under or equal to the threshold
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

    public String toString(){
        return "The beautiful bakery " + name + " is a wonderful " + color + " establishment, with " + windows + " windows, " + doors + " doors, " + ovens + " ovens, and " + displayWindows + " magnificent display windows!";
    }
}