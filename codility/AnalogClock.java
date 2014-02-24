package codility;

/**
 * Created by rahmanaicc on 2/23/14.
 */
public class AnalogClock {

    public static void Solution(int h, int m){

        m = (int) Math.round((float)m /5.0 ) ;
        if(m >= 9) h = (h %12) +1 ;
        int h1 =h, m1=m;
        System.out.println("h :" + h + " m : " + m);

        if(h < 6) {
            h1 = h%6;
        }
        else{
            h1= 12 -h;
        }

        if(m <6){
            m1 =m %6;
        }
        else{
            m1 = 12-m;
        }

        for (int i = 0; i < 7; i ++) {
            int k=i;
            if(i > 3) k = 6-k;
            for(int j=0; j<7 ; j++){
                if(Math.abs(j-3) == k ){
                    if(h1 == i ) {
                        System.out.print("h");
                        h = -999;

                    }
                    else if(m1 == i){
                        System.out.print("m");


                    }
                    else{
                        System.out.print("o");
                    }
                }
                else{
                    System.out.print(" ");

                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        AnalogClock.Solution(4,43);
    }

}
