package com.javarush;

public class ComputerLogic {
    public  static void FirstStep() {
        Main.count=Main.count-3;
        Print.CompMakeStep(3);

    }
    public static void Step(int PlayerStep){
        switch (PlayerStep){
            case 1:
                Main.count=Main.count-3;
                Print.CompMakeStep(3);
                break;

            case 2:
                Main.count=Main.count-2;
                Print.CompMakeStep(2);
                break;
            case 3:
                Main.count=Main.count-1;
                Print.CompMakeStep(1);
                break;

        }
    }
}

