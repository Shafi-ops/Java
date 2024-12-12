package myJava;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] orig= {1,2,3,4};
		int[] copy=new int[orig.length];
		for(int i=0;i<orig.length;i++) {
			copy[i]=orig[i];
		}
		System.out.println("The Copied array:");
		for(int num:copy) {
			System.out.println(num);
		}

	}

}
