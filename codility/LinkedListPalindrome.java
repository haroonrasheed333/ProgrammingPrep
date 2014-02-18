package codility;

import java.util.Stack;

/**
 * Created by rahmanaicc on 2/18/14.
 */
public class LinkedListPalindrome {
    public static boolean CheckPalindrome(IntList head){
        Stack<Integer> numbStack = new Stack<Integer>();
        IntList curr = head;
        int len = head.getLength();
        int counter = 0;
        while (counter <len/2){
            numbStack.push(curr.value);
            curr = curr.next;
            counter ++;

        }
        if(len %2 != 0){
            curr = curr.next;
        }

        while (curr != null){
            if(curr.value != numbStack.pop().intValue()){
                return false;
            }
            curr = curr.next;

        }

        return true;
    }

    public static void main(String[] args) {
        IntList number1Head = new IntList(1);
        IntList number1 = number1Head;
        number1.next = new IntList(6);
        number1 = number1.next;
        number1.next = new IntList(6);
        number1 = number1.next;
        number1.next = new IntList(6);
        number1 = number1.next;
        number1.next = new IntList(1);
        number1 = number1.next;

        System.out.print(LinkedListPalindrome.CheckPalindrome(number1Head));

    }
}
