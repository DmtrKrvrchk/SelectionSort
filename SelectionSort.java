import java.util.Arrays;
import java.util.logging.Logger;


/**
 * Klasse, um ein Array mithilfe der Selection-Sort-Methode zu sortieren
 * @author d.krivoruchko
 */

public class SelectionSort {
    Logger logger = Logger.getLogger(String.valueOf(SelectionSort.class));


    /**
     * Methode, um zwei Werte in einem Array zu tauschen
     * @param array - Array zum Sortieren
     * @param position1 - Index des ersten Elementes zum Tauschen
     * @param position2 - Index des zweiten Elementes zum Tauschen
     */
    public void swap(int[] array, int position1, int position2) {
        int placeholder = array[position1];
        array[position1] = array[position2];
        array[position2] = placeholder;
    }

    /**
     * Methode ermittelt die Position des kleinsten Wertes in einem Teilarray
     * @param array - Teilarray, in dem den kleinsten Wert gesucht wird
     * @param startIndex - Wert bestimmt den ersten Index des Teilarrays
     * @param endIndex - Wert bestimmt den letzten Index des Teilarrays
     */
    public int findIndexOfMinimum(int[] array, int startIndex, int endIndex) {
        int minIndex = startIndex;
        int minimum = array[startIndex];
        for (int i = startIndex+1; i < endIndex; i++) {
            if (array[i] < minimum) {
                minIndex = i;
                minimum = array[i];
            }
        }
        return minIndex;
    }

    /**
     * Methode überprüft, ob das Array sortiert ist
     * @param array - Array zum Prüfen
     * @return - Zeigt, ob der Array sortiert ist
     */
    public boolean isSorted(int[] array) {
        boolean sort = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i+1]) {
                sort = true;
                break;
            }
        }
        return sort;
    }

    /**
     * Methode, in der ein Array nach Selection-Sort-Methode sortiert und geprüft wird
     * @param array - Array zum Sortieren
     */
    public void selectionSort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = findIndexOfMinimum(array, i, array.length);
            swap(array, i, minIndex);
        }
        if (isSorted(array)) {
            logger.info(Arrays.toString(array));
        }
    }

}