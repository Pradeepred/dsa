import java.util.*;
class Pattern15{
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        int k=i;
        for(int j=1;j<=i;j++){
            System.out.print(k+" ");
            k--;
        }
        System.out.println();
        }        
    }
}
