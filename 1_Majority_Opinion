import java.util.*;

public class FarmerJohnHay2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int tt = 0; tt < T; tt++) {
            
            int N = scan.nextInt();
            int[] h = new int[N];
            
            for (int i = 0; i < N; i++) {
                h[i] = scan.nextInt();
            }
            
            if (N == 2) {
                if (h[0] == h[1]) {
                    System.out.println(h[0]);
                } else {
                    System.out.println(-1);
                }
                continue;
            }
            
            if (N == 3) {
                if (h[0] == h[1]) {
                    System.out.println(h[0]);
                } else if (h[0] == h[2]) {
                    System.out.println(h[0]);
                } else if (h[2] == h[1]) {
                    System.out.println(h[2]);
                } else{
                    System.out.println(-1);
                }
                continue;
            }
            
            
            int count = 0;
            int[] A = new int[N];
            for (int i = 0; i < N-3; i++) {
                if (h[i] == h[i+1] || h[i] == h[i+2]) {
                    A[h[i]]=1;;
                    count++;
                    //System.out.println("hi1");
                } else if (h[i+1] == h[i+2]) {
                    A[h[i+1]]=1;;
                    count++;
                    //System.out.println("hi1");
                }
                //System.out.println("hi1");
            }
            
            if (count ==0) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < N; i++) {
                    if (A[i] == 1) {
                        System.out.print(i + " ");
                    }
                } System.out.println();
            } 
            
        }
    }
}
