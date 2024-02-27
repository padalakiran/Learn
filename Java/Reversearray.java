// # to reverse list we can use 
// # By swaping Elements :- in swaping Elements we can run loop by half of length of array
// #                          and we can simply Swap array by swaping the elements by fist with 
// #                          last element.
// # Below is the code for swaping Elements in an array


public class ReverseArray{
    public static int[] Rev(int l[]){
       for(int i=1;i<Math.round((l.length)/2);i++){
            l[i-1]=l[l.length-i]+l[i-1];
            l[l.length-i]=l[i-1]-l[l.length-i];
            l[i-1]=l[i-1]-l[l.length-i];
       }
       return l;
    }
    
    public static void main(String args[]){
        int l[]={1,2,3,4,5,6,7,8};
        for(int i:Rev(l)){
            System.out.println(i);
        }
    }
}