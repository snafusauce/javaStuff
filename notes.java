import java.util.ArrayList; //used for array list which are better than arrays because they can change sizes

class ToDos {

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

