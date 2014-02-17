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
}
