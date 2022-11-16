import java.util.Arrays;
import java.util.Scanner;
public class Frequency_ofeach_element {
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
        int [] fr_arr = new int [n];
        int visited = -1;
        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = i+1; j < n; j++){
                if(array[i] == array[j]){
                    count++;
                    fr_arr[j] = visited;
                }
            }
            if(fr_arr[i] != visited)
                fr_arr[i] = count;
        }
        System.out.println("Frequency of the elements are");
        for(int i = 0; i < n; i++){
            if(fr_arr[i] != visited)
                System.out.println("    " + array[i] + "    ->    " + fr_arr[i]);
        }

    }
}