// # Palindrome:- if a string mean to be Palindromewhich reverse of string is equal to original string
// #              Example:- madam==madam (palindrome)
// #              asdc != cdsa(not a palindrome) 
import java.util.Scanner;
public class Palindrome{
    public static boolean Palind(String s) {
    int length = s.length();
    for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
    }
    return true;
}
    
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=a.nextLine();
        if(Palind(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}