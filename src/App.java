import java.util.Scanner;

import BasicExamples.*;
import IntermediateExamples.*;
import AdvancedExamples.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //BasicExampleMethods();
        //IntermediateExampleMethods();
        AdvancedExampleMethods();
    }

    public static void BasicExampleMethods() {
        ExVariables var = new ExVariables();
        var.RunExample();

        ExSwapVariables swap = new ExSwapVariables();
        swap.RunExample();

        ExUserInputBasic uib = new ExUserInputBasic();
        uib.RunExample();

        ExArithmeticExpressions exp = new ExArithmeticExpressions();
        exp.RunExample();

        ExBasicGUI gui = new ExBasicGUI();
        gui.RunExample();

        ExMathBasic basicMath = new ExMathBasic();
        basicMath.RunExample();

        ExRandom random = new ExRandom();
        random.RunExample();

        ExIfStatement myIf = new ExIfStatement();
        myIf.RunExample();

        ExSwitchStatement mySwitch = new ExSwitchStatement();
        mySwitch.RunExample();

        ExTernaryOperator myTern = new ExTernaryOperator();
        myTern.TernaryOperatorExample();
    }

    public static void IntermediateExampleMethods() {        
        int userChoice = 0;
        System.out.println("|---------------------------------------|");
        System.out.println("|      Intermediate Examples Menu       |");
        System.out.println("|---------------------------------------|");
        System.out.println("|01| - Madlibs Game Example             |");
        System.out.println("|02| - Shopping Cart Example            |");
        System.out.println("|03| - Calculator Example               |");
        System.out.println("|04| - Weight Conversion Example        |");
        System.out.println("|05| - Temperature Conversion Example   |");
        System.out.println("|06| - Enhanced Calculator Example      |");
        System.out.println("|07| - Number Guessing Game Example     |");
        System.out.println("|08| - Banking Program Example          |");
        System.out.println("|09| - Dice Roller Example              |");
        System.out.println("|10| - Quiz Game Example                |");
        System.out.println("|11| - Rock Paper Scissors Game Example |");
        System.out.println("|12| - Slot Machine Program Example     |");
        System.out.println("|---------------------------------------|");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which program would you like to run: ");
        userChoice = scanner.nextInt();

        switch(userChoice) {
            case 1 -> MadLibsGameExample();
            case 2 -> ShoppingCartExample();
            case 3 -> CalculatorExample();
            case 4 -> WeightConversionExample();
            case 5 -> TemperatureConverterExample();
            case 6 -> EnhancedCalculatorExample();
            case 7 -> NumberGuessingGameExample();
            case 8 -> BankingProgramExample();
            case 9 -> DiceRollerExample();
            case 10 -> QuizGameExample();
            case 11 -> RPSGameExample();
            case 12 -> SlotMachineGame();
            default -> System.out.println("Could not read choice. Exiting program...");
        }

        System.out.println("Closing Intermediate Examples...");

        scanner.close();
    }

    public static void AdvancedExampleMethods() {
        //MusicPlayerExample();
        HangManGameExample();
    }

    public static void MadLibsGameExample() {
        MadLibs game = new MadLibs();

        game.Madlibs();
    }

    public static void ShoppingCartExample() {
        ShopCart cart = new ShopCart();

        cart.ShoppingCart();
    }

    public static void CalculatorExample() {
        CompoundCalculator calc = new CompoundCalculator();
        calc.CompoundInterestCalculator();
    }

    public static void WeightConversionExample() {
        WeightConverter weight = new WeightConverter();
        weight.weightConversion();
    }

    public static void TemperatureConverterExample() {
        TemperatureConverter temp = new TemperatureConverter();
        temp.TempConverter();
    }

    public static void EnhancedCalculatorExample() {
        EnhancedCalculator calc = new EnhancedCalculator();
        calc.CalcProgram();
    }

    public static void NumberGuessingGameExample() {
        NumberGuessGame game = new NumberGuessGame();
        game.NumberGuessingGame();
    }

    public static void BankingProgramExample() {
        BankingProgram bank = new BankingProgram();
        bank.BankProgram();
    }
    
    public static void DiceRollerExample() {
        DiceRoller dice = new DiceRoller();
        dice.DiceProgram();
    }

    public static void QuizGameExample() {
        QuizGame game = new QuizGame();
        game.Game();
    }

    public static void RPSGameExample() {
        RockPaperScissors game = new RockPaperScissors();
        game.Game();
    }

    public static void SlotMachineGame() {
        SlotMachine game = new SlotMachine();
        game.Game();
    }

    public static void MusicPlayerExample() {
        MusicPlayer player = new MusicPlayer();
        player.Player();
    }

    public static void HangManGameExample() {
        HangManGame game = new HangManGame();
        game.Game();
    }
}