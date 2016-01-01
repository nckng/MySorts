import java.util.ArrayList;

public class BubbleSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) 
    {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }


    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) 
    {
	int randomIndex;
	//setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data ) {
	int f = data.size()-1;
	while (f > 0){
	    for (int i = data.size()-1; i > 0; i--){
		if ( data.get(i).compareTo(data.get(i-1)) < 0  ){
		    Comparable r = data.get(i);
		    data.set(i,data.get(i-1));
		    data.set(i-1,r);
		}
	    }
	    f--;
	}
    }//end bubbleSortV -- O(?)
    
    
    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
    {
	int f = input.size()-1;
	while (f > 0){
	    for (int i = input.size()-1; i > 0; i--){
		if ( input.get(i).compareTo(input.get(i-1)) < 0  ){
		    Comparable r = input.get(i);
		    input.set(i,input.get(i-1));
		    input.set(i-1,r);
		}
	    }
	    f--;
	}	
	return input;

    }//end bubbleSort -- O(?)

}//end class BubbleSort
