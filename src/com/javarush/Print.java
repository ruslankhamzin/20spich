package com.javarush;

public class Print {
    public static void StartGame(){
        System.out.println("Игра началась!");
        Print.Ostatok();
    }
    public static void CompMakeStep(int step){
        System.out.println("-Количество выбранных компьютером спичек = "+step+".");
        Print.Ostatok();

    }
    public static void Ostatok(){
        System.out.println("На столе осталось "+Main.count+" спичек.");
    }
    public static void PlayerMakeStep(int step){
        System.out.println("-Количество выбранных игроком спичек = "+step+".");
        Main.count=Main.count-step;
        Print.Ostatok();
    }
    public static void MessageMistake(){
        System.out.println("Некорректное количество спичек!");
        Print.Ostatok();
    }
    public static void FinishGame(){
        System.out.println("Для игрока осталась последняя спичка.Игрок проиграл!");
    }
    public static void ScanPlayer(){
        System.out.print("-Ход игрока.Введите количество спичек: ");
    }

}
