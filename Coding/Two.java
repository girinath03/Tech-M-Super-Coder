import java.util.*;
class Two
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("After two inputs");
        b--;
        int res=1;
        for(int i=2;i<=a/2;i++)
        {
            if(b==0)
            {
                System.out.println(res);
                System.exit(0);
            }
            if(a%i==0)
            {
                System.out.println(i);
                b--;
                res=i;
            }
        }
        if(b!=0) System.out.println("-1");
        sc.close();
    }
}