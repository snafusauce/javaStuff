---
# javaStuff
---
## Notes on Syntax and Best Practices

### Imports
+ import java.util.ArrayList; //used for array list 
+ import static java.lang.Math.*; // import Math class
+ import java.util.Scanner; //for user input
+ import java.util.Random; //for random number generator
---
### General
+ Use __command__ and _/_ to comment out blocks of code

### Arraylists methods
Data structure that is better than normal arrays because arraylists can change sizes

When declaring arraylists use <Integer>  <Double> and <Char> for types you would normally declare as doubles or chars.

__Declare__ an arraylist

    import java.util.ArrayList;

    ArrayList<String> shoppingCart = new ArrayList<String>();

__Add__ to an arraylist

    shoppingCart.add("Trench Coat");
    shoppingCart.add("Tweed Houndstooth Hat");
    shoppingCart.add("Magnifying Glass");

__Remove__ things from an arraylist. You can remove by index or by value; removing by value will remove only the first instance.

    shoppingCart.remove(1);
    // shoppingCart now holds ["Trench Coat", "Magnifying Glass"]

    shoppingCart.remove("Trench Coat");

__Update__ or __Change__ a value in an arraylist.

    //changing a value
    shoppingCart.set(0, "Tweed Cape");

__Access__ an arraylist.

    //access an arraylist
    shoppingCart.get(2)

Check the __size__ of an arraylist.

    //check the size
    shoppingCart.size()

__Traverse__ an arraylists

    //traverse an arrayList
    for (int i = 0; i < secretCode.size(); i++) {
        // Increase value of element value by 1
        int num = secretCode.get(i);
        secretCode.set(i, num + 1);
      }
---
### Random Numbers


Required library.

    // Importing the Random library
    import java.util.Random;

First create a random generator object

    // Creating a random number generator
    Random randomGenerator = new Random();
Pass it into a variable by calling the nextInt() method with the required number. Add one since it stats at 0.

    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(6) + 1;
---
### Classes
Classes are blueprints for objects and enable the creation of custom methods, subclasses, and fat data types.

    class classes {

        // a blueprint for a dog
        public class Dog{

            //A class field or attribute, something you fill later
            private String name;
       
            //Other methods and constructors
            public String getName() {
              return name;
            }
            //These methods are basically functions for the class objects
          }

__Private__ fields and methods are only accessible by the class they're a part of.

__BUT__ in the example above even though the field variable 'name' is private, other classes can call the public method __getName()__.

This returns the value of that instance variable. 

Accessor methods will always be public and will have a return type that matches the type of the instance variable they’re accessing.

Similarly, private instance variables often have __mutator methods__ (sometimes known as “setters”). These methods allow other classes to reset the value stored in private instance variables.

      public class Dog{
        private String name;
       
        //setter method
        public void setName(String newName) {
          name = newName;
        }
       
        public static void main(String[] args){
          Dog myDog = new Dog("Cujo");
          myDog.setName("Lassie");
        }
      }}
---
### Loops
Loops can exist all throughout our code - including inside a method. 

__While__ loops, make sure to create a condition that allows an escape to the loop. e.g. a counter

    //while loop example
    int wishes = 0;
    while (wishes < 3) {
 
        System.out.println("Wish granted.");
        // counter is incremented
        wishes++;
       
      }
__For__ loops

    //for loop example
    int sum = 0;
    for (int i = 0; i <= 10; i++) {
    sum += i
    }
For loops help with __traversing__ data structures.

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

Using __break;__ to end for loops.

    //break out and end the loop
    for (int i = 0; i < 10; i++) {
        System.out.println(i);
        if (i == 4) {
          break;
        }
      }

Using __continue;__ to end a specific iteration in the loop

    //continue and skip a specific iteration, but continue with the loop
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 == 0) {
          continue;
        }
        System.out.println(numbers[i]);
      }


If the __return__ keyword was executed inside a loop contained in a method, then the loop iteration would be stopped and the method/constructor would be exited.

    public static boolean checkForJacket(String[] lst) {
        for (int i = 0; i < lst.length; i++) {
          System.out.println(lst[i]);
          if (lst[i] == "jacket") {
            return true;
          }
        }
        return false;
      } 

__For-each loops__, which are also referred to as enhanced loops, allow us to directly loop through each item in a list of items (like an array or ArrayList) and perform some action with each item.
    
      for (String inventoryItem : inventoryItems) {
          //We can read the : as “in” like this: 

          //for each inventoryItem (which should be a String) in inventoryItems, print inventoryItem.

        // Print element value
        System.out.println(inventoryItem);  }

__NOTE__ that the values will not change because this is only a copy of the variable
 
We can name the enhanced for loop variable whatever we want; using the singular of a plural is just a convention. 

We may also encounter conventions like 

    String word : sentence.
    
__Removing Elements During Traversal__

When using a while loop and removing elements from an ArrayList, we should not increment the while loop’s counter whenever we remove an element. 

+ We don’t need to increase the counter because all of the other elements have now shifted to the left and incrementing the counter will cause a logical error.

For loops always increase so you need to decrease by 1 
- Avoid messing with enhanced for loops

Example

    //Remove with array list
    for(int i = 0; i < lunchBox.size();i++){
        if(lunchBox.get(i) == "ant"){
          lunchBox.remove(i);
          
          //here is where you need to decrement
          i--;
        }
      }
   return lunchBox;
     }
}

### String Methods
List of methods

1. length(): 
2. concat(): 
        
        String name = new String("Code");
        
        name = name.concat("cademy");
        
        System.out.println(name);//prints codeacademy

3. equals(): Side note, there’s also an __equalsIgnoreCase()__ method that compares two strings without considering upper/lower cases.

        String flavor1 = "Mango";
        String flavor2 = "Peach";
        
        System.out.println(flavor1.equals("Mango"));
        // prints true
        
        System.out.println(flavor2.equals("Mango"));
        // prints false

4. indexOf(): If the indexOf() doesn’t find what it’s looking for, it’ll return a -1.

+ Finding an index:

        String letters = "ABCDEFGHIJKLMN"; 
        System.out.println(letters.indexOf("C")); 
        returns 2

+ Index of a String:

        String letters = "ABCDEFGHIJKLMN";
        System.out.println(letters.indexOf("EFG"));
        returns 4 because EFG starts at 4

5. charAt(): returns the character located at a String‘s specified index.

        String str = "qwer";
        System.out.println(str.charAt(2));

6. substring(): cuts everything before a certain index. The substring begins with the character at the specified index

       String line = "The Heav'ns and all the Constellations rung";
       System.out.println(line.substring(24));

+ For the __middle of the string__ use:

        String line = "The Heav'ns and all the Constellations rung";
        System.out.println(line.substring(27, 33));
        //the first argument is inclusive and the second is exclusive. 
        
        //This means the resulting substring will begin at index 27 and extend up to, but not including, index 33. 
        //Therefore, the example above would output stella

7. toUpperCase() / toLowerCase():
        
        String input = "Cricket!";
        
        String upper = input.toUpperCase();
        // stores "CRICKET!"
        
        String lower = input.toLowerCase();
        // stores "cricket!"

---
### Scope Stuff
Using an instance variable with the same name as a local variable

      //how to use an instance variable vs a local variable, by 
      default it's the local variable
      public String name;
 
      public Dog(String inputName){
      name = inputName;
      }

      public void speakNewName(String name){
      System.out.println("Hello, my new name is" + this.name);
      }

Use __this__ keyword to call methods inside methods, this saves time - basically we don't have to pass in the parameters

Example:

     public int brightness;
     public int volume;

     public void setBrightness(int inputBrightness){
     //this sets the objects brightness to whatever was passed in
     this.brightness = inputBrightness;
     }

Example 2

    public void setVolume(int inputVolume){
    this.volume = inputvolume;
    }

Example 3: we call a method with this, which calls the earlier method which also uses the this keyword

    public void resetSettings(){
    this.setBrightness(0);
    this.setVolume(0);
     }
---
### INHERITANCE 
Use the __extends__ keyword followed by the parent class to inherit methods and attributes

        class Triangle extends Shape {
        
        // additional Triangle class members }

You can also inherit the constructor with the super keyword

    class Triangle extends Shape {
         Triangle() {
             super(3);}
OR - we can also use __this__ with the construtor name numSides

    this.numSides = 3;


__This__ calls the method from the parent class, make sure to use the required parameters


If you’re writing a constructor of a child class, and don’t explicitly make a call to a constructor from a parent class using super, 
  it’s important to remember that Java will automatically (and secretly) call super() as the first line of your child class constructor.

    class Shape {
 
    protected double perimeter;
 
    }
 
    //Any child class of Shape can access perimeter with the protected keyword

In addition to access modifiers, there’s another way to establish how child classes can interact with inherited parent class members: using the __final__ keyword. 

If we add final before a parent class method’s access modifier, we disallow any child classes from changing that method. 

This is helpful in limiting bugs that might occur from modifying a particular method.

Use the __override__ keyword on a child class method to change it
+ The parameters, name, and return type have to be the same 

Example

    @Override
    public void printBalance() {
        System.out.println("Your checking account balance is $" + balance);
        }
  
We can put instances of different classes that share a parent class together in an array or ArrayList!
Example

    Monster dracula, wolfman, zombie1;
 
    dracula = new Vampire();
    wolfman = new Werewolf();
    zombie1 = new Zombie();
 
    Monster[] monsters = {dracula, wolfman, zombie1};

    //iterate on the list of subclasses
    for (Monster monster : monsters) {
 
      monster.attack();
 
    }

We can also use child class objects as method parameters when it's defined with a parent class

---
### Error Handling

    //this will print the error in red
      catch(ArithmeticException e){
      System.err.println("ArithmeticException: " + e.getMessage());

