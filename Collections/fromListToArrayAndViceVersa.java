import java.util.*;
public class fromListToArrayAndViceVersa
{
    public static void main(String[] args)
    {
        String[] stuff = {"babies", "watermelong", "melons", "fudge"};
        
        LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff)); //   Treats the array as a linkedlist
        
        theList.add("pumpkin");
        theList.addFirst("First thing");
        
        //Convert back to array
        stuff = theList.toArray(new String[theList.size()]);
        
        for (String x : stuff)  // Print the contents on the array stuff
            System.out.printf("%s ", x);
        
        
        
    }
    
    public static <E> void print(E input) //    Creating a Generic print method
    {
        System.out.println(input);
    }
    
    
    
}