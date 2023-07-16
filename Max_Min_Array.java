import java.util.*;
public class Max_Min_Array
{
    public static void max_min(int arr[], int l)
    {
        int max=arr[0], index_max=0;
        int min=arr[l-1], index_min=l-1;
        for(int i=0;i<l;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index_max=i;
            }
            if(arr[i]<min)
            {
                min=arr[i];
                index_min=i;
            }
        }
        System.out.println("Maximum number in array is "+max+" and is found at position "+(index_max+1));
        System.out.println("Minimum number in array is "+min+" and is found at position "+(index_min+1));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n=sc.nextInt(),i;
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements in array: ");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        max_min(a, a.length);
    }
}
