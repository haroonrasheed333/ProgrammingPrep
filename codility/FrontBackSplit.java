package codility;

/**
 * Created by haroon on 2/22/14.
 */
public class FrontBackSplit {
    public static IntList Solution (IntList head) {
        IntList curr = head;

        int len = head.getLength();

        int mid = len % 2 == 0? len/2 : len/2 +1;

        while (mid > 1) {
            curr = curr.next;
            mid--;
        }

        IntList newList = curr.next;
        curr.next = null;

        return newList;
    }
    public static void main(String[] args) {
        IntList number1Head = new IntList(1);
        IntList number1 = number1Head;
        number1.next = new IntList(2);
        number1 = number1.next;
        number1.next = new IntList(3);
        number1 = number1.next;
        number1.next = new IntList(5);
        number1 = number1.next;
        number1.next = new IntList(7);
        number1 = number1.next;
        number1.next = new IntList(9);
        number1 = number1.next;
//        number1.next = new IntList(11);
//        number1 = number1.next;

        IntList newLst = FrontBackSplit.Solution(number1Head);

        System.out.println("done");
    }
}
