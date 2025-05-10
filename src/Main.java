import java.util.Scanner;
public class Main{
    //make sure their occupation matches the building they bought somehow

    //use if statement to determine how much money they get depending on what prettiness Factor returns (0 1 or 2)
    //if(prettinesFactor == 1){
          //  Player.money += 5;
        //}else if(prettinesFactor == 2){
        //    Player.money += 10;
       //}else{
         //   Player.money += 0;
       // }
      public static void main(String[] args) {
          
      
      Scanner input = new Scanner(System.in);
      int dailyActions = 0;
      boolean gameTime = true;


      System.out.println("Welcome to Celestialdrop Meadow! Please choose your profession:");
      System.out.println("Do you want to be a baker, author, blacksmith, or a farmer?");
      String job = input.nextLine().toLowerCase();
      System.out.println("What color do you want the building to be?");
      String col = input.nextLine().toLowerCase();
      System.out.println("What do you want the name of your building to be?");
      String bName = input.nextLine().toLowerCase();
      
      if(job.equals("author")){
        System.out.println("How many rooms do you want?");
        int rNum = input.nextInt();
        input.nextLine();
        System.out.println("How many doors do you want?");
        int dNum = input.nextInt();
        input.nextLine();
        System.out.println("How many windows do you want?");
        int wNum = input.nextInt();
        input.nextLine();
        System.out.println("Do you want your house to have multiple floors? y or n?");
        boolean floors;
        if(input.nextLine().equals("y")){
          floors = true;
        }else{
          floors = false;
        }
        System.out.println("How many gardens do you want?(Each garden costs 10 Starcoins to make)");
        int gNum = input.nextInt();
        input.nextLine();
        Author a = new Author("author", 10);
        Player you = new Player(a);
        House home = new House(col, wNum, dNum, bName, gNum, rNum, floors);
        Player.money -= (home.gardens * 10);
        Object book = new Object("book", 10);
        for(int i = 0; i < 10; i++){
          you.addProductToInventory(book);
        }
        home.toString();

        // make a new book every 3 days
      }else if(job.equals("baker")){
        System.out.println("How many doors do you want?");
        int bdNum = input.nextInt();
        input.nextLine();
        System.out.println("How many windows do you want?");
        int bwNum = input.nextInt();
        input.nextLine();
        System.out.println("How many ovens do you want?");
        int oNum = input.nextInt();
        System.out.println("How many display windows do you want?");
        int dWNum = input.nextInt();
        input.nextLine();
        Baker b = new Baker("baker", 10);
        Player you = new Player(b);
        Bakery baking = new Bakery(col, bwNum, bdNum, bName, oNum, dWNum);
        Object pastry = new Object("pastry", 10);
        for(int i = 0; i < 10; i++){
          you.addProductToInventory(pastry);
        }
        
        baking.toString();
      }else if(job.equals("farmer")){
        System.out.println("How many doors do you want?");
        int badNum = input.nextInt();
        input.nextLine();
        System.out.println("How many windows do you want?");
        int bawNum = input.nextInt();
        input.nextLine();
        System.out.println("How many sections do you want?(must have a minimum of one but can only have 5 max)");
        int sNum = input.nextInt();
        input.nextLine();
        System.out.println("Do you want stables? It'll cost extra tho(50 starcoins)...(y or n)?");
        boolean stables;
        if(input.nextLine().equals("y")){
          stables = true;
          Player.money -= 50;
        }else{
          stables = false;
        }

        Farmer f = new Farmer("farmer", 10);
        Player you = new Player(f);
        Object crop = new Object("crop", 5);
        for(int i = 0; i < 10; i++){
          you.addProductToInventory(crop);
        }
        Barn barned = new Barn(col, bawNum, badNum, bName, sNum, stables);
        barned.toString();


      }else if(job.equals("blacksmith")){
        System.out.println("How many doors do you want?");
        int wdNum = input.nextInt();
        input.nextLine();
        System.out.println("How many windows do you want?");
        int wwNum = input.nextInt();
        input.nextLine();
        System.out.println("How many anvils do you want?");
        int aNum = input.nextInt();
        System.out.println("What size[whole number] do you want the forge to be(size increase you have[must have minimum 1 and maximum 3, you pay an extra 30 starcoins])?");
        int fsize = input.nextInt();
        input.nextLine();
        Blacksmith bl = new Blacksmith("blacksmith", 10);
        Player you = new Player(bl);
        Workshop workin = new Workshop(col, wwNum, wdNum, bName, aNum, fsize);
        Object tool = new Object("tool", 15);
        for(int i = 0; i < 10; i++){
          you.addProductToInventory(tool);
        }
        Player.money -= (workin.forgeSize * 30);
        workin.toString();
      }else{
        System.out.println("That ain't an option bud");
      }
      

      }
}