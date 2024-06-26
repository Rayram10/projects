public class RecursiveTest {
    public static int findSmallestElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        return findSmallestElementRecursive(arr, 0);
    }

    private static int findSmallestElementRecursive(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int nextSmallest = findSmallestElementRecursive(arr, index + 1);
        return Math.min(arr[index], nextSmallest);
    }

    public static void main(String[] args) {
        int[] arr = {};
        int smallest = findSmallestElement(arr); 
        System.out.println(smallest);
    }
}

