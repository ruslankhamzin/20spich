package com.javarush;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static int count = 20;
    public static void main(String[] args){
	Print.StartGame();
	Scanner scanner = new Scanner(System.in);
	ComputerLogic.FirstStep();
	while(count!=1){
        Print.ScanPlayer();
        int Player=scanner.nextInt();
        if (Player>3||Player<1){
            Print.MessageMistake();
            continue;
        }
        else{
            Print.PlayerMakeStep(Player);
            ComputerLogic.Step(Player);
        }
    }
	Print.FinishGame();


	// write your code here
    }
}
