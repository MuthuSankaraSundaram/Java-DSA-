import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();//7
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();//4,5,6,7,0,1,2
		}
		int pivot=pivotelement(arr);
		if(pivot!=-1)
		    System.out.println("Pivot element in a given rotated array is :"+arr[pivot]);
		else
		    System.out.println("Not pivot element is found");
	}
	public static int pivotelement(int[] arr1)
	{
	    int start=0,end=arr1.length-1;
	    while(start<=end)
	    {
	        int mid=start+(end-start)/2;
	        if(mid<end && arr1[mid]>arr1[mid+1])
	            return mid;
	        if(mid>start&&arr1[mid]<arr1[mid-1])
	            return mid-1;
	        if(arr1[start]<arr1[mid])
	            start=mid+1;
	        else
	            end=mid-1;
	    }
	    return -1;
	}
}