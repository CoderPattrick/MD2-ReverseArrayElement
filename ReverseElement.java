public class ReverseElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        array = reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static int[] reverse(int[] arr){
        int[] arrTemp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrTemp[i]=arr[arr.length-1-i];
        }
        return arrTemp;
    }
}
