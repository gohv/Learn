import java.util.Random;
import static java.lang.System.out;
import java.util.Scanner;

public class Zekreia {

	public static void main(String[] args) {

		String hero1;
		String hero2;
		int ability1;
		int ability2;
		int dice1;
		int dice2;
		int result1;
		int result2;
		int outCome;

		out.println("����� ����� � ������� ������� �� ������!");
		out.println(" ");
		out.println("�������� ����������� �� ����� ����� � �������� ���� � �������� �����!");
		out.println(" ");

		// ����� 1

		Scanner heroName = new Scanner(System.in);
		ClassZekreia intro = new ClassZekreia();
		out.print("����� �� ������ �����: ");
		hero1 = heroName.nextLine();

		// �������� ����� 1

		out.print("�������� ��������� �� ������ �����: ");
		Scanner heroAbility1 = new Scanner(System.in);
		while (!heroAbility1.hasNextInt()) {
			System.out.print("���� �������� �����: ");
			heroAbility1.nextLine();
		}
		ability1 = heroAbility1.nextInt();

		// ����� 2

		Scanner heroName2 = new Scanner(System.in);
		out.print("����� �� ������ �����: ");
		hero2 = heroName2.nextLine();

		// �������� ����� 2

		out.print("�������� ��������� �� ������ �����: ");
		Scanner heroAbility2 = new Scanner(System.in);
		while (!heroAbility2.hasNextInt()) {
			System.out.print("���� �������� �����: ");
			heroAbility2.nextLine();
		}
		ability2 = heroAbility2.nextInt();
		out.println(" ");

		// ����� 1 ���
 
		out.println(hero1 + " ������ ���");
		dice1 = new Random().nextInt(20) + 1;
		out.println("���������� ��� �: " + dice1);
		result1 = dice1 + ability1;
		out.println("������ �������� �� ������� ��: " + result1);
		out.println(" ");
		// ����� 2 ���

		out.println(hero2 + " ������ ���");
		dice2 = new Random().nextInt(20) + 1;
		out.println("���������� ��� �: " + dice2);
		result2 = dice2 + ability2;
		out.println("������ �������� �� ������� ��: " + result2);

		// �������� ���� �� �������

		out.println(" ");
		out.println("��������� �� " + hero1 + " �� ������� �� " + result1);

		out.println("��������� �� " + hero2 + " �� ������� �� " + result2);

		out.println(" ");
		out.println("������� �� ������� � ����� ");
		out.println(" ");
		if (result1 > result2) {
			out.println(hero1 + " ������ " + hero2);
			outCome = result1 - result2;
			out.println(outCome + " ������ ���� �� " + hero2);
			
		} else {
			out.println(hero2 + " ������ " + hero1);
			outCome = result2 - result1;
			out.println(outCome + " ������ ���� �� " + hero1);	
			}
			intro.battle();
		
		

	}

}
