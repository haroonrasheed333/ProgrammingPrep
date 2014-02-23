package codility;

/**
 * Created by haroon on 2/22/14.
 */
public class AlternatingSplit {
    public static IntList Solution (IntList head1) {
        IntList curr1 = head1;
        IntList head2 = new IntList(curr1.next.value);
        IntList curr2 = head2;
        curr2.next = null;
        curr1.next = curr1.next.next;
        curr1 = curr1.next;

        while(curr1 != null){

            if(curr1.next != null)
            {
                curr2.next = new IntList(curr1.next.value);
                curr2 = curr2.next;
                curr2.next = null;
                curr1.next = curr1.next.next;


            }
            curr1 = curr1.next;

        }

        return head2;

    }

    public static void main(String[] args) {
        IntList number1Head = new IntList(1);
        IntList number1 = number1Head;
        number1.next = new IntList(2);
        number1 = number1.next;
        number1.next = new IntList(3);
        number1 = number1.next;
        number1.next = new IntList(4);
        number1 = number1.next;
        number1.next = new IntList(5);
        number1 = number1.next;
        number1.next = new IntList(6);
        number1 = number1.next;
        number1.next = new IntList(7);
        number1 = number1.next;

        IntList newLst = AlternatingSplit.Solution(number1Head);

        System.out.println("done");
    }
}
