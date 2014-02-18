/**
 * Created by rahmanaicc on 2/16/14.
 */
package codility;

public class IntList {
    public int value;
    public IntList next;

    IntList(int value){
        this.value = value;
    }

    public void SetValue(int v){
        value = v;

    }
    public void SetNext(IntList nxt){
        next = nxt;
    }


    public int getLength(){
        IntList curr = this;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }

        return length;
    }

    public IntList Reverse(){
        IntList curr = this;
        IntList nxt = null;
        IntList prev = null;

        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;


        }

        return prev;
    }

    public IntList InsertAtNthLocation(int n, int value){
        IntList curr = this;
        int counter =0;
        if(n<0) return this;
        if(n==0){

            IntList temp = new IntList(value);
            temp.next = this;
            return temp;
        }
        else{
            while(curr != null){

                if(counter == n-1){

                    if(curr.next == null){
                        curr.next = new IntList(value);
                        break;
                    }
                    else{
                        IntList temp = curr.next.next;
                        curr.next = new IntList(value);
                        curr.next.next = temp;
                        break;
                    }

                }
                counter ++;
                curr = curr.next;
            }

            return this;
        }

    }

    public static IntList SortedInsert(int value, IntList head){
        IntList curr = head;

        if(curr != null && value <= curr.value){
            IntList temp = new IntList(value);
            temp.next = head;
            return temp;
        }
        else{
            while(curr != null){


                if(curr.next != null){
                    if(value >= curr.value && value < curr.next.value){
                        IntList temp =curr.next;
                        curr.next = new IntList(value);
                        curr.next.next = temp;
                        break;
                    }
                }
                else{
                    curr.next = new IntList(value);
                    break;
                }

                curr = curr.next;

            }
            return head;

        }

    }


}
