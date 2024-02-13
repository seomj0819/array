package array;

public class Ex05 {
	public static void main(String[] args) {
		int arr[][] = new int [][] {
			//		{}.arr;
			{10, 20, 30, 3},
			{40 ,50, 60, 4}, 
			{70, 80, 90, 5},
		};
		System.out.println (arr[0] [0]);
		System.out.println (arr[1] [2]);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		for (int i=0 ; i<arr.length ; i++) {
			for (int k=0 ; k<arr[i].length ; k++) {
				System.out.println(arr[i][k]+" ");
			}
			//		System.out.println(arr[i][0]);
			//		System.out.println(arr[i][1]);
			//		System.out.println(arr[i][2]);
			//		System.out.println(arr[i][3]);
			System.out.println("---------------");
		}
	}
}