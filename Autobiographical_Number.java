import java.util.Scanner;
public class Autobiographical_Number
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt(), i, j;
    n = Math.abs (n);
    int temp = n;
    String s = String.valueOf(n);
    int arr[] = new int[s.length()];
    for (i=arr.length-1; i>=0; i--)
    {
	    arr[i] = temp % 10;
	    temp = temp / 10;
    }
    boolean b = true;
    for (i = 0; i <arr.length; i++)
    {
	    int count = 0;
	    for (j = 0; j <arr.length; j++)
	    {
	        if (i == arr[j])
	            count++;
	    }
	    if (arr[i] == count)
	    b = true;
	    else
	    {
	        b = false;
	        break;
	    }
    }
    if (b == true)
        System.out.println (n+" is an autobiographical number.");
    else
        System.out.println (n+" is not an autobiographical number.");
    }
}
