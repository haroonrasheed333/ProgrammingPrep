 public  static int[] solution(int N, int[] A) {
        // write your code in Java SE 7

        int[] counter_arr = new int[N];
        int max_value = 0;
        int max_value_temp = 0;
        boolean flag = false;
        for(int i=0;i<A.length;i++){
            if(A[i] >= 1 && A[i] <= N){
                int t = counter_arr[A[i]-1] += 1;
                if(t > max_value) max_value = t;

            }
            else{
                for(int j=0;j<N;j++){
                    counter_arr[j] = max_value;
                }
            }
        }

        return counter_arr;

    }