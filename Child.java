
public class Child extends Parent {

	void howMuchMoneyDoIHave() {
		super.howMuchMoneyDoIHave();
		System.out.println("�l�͎q�N���X�B");
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.money = 1000000;
		child.howMuchMoneyDoIHave();
	}

}
