package sorting.algorithms;

/**
 *
 * @author mzcho
 */
public class SortingAlgorithms {

    /**
     * Loops through the array and prints each element out.
     * @param array - Takes an array of integers as input.
     */
    public static void printArray(int[] array) {
        
        String sortedList = "";
        for(int i=0; i < array.length; i++) {
            sortedList += array[i] + " ";
        }
        System.out.println(sortedList);
//        }
//        for(int i=0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
    }
    
    /**
     * Loops through unsorted array and sorts elements out from smallest to largest.
     * @param array - Takes an array of integers as input.
     * @return - Returns a sorted array from smallest to largest.
     */
    public static int[] bubbleSort(int[] array) {
        
        int i, j, temp = 0;
        
        for(i =0; i < array.length -1; i++ ) {

            for(j=0; j < array.length -1 -i; j++) {
                
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    System.out.println("Iteration: " + i);
                    printArray(array);
                }
            }
        }
        return array;
    }
    
    public static int[] selectionSort(int[] array) {
        
        int i, j, temp =0;
        
        for(i=0; i < array.length -1; i++) {
            int minIndx = i;
            for (j=i+1; j < array.length; j++) {
                if(array[j] < array[minIndx]) {
                    minIndx = j;
                }
            }
            temp = array[minIndx];
            array[minIndx] = array[i];
            array[i] = temp;
            System.out.println("Iteration: " + i);
            printArray(array);
            
        }
        return array;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = {5, 8, 1, 6, 9, 2};

        System.out.println("Bubble Sort: ");
        bubbleSort(array);

        System.out.println("\nSelection Sort: ");
        selectionSort(array);
    }
    
}
