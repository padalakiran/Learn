import java.util.HashMap;
import java.util.Scanner;
public class HashMaps{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        HashMap<Integer,String> a=new HashMap<Integer,String>();
        // adding elements in Hash Map
        System.out.print("Enter Number of elements to add: ");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter Key: ");
            int b=input.nextInt();
            System.out.print("Enter Value: ");
            String c=input.next();
            //adding elements in HashSet
            a.put(b,c);
        }
        System.out.println(a);
        //accessing elements in HashMap
        for(int i:a.keySet()){
            System.out.print(i+" ");//Accessing keys
            System.out.println(a.get(i)+" ");//Accessing Values
        }
        
        //removing perticular elemt using key
        for(int i:a.keySet()){
            if(i==2){
                a.remove(i);
            }
        }
        System.out.println(a);
        System.out.println(a.size());//Size of HashSet
    }
    
}
    
