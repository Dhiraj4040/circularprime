/*
to check circular prime

*/

import java.util.*;
public class CircularPrime{

static boolean isPrime(int n){
	    if(n<=1){
		   return false;
       		   }
	for(int i=2;i<=Math.sqrt(n);i++){
		if(n%i==0){
			return false;
		}
	}
		return true;
		
	}

 static int circulate(int n){
	 String s=Integer.toString(n);
	 String p=s.substring(1)+s.charAt(0);
	 int a=Integer.parseInt(p);
	 return a;
	 
	 
 }
 
static void cp(int n){
	int a=n;
	do{
		if(isPrime(a)==false){
			System.out.println(a+"not circular prime");
		    break;
		}
		a=circulate(a);
	}while(a!=n);
		//System.out.println(a+" is circular prime");
}

	
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	scan.close();
		cp(num);
	
}
}