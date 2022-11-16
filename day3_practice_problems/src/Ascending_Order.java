import java.util.Arrays;
import java.util.Scanner;
public class Ascending_Order {
public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of elements you want to store: ");
    n=sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<n; i++)
    {
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("after sorting array in ascending order:");
    for(int i=0; i<n;i++) {
        System.out.println(arr[i]);
    }
}
}

