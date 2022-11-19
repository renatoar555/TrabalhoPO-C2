package Aplication;

import java.io.IOException;

import Algoritimos.BubbleSort;
import Algoritimos.InsertionSort;
import Algoritimos.QuickSort;
import Algoritimos.SelectionSort;

public class Aplicativo {

	public static void main(String[] args) throws IOException {

		int nVetCres100 = 100, nVetCres1000 = 1000, nVetCres10000 = 10000, nVetCres100000 = 100000, nVetCres1000000 = 1000000; 
		int nVetDcres100 = 100, nVetDcres1000 = 1000, nVetDcres10000 = 10000, nVetDcres100000 = 100000, nVetDcres1000000 = 1000000; 
		int nVetRandom100 = 100, nVetRandom1000 = 1000, nVetRandom10000 = 10000, nVetRandom100000 = 100000, nVetRandom1000000 = 1000000; 

		int VetCres100[] = new int[nVetCres100]; 
		int VetCres1000[] = new int[nVetCres1000];
		int VetCres10000[] = new int[nVetCres10000]; 
		int VetCres100000[] = new int[nVetCres100000];
		int VetCres1000000[] = new int[nVetCres1000000];
		
		int VetDcres100[] = new int[nVetDcres100];
		int VetDcres1000[] = new int[nVetDcres1000];
		int VetDcres10000[] = new int[nVetDcres10000];
		int VetDcres100000[] = new int[nVetDcres100000];
		int VetDcres1000000[] = new int[nVetDcres1000000];
		
		int VetRandom100[] = new int[nVetRandom100];
		int VetRandom1000[] = new int[nVetRandom1000];
		int VetRandom10000[] = new int[nVetRandom10000];
		int VetRandom100000[] = new int[nVetRandom100000];
		int VetRandom1000000[] = new int[nVetRandom1000000];
		
		for (int i = 0; i < nVetCres100; i++) {
			VetCres100[i] = i;
		}
		for (int i = 0; i < nVetCres1000; i++) {
			VetCres1000[i] = i;
		}
		for (int i = 0; i < nVetCres10000; i++) {
			VetCres10000[i] = i;
		}
		for (int i = 0; i < nVetCres100000; i++) {
			VetCres100000[i] = i;
		}
		for (int i = 0; i < nVetCres1000000; i++) {
			VetCres1000000[i] = i;
		}
		
		for (int i = 100-1; i > nVetDcres100; i--) {
			VetDcres100[i] = i;
		}
		for (int i = 1000-1; i > nVetDcres1000; i--) {
			VetDcres1000[i] = i;
		}
		for (int i = 10000-1; i > nVetDcres10000; i--) {
			VetDcres10000[i] = i;
		}
		for (int i = 100000-1; i > nVetDcres100000; i--) {
			VetDcres100000[i] = i;
		}
		for (int i = 1000000-1; i > nVetDcres1000000; i--) {
			VetDcres1000000[i] = i;
		}

	    for (int i = 0; i < VetRandom100.length; i++) {
	    	VetRandom100[i] = (int) (Math.random()*nVetRandom100);
	    }
	    for (int i = 0; i < VetRandom1000.length; i++) {
	    	VetRandom1000[i] = (int) (Math.random()*nVetRandom1000);
	    }
	    for (int i = 0; i < VetRandom10000.length; i++) {
	    	VetRandom10000[i] = (int) (Math.random()*nVetRandom10000);
	    }
	    for (int i = 0; i < VetRandom100000.length; i++) {
	    	VetRandom100000[i] = (int) (Math.random()*nVetRandom100000);
	    }
	    for (int i = 0; i < VetRandom1000000.length; i++) {
	    	VetRandom1000000[i] = (int) (Math.random()*nVetRandom1000000);
	    }

	  
	    /*long TIInsertCres100 = System.currentTimeMillis();
	    InsertionSort.insertionSort(VetCres100);
	    long TFInsertCres100 = System.currentTimeMillis();
	    System.out.println("InsertionSort vetor crescente 100 posições executado em = " + (TFInsertCres100 - TIInsertCres100) + " ms");
	    */
	    
	    /*long TIBubbleCres100 = System.currentTimeMillis();
	    BubbleSort.bubbleSort(VetCres100);
	    long TFBubbleCres100 = System.currentTimeMillis();
	    System.out.println("BubbleSort vetor crescente 100 posições executado em = " + (TIBubbleCres100 - TFBubbleCres100) + " ms");  
	    */
	    
	    //QuickSort.quickSort(VetRandom100,0,VetRandom100.length-1);
	    
	    long TIInsertCres100 = System.currentTimeMillis();
	    SelectionSort.selectionSort(VetRandom100);
	    long TFInsertCres100 = System.currentTimeMillis();
	    System.out.println("InsertionSort vetor crescente 100 posições executado em = " + (TFInsertCres100 - TIInsertCres100) + " ms");  
	    
	    long TIInsertCres1000 = System.currentTimeMillis();
	    SelectionSort.selectionSort(VetRandom1000);
	    long TFInsertCres1000 = System.currentTimeMillis();
	    System.out.println("InsertionSort vetor crescente 1000 posições executado em = " + (TFInsertCres1000 - TIInsertCres1000) + " ms");
	    
	    long TIInsertCres10000 = System.currentTimeMillis();
	    SelectionSort.selectionSort(VetRandom10000);
	    long TFInsertCres10000 = System.currentTimeMillis();
	    System.out.println("InsertionSort vetor crescente 10000 posições executado em = " + (TFInsertCres10000 - TIInsertCres10000) + " ms");
	   
	    long TIInsertCres100000 = System.currentTimeMillis();
	    SelectionSort.selectionSort(VetRandom100000);
	    long TFInsertCres100000 = System.currentTimeMillis();
	    System.out.println("InsertionSort vetor crescente 100000 posições executado em = " + (TFInsertCres100000 - TIInsertCres100000) + " ms");
	    
	    long TIInsertCres1000000 = System.currentTimeMillis();
	    SelectionSort.selectionSort(VetRandom1000000);
	    long TFInsertCres1000000 = System.currentTimeMillis();
	    System.out.println("InsertionSort vetor crescente 1000000 posições executado em = " + (TFInsertCres1000000 - TIInsertCres1000000) + " ms");
	
	}
	
}