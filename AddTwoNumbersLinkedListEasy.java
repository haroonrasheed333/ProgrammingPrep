// you can also use imports, for example:
// import java.math.*;
class Solution {
    public static IntList solution(IntList number1, IntList number2) {

        IntList sum = null;
        IntList sumHead = null;


        int carry = 0;
        while(number1 != null || number2 != null){

            int n1 = number1 == null ? 0: number1.value;
            int n2 = number2 == null ? 0: number2.value;


            int t = n1+n2+carry ;

            carry = t >=10 ? t/10 : 0;
            t = carry == 0 ? t: t%10;

            if(sumHead == null){
                sumHead = new IntList(t);
                sumHead.next = null;
                sum = sumHead;
            }
            else{
                sum.next = new IntList(t);
                sum = sum.next;
            }


            if(number1 != null)
                number1 = number1.next;
            else
                number1 = null;
            if(number2 != null)
                number2 = number2.next;
            else
                number2 = null;


        }


        return sumHead;

    }

    public static void main(String[] args) {

        IntList number1Head = new IntList(7);
        IntList number1 = number1Head;
        number1.next = new IntList(1);
        number1 = number1.next;
        number1.next = new IntList(6);
        number1 = number1.next;
        number1.next = new IntList(1);
        number1 = number1.next;

        IntList number2Head = new IntList(5);
        IntList number2 = number2Head;
        number2.next = new IntList(9);
        number2 = number2.next;
        number2.next = new IntList(2);
        number2 = number2.next;

        IntList sum = Solution.solution(number1Head,number2Head);
        System.out.print("hey");
    }


}
