import java.util.Arrays;
import java.util.Scanner;

public class Smallest_Element {
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
        Arrays.sort(array);
        //for(int i=0; i<n;i++){ System.out.println(array[i]);}
        System.out.println("The smallest element is "+array[0]);
    }
}
