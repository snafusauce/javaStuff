import java.util.ArrayList;
import java.util.Scanner;
public class PlayerDriver {

    //unsure if I'm allowed to place variables up here
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

        //some weak input handling in this block
        if(players == 0){
            System.out.println("You've opted for zero players.\n ");

        }
        else if (players <= 10){
            scan.nextLine(); // Flush the buffer

            System.out.println("\nExcellent. Let’s get started!\n");
            //call a function that loops through the desired player count
            looper(players);
            //call a function that recaps the provided player objects
            recap(players); 
        }

        else {
            System.out.println("\nThe program limit is 10, please run the program again with a reasonable range.");
        }


        System.out.println("\nThank you for using our services. Good Bye! ");

    }
        //check for int input
    public static int input() {
        //unsure how to also check for a 1 - 10 range here
        while (!scan.hasNextInt()) {
            scan.nextLine(); // Flush the buffer
            System.out.println("Sorry, please enter an integer between 1 and 10: ");
        }

        return scan.nextInt();
    }




    public static int crayons(String crayon){
        //take a crayon input that a normal human would input
        crayon = crayon.toUpperCase(); //change it to uppercase

        //loop through the enum thing to match the color
        for (Player.Color colors : Player.Color.values()) {
            if(colors.toString().equals(crayon)){
                //return the enum place
                return colors.ordinal();
            }
        }

        //this block can be used to check the input, but it's not implemented yet
        int test = -1;
        System.out.print(test);
        return test;
    } 

    //this function loops through the user count to create a payer object insude the PlayerList arrayList
    public static void looper(int count){
        //l
        for(int i = 0; i < count; i++){
            //what's the name
            System.out.print("What is the " + places[i] + " player's name? ");
            playerList.add(new Player(scan.nextLine()));
            //hand info
            System.out.print("Is the " + places[i] + " player left- or right-handed? Please enter l or left for left-handed and r or right for right-handed: ");
            playerList.get(i).setHanded(scan.nextLine());
            //level info
            System.out.print("What level is the " + places[i] + " player? ");
            playerList.get(i).setLevel(scan.nextInt());
            //color info
            System.out.print("What is the " + places[i] + " player’s favorite color? ");
            scan.nextLine(); // Flush the buffer
            playerList.get(i).setColor(crayons(scan.nextLine())); //calling the crayon function to translate the string into int

            System.out.println("\nThank you!");
        }

    }

    //loops through all of the provided objects
    public static void recap(int count){
        //used for friendly text
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
        //match our string text to the playerCounts as an index, subtract one since we start at 0
        String countText = playerCounts[count -1];

        System.out.println("According to my records, we have " + countText + " player’s in our records.");
        for(int i = 0; i < count; i++){
            System.out.println(playerList.get(i).toString());
        }
    }

}
