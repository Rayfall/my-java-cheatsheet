package BasicExamples;

public class ExArithmeticExpressions {
    // expression =     operands & operators
    // operands =  values, variables, numbers, quantity
    // operators = + - * / % 

    public void RunExample() {
        int friends = 10;
        int temp = 0;

        System.out.println(friends);

        temp = friends + 10;
        System.out.println(temp);
        temp = friends - 10;
        System.out.println(temp);
        temp = friends * 2;
        System.out.println(temp);
        temp = friends / 2;
        System.out.println(temp);
        temp = friends % 3;
        System.out.println(temp);
        friends++;
        temp = friends;
        System.out.println(temp);
        friends--;
        friends--;
        temp = friends;
        System.out.println(temp);
    }    
}
