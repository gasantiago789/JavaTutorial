import java.util.*;
public class HashSetTutorial
{
    public static void main(String[] args)
    {
        String[] things = {"apple", "bob", "ham","bob", "bacon"}; //    Create array
        List<String> list = Arrays.asList(things);  //  Convert it into a list
        
        System.out.printf("%s ", list);
        System.out.println();
        
        Set<String> set = new HashSet<String>(list); // Creates a hashset and passes list as a constructor parameter
        //  Hashsets remove the duplicate item of primary variables. Objects have different references.
        
        System.out.printf("%s ", set);  //  Prints out your hashset
        
        
        
        
    }
    
    public static <E> void print(E input) //    Creating a Generic print method
    {
        System.out.println(input);
    }
    
    
    
}