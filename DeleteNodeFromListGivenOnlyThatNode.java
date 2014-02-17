// you can also use imports, for example:
// import java.math.*;
class Solution {
    public static void solution(IntList current) {
        current.value = current.next.value;
        current.next = current.next.next;


    }

    public static void main(String[] args) {
        //int[] A= {-7,1,5,2,-4,3,0};
        IntList head = new IntList(0);
        IntList curr = head;
        for(int i=1;i < 10; i++){
            curr.next = new IntList(i);
            curr = curr.next;
        }
        System.out.println(head.next.next.next.next.value);
        Solution.solution(head.next.next.next.next);
        System.out.println(head.next.next.next.next.value);



    }


}
