import java.util.*;
public class ArrayListTutorial
{
    public static void main(String[] args)
    {
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>(); //  Creation of a list (in this case an array list)
        
        //add array items to list
        for (String x : things)
            list1.add(x);
        
        String[] morethings = {"lasers", "hats"};
        
        List<String> list2 = new ArrayList<String>();   //  Creatuib if secibd kust
        
        for (String y : morethings) //  Add the items to the second list
            list2.add(y);
        
        for (int i = 0; i < list1.size(); i++)  //  Prints out contents of list
        {
            System.out.printf("%s ", list1.get(i));
        }
        
        editList(list1, list2); // Calling of edit list function, will check and remove something it is repeated
        System.out.println();
        
        for (int i = 0; i < list1.size(); i++) //   Prints out new list
        {
            System.out.printf("%s ", list1.get(i));
        }
        
        
    }
    
    public static <E> void print(E input) //    Creating a Generic print method
    {
        System.out.println(input);
    }
    
    public static void editList(Collection<String> l1, Collection<String> l2) //    Function that will edit the list
    {
        Iterator<String> it = l1.iterator(); // You create an iteratior in the list to travel within it
        while(it.hasNext()) //  If it has something next then
        {
            if(l2.contains(it.next()))  //  If it contains the same item
                it.remove();    //  Removes it from the list
        }
    }
    
}