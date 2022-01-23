package PepAssignments;

import java.util.Arrays;

//Sort the arrays
public class Assignment6 {
    public static void main(String[] args) {
        int[] productPrices = {1200, 4500, 3200, 4300, 1500};
        int[] covidCases = {512433, 734667, 346762, 989823, 877873, 97632, 142331};
        int[] scores = {70, 88, 12, 34, 56, 80, 90, 95, 34, 35, 16};

        System.out.println("This is bubble sort Algo");
        Assignment6.bubbleSort(productPrices);
        Assignment6.bubbleSort(covidCases);
        Assignment6.bubbleSort(scores);

        System.out.println();
        System.out.println("This is merge sort Algo");
        beforeSorting(productPrices);
        int[] res1 = Assignment6.mergeSort(productPrices);
        afterSorting(res1);
        beforeSorting(covidCases);
        int[] res2 = Assignment6.mergeSort(covidCases);
        afterSorting(res2);
        beforeSorting(scores);
        int[] res3 = Assignment6.mergeSort(scores);
        afterSorting(res3);
    }

    private static int[] mergeSort(int[] array) {
        if(array.length<=1) return array;
        int midpoint = array.length/2;
        int[] left = new int[midpoint];
        int[] right;
        if(array.length%2 == 0) right = new int[midpoint];
        else right = new int[midpoint+1];
        System.arraycopy(array, 0, left, 0, midpoint);
        System.arraycopy(array, midpoint, right, 0, right.length);
        int[] result = new int[array.length];
        left = mergeSort(left);
        right = mergeSort(right);
        result =  merge(left, right);
        return result;
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length+ right.length];
        int leftPointer =0, rightPointer=0, resultPointer=0;
        while(leftPointer<left.length || rightPointer<right.length){
            if(leftPointer<left.length && rightPointer<right.length){
                if(left[leftPointer]<right[rightPointer]) result[resultPointer++] = left[leftPointer++];
                else result[resultPointer++] = right[rightPointer++];
            }
            else if(leftPointer<left.length) result[resultPointer++] = left[leftPointer++];
            else result[resultPointer++] = right[rightPointer++];
        }
        return result;
    }

    private static void bubbleSort(int[] array) {
        beforeSorting(array);
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        afterSorting(array);
    }

    private static void afterSorting(int[] array) {
        System.out.println("after Sorting");
        for(int elements:array){
            System.out.print(elements+" ");
        }
        System.out.println();
    }

    private static void beforeSorting(int[] array) {
        System.out.println("before Sorting");
        for(int elements:array){
            System.out.print(elements+" ");
        }
        System.out.println();
    }
}
