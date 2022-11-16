import java.util.Arrays;
import java.util.Scanner;

public class Even_Position {
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
        System.out.println("even position elements are");
        int i=0;
        while (i<n)
        {
            System.out.println(array[i]);
            i=i+2;
        }
    }
}
