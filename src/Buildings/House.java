

public class House extends Building{
    private int gardens;
    private int rooms;
    private boolean singleFloor;
    private int prettinesFactor = 0;

    public House(String color, int windows, int doors, String name, int gardens, int rooms, boolean singleFloor){
        super(color, windows, doors, name);
        this.gardens = gardens;
        this.rooms = rooms;
        this.singleFloor = singleFloor;
    }

    //try to get it so that this method will be called every 3 days
    public int prettinessFactor(){
        if(gardens == 0){
            System.out.println("It's an alright house");
            return 0;
        }else if(gardens > 0 && gardens < 2){
            System.out.println("Wow, nice place!");
            return 1;
        }else{
            System.out.println("I-i can't believe my eyes! This is the most illustrious building I have ever layed my eyes upon. This this house... it's an absolute masterpiece!!!");
            return 2;
        }

        
    }

    public int getGardens(){
        return gardens;
    }

    public int getRooms(){
        return rooms;
    }

    public boolean isSingleFloor(){
        return singleFloor;
    }

    public int getPretty(){
        return prettinesFactor;
    }
    
    @Override
    public String toString(){
        if(singleFloor == true){
            return "Named " + super.getName() + " this handsome " + super.getColor() + " single story house is truly a home, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, " + rooms + " rooms and " + gardens + " gardens!";
        }else{
            return "Named " + super.getName() + " this handsome " + super.getColor() + " multi-story house is truly a home, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, " + rooms + " rooms and " + gardens + " gardens!";
        }
    }
}