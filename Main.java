public class Main {
    public static void main(String[] args) {
        int array[] = {18, 32, 14, 1, 88, 7, 31, 42, 63, 57};
        System.out.print("Sorted Array : ");
        bubbleSorting(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void bubbleSorting(int[] array) {
        int num = array.length;
        int var = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < (num - i); j++) {
                if (array[j - 1] > array[j]) {

                    var = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = var;
                }

            }
        }
    }
}  