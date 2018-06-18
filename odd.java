import java.util.*;

public class odd {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		if(a>=1 && a<=100000){
			if(a%2 == 0)
			System.out.println("Even");
			else
				System.out.println("Odd");
		}
		else{
			System.out.println("Invalid");
		}
			

	}

}
