package by.jonlinr.practice01_dop;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] wordListOne = { "�������", "������� ����", "��������� ����" };
		String[] wordListTwo = { "�������", "���������� ������� ����������������", "���� Senior Developer" };
		String[] wordListThree = { " - ��� �����!", " - ��� �������!", " - ��� ��, ���� �� ������ �����!" };

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		String phrase = wordListOne[rand1] + " � " + wordListTwo[rand2] + "" + wordListThree[rand3];

		System.out.println(phrase);
	}

}