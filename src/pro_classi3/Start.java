package pro_classi3;

public class Start {
	public static void main(String[] args) {

		Computer apple = new Computer();

		apple.getMemory(); // ����� get ������� �������� � ��� ��� ����� 0

		apple.setMemory(320);// ���������� � ���������� apple ���� Computer, ����� � ������ � ������ ������
		// setMemory �� ����������� ��������

		apple.getMemory(); // ����� get ������� �������� � ��� ��� ����� 320

	}
}
