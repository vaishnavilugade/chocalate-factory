import java.util.*;
class chocalate{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the 5 packets in the array:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		int n5=sc.nextInt();
		System.out.println("Entered values are:");
		System.out.println("["+n1+","+n2+","+n3+","+n4+","+n5+"]");
		System.out.println("Enter new chocalate:");
		int s=sc.nextInt();
		if(n1==0){
			System.out.println("["+s+","+n2+","+n3+","+n4+","+n5+"]");
		}
		else if(n2==0){
			System.out.println("["+n1+","+s+","+n3+","+n4+","+n5+"]");
		}
		else if(n3==0){
		    System.out.println("["+n1+","+n2+","+s+","+n4+","+n5+"]");
		}
		else if(n4==0){
			System.out.println("["+n1+","+n2+","+n3+","+s+","+n5+"]");
		}
		else if(n5==0){
			System.out.println("["+n1+","+n2+","+n3+","+n4+","+s+"]");
		}
		else{
			System.out.println("Sorry!!.....please try again");
		}



		
		
	}
}
		