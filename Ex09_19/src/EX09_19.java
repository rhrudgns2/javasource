
class MyChar {
	char x;
	char y;
}
		
public class EX09_19 {
		
	static void func1(char x, char y) {
		char imsi;
		imsi = x;
		x =y;
		y= imsi;
	}
	static void func2(MyChar ch) {
		char imsi;
		imsi =ch.x;
		ch.x= ch.y;
		ch.y=imsi;
	}
		
	public static void main(String[] args) {
			
		char x ='A'; char y= 'Z';
		System.out.printf("���� ��    :x=%c, y=%c\n", x, y);
		func1(x,y);
		System.out.printf("���� ������ �� : x=%c, y=%c\\n",x,y);
				
		MyChar ch = new MyChar();
		ch.x = 'A';
		ch.y = 'Z';
		System.out.printf("���� ��    : x=%c, y=%c\n", ch.x, ch.y);
		func2(ch);
		System.out.printf("�ּҸ� ������ �� : x=%c, y=%c\n", ch.x, ch.y);
	}
}
