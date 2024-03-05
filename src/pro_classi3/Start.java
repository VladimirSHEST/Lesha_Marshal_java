package pro_classi3;

public class Start {
	public static void main(String[] args) {

		Computer apple = new Computer();

		apple.getMemory(); // метод get выводит значение и тут оно равно 0

		apple.setMemory(320);// обращаемся к переменной apple типа Computer, затем к методу в другом классе
		// setMemory он присваивает значение

		apple.getMemory(); // метод get выводит значение и тут оно равно 320

	}
}
