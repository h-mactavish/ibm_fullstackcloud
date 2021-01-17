import java.io.*;
import java.util.*;

public class Pattern{


    public static void main(final String args[]) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int min=0;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){
                min=i<j?i:j;
                System.out.print(n-min+1);
            }

            for(int j=n-1;j>=1;j--){
                min=i<j?i:j;
                System.out.print(n-min+1);
            }
            System.out.println();
        }

        
    }
}