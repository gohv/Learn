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

		out.println("Добре дошли в бойната система на Зекрея!");
		out.println(" ");
		out.println("Напишете стойностите на двата героя в полетата долу и кликнете БИТКА!");
		out.println(" ");

		// Герой 1

		Scanner heroName = new Scanner(System.in);
		ClassZekreia intro = new ClassZekreia();
		out.print("Името на първия герой: ");
		hero1 = heroName.nextLine();

		// СТОЙНОСТ ГЕРОЙ 1

		out.print("Напишете стойноста на първия герой: ");
		Scanner heroAbility1 = new Scanner(System.in);
		while (!heroAbility1.hasNextInt()) {
			System.out.print("Моля напишете число: ");
			heroAbility1.nextLine();
		}
		ability1 = heroAbility1.nextInt();

		// Герой 2

		Scanner heroName2 = new Scanner(System.in);
		out.print("Името на втория герой: ");
		hero2 = heroName2.nextLine();

		// СТОЙНОСТ ГЕРОЙ 2

		out.print("Напишете стойноста на втория герой: ");
		Scanner heroAbility2 = new Scanner(System.in);
		while (!heroAbility2.hasNextInt()) {
			System.out.print("Моля напишете число: ");
			heroAbility2.nextLine();
		}
		ability2 = heroAbility2.nextInt();
		out.println(" ");

		// Герой 1 ЗАР
 
		out.println(hero1 + " хвърля ЗАР");
		dice1 = new Random().nextInt(20) + 1;
		out.println("Хвърленият ЗАР е: " + dice1);
		result1 = dice1 + ability1;
		out.println("Общата стойност се равнява на: " + result1);
		out.println(" ");
		// Герой 2 ЗАР

		out.println(hero2 + " хвърля ЗАР");
		dice2 = new Random().nextInt(20) + 1;
		out.println("Хвърленият ЗАР е: " + dice2);
		result2 = dice2 + ability2;
		out.println("Общата стойност се равнява на: " + result2);

		// Стартова фаза на битката

		out.println(" ");
		out.println("Стойноста на " + hero1 + " се равнява на " + result1);

		out.println("Стойноста на " + hero2 + " се равнява на " + result2);

		out.println(" ");
		out.println("Героите се впускат в битка ");
		out.println(" ");
		if (result1 > result2) {
			out.println(hero1 + " напада " + hero2);
			outCome = result1 - result2;
			out.println(outCome + " нанася щета на " + hero2);
			
		} else {
			out.println(hero2 + " напада " + hero1);
			outCome = result2 - result1;
			out.println(outCome + " нанася щета на " + hero1);	
			}
			intro.battle();
		
		

	}

}
