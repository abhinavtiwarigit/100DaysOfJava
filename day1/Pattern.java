package day1;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 int n=5;
		 /* 4) Right Sided Triangle
		     * 
		   * * 
		 * * * 
       * * * * 
     * * * * * 

			for(int i=1;i<=n;i++) {
				 for(int j=i;j<=n;j++) { 
					 System.out.print("  "); // Decreasing  no. of spaces
				 }
				 for(int j=1;j<=i;j++) {
					 System.out.print("* "); // Increasing no. of *
				 }
				 
				 System.out.println();
			}
*/
		 /*5)Right Sided Triangle
		   		* * * * * 
		   		  * * * * 
		   			* * * 
		   			  * * 
		   				* 
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i;j++) { 
				 System.out.print("  "); // Increasing no. of spaces
			 }
			 for(int j=i;j<=n;j++) {
				 System.out.print("* "); // Decreasing no. of *
			 }
			 
			 System.out.println();
		 }
		 
		 
		 //6) Hill Pattern
		 for(int i=1;i<=n;i++) {
			 for(int j=i;j<=n;j++) { 
				 System.out.print("  "); // Decreasing no. of spaces
			 }
			 for(int j=1;j<i;j++) {		// <i because we need 1 less column 
				 System.out.print("* "); // Increasing no. of *
			 }
			 for(int j=1;j<=i;j++) {
				 System.out.print("* "); // Increasing no. of *
			 }
			 
			 System.out.println();
		 } */
		 
	}

}
