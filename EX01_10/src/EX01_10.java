import java.util.Arrays;
class EX01_10 {
	public static void main(String[] args) {
		int[] arr = {0,4,1,3,2};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); //배열 arr을 오름차순으로 정렬
		
		
		int[][] arr2D = {{11,12},{21,22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));

		String[][] str2D = {{"ccc,bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.deepEquals(str2D,str2D2));
		
		int[] arr2 =Arrays.copyOfRange(arr,2,10);
		System.out.println(Arrays.toString(arr2));
		}
		
}

