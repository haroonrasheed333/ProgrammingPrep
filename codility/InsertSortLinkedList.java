package codility;

/**
 * Created by rahmanaicc on 2/18/14.
 */
public class InsertSortLinkedList {


    public static IntList InsertSort(IntList head){
        IntList curr = head;

        IntList new_sorted_list = new IntList(curr.value);
        curr = curr.next;

        while(curr != null){
            new_sorted_list = IntList.SortedInsert(curr.value,new_sorted_list);
            curr = curr.next;
        }

        return new_sorted_list;
    }

    public static void main(String[] args) {
        IntList number1Head = new IntList(2);
        IntList number1 = number1Head;
        number1.next = new IntList(1);
        number1 = number1.next;
        number1.next = new IntList(7);
        number1 = number1.next;
        number1.next = new IntList(5);
        number1 = number1.next;
        number1.next = new IntList(3);
        number1 = number1.next;

       IntList new_list =   InsertSortLinkedList.InsertSort(number1Head);
        System.out.print("hey");

    }


}
