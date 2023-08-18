public class Friend
{
    String name;
    static int number_of_friends;

    Friend(String name)
    {
        this.name = name;
        number_of_friends++;
    }

    static void display_friends()
    {
        System.out.println("You have " + number_of_friends + " friends");
    }

}
