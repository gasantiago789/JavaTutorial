import java.util.*;
public class LinkedListTutorial
{
    /*
    *   Main Method
    *
    */
    public static void main(String[] args)
    {
        String[] things = {"apples", "noobs", "pwnge","bacon", "goats"};
        List<String> list1 = new LinkedList<String>(); //   Creation of linked list
        for(String x : things)  //  For loop that will add all the contents of the array into the linked list
        {
            list1.add(x);
        }
        
        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<String>(); //   Creation of a linked list type string
        for (String y : things2)
            list2.add(y);
            
        list1.addAll(list2); //Adds all content of list2 -> list1
        list2 = null; //    Free up data
        
        printMe(list1);
        removeStuff(list1, 2, 5);
        printMe(list1);
        reverseMe(list1);
        
        
    }
    
    //printMe Method
    private static void printMe(List<String> l)
    {
        for (String b : l)  //  Will loop through the list printing out its contents
        {
            System.out.printf("%s ", b);
        }
        
        System.out.println();
    }
    
    //removeStuff method
    
    private static void removeStuff(List<String> l, int from, int to)
    {
        l.subList(from, to).clear(); //l (paramater from method).subList(from, to) (captures a small portion of the list). clear() (deletes that portion)
    }
    
    //reverseMe
    private static void reverseMe(List<String> l)
    {
        ListIterator<String> gabo = l.listIterator(l.size()); //You start the psostion of a iterator and then if you do l.size() it automatically starts a the end
        while(gabo.hasPrevious())
            System.out.printf("%s ", gabo.previous()); //   Since the iterator is set to the end of the list, it will display everything in reverse order
    }
}