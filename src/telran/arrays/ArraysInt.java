package telran.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysInt {
	public static int[] addNumber(int [] array,int number) {
		int [] res=Arrays.copyOf(array, array.length+1);
		res[array.length]=number;
		return res;
		
		
	}
	public static int [] insertNumber(int []array,int index,int number) {
		int [] res=new int  [array.length+1];
		System.arraycopy(array, 0, res, 0, index);
		res[index]=number;
		System.arraycopy(array, index, res, index+1, array.length-index);
		return res;
		
	}
	public static int [] removeNumber(int []array,int index) {
		//TODO returns array with no number at the given index
		int [] res=new int [array.length-1];
		System.arraycopy(array, 0, res, 0, index);
		System.arraycopy(array, index+1, res, index, array.length-index-1);
		return res;
		
	}
	public static int [] insertNumberSorted(int []array,int number) {
		 int index = Arrays.binarySearch(array, number);
	        
	        if (index < 0) {
	            index = -index - 1;
	        }
	        
	        int[] res = new int[array.length + 1];
	        System.arraycopy(array, 0, res, 0, index);
	        res[index] = number;
	        System.arraycopy(array, index, res, index + 1, array.length - index);
	        
	        return res;
		
	}
	public static int searchNumber(int [] array ,int number) {
		// looking for the given number in the given array 
		//returns index value for the number if exists,otherwise -1
		int index=0;
		while (index<array.length && array[index]!=number) {
			index++;
			
		}
		return index<array.length?index:-1;
	}
	public static int binarySearchNumber(int[] array,int number) {
		int left=0;
		int right=array.length-1;
		int middle;
		int res=-1;
		while(left<=right) {
			middle=left+(right-left)/2;
			
			if(array[middle]==number) {
				res=middle;
				right=middle-1;
			}else {
				if(array[middle]>number) {
					right=middle-1;
					
				}else {
					left=middle+1;
				}
				
			}
			
		}
		return res==-1?-left-1:res;
		
	}
	public static void quickSort(int[] array) {
		Arrays.sort(array);//O[N*LogN]
	}
	public static void bubbleSort(int []array) {
		int length=array.length;
		boolean flSorted=false;
		do {
			length--;
			flSorted=true;
			for(int i=0;i<length;i++) {
				if(array[i]>array[i+1]) {
					swap(array,i,i+1);
					flSorted=false;
				}
				
			}
		}while(!flSorted);
	}
	private static void swap(int[] array, int i, int j) {
		/*swap with no additional variable
array[i]=array[i]+array[j];
array[j]=array[i]-array[j];
array[i]=array[i]-array[j];
*/
		int tmp= array[i];
		array[i]=array[j];
		array[j]=tmp;
	}
	public static int getRandomInt(int min,int max) {
		Random gen = new Random();
		return gen.nextInt(min,max+1);
	}


}
