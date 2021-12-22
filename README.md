# javaStuff
import java.util.ArrayList; //used for array list which are better than arrays because they can change sizes
import static java.lang.Math.*; // import Math class

// Random int value between 10 and 20
int d = (int)(Math.random() * 11 ) + 10;

// Importing the Random library
import java.util.Random;

/*     // Creating a random number generator
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(6) + 1;

*/
class classes {
    public class Dog{
        private String name;
       
        //Other methods and constructors
       
        public String getName() {
          return name;
        }
      }
      /*Even though the instance variable name is private, other classes could call the public method getName() 
      which returns the value of that instance variable. Accessor methods will always be public, and will have 
      a return type that matches the type of the instance variable they’re accessing. */

      /* Similarly, private instance variables often have mutator methods (sometimes known as “setters”). 
      These methods allow other classes to reset the value stored in private instance variables. */
      public class Dog{
        private String name;
       
        //Other methods and constructors
       
        public void setName(String newName) {
          name = newName;
        }
       
        public static void main(String[] args){
          Dog myDog = new Dog("Cujo");
          myDog.setName("Lassie");
        }
      }
}
class arraylists {

//declare a new array list
ArrayList<String> shoppingCart = new ArrayList<String>();

//  When declaring arraylists use <Integer>  <Double> and <Char> for types you would normally declare as doubles or chars.

// add stuff to an array list
shoppingCart.add("Trench Coat");

//replace something in an array list
shoppingCart.set(0, "Tweed Cape");

//get the object at index 2
System.out.println(shoppingCart.get(2));

//get the index size
shoppingCart.size();

//remove an item using the index or the value
shoppingCart.remove(1);
//this command removes only the first instance of trench coat
shoppingCart.remove("Trench Coat");

//find the index of something
shoppingCart.indexOf("Trench Coat");
}

class loops {
    //while loop example
    int wishes = 0;
    while (wishes < 3) {
 
        System.out.println("Wish granted.");
        // counter is incremented
        wishes++;
       
      }
    //for loop example
    int sum = 0;
    for (int i = 0; i <= 10; i++) {
    sum += i
    }

    //traverse an array
    for (int i = 0; i < secretCode.length; i++) {
        // Increase value of element value by 1
        secretCode[i] += 1;
      }
    //traverse an arrayList
    for (int i = 0; i < secretCode.size(); i++) {
        // Increase value of element value by 1
        int num = secretCode.get(i);
        secretCode.set(i, num + 1);
      }
    
    //break out and end the loop
    for (int i = 0; i < 10; i++) {
        System.out.println(i);
        if (i == 4) {
          break;
        }
      }
    //continue and skip a specific iteration, but continue with the loop
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 == 0) {
          continue;
        }
        System.out.println(numbers[i]);
      }
    //Loops can exist all throughout our code - including inside a method. 
    //If the return keyword was executed inside a loop contained in a method, 
    //then the loop iteration would be stopped and the method/constructor would be exited.
    public static boolean checkForJacket(String[] lst) {
        for (int i = 0; i < lst.length; i++) {
          System.out.println(lst[i]);
          if (lst[i] == "jacket") {
            return true;
          }
        }
        return false;
      } 

      /******
      For-each loops, which are also referred to as enhanced loops, 
      allow us to directly loop through each item in a list of items 
      (like an array or ArrayList) and perform some action with each item.
       */
      for (String inventoryItem : inventoryItems) {
          //We can read the : as “in” like this: 
          //for each inventoryItem (which should be a String) in inventoryItems, print inventoryItem.
        // Print element value
        System.out.println(inventoryItem);
       //NOTE that the values will not change because this is only a copy of the variable
       //Note: 
       //We can name the enhanced for loop variable whatever we want; using the singular of a plural is just a convention. 
       //We may also encounter conventions like String word : sentence.
      }

    /* a note on removing elements
    Removing Elements During Traversal
    **When using a while loop and removing elements from an ArrayList,
     we should not increment the while loop’s counter whenever we remove an element. 
     We don’t need to increase the counter because all of the other elements have now shifted to the left.

    ** For loops always increase so you need to decrease by 1 
        // Decrease loop control variable by 1
    i--;  

    **avoid messing with enhanced for loops
    */
    //Remove exaple with array list
    for(int i = 0; i < lunchBox.size();i++){
        if(lunchBox.get(i) == "ant"){
          lunchBox.remove(i);
          i--;
        }
      }
   return lunchBox;
     }
}

class stringMethods {
/* List of methods
length(): 
concat(): 
        String name = new String("Code");
        
        name = name.concat("cademy");
        
        System.out.println(name);

equals(): Side note, there’s also an equalsIgnoreCase() method that compares two strings without considering upper/lower cases.
        String flavor1 = "Mango";
        String flavor2 = "Peach";
        
        System.out.println(flavor1.equals("Mango"));
        // prints true
        
        System.out.println(flavor2.equals("Mango"));
        // prints false

indexOf(): If the indexOf() doesn’t find what it’s looking for, it’ll return a -1.
    String letters = "ABCDEFGHIJKLMN";
    System.out.println(letters.indexOf("C")); 
    returns 2

    String letters = "ABCDEFGHIJKLMN";
    System.out.println(letters.indexOf("EFG"));
    returns 4 because EFG starts at 4

charAt(): returns the character located at a String‘s specified index.
    String str = "qwer";
    System.out.println(str.charAt(2));

substring(): It would output Constellations rung because that’s what begins at index 24 
//and ends at the end of line. The substring begins with the character at the specified index
//and extends to the end of the string.
        String line = "The Heav'ns and all the Constellations rung";
        System.out.println(line.substring(24));

    For the middle of the string use:
        String line = "The Heav'ns and all the Constellations rung";
        System.out.println(line.substring(27, 33));
        the first argument is inclusive and the second is exclusive. 
        This means the resulting substring will begin at index 27 and extend up to, but not including, index 33. 
        Therefore, the example above would output stella

toUpperCase() / toLowerCase():
        String input = "Cricket!";
        
        String upper = input.toUpperCase();
        // stores "CRICKET!"
        
        String lower = input.toLowerCase();
        // stores "cricket!"

*/

//how to use an instance variable vs a local variable, by default it's the local variable
public String name;
 
public Dog(String inputName){
  name = inputName;
}

public void speakNewName(String name){
  System.out.println("Hello, my new name is" + this.name);
}

//use this to call mother methods inside a method, this saves time - basically we don't have to pass in the parameters
public int brightness;
public int volume;

public void setBrightness(int inputBrightness){
  this.brightness = inputBrightness;
}

public void setVolume(int inputVolume){
  this.volume = inputvolume;
}

public void resetSettings(){
  this.setBrightness(0);
  this.setVolume(0);
}
}



INHERITTANCE 
//use the extends keyword followed by the parent classs
class Triangle extends Shape {
 
  // additional Triangle class members
 
}

You can also inherit the constructor with the super keyword
class Triangle extends Shape {
 
  Triangle() {
    super(3);
    OR - we can also use this with the construtor name numSides
    this.numSides = 3;

  }

  If you’re writing a constructor of a child class, and don’t explicitly make a call to a constructor from a parent class using super, 
  it’s important to remember that Java will automatically (and secretly) call super() as the first line of your child class constructor.

  class Shape {
 
  protected double perimeter;
 
}
 
// any child class of Shape can access perimeter

In addition to access modifiers, there’s another way to establish how child classes can interact with inherited parent class members: using the final keyword. 
If we add final before a parent class method’s access modifier, we disallow any child classes from changing that method. This is helpful in limiting bugs that might occur from modifying a particular method.

Use the override keyword on a child class method to change it, the parameters, name, and return type have to be the same
  @Override
  public void printBalance() {
    System.out.println("Your checking account balance is $" + balance);
  }
}
//this calls the method from the parent class, make sure to use the required parameters
super.printBalance();
