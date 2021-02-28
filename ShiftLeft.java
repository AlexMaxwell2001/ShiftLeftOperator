import java.util.*;
public class ShiftLeft{

     public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();int num2= sc.nextInt();
        int result= shiftleft(num1, num2);
        System.out.println(num1 + " << by " + num2 + " is " + result);
     }
     
     public static int shiftleft( int num1, int num2){
         String manip="";
         int dec=0,count=0;
         while(num1!=0){
             if(num1%2==0){
                 manip= "0" + manip;
             }else{
                 manip= "1" + manip;
             }
             num1=num1/2;
         }
         for(int i=0;i<num2;i++){
             manip += "0";
         }
         for(int i=manip.length()-1; i>=0;i--){
             int n=Character.getNumericValue(manip.charAt(i));
             System.out.println(n);
             dec+= n * Math.pow(2,count);
             count++;
         }
         return dec;
     }
}
