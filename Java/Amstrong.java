// # Amstrong Number :- The number which sum of power of each digit with number of digis equal to the origina number
// #                     Example:- 153= 1**3+5**3+3**3
// #                                  = 1+125+27
// #                                  =153 : hence it is a amstrong Number
public class Amstrong{
    public static int Amst(int n){
        int r=0;
        int d=0;
        int n1=n;
        int l=0;
        while(n1>0){
            d=d+1;
            n1=Math.round(n1/10);
        }
        while(n>0){
            l=n%10;
            r=r+(int)Math.pow(l,d);
            n=Math.round(n/10);
        }
        return r;
    }
    public static void main(String args[]){
        if(Amst(153)==153){
        System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}