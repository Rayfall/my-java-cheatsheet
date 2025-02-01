//import BasicExamples.ExUserInputBasic;
import BasicExamples.*;
import MadLibsGame.*;
import ShoppingCart.*;
import CompoundInterestCalculator.*;
import WeightConverter.*;
import TemperatureConverter.*;
import EnhancedCalculator.*;
import NumberGuessGame.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //BasicExampleMethods();
        //MadLibsGameExample();
        //ShoppingCartExample();
        //CalculatorExample();
        //WeightConversionExample();
        //TemperatureConverterExample();
        //EnhancedCalculatorExample();
        NumberGuessingGameExample();
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
}