package Algoritimos;

public class SelectionSort {

	/*Complexidade Pior Caso: O(n²)
	Complexidade Caso Médio: O(n²)
	Complexidade Melhor Caso: O(n²)
	*/
	
	public static void selectionSort(int[] array) {
		  for (int fixo = 0; fixo < array.length - 1; fixo++) {
		    int menor = fixo;

		    for (int i = menor + 1; i < array.length; i++) {
		       if (array[i] < array[menor]) {
		          menor = i;
		       }
		    }
		    if (menor != fixo) {
		      int t = array[fixo];
		      array[fixo] = array[menor];
		      array[menor] = t;
		    }
		  }
		}
}
