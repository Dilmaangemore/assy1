package assy1;

public class binarySearch {
	
		 static int binarySearch(int[]arr, int target) {
		    int   start =0;
		  int   end = arr.length-1;
		    while(start<=end){
		      int  mid= start+(end-start)/2;
		      
		        if (arr[mid]==target){
		            
		          return mid;
		        } 
		        if(target<arr[mid]){
		            end=mid-1;
		        }else{
		            start=mid+1;
		        }
		    }
		     return start;
		 }

//		if (start>end ) 
		  //      return -1;
		
		 public static void main (String [] args){
		    int arr[]= {2,4,6,8,10,12,14};
		     int target=12;
		 // int   start =0;
		  System.out.println(binarySearch(arr,target));
		}
	}

