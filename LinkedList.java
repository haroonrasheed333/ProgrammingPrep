/**
 * Created by rahmanaicc on 2/16/14.
 */
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

}
