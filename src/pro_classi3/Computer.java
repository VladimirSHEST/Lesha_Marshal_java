//� 3-��� ����� �� ������ ��������� ���������� � ���� ������, ����� ����� �� ��� �� ��������.
// ����� ����� ����������� ���������� � ��������� ���������� �� ������ ������ ������ �����-����� ���
// ������ set. ���� ����� setMemory ����� ����������� �������� � ������ �� ����� ����� private int memory
package pro_classi3;

public class Computer {
	private int memory; // private ��� ������ ������ � ���� ������
	private int cpu;
	private String name;

	void getMemory() {  // ������� �� �����
		System.out.println(memory);
	}

	//	void setMemory(int m){ // ��������� ��������
    //		memory = m;
    //	}
	void setMemory(int memory) { // ��������� ��������
		this.memory = memory;
	}
}
// set �����, ����� ��������� ��������
// get �����, ����� ������� ��������
// ����: ��� ����� Computer ������� �� ����� � �������