import java.util.ArrayList;
import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        
        String[] friendArray = new String[4]; // array 
        String[] friendArray2 = {"john","chris","eric","luke"};

        ArrayList<String> friendsArraylist = new ArrayList<>(); // no need to give size 
        ArrayList<String> friendArraylist2 = new ArrayList<>(Arrays.asList("john","chries","eric","luke"));
        
        // gitting the element from the array 

        System.out.println(friendArray2[1]);
        System.out.println(friendArraylist2.get(1)); // array list 

        // git the the size or length of the arrays 

        System.out.println(friendArray2.length);
        System.out.println(friendArraylist2.size());

        // adding an element at the end of an array list 

        friendArraylist2.add("antonio");
        System.out.println(friendArraylist2.get(4)); 
        System.out.println(friendArraylist2.size());

        // change element 

        friendArray2[2] = "baby";  
        System.out.println(friendArray2[2]);
        friendArraylist2.set(2, "babygal");
        System.out.println(friendArraylist2.get(2));

        // removing element at arraylist 

        friendArraylist2.remove("babygal");
        System.out.println(friendArraylist2.get(2));

        System.out.println(friendArray2);// array
        System.out.println(friendArraylist2); // arraylist 







    
    }//
}
