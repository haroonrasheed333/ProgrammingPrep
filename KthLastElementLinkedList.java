// you can also use imports, for example:
// import java.math.*;
class Solution {
    public static int solution(IntList head, int k) {
        IntList fast = head;
        IntList slow = head;
        for(int i =0;i <k;i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return  slow.value;


    }

    public static void main(String[] args) {
        //int[] A= {-7,1,5,2,-4,3,0};
        IntList head = new IntList(0);
        IntList curr = head;
        for(int i=1;i < 10; i++){
            curr.next = new IntList(i);
            curr = curr.next;
        }

       System.out.print( Solution.solution(head,2));


    }


}
