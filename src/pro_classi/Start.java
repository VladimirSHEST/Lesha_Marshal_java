package pro_classi;

public class Start {
	public static void main(String[] args) {
		Computer apple = new Computer();// класс Computer используем как тип данных,
		//который сами создали. new - это выделение памяти под новую переменную
		//Computer() - говорим,что хотим создать

		apple.name = "MacBook10";  // обращаемся к apple, затем к переменной name
		apple.cpu = 2500;
		apple.memory =1000;
		System.out.println(apple.name);
	}
}
