package codility;

/**
 * Created by rahmanaicc on 2/18/14.
 */
public class LinkedListAppend {
    public static IntList append(IntList aNode, IntList bNode){
        IntList curr = aNode;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new IntList(bNode.value);
        curr.next.next = bNode.next;

        return null;
    }


    public static void main(String[] args) {
        IntList aHead = new IntList(1);
        IntList a = aHead;
        a.next = new IntList(2);
        a = a.next;
        a.next = new IntList(3);
        a = a.next;
        a.next = new IntList(5);
        a = a.next;

        IntList bHead = new IntList(1);
        IntList b = bHead;
        b.next = new IntList(2);
        b = b.next;
        b.next = new IntList(3);
        b = b.next;
        b.next = new IntList(5);
        b = b.next;

        bHead = LinkedListAppend.append(aHead, bHead);
        System.out.print("done");

    }
}
