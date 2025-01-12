import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int[] arr={4,5,6,0,1,2,3};
		int target=8;
		
		int start=0,end=arr.length-1;
		while(start<=end)
		{
		    int mid=(start+end)/2;
		    if(arr[mid]==target)
		    {
		        System.out.println(mid);
		        return;
		    }
		    if(arr[start]<=arr[mid])
		    {
		        if(target<arr[mid]&&target>=arr[start])
		        {
		            end=mid-1;
		        }
		        else{
		            start=mid+1;
		        }
		    }
		    else{
		        if(target>arr[mid]&&target<=arr[end])
		        {
		            start=mid+1;
		        }
		        else{
		            end=mid-1;
		        }
		    }
		}
		System.out.println("no");
	}
}
