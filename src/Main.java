import exo.java.one.Dice;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("================== Q - B ==================");
        Dice dice = new Dice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of throws :");
        int iteration = Integer.parseInt(sc.next());

        for(int i = 1 ; i < iteration+1 ; i++){

            dice.launch();
            System.out.println("============== Game" +i+ " =============");
            System.out.println("Result = "+dice.getValue());
        }

        System.out.println();

        System.out.println("================== Q - C ==================");

        Dice diceO = new Dice();
        Dice diceT = new Dice();

        sc = new Scanner(System.in);
        System.out.println("Please enter the number of throws :");
        iteration = Integer.parseInt(sc.next());

        for (int i = 1 ; i < iteration + 1 ; i++){

            diceO.launch();
            diceT.launch();
            System.out.println("============== Game " +i+ " =============");
            System.out.println("Result Dic 1 = "+diceO.getValue()+"| Result Dic 2 = "+diceT.getValue());

            if(diceO.getValue() == diceT.getValue()){

                System.out.println("You Win... ☺");
            }
        }

    }
}
