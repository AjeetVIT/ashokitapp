package in.nareshit.raghu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution {
public static int solve(int N,int K,List<Integer>A) {
	return K;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int N= Integer.parseInt(scan.nextLine().trim());
		int K=Integer.parseInt(scan.nextLine().trim());
		List<Integer>A=new ArrayList<>(N);
		for(int j=0;j<N;j++) {
			A.add(Integer.parseInt(scan.nextLine().trim()));
		}
int result=solve(N,K,A);
System.out.println(result);
	}

}
