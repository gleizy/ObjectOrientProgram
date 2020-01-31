
public class Wheel {
	String name;
	
	public Wheel(String name) {
		this.name = name;
	}
	
	void run() {
		System.out.println(name + "タイヤが運転します。");
	}
	
	void bre() {
		System.out.println(name + "タイヤが停止します。");
	}
}
