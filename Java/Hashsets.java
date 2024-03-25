import java.util.HashSet;
import java.util.Scanner;
public class HashSets{
    public static void main(String args[]){
        // Does not contain Duplicate Elements
        HashSet<Integer> a=new HashSet<Integer>();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of Elements: ");
		int b=input.nextInt();
		// adding elements in hashset
		for(int i=0;i<b;i++) {
			System.out.print("Enter "+(i+1)+" Elements: ");
			int c=input.nextInt();
			a.add(c);
		}
		a.remove(0);//removes the given object not index
		// Accesing elements in hashset
		for(int i:a) {
			System.out.print(i+" ");
		}
    }
}