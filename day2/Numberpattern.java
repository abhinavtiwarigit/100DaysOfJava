package day2;
import java.util.*;
public class Numberpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		for(int i=1,p=1;i<=n;i++,p++) {
			for(int j=1;j<=i;j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}

	}

}
