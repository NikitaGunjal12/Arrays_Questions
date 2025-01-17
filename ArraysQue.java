package Arrays_Questions;

public class ArraysQue {
/*Linear Search
Linear search is used to search a key element from multiple elements.
Linear search is less used today because it is slower than binary search
and hashing.
*/

/*public class LinearSearchEx{
    public static int LinearSearchex(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return key;
     }
    public static void main(String args[]){
        int arr[]={3,5,6,7,8,9,10};
        int key =10;
        int index = LinearSearchex(arr, key);
        if(index==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key is found at index:"+index);
        }
    }
}*/

/*

 //Example 2: LARGEST AND SMALLEST ELEMENT FROM ARRAY...
public class LargestNoFromArray {
    public static int LargestEle(int arr[]){
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
     System.out.println("The Smallest Number is:"+min);
    return max;
    }
    public static void main(String args[]){
        int arr[]={1,3,5,6,89};
        System.out.println("The Largest Element is:"+LargestEle(arr));
    }
}
 */

 /*
Example :3

BINARY SEARCH
Binary search is used to search a key element from multiple elements.
 Binary search is faster than linear search.
In case of binary search, array elements must be in ascending order. 
If you have unsorted array,you can sort the array using Arrays.sort(arr) method


import java.util.Arrays;
public class BinarySearch {
    public static int BinarySearchEx(int arr[],int key){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;

            }if (arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={34,56,12,89,32};
        int key =12;
        System.out.println("The Element at Index:"+BinarySearchEx(arr, key));

    }

//EXAMPLE 2:(Another method of BinarySearch)
public static void main(String[]args){
    int arr[]={10,20,30,40,50,60};
    int key =40;
    int result = Arrays.binarySearch(arr,key);
    if(result <0){
        System.out.println("Element is not found");
    }else{
        System.out.println("Element found at index:"+result);
    }
}
}
 */

 /*
  /*PROGRAM-2
 * Given an integer n, print the first n rows of pascal's triangle.
 * in pascal's triangle each no of is the sum of two numbers directly above it as show 
 * INPUT: n=5
 * OUTPUT:
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */
/*public class Program3 {
    public static void main(String[]args){
        int n =5;
        printPascal(n);
    }
    public static void printPascal(int n){
        int [][] ans = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j== 0 || i==j){
                    ans[i][j]=1;
                }
                else{
                    ans[i][j] = ans[i-1][j-1]+ ans[i-1][j];
                }
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }*/

    /*
    /*PROGRAM-2
 * Given an integer n, print the first n rows of pascal's triangle.
 * in pascal's triangle each no of is the sum of two numbers directly above it as show 
 * INPUT: n=5
 * OUTPUT:
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 
public class Program3 {
    public static void main(String[]args){
        int n =5;
        printPascal(n);
    }
    public static void printPascal(int n){
        int [][] ans = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j== 0 || i==j){
                    ans[i][j]=1;
                }
                else{
                    ans[i][j] = ans[i-1][j-1]+ ans[i-1][j];
                }
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
*/
/*
 import java.util.Scanner;
import java.util.*;

public class Practiceque{
	public static void main(String args[]){
		/*int year = 2005;
		if(year%4==0){
			System.out.println("Year is leap Year");
		}
			else{
				System.out.println("Year is not Leap Year");
			}*/
			/*int a ,b , c;
			Scanner scnner = new Scanner(System.in);  
 
			System.out.println("Enter the first number:");  
			a = scnner.nextInt();  
			System.out.println("Enter the second number:");  
			b = scnner.nextInt();  
			System.out.println("Enter the third number:");  
			c = scnner.nextInt();  
			if(a>=b && a>=c){
				System.out.println(a+ "is greater");
			}else if(b>=a && b>=c){
				System.out.println(b +"is greater");
			}
			else{
				System.out.println(c+ "is greater");
			}*/
			
			//Sum of all even Numbers.
			/*int sum=0;
			for(int i=1;i<=100;i++){
				if(i%2==0){
					//System.out.println(i);
					sum+=i;
				}
			}
			System.out.println("Sum of all even numbers:"+sum*/
			
			//String palindrome
			/*Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string");
			String str = sc.nextLine();
			//String str;
			String rev="";
			for(int i = str.length()-1; i>=0;i-- )
				rev =  rev +str.charAt(i);
			if(str.equals(rev))
				System.out.println(str +" is  Palindrome");
			else
				System.out.println(str +"  is not palindrome");*/
		
	//reverse array
	/*int arr[]= new int []{2,4,5,6,7,8};
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	System.out.println("***Reverse array***");
	for(int i= arr.length-1;i>=0;i--){
		System.out.println(arr[i]);
	*/
	
	
	//Equal elemnet from array
	/*int arr1[]= new int [] {2,4,5,6};
	int arr2[]=new int [] {2,3,8,6};
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr2.length;j++)
		{
			if(arr1[i]==arr2[j])
				System.out.println(arr1[i]);
			}
			
		}


		int radius=5;
		double pi= 3.14 , area;
		area= pi* radius*radius;
		System.out.println(area);
		int sum=0;
		int arr1[]= new int[]  {2,4,5,6};
		for(int i=0;i<arr1.length;i++){
			//System.out.println(arr1[i]);
		
			sum+=arr1[i];
		}
		
			System.out.println(sum);
			
		}
		
		
	}*/

    
}

  

