
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d= new MethodsDemo();
		d.getdata();
		String Location=d.getdata2();
		System.out.println(Location);
		getdata3();
		MethodsDemo2 t=new MethodsDemo2();
		t.getdata();
	}
	
	public void getdata() {
		System.out.println("Priya");
	}
	
	public String getdata2() {
		System.out.println("Hari");
		return("Priya is in Melbourne");
	}
	
	public static void getdata3() {
		System.out.println("Amudha");
	}

}
