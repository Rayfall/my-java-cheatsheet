package BasicExamples;
import java.util.Random;

public class ExRandom {
    Random random = new Random();

    public void RandomInt() {
        
        int x = random.nextInt(6)+1;
        System.out.println(x);
    }

    public void RandomDouble() {
        double y = random.nextDouble();
        System.out.println(y);
    }

    public void RandomBool() {
        boolean z = random.nextBoolean();
        System.out.println(z);
    }

    public void RunExample() {
        RandomInt();
        RandomDouble();        
        RandomBool();
    }

}
