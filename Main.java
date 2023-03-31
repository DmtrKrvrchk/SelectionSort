/**
 * Hauptklasse
 * @author d.krivoruchko
 */
public class Main {

    /**
     * Hauptmethode
     */
    public static void main(String[] args) {

        int[] list = {5, 8, 3, 6, 8, 9, 4, 2};
        SelectionSort aufgabe = new SelectionSort();
        aufgabe.selectionSort(list);
    }
}
