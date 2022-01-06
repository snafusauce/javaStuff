import java.util.ArrayList;
import java.util.Scanner;
public class PlayerDriver {

    static Scanner scan = new Scanner(System.in); //scanner object
    static int players = 0; //the number of players the user will update
    static ArrayList<Player> playerList = new ArrayList<Player>(); //our list of player objects
    static String[] places = { //places text list for easy reading
        "first", 
        "second", 
        "third",
        "fourth", 
        "fith", 
        "sixth", 
        "seventh", 
        "eighth", 
        "ninth", 
        "tenth" };
    
    public static void main (String [] args){
    
        System.out.print("Hello! How many players would you like to enter today? ");
        //call our input function which checks for ints
        players = input();
        if(players == 0){
            System.out.println("You've opted for zero players.\n ");

        }
        else if (players <= 10){
            scan.nextLine(); // Flush the buffer

            System.out.println("\nExcellent. Let’s get started!\n");
    
            looper(players);
    
            recap(players); 
        }

        else {
            System.out.println("\nThe program limit is 10, please run the program again with a reasonable range.");
        }


        System.out.println("\nThank you for using our services. Good Bye! ");

    }

    public static int input() {
        while (!scan.hasNextInt()) {
            scan.nextLine(); // Flush the buffer
            System.out.println("Sorry, please enter an integer between 1 and 10: ");
        }

        return scan.nextInt();
    }




    public static int crayons(String crayon){
        crayon = crayon.toUpperCase();
        for (Player.Color colors : Player.Color.values()) {
            if(colors.toString().equals(crayon)){
                return colors.ordinal();
            }
        }
        int test = -1;
        System.out.print(test);
        return test;
    } 

    public static void looper(int count){
        for(int i = 0; i < count; i++){
            System.out.print("What is the " + places[i] + " player's name? ");
            playerList.add(new Player(scan.nextLine()));

            System.out.print("Is the " + places[i] + " player left- or right-handed? Please enter l or left for left-handed and r or right for right-handed: ");
            playerList.get(i).setHanded(scan.nextLine());

            System.out.print("What level is the " + places[i] + " player? ");
            playerList.get(i).setLevel(scan.nextInt());

            System.out.print("What is the " + places[i] + " player’s favorite color? ");
            scan.nextLine(); // Flush the buffer
            playerList.get(i).setColor(crayons(scan.nextLine()));

            System.out.println("\nThank you!");
        }

    }

    public static void recap(int count){
        String[] playerCounts = {
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten"
        };
        String countText = playerCounts[count -1];

        System.out.println("According to my records, we have " + countText + " player’s in our records.");
        for(int i = 0; i < count; i++){
            System.out.println(playerList.get(i).toString());
        }
    }

}
