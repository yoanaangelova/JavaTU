import java.util.*;

public class Test
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> myList = new LinkedList<String>();

        for (int i = 0; i < myList.size(); i++) {
            String word = scanner.nextLine();
            myList.add(word);
        }

        System.out.println("Linked list after sort : " + myList);

        Collections.sort(myList);

        System.out.println("Linked list after sort : " + myList);

        myList.remove("hello");
        myList.remove(3);
        myList.removeFirst();
        myList.removeLast();

        System.out.println("Linked list after deletion: " + myList);
    }
} 