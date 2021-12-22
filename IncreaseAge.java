import java.util.*; 

public class IncreaseAge {

    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        boolean validInput = true;
        String coolName = "Adam";
        int coolAge = 0;

        while(validInput){
            try{
                System.out.print("Hello, what is your first name? ");
                coolName = userInput.nextLine();
                validInput = false;
            }
            catch(Exception error){
                System.out.println("Invalid input, try again!");
                userInput.next();
            }
        }
        validInput = true;
        while(validInput){
            try{
                System.out.print("Hi "+ coolName + "! How old are you?");
                coolAge = userInput.nextInt();
                validInput = false;
            }
            catch(Exception error){
                System.out.println("Invalid input, try again!");
                userInput.next();
            }
        }
        System.out.println("Hello "+ coolName + ", in ten years you will be " + (coolAge+10));
        userInput.close();


    }
    
}
