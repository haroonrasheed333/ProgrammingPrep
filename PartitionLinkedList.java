// you can also use imports, for example:
// import java.math.*;
class Solution {
    public static IntList solution(IntList head, int x) {

        IntList current = head;

        IntList less = null;
        IntList more = null;

        IntList lessHead = null;
        IntList moreHead = null;

        while(current != null){
            if(current.value <x ){
                if(less == null){
                    lessHead = new IntList(current.value);
                    lessHead.next = null;
                    less = lessHead;
                }
                else{
                    less.next = new IntList(current.value);
                    less = less.next;

                }

            }
            else if(current.value>x){
                if(more == null){
                    moreHead = new IntList(current.value);
                    moreHead.next = null;
                    more = moreHead;
                }
                else{
                    more.next  = new IntList(current.value);
                    more = more.next;
                }
            }

            current = current.next;
        }

        less.next = new IntList(x);
        less.next.next = moreHead;

        return lessHead;

    }

    public static void main(String[] args) {
        int[] A= {-7,1,5,2,-4,3,0};
       IntList head = new IntList(A[0]);
        IntList curr = head;
        for(int i=1;i < A.length; i++){
            curr.next = new IntList(A[i]);
            curr = curr.next;
        }


        IntList newList = Solution.solution(head,0);

        while (newList != null){
            System.out.println(newList.value);
            newList = newList.next;
        }

    }


}
