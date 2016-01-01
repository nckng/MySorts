//Nicholas Ng
//Bogosort
import java.util.ArrayList;

public class BogoSort{
    
    public static ArrayList populate( int size, int lo, int hi ) {//method that populates an arraylist
	ArrayList<Comparable> retAL = new ArrayList<Comparable>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }
    
    public static boolean issorted(ArrayList<Comparable> data){//checks if items in arraylist are sorted 
	boolean is = true;
	for (int i = 0; i < data.size()-1; i++){
	    if (data.get(i).compareTo(data.get(i+1)) > 0){
		is = false;
	    }
	}
	return is;
    }
    
    public static ArrayList<Comparable> shuffle( ArrayList<Comparable> al ) {//creates a random order of elements
	int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ));
        }
	return al;
    }
    public static void bogoSortV(ArrayList<Comparable> data){//void version of bogosort
	if (issorted(data)){
	    return;
	}
	else{

	    bogoSort(shuffle(data)); 
	}
    }

    public static ArrayList<Comparable> bogoSort(ArrayList<Comparable> data){//bogosort that returns an arraylist 
	if (issorted(data)){
	    return data;
	}
	else{
	    shuffle(data);
	}
	return bogoSort(data);
	
    }

}	    
