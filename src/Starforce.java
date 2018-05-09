import java.util.Scanner;
import java.util.Random;
public class Starforce {

	static final int mesos = 55; //55m per try
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Roflcopter
		Scanner input = new Scanner(System.in);
		System.out.println("Which tyrant equip would you like to starforce?");
		System.out.println("1. Tyrant Gloves");
		System.out.println("2. Tyrant Cape");
		System.out.println("3. Tyrant Shoes");
		System.out.println("4. Tyrant Belt");
		System.out.print("Enter your choice here: ");
		int choice; 
		double totalMesos = 0;
		double totalMesosInBil = 0;
		choice = input.nextInt();
		if(choice == 1)			//Tyrant Gloves
		{
			int z = 0;
			int currentStarForce = TyrantGlovesFirstStar(z);
			totalMesos = totalMesos + mesos;
			totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
			if(totalMesos < 1000)
			{
				System.out.println("Total mesos used: " + totalMesos + "m");
			}
			else
			{
				System.out.println("Total mesos used: " + totalMesosInBil + "b");
			}
			
			System.out.println("Would you like to starforce again?");
			System.out.println("Enter 1(yes) or 2(no):");
			int choice1, choice2;
			choice1 = input.nextInt();
			while(choice1 == 1)
			{
				if(currentStarForce == 0)
				{
					currentStarForce = TyrantGlovesFirstStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
					
				}
				else if (currentStarForce == 1)
				{
					currentStarForce = TyrantGlovesSecondStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 2)
				{
					currentStarForce = TyrantGlovesThirdStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 3)
				{
					currentStarForce = TyrantGlovesFourthStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 4)
				{
					currentStarForce = TyrantGlovesFifthStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 5)
				{
					currentStarForce = TyrantGlovesSixthStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 6)
				{
					currentStarForce = TyrantGlovesSeventhStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 7)
				{
					currentStarForce = TyrantGlovesEighthStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 8)
				{
					currentStarForce = TyrantGlovesNinethStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 9)
				{
					currentStarForce = TyrantGlovesTenthStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 10)
				{
					currentStarForce = TyrantGlovesEleventhStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 11)
				{
					currentStarForce = TyrantGlovesTwelfthStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 12)
				{
					currentStarForce = TyrantGlovesThirteenthStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 13)
				{
					currentStarForce = TyrantGlovesFourteenthStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					System.out.println("Would you like to starforce again?");
					System.out.println("Enter 1(yes) or 2(no):");
					choice1 = input.nextInt();
				}
				else if (currentStarForce == 14)
				{
					currentStarForce = TyrantGlovesFifteenthStar(z);
					totalMesos = totalMesos + mesos;
					totalMesosInBil = totalMesosInBil + (totalMesos / 1000);
					if(totalMesos < 1000)
					{
						System.out.println("Total mesos used: " + totalMesos + "m");
					}
					else
					{
						System.out.println("Total mesos used: " + totalMesosInBil + "b");
					}
					if(currentStarForce == 15)
					{
						Done(totalMesos);
						System.out.println("1. Tyrant Gloves");
						System.out.println("2. Tyrant Cape");
						System.out.println("3. Tyrant Shoes");
						System.out.println("4. Tyrant Belt");
						System.out.print("Enter your choice here: ");
						choice = input.nextInt();
					}
					else
					{
						System.out.println("Would you like to starforce again?");
						System.out.println("Enter 1(yes) or 2(no) to say yes:");
						choice1 = input.nextInt();
					}
				}
		
			}
			
		}	
		
	}

	public static int TyrantGlovesFirstStar(int starCount)
	{
		//First star
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0;
		starCount = 0;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 50)			//50% success
		{
			starCount++;
			bonusStat = 19;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(starCount == 0)
			{
				starCount = 0;
				totalMainStat = 12;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
			else
			{
				starCount--;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + attack);
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	
	public static int TyrantGlovesSecondStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0;
		starCount = 1;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 50)			//50% success
		{
			starCount++;
			bonusStat = 39;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(starCount == 0)
			{
				starCount = 0;
				totalMainStat = 12;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
			else
			{
				starCount--;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + attack);
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	
	public static int TyrantGlovesThirdStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0;
		starCount = 2;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 50)			//50% success
		{
			starCount++;
			bonusStat = 61;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(starCount == 0)
			{
				starCount = 0;
				totalMainStat = 12;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
			else
			{
				starCount--;
				bonusStat = 19;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + attack);
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	
	public static int TyrantGlovesFourthStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0;
		starCount = 3;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 50)			//50% success
		{
			starCount++;
			bonusStat = 86;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(starCount == 0)
			{
				starCount = 0;
				totalMainStat = 12;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
			else
			{
				starCount--;
				bonusStat = 39;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + attack);
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	
	public static int TyrantGlovesFifthStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0;
		starCount = 4;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 50)			//50% success
		{
			starCount++;
			bonusStat = 115;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(starCount == 0)
			{
				starCount = 0;
				totalMainStat = 12;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
			else
			{
				starCount--;
				bonusStat = 61;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + attack);
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	
	public static int TyrantGlovesSixthStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0, bonusAttack = 0, totalAttack = 0;
		starCount = 5;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		int boomRate = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 45)			//45% success
		{
			starCount++;
			bonusStat = 115;
			bonusAttack = 9;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			totalAttack = attack + bonusAttack;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(boomRate >= 1 && boomRate <= 2)
			{
				System.out.println("Uh oh, your Tyrant Gloves blew up!!");
				return boomRate;
			}
			else
			{
				starCount--;
				bonusStat = 86;
				bonusAttack = 0;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				totalAttack = attack;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			if(starCount == 4)
				System.out.println("Weapon attack: " + totalAttack);
			else
				System.out.println("Weapon attack: " + totalAttack + " (" + attack + "+" + bonusAttack + ")");
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	
	public static int TyrantGlovesSeventhStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0, bonusAttack = 0, totalAttack = 0;
		starCount = 6;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		int boomRate = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 40)			//40% success
		{
			starCount++;
			bonusStat = 115;
			bonusAttack = 19;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			totalAttack = attack + bonusAttack;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(boomRate >= 1 && boomRate <= 2)
			{
				System.out.println("Uh oh, your Tyrant Gloves blew up!!");
				return boomRate;
			}
			else
			{
				starCount--;
				bonusStat = 115;
				bonusAttack = 0;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				totalAttack = attack + bonusAttack;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			if(starCount == 5)
				System.out.println("Weapon attack: " + totalAttack);
			else
				System.out.println("Weapon attack: " + totalAttack + " (" + attack + "+" + bonusAttack + ")");
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	
	public static int TyrantGlovesEighthStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0, bonusAttack = 0, totalAttack = 0;
		starCount = 7;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		int boomRate = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 35)			//35% success
		{
			starCount++;
			bonusStat = 115;
			bonusAttack = 30;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			totalAttack = attack + bonusAttack;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(boomRate >= 1 && boomRate <= 2)
			{
				System.out.println("Uh oh, your Tyrant Gloves blew up!!");
				return boomRate;
			}
			else
			{
				starCount--;				//From 7 to 6 stars
				bonusStat = 115;
				bonusAttack = 9;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				totalAttack = attack + bonusAttack;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + totalAttack + " (" + attack + "+" + bonusAttack + ")");
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	
	public static int TyrantGlovesNinethStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0, bonusAttack = 0, totalAttack = 0;
		starCount = 8;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		int boomRate = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 30)			//30% success
		{
			starCount++;
			bonusStat = 115;
			bonusAttack = 42;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			totalAttack = attack + bonusAttack;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(boomRate >= 1 && boomRate <= 2)
			{
				System.out.println("Uh oh, your Tyrant Gloves blew up!!");
				return boomRate;
			}
			else
			{
				starCount--;
				bonusStat = 115;
				bonusAttack = 19;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				totalAttack = attack + bonusAttack;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + totalAttack + " (" + attack + "+" + bonusAttack + ")");
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	
	public static int TyrantGlovesTenthStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0, bonusAttack = 0, totalAttack = 0;
		starCount = 9;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		int boomRate = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 25)			//25% success
		{
			starCount++;
			bonusStat = 115;
			bonusAttack = 55;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			totalAttack = attack + bonusAttack;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(boomRate >= 1 && boomRate <= 2)
			{
				System.out.println("Uh oh, your Tyrant Gloves blew up!!");
				return boomRate;
			}
			else
			{
				starCount--;
				bonusStat = 115;
				bonusAttack = 30;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				totalAttack = attack + bonusAttack;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + totalAttack + " (" + attack + "+" + bonusAttack + ")");
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	public static int TyrantGlovesEleventhStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0, bonusAttack = 0, totalAttack = 0;
		starCount = 10;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		int boomRate = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 20)			//20% success
		{
			starCount++;
			bonusStat = 115;
			bonusAttack = 70;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			totalAttack = attack + bonusAttack;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(boomRate >= 1 && boomRate <= 2)
			{
				System.out.println("Uh oh, your Tyrant Gloves blew up!!");
				return boomRate;
			}
			else
			{
				starCount--;
				bonusStat = 115;
				bonusAttack = 42;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				totalAttack = attack + bonusAttack;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + totalAttack + " (" + attack + "+" + bonusAttack + ")");
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	public static int TyrantGlovesTwelfthStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0, bonusAttack = 0, totalAttack = 0;
		starCount = 11;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		int boomRate = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 15)		//15% success
		{
			starCount++;
			bonusStat = 115;
			bonusAttack = 87;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			totalAttack = attack + bonusAttack;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(boomRate >= 1 && boomRate <= 2)
			{
				System.out.println("Uh oh, your Tyrant Gloves blew up!!");
				return boomRate;
			}
			else
			{
				starCount--;
				bonusStat = 115;
				bonusAttack = 55;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				totalAttack = attack + bonusAttack;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + totalAttack + " (" + attack + "+" + bonusAttack + ")");
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	public static int TyrantGlovesThirteenthStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0, bonusAttack = 0, totalAttack = 0;
		starCount = 12;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		int boomRate = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 3)			//3% success
		{
			starCount++;
			bonusStat = 115;
			bonusAttack = 106;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			totalAttack = attack + bonusAttack;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(boomRate >= 1 && boomRate <= 2)
			{
				System.out.println("Uh oh, your Tyrant Gloves blew up!!");
				return boomRate;
			}
			else
			{
				starCount--;
				bonusStat = 115;
				bonusAttack = 70;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				totalAttack = attack + bonusAttack;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + totalAttack + " (" + attack + "+" + bonusAttack + ")");
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	public static int TyrantGlovesFourteenthStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0, bonusAttack = 0, totalAttack = 0;
		starCount = 13;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		int boomRate = rand.nextInt(100) + 1;
		if(star1 >= 1 && star1 <= 2)			//2% success
		{
			starCount++;
			bonusStat = 115;
			bonusAttack = 127;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			totalAttack = attack + bonusAttack;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(boomRate >= 1 && boomRate <= 2)
			{
				System.out.println("Uh oh, your Tyrant Gloves blew up!!");
				return boomRate;
			}
			else
			{
				starCount--;
				bonusStat = 115;
				bonusAttack = 87;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				totalAttack = attack + bonusAttack;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + totalAttack + " (" + attack + "+" + bonusAttack + ")");
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	public static int TyrantGlovesFifteenthStar(int starCount)
	{
		Random rand = new Random();
		int bonusStat = 0, totalMainStat = 0, totalSecondaryStat = 0, bonusAttack = 0, totalAttack = 0;
		starCount = 14;
		int mainStat = 12;		//main stat
		int secondaryStat = 12; 	//secondary stat
		int attack = 15;		//Weapon attack
		int star1 = rand.nextInt(100) + 1;
		int boomRate = rand.nextInt(100) + 1;
		if(star1 == 1)						//1% success
		{
			starCount++;
			bonusStat = 115;
			bonusAttack = 150;
			totalMainStat = mainStat + bonusStat;
			totalSecondaryStat = secondaryStat + bonusStat;
			totalAttack = attack + bonusAttack;
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("SUCCESS!");
			
		}
		else
		{
			if(boomRate >= 1 && boomRate <= 2)
			{
				System.out.println("Uh oh, your Tyrant Gloves blew up!!");
				return boomRate;
			}
			else
			{
				starCount--;
				bonusStat = 115;
				bonusAttack = 106;
				totalMainStat = mainStat + bonusStat;
				totalSecondaryStat = secondaryStat + bonusStat;
				totalAttack = attack + bonusAttack;
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("FAIL!");
			}
		}
		System.out.println("The stats of your Tyrant Gloves are: ");
		if(starCount == 0)
		{
			System.out.println("Main stat: " + mainStat);
			System.out.println("Secondary stat: " + secondaryStat);
			System.out.println("Weapon attack: " + attack);
		}
		else
		{
			System.out.println("Main stat: " + totalMainStat + " (" + mainStat + "+" + bonusStat + ")");
			System.out.println("Secondary stat: " + totalSecondaryStat + " (" + secondaryStat + "+" + bonusStat + ")");
			System.out.println("Weapon attack: " + totalAttack + " (" + attack + "+" + bonusAttack + ")");
		}
		System.out.println("The amount of stars: " + starCount);
		return starCount;
	}
	public static double Done(double z)
	{
		System.out.println("Yay congrats! You've FINALLY fully starforced your Tyrant Gloves after " + z + " mesos!");
		System.out.println("What would you like to starforce next?");
		return z;
	}
}
