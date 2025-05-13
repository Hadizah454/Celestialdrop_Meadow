import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dailyActions = 0;
        boolean gameTime = true;

        Player you = null;

        System.out.println("Welcome to Celestialdrop Meadow! Please choose your profession:");
        System.out.println("Do you want to be a baker, author, blacksmith, or a farmer?");
        String job = input.nextLine().toLowerCase();

        if (job.equals("author")) {
            // Get building info
            System.out.println("What color do you want the building to be?");
            String col = input.nextLine().toLowerCase();
            System.out.println("What do you want the name of your building to be?");
            String bName = input.nextLine();
            System.out.println("How many rooms do you want?");
            int rNum = input.nextInt(); input.nextLine();
            System.out.println("How many doors do you want?");
            int dNum = input.nextInt(); input.nextLine();
            System.out.println("How many windows do you want?");
            int wNum = input.nextInt(); input.nextLine();
            System.out.println("Do you want your house to have multiple floors? y or n?");
            boolean floors = input.nextLine().equals("y");
            System.out.println("How many gardens do you want?(Each garden costs 10 Starcoins to make)");
            int gNum = input.nextInt(); input.nextLine();

            Author a = new Author("author", 10);
            you = new Player(a);
            House home = new House(col, wNum, dNum, bName, gNum, rNum, floors);
            Player.money -= (home.getGardens() * 10);
            Item book = new Item("book", 10);
            for (int i = 0; i < 10; i++) {
                Player.inventory.add(book);
            }
            System.out.println(home);

        } else if (job.equals("baker")) {
            System.out.println("What color do you want the building to be?");
            String col = input.nextLine().toLowerCase();
            System.out.println("What do you want the name of your building to be?");
            String bName = input.nextLine();
            System.out.println("How many doors do you want?");
            int bdNum = input.nextInt(); input.nextLine();
            System.out.println("How many windows do you want?");
            int bwNum = input.nextInt(); input.nextLine();
            System.out.println("How many ovens?");
            int oNum = input.nextInt();
            System.out.println("How many display windows?");
            int dWNum = input.nextInt(); input.nextLine();

            Baker b = new Baker("baker", 10);
            you = new Player(b);
            Bakery baking = new Bakery(col, bwNum, bdNum, bName, oNum, dWNum);
            Item pastry = new Item("pastry", 10);
            for (int i = 0; i < 10; i++) Player.inventory.add(pastry);
            System.out.println(baking);

        } else if (job.equals("farmer")) {
            System.out.println("What color do you want the building to be?");
            String col = input.nextLine().toLowerCase();
            System.out.println("What do you want the name of your building to be?");
            String bName = input.nextLine();
            System.out.println("How many doors?");
            int badNum = input.nextInt(); input.nextLine();
            System.out.println("How many windows?");
            int bawNum = input.nextInt(); input.nextLine();
            System.out.println("Sections (1-5)?");
            int sNum = input.nextInt(); input.nextLine();
            System.out.println("Do you want stables (50 starcoins)? (y/n)");
            boolean stables = input.nextLine().equals("y");
            if (stables) Player.money -= 50;

            Farmer f = new Farmer("farmer", 10);
            you = new Player(f);
            Barn barn = new Barn(col, bawNum, badNum, bName, sNum, stables);
            Item crop = new Item("crop", 5);
            for (int i = 0; i < 10; i++) Player.inventory.add(crop);
            System.out.println(barn);

        } else if (job.equals("blacksmith")) {
            System.out.println("What color do you want the building to be?");
            String col = input.nextLine().toLowerCase();
            System.out.println("What do you want the name of your building to be?");
            String bName = input.nextLine();
            System.out.println("Doors?");
            int wdNum = input.nextInt(); input.nextLine();
            System.out.println("Windows?");
            int wwNum = input.nextInt(); input.nextLine();
            System.out.println("Anvils?");
            int aNum = input.nextInt();
            System.out.println("Forge size (1-3)? (30 starcoins per size)");
            int fsize = input.nextInt(); input.nextLine();

            Blacksmith bl = new Blacksmith("blacksmith", 10);
            you = new Player(bl);
            Workshop shop = new Workshop(col, wwNum, wdNum, bName, aNum, fsize);
            Item tool = new Item("tool", 15);
            for (int i = 0; i < 10; i++) Player.inventory.add(tool);
            Player.money -= (shop.getForgeSize() * 30);
            System.out.println(shop);
        } else {
            System.out.println("That ain't an option bud");
            input.close();
            return;
        }

        // Main game loop
        while (gameTime) {
            if (dailyActions >= 24) {
                Player.days++;
                dailyActions = 0;
                System.out.println("\nA new day begins! It is now Day " + Player.days + ".");
            }

            System.out.println("\nChoose an action:");
            System.out.println("[1] Buy items\n[2] Sell items\n[3] Advance day\n[4] Have conversation\n[5] View money\n[6] Quit\n[7] View inventory\n[8] View stats");
            String choice = input.nextLine();
            dailyActions++;

            switch (choice) {
                case "1":
                    System.out.println("What would you like to buy?");
                    System.out.println("Options: flour, iron, paper, seeds, hot cocoa, tea or honey?");
                    String itemName = input.nextLine().toLowerCase();
                    int price = getItemPrice(itemName);
                    if (price > 0 && Player.money >= price) {
                        Player.inventory.add(new Item(itemName, price));
                        Player.money -= price;
                        System.out.println("Bought " + itemName + " for $" + price);
                    } else if (price == 0) {
                        System.out.println("Unknown item.");
                    } else {
                        System.out.println("Not enough money.");
                    }
                    break;

                case "2":
                    if (Player.inventory.isEmpty()) {
                        System.out.println("Your inventory is empty!");
                    } else {
                        for (int i = 0; i < Player.inventory.size(); i++) {
                            System.out.println("[" + i + "] " + Player.inventory.get(i).getName());
                        }
                        System.out.println("Which item do you want to sell?(Enter the number of the item)");
                        int idx = input.nextInt(); 
                        input.nextLine();
                        Player.money += Player.inventory.get(idx).getCost() * 2;
                        Player.inventory.remove(idx);
                    }
                    break;

                case "3":
                    Player.days++;
                    dailyActions = 0;
                    System.out.println("You rest. It is now Day " + Player.days);
                    break;

                case "4":
                    System.out.println("You chat with a villager. They share a story about the old days.");
                    System.out.println("And that my dear is why Austrailians have weird but adorable acccents, it was all me!");
                    System.out.println("I forgot to mention that sweet Nellie has dementia, whoops");
                    break;

                case "5":
                    System.out.println("You have $" + Player.money);
                    break;

                case "6":
                    gameTime = false;
                    System.out.println(you.stats());
                    System.out.println(you.toString());
                    System.out.println("Game over. Thanks for playing!");
                    break;

                case "7":
                    if (Player.inventory.isEmpty()) {
                        System.out.println("Your inventory is empty.");
                    } else {
                        System.out.println("Inventory:");
                        for (Item item : Player.inventory) {
                            System.out.println("- " + item);
                        }
                    }
                    break;

                case "8":
                    System.out.println("Stats:");
                    System.out.println(you.stats());
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        input.close();
    }


      


      public static int getItemPrice(String item) {
        switch (item) {
            case "flour": return 10;
            case "iron": return 15;
            case "paper": return 5;
            case "seeds": return 8;
            case "hot cocoa": return 6;
            case "tea": return 6;
            case "honey": return 7;
            default: return 0;
        }
      }
}