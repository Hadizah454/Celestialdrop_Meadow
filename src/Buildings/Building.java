public class Building{
    private String color;
    private int windows;
    private int doors;
    private String name;

    /**
     * Creates a new Building with the specified color, name; and the specified number of windows, and doors
     * @param color - color of the building
     * @param windows - number of windows the building has
     * @param doors - number of doors the building has
     * @param name - name of the building
     */
    public Building(String color, int windows, int doors, String name){
        this.color = color;
        this.windows = windows;
        this.doors = doors;
        this.name = name;
    }

    /**
     * returns the name of the building
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * returns the number of windows the building has
     * @return
     */
    public int getWindows(){
        return windows;
    }

    /**
     * returns the number of doors the building has
     * @return
     */
    public int getDoors(){
        return doors;
    }

    /**
     * returns the color of the building
     * @return
     */
    public String getColor(){
        return color;
    }

    /**
     * returns the description of the building
     */
    public String toString(){
        return "Named " + name + " this beauteous " + color + " building is truly stunning, with " + windows + " windows, and " + doors + "doors";
    }




}