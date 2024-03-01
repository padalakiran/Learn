// # wiggle Sort:- odd index numbers should always greater than equal to
// #               previous numburs and even index numbers should always
// #                less than equal to next index numbers
// # For wigglesort we do iterate through array and swaping numbers
public class WiggleSort{
    public static void main(String args[]){
        int a[]={3,5,2,1,6};
        for(int i=0;i<a.length-1;i++){
            if(i%2==0){
                if(a[i]>a[i+1]){
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }else{
                if(a[i]<a[i+1]){
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
        for(int i:a){
            System.out.print(i);
        }
    }
}