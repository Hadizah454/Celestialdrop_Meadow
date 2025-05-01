public class Building{
    String color;
    int windows;
    int doors;
    String name;

    public Building(String color, int windows, int doors, String name){
        this.color = color;
        this.windows = windows;
        this.doors = doors;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Named " + name + " this beauteous " + color + " building is truly stunning, with " + windows + " windows, and " + doors + "doors";
    }




}