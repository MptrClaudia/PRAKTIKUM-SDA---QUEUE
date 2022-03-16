import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {

    public static void main(String[] args) {
         //declare a Queue   

         Queue<String> Food = new LinkedList<String>();
         //initialize the queue with values
         Food.add("Bakso");
         Food.add("Sate");
         Food.add("Rendang");
         Food.add("Pangsit");
         Food.add("Batagor");
         //print the Queue
         System.out.println("Menu Before Adding :" + Food);

         //1. Add
         Food.add("Siomay");
         Food.add("Lontong");
         Food.add("Mie");
         System.out.println("Menu :" + Food);

         //2. Peek
         System.out.println("Main Menu After :"+ Food.peek());

         //3. Remove
         Food.remove();     // removing the front element (`1`)
         Food.remove();     // removing the front element (`2`)
         System.out.println("Menu After Removing :" + Food);

         Food.add("Soto");
         Food.add("Lotek");
         System.out.println("Menu After Adding :" + Food);

         //4. Peek
         System.out.println("Main Menu Before :" + Food.peek());

         //5. Size
         System.out.println("Number Of Menus :" + Food.size());

    }
    
}