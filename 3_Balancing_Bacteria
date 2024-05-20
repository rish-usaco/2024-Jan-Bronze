import java.util.*;

public class prob33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        
        
        long count = 0;
        for (int i = 0; i < N; i++) {
            //System.out.println(A[i]);
            int sign = 1;
            if (A[i] != 0) {
                if (A[i] < 0) {
                } else {
                    sign = -1;
                }
                
                long times = Math.abs(A[i]);
                for (int j = i; j < N; j++) {
                    A[j] += (times*(j+1-i))*sign;
                }
                count += times;
                //System.out.println(times);
                
                
                
                
                /*
                for (int j = 0; j < N; j++) {
                    System.out.print(A[j] + " ");
                    
                }System.out.println("times: " + times);
                */
            }
        }
        
        
        
        
        System.out.println(count);
        
        
    }
}
