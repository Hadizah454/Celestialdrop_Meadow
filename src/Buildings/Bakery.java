public class Bakery extends Building{
    private int ovens;
    private int displayWindows;
    public static int totalBakes = 0; //total items made
    private int threshold = 0; //product threshold

    public Bakery(String color, int windows, int doors, String name, int ovens, int displayWindows){
        super(color, windows, doors, name);
        this.ovens = ovens;
        this.displayWindows = displayWindows;
    }

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

    public int getOvens(){
        return ovens;
    }

    public int getThreshold(){
        return threshold;
    }

    public int getDisplayWindows(){
        return displayWindows;
    }

    public String toString(){
        return "The beautiful bakery " + super.getName() + " is a wonderful " + super.getColor() + " establishment, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, " + ovens + " ovens, and " + displayWindows + " magnificent display windows!";
    }
}