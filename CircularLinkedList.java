// you can also use imports, for example:
// import java.math.*;
class Solution {
    public static IntList solution(IntList head) {

        IntList current = head;

        IntList slow = current;
        IntList fast = current;

        boolean flag = true;
        while(slow != null && flag){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                while(slow != current){
                    slow = slow.next;
                    current = current.next;
                }
                flag = false;

            }

        }
        return current;

    }

    public static void main(String[] args) {
        int[] A= {-7,1,5,2,-4,3,0};
        IntList head = new IntList(A[0]);
        IntList curr = head;
        IntList temp = null;
        for(int i=1;i < A.length; i++){

            curr.next = new IntList(A[i]);

            if(i == 3){
                temp = curr;
            }

            curr = curr.next;

        }

        curr.next = temp;

        IntList data = Solution.solution(head);


    }


}
