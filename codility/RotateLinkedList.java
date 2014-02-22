package codility;

/**
 * Created by rahmanaicc on 2/21/14.
 */
public class RotateLinkedList {

    public static IntList Rotate(IntList head, int k){
        IntList curr = head;

        int length = head.getLength();
        int numOfRotations = k % length;

        if(numOfRotations == 0){
            return  head;
        }
        for(int i=0;i <length - numOfRotations-1; i++){
            curr = curr.next;
        }

        IntList temp = curr.next;
        curr.next = null;

        IntList ret_node = temp;
        while(temp.next != null){

            temp = temp.next;
        }

        temp.next = head;
        return ret_node;
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
        number1.next = new IntList(11);
        number1 = number1.next;




        number1Head = RotateLinkedList.Rotate(number1Head,8);

        System.out.print("done");



    }
}

