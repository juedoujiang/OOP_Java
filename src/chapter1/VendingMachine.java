package chapter1;

public class VendingMachine {
	int price = 80;
	int balence = f();
	int total;
	
	int f()
	{
		return 10;
	}
	
	VendingMachine() // 构造函数
	{
		total = 0;
	}
	VendingMachine(int price) // 重载
	{
		this.price = price;
	}
	
	void setPrice(int price)
	{
		this.price = price;
	}
	
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	
	void insertMoney(int amount)
	{
		balence += amount;
		showBalence();
	}
	
	void showBalence()
	{
		System.out.println(this.balence);
	}
	
	void getFood()
	{
		if (balence >= price)
		{
			System.out.println("Here you are");
			balence = balence - price;
			total = total + price;
		}
	}
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		VendingMachine vm1 = new VendingMachine(100);
		vm.showPrompt();
		vm.showBalence();
		vm.insertMoney(100);
		vm1.insertMoney(200);
		vm.getFood();
		vm.showBalence();
	}

}
