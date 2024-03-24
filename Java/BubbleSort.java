// BUbbleSort:- it is a sorting technique used to sort list/array By iterarting and comparing through each element
//              time complexity will be O(n^2)
public class BubbleSort{
    public static int[] BSA(int l[]){
        int a=l.length-1;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(l[j]>l[j+1]){
                    l[j]=l[j]+l[j+1];
                    l[j+1]=l[j]-l[j+1];
                    l[j]=l[j]-l[j+1];
                }
            }
        }
        return l;
    }
    public static void main(String args[]){
        int l[]={3,4,2,1};
        for(int i: BSA(l)){
            System.out.print(i+" ");
        }
    }
}
// output: - 1 2 3 4