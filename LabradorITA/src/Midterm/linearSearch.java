
package Midterm;

public class linearSearch {
    
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int result = search(arr, 4);

        if (result >= 0) {
            System.out.println("Found at index: " + result + " = " + arr[result]);
        } else {
            System.out.print("Element not Found");
        }
    }
}
