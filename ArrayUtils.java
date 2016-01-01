//Nicholas Ng
//APCS1 pd10
//Hw27 -- Objectify Your Array of Tools
//2015-11-10

public class ArrayUtils{
    public static void populate(int[] arr){
	for (int x = arr.length-1; x>=0; x--){
	    arr[x] = (int)(Math.random()*(10)+10);
	}
    }

    public static void populate(String[] arr){
	for (int x = arr.length-1; x>=0; x--){
	    arr[x] = ""+(int)(Math.random()*(10)+10);
	}
    }


    public static String stringify(int[] arr){
	String wat = "";
	for (int x = arr.length-1; x >= 1 ; x --){
	    wat = ","+arr[x]+ wat;
	}
	wat = arr[0] + wat;
	return wat;
    }

 public static String stringify(String[] arr){
	String wat = "";
	for (int x = arr.length-1; x >= 1 ; x --){
	    wat = ","+arr[x]+ wat;
	}
	wat = arr[0] + wat;
	return wat;
    }










public static int linSearch(int[] a, int target){
	for (int counter = 0;  counter < a.length ; counter++){
	    if (a[counter] == target){
		return counter;
	    }
	}
	return -1;
    }
public static int linSearch(String[] a, String target){
	for (int counter = 0;  counter < a.length ; counter++){
	    if (a[counter].equals(target)){
		return counter;
	    }
	}
	return -1;
    }


       public static int linSearcheR(int[] a, int target){
	if (a.length == 0){
	    return 0;
	}
	if (a[0] == target){
	    return 0;    
	}
	else{
	    return 1 + linSearcheR(shortArr(a), target);
	}
       }

       public static int linSearcheR(String[] a, String target){
	if (a.length == 0){
	    return 0;
	}
	if (a[0].equals(target)){
	    return 0;    
	}
	else{
	    return 1 + linSearcheR(shortArr(a), target);
	}
       }






	public static int linSearchR(int[] a, int target){
		if (linSearcheR(a, target) == (a.length)){
			return -1;
		}else{
			return linSearcheR(a, target);}
		}

	public static int linSearchR(String[] a, String target){
		if (linSearcheR(a, target) == (a.length)){
			return -1;
		}else{
			return linSearcheR(a, target);}
		}
				

	    
    public static int[] shortArr(int[] a){
	int[] newer = new int[a.length-1];
	for (int c = 1; c < a.length; c++){
	    newer[c-1]=a[c];
	}
	return newer;
    }

	public static String[] shortArr(String[] a){
	String[] newer = new String[a.length-1];
	for (int c = 1; c < a.length; c++){
	    newer[c-1]=a[c];
	}
	return newer;
    }

    public static int freq(int[] a, int target){
	int count = 0;
	for (int i : a){
	    if (i == target){
		count ++;
	    }
	}
	return count;
    }


    public static int freq(String[] a, String target){
	int count = 0;
	for (String i : a){
	    if (i.equals(target)){
		count ++;
	    }
	}
	return count;
    }

    public static int freqR(int[] a, int target){
	if (a.length == 0){
	    return 0;
	}
	if (a[0] == target){
	    return 1 + freqR(shortArr(a),target);
	}
	else{
	    return freqR(shortArr(a),target);
	}
    }

    public static int freqR(String[] a, String target){
	if (a.length == 0){
	    return 0;
	}
	if (a[0].equals(target)){
	    return 1 + freqR(shortArr(a),target);
	}
	else{
	    return freqR(shortArr(a),target);
	}
    }
    
   

}
	
