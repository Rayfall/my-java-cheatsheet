//import BasicExamples.ExUserInputBasic;
import BasicExamples.*;
import MadLibsGame.*;
import ShoppingCart.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //BasicExampleMethods();
        //MadLibsGameExample();

        ShoppingCartExample();
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
    }

    public static void MadLibsGameExample() {
        MadLibs game = new MadLibs();

        game.Madlibs();
    }

    public static void ShoppingCartExample() {
        ShopCart cart = new ShopCart();

        cart.ShoppingCart();
    }
}