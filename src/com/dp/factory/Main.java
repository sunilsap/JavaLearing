package com.dp.factory;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		EnemyShip theEnemy = null;

		Scanner userInput = new Scanner(System.in);

		System.out.print("What type of ship?(U/R/B)") ;
		if(userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine() ;
			theEnemy = EnemyShipFactory.makeEnemyShip(typeOfShip);
		}

		if(theEnemy != null) {
			doStuffEnemy(theEnemy) ;
		}else System.out.println("Enter a U, R, or B next time");
	}

	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
