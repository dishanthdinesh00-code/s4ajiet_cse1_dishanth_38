import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n.k.j,m,p");
    int n=sc.nextInt();
    int k=sc.nextInt();
    int j=sc.nextInt();
    int m=sc.nextInt();
    int p=sc.nextInt();
    if(k==0||j==0||n==0){
        System.out.println("the k and j and n value cannot be zero");
    }
    else{
         int a=m/k;
         int b=p/j;
         int c=a+b;
         int result=n-c;
         if((m%k!=0)||(p%j!=0)) {
             result=result-1;
         }
         System.out.println(result);
         
         }
    }
}
