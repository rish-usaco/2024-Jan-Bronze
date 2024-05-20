import java.util.*;

public class prob2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int S = scan.nextInt();
        int[] line = new int[N+1];
        int[] val = new int[N+1];
        
        for (int i = 1; i <= N; i++) {
            line[i] = scan.nextInt();
            val[i] = scan.nextInt();
        }
        
        int pos = S;
        int power = 1;
        int dir = 1;
        int count = 0;
        boolean done = false;
        int infinity = 1000000001;
        int movecount = 1;
        
        
        
        while (!done) {
            //System.out.println("pos: " + pos);
            if (line[pos] == 0) {
                dir *= -1;
                power += val[pos];
            } else if (line[pos] == 1) {
                if (val[pos] <= power) {
                    count++;
                    line[pos] = -1;
                }
            }
            
            pos += power*dir;
            movecount++;
            
            
            
            
            
            
            
            
            if (movecount == infinity || pos < 1 || pos > N) {
                done = true;
            }
        }
        
        System.out.println(count);
        
        
        
    }
}
