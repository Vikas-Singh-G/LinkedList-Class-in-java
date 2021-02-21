//A LinkedList with strings
import java.io.*;
import java.util.*;
class LinkedList
{
    public static void main(String args[ ])throws IOException
    {
        //creating an empty linked list to stor strings
        LinkedList<strings> ll= new LinkedList<>();
        
        //add some names to linked list
        ll.add("India");
        ll.add("America");
        ll.add("japan");

        //display the elements in the linked list
        System.out.println("List= " +ll);

        //variables
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String element;
        int position, choice=0;

        //Menu
        while(choice<4)
        {
            System.out.println("\nLINKEDLIST OPERATIONS");
            System.out.println("1 Add an element");
            System.out.println("2 Remove an element");
            System.out.println("3 Change an element");
            System.out.println("4 Exit");

            System.out.print("Your choice: ");
            choice = Integer.parseInt(br.readLine());

            //perform task depending on usr choice
            switch(choice)
            {
                case 1: System.out.print("Enter element: ");
                element= br.readLine();
                System.out.print("At what position?");
                position= Integer.parseInt(br.readLine());
                ll.add(position-1,element);
                break;
                
                case 2: System.out.print("Enter position: ");
                position= Integer.parseInt(br.readLine());
                ll.remove(position-1);
                break;

                case 3: System.out.print("Enter position: ");
                position= Integer.parseInt(br.readLine());
                System.out.print("Enter new element");
                element= br.readLine();
                ll.set(position-1,element);
                break;
                default: return;
            }
            //Use Iterator to retrieve the elements
            System.out.print("List= ");
            Iterator it= ll.iterator();
            while(it.hasNext())
            System.out.print(it.next()+" ");
        }//end of while
    }
}
