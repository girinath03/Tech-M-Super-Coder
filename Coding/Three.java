import java.util.*;
public class Three {
    public static void main(String[] argss)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        int []house=new int[n];
        int []people=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+i+" people:");
            people[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+i+" house:");
            house[i]=sc.nextInt();
        }
        int check=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(house[j]!=-1)
                {
                    if(people[i]<=house[j])
                    {
                        house[j]=-1;
                        break;
                    }
                }
            }
        }
        for(int i : house)
        {
            if(i!=-1) check++;
        }
        System.out.println(check);
        sc.close();
    }
}
