public class maxArrayElemnt {
    public static void maxElement() {
        int[] arr = {3,7,1,9,2,6,8};
        int temp = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }

    public static void sumArray() {
        int[] arr = {3,7,1,9,2,6,8};
        int sum = 0;
        for (int i = 0; i< arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        System.out.println("Max element is: ");
        maxElement();

        System.out.println("The sum of array elements is: ");
        sumArray();
    }
}