import java.util.Random;

public class Dice_Roller
{
    Random random = new Random();
    int number;


    Dice_Roller()
    {
        roll();
    }

    void roll()
    {
        number = random.nextInt(6) + 1; //[1,6]
        System.out.println(number);
    }

}
