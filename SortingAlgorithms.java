package sorting.algorithms;

/**
 *
 * @author mzcho
 */
public class SortingAlgorithms {

    /**
     * 
     * @param array 
     */
    public static void printArray(int[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    /**
     * 
     * @param array
     * @return 
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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = {5, 8, 1, 6, 9, 2};
        int[] result = bubbleSort(array);
        String sortedList = "";
        System.out.println("Result:");
        for(int i=0; i < result.length; i++) {
            sortedList += result[i] + " ";
        }
        
        System.out.println(sortedList);
    }
    
}
