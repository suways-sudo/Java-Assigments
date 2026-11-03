// Example traversal from the lecture.
// Requires a Person class with getElement() and next members.

public class LinkedListTraversal {

    public static void printList(Person head) {

        Person current = head;

        while (current != null) {

            System.out.println(current.getElement());

            current = current.next;
        }
    }
}
