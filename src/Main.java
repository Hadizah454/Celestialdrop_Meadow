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
        //find the thingy
        System.out.println("How many doors do you want?");
        int dNum = input.nextInt();
        //find the thingy
        System.out.println("How many windows do you want?");
        int wNum = input.nextInt();
        //find the thingy
        System.out.println("Do you want your house to have multiple floors? y or n?");
        //if(input.nextLine().equals("y")){
      //    boolean floors == true;
        //}
        House home = new House(col, wNum, dNum, bName, 1, rNum, true);
      }else if(job.equals("baker")){
        
      }else if(job.equals("farmer")){
        
      }else if(job.equals("blacksmith")){
        
      }else{
        System.out.println("That ain't an option bud");
      }
      
      
      //do you want to build your fine establishment(needed to make cash) y or n?

      //yes

      //no

      }
}