package array;

public class Ex02 {
public static void main(String[] args) {
	double dos[] = new double[] {1.111, 2.222, 3.333};
	System.out.println(dos[0]);
	System.out.println(dos.length); //현재 가지고 있는 배열의 개수
	for(int i=0 ; i<3 ; i++) { //0부터 들어와야 함'
		System.out.println(i+"."+dos[i]);
	}
	
	
	
}
}
