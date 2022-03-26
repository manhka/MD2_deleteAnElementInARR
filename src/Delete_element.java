import java.util.Scanner;

public class Delete_element {
    // BUIL METHOD TO FIND THE POSITION OF WHAT WE DELETE
    static int findPosition(int[] arr, int element_delete) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element_delete) {
                position = i;
            }
        }
        return position;
    }
// REMOVING WHAT WE CHOSE BY CREATE NEW ARRAY
    static int[] DeleteAnElement(int[] arr1, int position1) {
        int[] newArr = new int[arr1.length - 1];
        for (int i = 0; i < position1; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = position1 + 1; i < arr1.length; i++) {
            newArr[i - 1] = arr1[i];
        }
        return newArr;
    }
//
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("what number you wanna remove in the array:");
        int number = sc.nextInt();
        int positionToDelete = findPosition(arr, number);
        if (positionToDelete == -1) {
            System.out.println("we don't have this element in this arr, please enter an other number");
            return;
        } else {
            arr = DeleteAnElement(arr, positionToDelete);
        }
        System.out.print("ARRAY AFTER REMOVE AN ELEMENT: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        for (int element:arr
             ) {
            System.out.print(element+", ");
        }
    }
}

