package spring.DI;

public class Foo {
	
	
	public void start(){
		System.out.println("���� �����");
		
	}
	
	public void stop(){
		System.out.println("����");
	}

	Bar bar;
	Baz baz;

	String str;
	String str1;
	String str2;

	Foo() {

	}
	
	
	

	public void setStr(String str) {
		this.str = str;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void setBaz(Baz baz) {
		this.baz = baz;
	}

	int i;

	void doFoo() {
		/*bar = getBar();*/
		System.out.println("doFoo()�޼ҵ��� --->  str : " + str + " i : " + i);
		/*bar.doIt();*/
	}
	
	public Bar getBar(){
		return null;//Bar Ÿ���� ��ü�� ���� �ǵ��� �������̵���;
		
	}

	Foo(Bar bar, Baz baz) {
		System.out.println("Bar bar Baz baz");
		this.bar = bar;
		this.baz = baz;
	}

	Foo(String str, int i) {
		this.str = str;
		this.i = i;
		System.out.println("str : " + str + " i :  " + i);
	}

	Foo(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
		System.out.println("String,String :: " + str1 + str2);
	}

}
