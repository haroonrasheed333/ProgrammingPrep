package codility;

/**
 * Created by rahmanaicc on 2/22/14.
 */
public class InsertInSortedCircularLinkedList {

    public static void Solution(IntList node, int x){

        if(node == null){
            node = new IntList(x);
            node.next = node;
        }

        else{
            while (node != null){
                if(node.value > node.next.value ){

                   if(x > node.value && x > node.next.value){
                       IntList temp = node.next;
                       node.next = new IntList(x);
                       node.next.next = temp;
                       break;
                   }

                   if(x < node.value && x <node.next.value){
                       IntList temp = node.next;
                       node.next = new IntList(x);
                       node.next.next = temp;
                       break;
                   }



                }
                if(x >= node.value && x <= node.next.value){
                    IntList temp = node.next;
                    node.next = new IntList(x);
                    node.next.next = temp;
                    break;
                }
                node = node.next;
            }

        }


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
        number1.next = number1Head;


        InsertInSortedCircularLinkedList.Solution(number1Head, 1);
        InsertInSortedCircularLinkedList.Solution(number1Head, -1);
        InsertInSortedCircularLinkedList.Solution(number1Head, 12);
        InsertInSortedCircularLinkedList.Solution(number1Head, 6);

        System.out.print("done");
    }




}
