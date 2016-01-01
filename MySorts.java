//Nicholas Ng
// MYSORTS DRIVER

import java.util.ArrayList;

public class MySorts{//Driver for testing sorting algos
    public static void main(String [] args){
	BubbleSort bryan = new BubbleSort();
	BogoSort wally = new BogoSort();
	SelectionSort jj = new SelectionSort();
    	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );

	System.out.println( "ArrayList glen after sorting:\n");
	System.out.println(bryan.bubbleSort(glen));
	System.out.println(jj.selectionSort(glen));
	System.out.println(wally.bogoSort(glen));
       
      	ArrayList coco = bryan.populate( 7, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	ArrayList cocoSorted = BubbleSort.bubbleSort( coco );
	System.out.println( "sorted version of ArrayList coco:\n" );
	System.out.println(bryan.bubbleSort(coco));
	System.out.println(jj.selectionSort(coco));
	System.out.println(wally.bogoSort(coco));
    }//end main
}
