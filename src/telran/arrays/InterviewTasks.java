package telran.arrays;

public class InterviewTasks {
	public static boolean isSumTwo(short[]array,short sum) {
//aray of positive numbers or 0 helper array
		boolean[] helper=new boolean[sum>0?sum+1:Short.MAX_VALUE+1];
		boolean res=false;
		int index=0;
		while(index<array.length&&!res) {
			short num=(short)(sum-array[index]);
			if(num>=0) {
				if(helper[num]) {
					res=true;
				}else {
					helper[array[index]]=true;
				}
				
			}
			index++;
		}
		return res;
	}

	

public static void sort(short[]array) {
//		boolean[] helper=new boolean[Short.MAX_VALUE];
//		int index=0;
//		while((index<helper.length&&helper[index]==false)||index<array.length) {
//			int arrayIndex=0;
//			if(helper[array[index]]==false) {
//				helper[array[index]]=true;
//				index++;
//				
//			}
//			
//			index++;
//		}
//		return res;
	}
		
public static short getMaxWithNegativePresentation(short[] array) {
			boolean[] helper=new boolean[Short.MAX_VALUE];
			int res=-1;
			for(int i=0;i<array.length;i++) {
				int num=array[i];
				if(num>0) {
					helper[num]=true;
				}else if(helper[-num]==true) {
					if(res<-num) {
						res=-num;
				}
			}
}
			return (short)res;
}
}