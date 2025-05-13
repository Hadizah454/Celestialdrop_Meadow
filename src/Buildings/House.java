

public class House extends Building{
    private int gardens;
    private int rooms;
    private boolean singleFloor;
    private int prettinesFactor = 0;

    /**
     * Creates a new House with the specified color, name; whether or not it is a single floor; and the specified number of rooms, gardens, windows, and doors
     * @param color - color of the house
     * @param windows - number of windows the house has
     * @param doors - number of doors the house has
     * @param name - name of the house
     * @param gardens - number of gardens the house has
     * @param rooms - number of rooms the house has
     * @param singleFloor - whether or not the house has a single story
     */
    public House(String color, int windows, int doors, String name, int gardens, int rooms, boolean singleFloor){
        super(color, windows, doors, name);
        this.gardens = gardens;
        this.rooms = rooms;
        this.singleFloor = singleFloor;
    }

    
    /**
     * returns the prettines rating of the house and gives the player a comment depending on how many gardens the house has
     * @return
     */
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

    /**
     * returns the number of gardens the house has
     * @return
     */
    public int getGardens(){
        return gardens;
    }

    /**
     * returns the number of rooms the house has
     * @return
     */
    public int getRooms(){
        return rooms;
    }

    /**
     * returns the boolean that represents whether or not the house has a single story
     * @return
     */
    public boolean isSingleFloor(){
        return singleFloor;
    }

    /**
     * returns the prettiness factor of the house
     * @return
     */
    public int getPretty(){
        return prettinesFactor;
    }
    
    /**
     * returns a description of the house depending on whether or not it is a single story building
     */
    @Override
    public String toString(){
        if(singleFloor == true){
            return "Named " + super.getName() + " this handsome " + super.getColor() + " single story house is truly a home, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, " + rooms + " rooms and " + gardens + " gardens!";
        }else{
            return "Named " + super.getName() + " this handsome " + super.getColor() + " multi-story house is truly a home, with " + super.getWindows() + " windows, " + super.getDoors() + " doors, " + rooms + " rooms and " + gardens + " gardens!";
        }
    }
}