package codility;

/**
 * Created by rahmanaicc on 2/21/14.
 */
public class IntersectionOfConnectedLists {
    
    public static IntList Solution(IntList head1, IntList head2){
        IntList curr = head1;
        while(curr.next != null){
            curr = curr.next;    
        }
        
        curr.next = head1;
        
        return CircularLinkedList.solution(head2);
        
    }

    public  static  IntList Solution2(IntList head1, IntList head2){

        IntList currHead1 = head1;
        IntList currHead2 = head2;
        int length1 = head1.getLength();
        int length2 = head2.getLength();

        int diff = Math.abs(length1-length2);

        if(length1 > length2){
            while(diff != 0){
                currHead1 = currHead1.next;
                diff --;
            }
        }
        else{
            while(diff != 0){
                currHead2 = currHead2.next;
                diff --;
            }
        }

        while(currHead1 != null && currHead2 != null){
            currHead1 =currHead1.next;
            currHead2 = currHead2.next;

            if(currHead1 == currHead2){
                return currHead1;
            }
        }

        return null;
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
        IntList temp = number1;

        number1.next = new IntList(9);
        number1 = number1.next;
        number1.next = new IntList(11);
        number1 = number1.next;



        IntList number2Head = new IntList(10);
        IntList number2 = number2Head;
        number2.next = new IntList(20);
        number2 = number2.next;
        number2.next = new IntList(30);
        number2 = number2.next;
        number2.next = new IntList(50);
        number2 = number2.next;
        number2.next = new IntList(70);
        number2 = number2.next;
        number2.next = temp;


//        System.out.print(IntersectionOfConnectedLists.Solution(number1Head, number2Head).value);
        System.out.print(IntersectionOfConnectedLists.Solution2(number1Head, number2Head).value);

    }
}
