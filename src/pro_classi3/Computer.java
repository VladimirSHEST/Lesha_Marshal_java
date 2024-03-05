//В 3-тей части мы создаём приватные переменные в этом классе, чтобы никто не мог их изменить.
// Чтобы иметь возможность обращаться к приватным переменным мы внутри класса создам метод-класс при
// помощи set. Этот метод setMemory будет присваивать значение к одному из наших полей private int memory
package pro_classi3;

public class Computer {
	private int memory; // private даёт доступ только в этом классе
	private int cpu;
	private String name;

	void getMemory() {  // выводит на экран
		System.out.println(memory);
	}

	//	void setMemory(int m){ // принимает значение
    //		memory = m;
    //	}
	void setMemory(int memory) { // принимает значение
		this.memory = memory;
	}
}
// set пишем, чтобы присвоить значения
// get пишем, чтобы вывести значения
// Итог: наш класс Computer состоит из полей и методов