package projects;
public class Kingify {
    
    public static void main(String[] args){
        if(args.length > 1){
            System.out.println(args[0] + " Da King " + args[1]);
        }
        else{
            System.err.println("You failed, run the program again and input exactly two names");
        }
    }
}
