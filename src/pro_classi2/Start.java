package pro_classi2;

public class Start {
	public static void main(String[] args) {
		Computer apple = new Computer();

		apple.name = "MacBook10";  // обращаемся к apple, затем к переменной(к полю) name
		apple.cpu = 2500;
		apple.memory =1000;
		System.out.println(apple.name);
		apple.isCpu();

		Computer dell = new Computer();
		dell.cpu = 4300;
		dell.isCpu();

		Computer aser = apple; // Computer-переменная типа Computer
		// aser - имя переменной
		// = apple - тут присваиваем значение переменной apple
		//другими словами мы написали int a = b;

		apple.memory = 1500;
		aser.memory = 700;  //У этих двух одна и та же ссылка

		apple.isMemory();
		aser.isMemory();

	}
}
