public class Building{
    private String color;
    private int windows;
    private int doors;
    private String name;

    public Building(String color, int windows, int doors, String name){
        this.color = color;
        this.windows = windows;
        this.doors = doors;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getWindows(){
        return windows;
    }

    public int getDoors(){
        return doors;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        return "Named " + name + " this beauteous " + color + " building is truly stunning, with " + windows + " windows, and " + doors + "doors";
    }




}