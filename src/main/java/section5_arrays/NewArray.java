package section5_arrays;

import java.util.Arrays;

public class NewArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];//alle 0

        System.out.println("Arrays.");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        int[] emptyArr1 = {};
        int[] emptyArr2 = new int[0];
        //Falsch!
        //int[] emptyArr3;

        System.out.println("Empty Arrays");
        System.out.println(Arrays.toString(emptyArr1));
        System.out.println(Arrays.toString(emptyArr2));
        //Error Variable 'emptyArr3' might not have been initialized
       //System.out.println(Arrays.toString(emptyArr3));




    }
}
