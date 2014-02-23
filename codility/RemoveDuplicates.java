package codility;

import java.util.HashMap;

/**
 * Created by haroon on 2/22/14.
 */
public class RemoveDuplicates {

    public static void Solution (IntList head) {
        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();

        IntList curr = head;
        hash.put(curr.value, true);

        while (curr.next != null) {
            if (hash.containsKey(curr.next.value)) {
                if (curr.next.next == null) {
                    curr.next = null;
                }
                else {
                    curr.next = curr.next.next;
                }
            }
            else {
                hash.put(curr.next.value, true);
            }
            if (curr.next != null)
                curr = curr.next;
        }


    }
    public static void main(String[] args) {
        IntList number1Head = new IntList(1);
        IntList number1 = number1Head;
        number1.next = new IntList(3);
        number1 = number1.next;
        number1.next = new IntList(5);
        number1 = number1.next;
        number1.next = new IntList(3);
        number1 = number1.next;
        number1.next = new IntList(9);
        number1 = number1.next;
        number1.next = new IntList(1);
        number1 = number1.next;

        RemoveDuplicates.Solution(number1Head);

        System.out.println("done");
    }
}
