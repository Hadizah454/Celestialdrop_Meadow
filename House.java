

public class House extends Building{
    int gardens;
    int rooms;
    boolean singleFloor;
    private int prettinesFactor = 0;

    public House(String color, int windows, int doors, String name, int gardens, int rooms, boolean singleFloor){
        super(color, windows, doors, name);
        this.gardens = gardens;
        this.rooms = rooms;
        this.singleFloor = singleFloor;
    }

    //try to get it so that this method will be called every 3 days
    public void prettinessComment(){
        if(gardens == 0){
            prettinesFactor = 0;
            System.out.println("It's an alright house");
        }else if(gardens > 0 && gardens < 2){
            prettinesFactor = 1;
            System.out.println("Wow, nice place!");
        }else{
            prettinesFactor = 2;
            System.out.println("I-i can't believe my eyes! This is the most illustrious building I have ever layed my eyes upon. This this house... it's an absolute masterpiece!!!");
        }

        if(prettinesFactor == 1){
            Player.money += 5;
        }else if(prettinesFactor == 2){
            Player.money += 10;
        }else{
            Player.money += 0;
        }
    }

    //make to string
}