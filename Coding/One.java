import java.util.*;
class One
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of value :");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<x;i++)
        {
            a.add(sc.nextInt());
        }
        int minimum=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        for(int i=x-1;i>0;i--)
        {
            int b=a.get(i);
            if(minimum>b) minimum=b;
            int c=a.get(i-1);
            if(min<c-minimum)
            {
                min=c-minimum;
            }
        }
        sc.close();
        System.out.println(min);
    }

}