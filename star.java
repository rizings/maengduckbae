package bronzefor;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i;j++)
			{
			System.out.print("*"); //ln 을 쓰면 별이 하나씩 나옴 
			}
			System.out.println(); // 별 줄바꿈
		}
	}

}
