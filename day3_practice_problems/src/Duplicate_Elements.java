public class Duplicate_Elements {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 2, 4, 5,4,7,6};
        for (int i = 0; i <arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}


