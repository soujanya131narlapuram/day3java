//import java.util.Arrays;
import java.util.Scanner;
public class Reverse_Order {
    public static void main(String args[]) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {

            array[i]=sc.nextInt();
        }
        System.out.println("reverse order:");
        for(int i=n-1; i>=0 ; i--)
        {

            System.out.println(array[i]);
        }
        }
    }
