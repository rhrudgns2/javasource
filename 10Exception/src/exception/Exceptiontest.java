package exception;
/*Exception 과 Error(해결 못함 -컴퓨터 다운...)
 * 
 *Exception(예외)
 *컴파일 예외 -코딩할 때 이클립스에서 바로 알려줌
 *런타임 예외 -실행 할때 나타나는 예외사항
 */
public class Exceptiontest {

	public static void main(String[] args) {
		//컴파일 예외
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();//개발할떄 많이 씀. 어디서 오류가 났는지 알수있음
			System.out.println("입력값을 확인해 주세요");
		}

	}

}
