package BasicExamples;
public class ExSwapVariables {
    public void RunExample() {
        String x = "water";
		String y = "Kool-Aid";
		String temp;		

		temp = x;
		x=y;
		y=temp;		

		System.out.println("x: "+x);
		System.out.println("y: "+y);
    }
}