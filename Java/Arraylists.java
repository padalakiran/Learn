import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> li=new ArrayList<Integer>();
		Scanner input=new Scanner(System.in);
		// adding elements in Arraylist
		System.out.print("Enter Number of Elements Want to Add: ");
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Enter "+(i+1)+" Element: ");
			int a=input.nextInt();
			li.add(a);
		}
		// accessing Elements in array list
		for(int i:li) {
			System.out.print(i+" ");
		}
		System.out.println("");
		//removing elemets in arraylist
		li.remove(0);// remove method uses index to remove the elements
		
		// accessing Elements in array list
		for(int i:li) {
			System.out.print(i+" ");
		}
    }
}