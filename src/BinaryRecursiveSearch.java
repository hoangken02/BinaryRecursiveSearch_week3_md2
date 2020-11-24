public class BinaryRecursiveSearch {
    static int binaryRecursiveSearch(int[] array, int key, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;

            if (key == array[mid]) {
                return mid;
            } else if (key > array[mid]) {
                return binaryRecursiveSearch(array, key, mid + 1, high);
            } else if (key < array[mid]) {
                return binaryRecursiveSearch(array, key, low, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinaryRecursiveSearch object = new BinaryRecursiveSearch();
        int[] array = {1, 4, 7, 9, 22, 44, 55};
        int low = 0;
        int high = array.length;
        int key = 9;
        int result = object.binaryRecursiveSearch(array, key, low, high);
        if (result == -1) {
            System.out.println("Array have not key");
        } else {
            System.out.println("Key found at index: " + result);
        }
    }
}