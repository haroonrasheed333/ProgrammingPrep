package codility;

/**
 * Created by rahmanaicc on 2/22/14.
 */
public class ShuffleMergeLinkedList {

    public static IntList Solution(IntList head1, IntList head2){
        IntList curr1 = head1;

        while(head2 != null){

            if(curr1.next != null){
                IntList temp = curr1.next;
                curr1.next = new IntList(head2.value);
                curr1.next.next = temp;
                curr1 = curr1.next.next;

            }
            else{
                curr1.next = new IntList(head2.value);
                curr1 = curr1.next;
                break;
            }

            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        IntList aHead = new IntList(1);
        IntList a = aHead;
        a.next = new IntList(3);
        a = a.next;
        a.next = new IntList(5);
        a = a.next;
        a.next = new IntList(7);
        a = a.next;

        IntList bHead = new IntList(2);
        IntList b = bHead;
        b.next = new IntList(4);
        b = b.next;
        b.next = new IntList(6);
        b = b.next;
        b.next = new IntList(8);
        b = b.next;

        bHead = ShuffleMergeLinkedList.Solution(aHead,bHead);
        System.out.print("done");
    }
}
