package pro_classi;

public class Start {
	public static void main(String[] args) {
		Computer apple = new Computer();// ����� Computer ���������� ��� ��� ������,
		//������� ���� �������. new - ��� ��������� ������ ��� ����� ����������
		//Computer() - �������,��� ����� �������

		apple.name = "MacBook10";  // ���������� � apple, ����� � ���������� name
		apple.cpu = 2500;
		apple.memory =1000;
		System.out.println(apple.name);
	}
}
