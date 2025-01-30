//import BasicExamples.ExUserInputBasic;
import BasicExamples.*;
import MadLibsGame.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        BasicExampleMethods();
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
        basicMath.RunExampleHypo();

        ExRandom random = new ExRandom();
        random.RunExample();

        ExIfStatement myIf = new ExIfStatement();
        myIf.RunExample();

        ExSwitchStatement mySwitch = new ExSwitchStatement();
        mySwitch.RunExample();
    }
}

