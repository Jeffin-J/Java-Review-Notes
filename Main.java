//Jeffin Johnykutty
//Link to full course: https://youtu.be/xk4_1vDrzzo

//MAIN CLASS TEMPLATE
/*
public class Main
{
    public static void main(String args[])
    {

    }

}
*/

///JAVA TUTORIAL FOR BEGINNERS
/*
public class Main
{

    public static void main(String[] args)
    {
        System.out.println("\"I love pizza\""); //Using escape sequence
        System.out.println("\\It's really good!"); //Shortcut: type "sout" + tab
        System.out.println();
        //This is a comment
    }
}
*/

///VARIABLES
/*
public class Main
{

    public static void main(String[] args)
    {
        int x =123; // delcaration + assignment = initialization
        String name = "Bro";  //"String" is a reference data type. A data type that is captialized are usually a reference data type.

        System.out.println("My number is: " + x);
        System.out.println("Hello " + name);


    }
}
*/

///USER INPUT
/*
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        //Use scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = scanner.nextLine();

        System.out.println("How old are you: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //Do this to ignore new line character after reading age  integer.

        System.out.println("What is your favorite food: ");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
    }
}
*/

//INTRO TO GUI (Graphical User Interface) INTRO
/*
import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

    }
}
*/

///Math class
/*
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       double x, y, z;

       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("Hypothenuse is " + z);

        scanner.close(); //cloes scanner
    }
}
*/

///RANDOM NUMBERS
/*
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int x = random.nextInt(6) + 1; //[1,6]
        System.out.println(x);

        double y = random.nextDouble(); //Generate random numbers (0,1)
        System.out.println(y);

        Boolean z = random.nextBoolean(); //True or False
        System.out.println(z);

    }
}
*/

//WARPPER CLASSES
/*
public class Main
{
    public static void main(String[] args)
    {

//            Wrapper class = provides a way to use primitive datat tpes as reference data types
//                            Reference datta types contain useful methods, but slower to access than prmitive data types
//                            Can be used with collections (ex. ArrayList)
//
//            Primitive:      Wrapper:
//            ----------      ---------
//            boolean         Boolean
//            char            Character
//            int             Integer
//            double          Double
//
//            autoboxing = the automatic conversion that the Java compiler makes between the primitive data types and their coreesponding object wrapper classes
//            unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive


        Boolean a = true; //autoboxing
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Jeffin";

        if(b == '@') //unboxing
            System.out.println("This is true");

    }

}
*/

//2D ARRAYLIST
/*
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        //        2D ArrayList = a dynamic list of lists
        //                        You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> grocery_list = new ArrayList<>();

        ArrayList<String> bakery_list = new ArrayList<>();
        bakery_list.add("pasta");
        bakery_list.add("garlic bread");
        bakery_list.add("donuts");

        ArrayList<String> produce_list = new ArrayList<>();
        produce_list.add("tomatoes");
        produce_list.add("zucchini");
        produce_list.add("peppers");

        ArrayList<String> drinks_list = new ArrayList<>();
        drinks_list.add("soda");
        drinks_list.add("cofee");

//        System.out.println(bakery_list);
//        System.out.println(bakery_list.get(0));

        grocery_list.add(bakery_list);
        grocery_list.add(produce_list);
        grocery_list.add(drinks_list);

        System.out.println(grocery_list);
        System.out.println(grocery_list.get(0)); //get first list
        System.out.println(grocery_list.get(0).get(0)); //get first element of first list
        System.out.println(grocery_list.get(2).get(1)); //get the last element of the last list
    }

}
*/

//METHODS
/*
public class Main
{

    static void hello(String name, int age)
    {
        System.out.println("hello " + name + ". I am " + age + " years old.");
    }

    static int add(int x, int y)
    {
        return x+y;
    }

    public static void main(String args[])
    {
        //method = a block of code that is executed whenever it is called upon

        String name = "Jeffin";
        int age = 21;

        hello(name, age);

        int x = 3, y =4;
        int z = add(x,y);
        System.out.println(x + " + " + y + " = " + z);

    }

}
 */

// OVERLOADED METHODS
/*
public class Main
{
    static int add(int a, int b)
    {
        System.out.println("Overloaded Method #1");
        return a+b;
    }

    static int add(int a, int b, int c)
    {
        System.out.println("Overloaded Method #2");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d)
    {
        System.out.println("Overloaded Method #3");
        return a+b+c+d;
    }

    static double add(double a, double b)
    {
        System.out.println("Overloaded Method #4");
        return a+b;
    }


    public static void main(String args[])
    {
//        overloaded methods = methods that share the same name but have different parameters
//                            method name + parameters = method signature

        int x = add(1,2, 3 ,4);
        System.out.println(x);

        double y = add(1.0, 2.0);
        System.out.println(y);
    }

}
*/

// PRINTF
/*
public class Main
{
    public static void main(String args[])
    {
//        printf() = and optional metod to control, format, and idsplay text to the console window
//                    Two arguemnts = format string + (object/variable/value)
//                    % [flags] [prcision] [width] [conversion-character]


//        System.out.printf("This is a format string %d", 123);  //%d = fromat specifier

        boolean my_boolean = true;
        char my_char = '@';
        String my_string = "Jeffin";
        int my_int = 50;
        double my_double = 1000;

        // Conversion character
//        System.out.printf("%b", my_boolean);
//        System.out.printf("%c", my_char);
//        System.out.printf("%s", my_string);
//        System.out.printf("%d", my_int);
//        System.out.printf("%f", my_double);


//        width = minimal number of characters to be written as output
//        System.out.printf("Hello %10s", my_string);

//        precision = set number of digits of precision when outputing floating-point values
//        System.out.printf("You have this musch money %.2f", my_double);

//        flags = adds an effect to ouptu based on the flag added to format specificer
//        - : left-justify
//        + : output a plus ( + ) or minus ( - ) sign for a numeric value
//        0 : numeric values are zero-padded
//        , : comma grouping spearator if numbers > 1000
//        System.out.printf("You have this musch money %020f", my_double);
        System.out.printf("You have this musch money %,f", my_double);



    }

}
*/

//FINAL KEYWORD
/*
public class Main
{
    public static void main(String args[])
    {
        final double PI = 3.14159; //CANNOT UPDATE VALUE (similar to const in C++)

        System.out.println(PI);
    }

}
*/

//OBJECT ORIENTED PROGRAMMING (OOP)
/*
//object = an instance of a class that may contain attributes and methodas
//ex: phone, desk, computer, coffee cup
// [OPEN Car.java to see attr. and methods]

public class Main
{
    public static void main(String[] args)
    {
        Car my_car_1 = new Car();
        Car my_car_2 = new Car();

        System.out.println(my_car_1.model);
        System.out.println(my_car_1.make);
        my_car_1.drive();
        my_car_1.brake();
        System.out.println();

        System.out.println(my_car_2.model);
        System.out.println(my_car_2.make);
        my_car_2.drive();
        my_car_2.brake();

    }
}
*/

//CONSTRUCTORS
/*
//constructor =  special method that is called when an object is instantiated (created)
//              Helps to allow to created obejcts from the same class with different attributes.
// [Open Human.java to see attr. and methods]

public class Main
{
    public static void main(String[] args)
    {
        Human human_1 = new Human("Rick", 65, 700);
        Human human_2 = new Human("Morty", 16, 50);

        System.out.println(human_1.name);
        System.out.println(human_2.name);
        human_2.eat();
        human_1.drink();
    }
}
 */

//VARIABLE SCOPE
/*
//[Open Dice_Roller.java]
public class Main
{
    public static void main(String args[])
    {
        //local = declared inside a method
        //      Visible only to that method

        //global = declared outside a method, but within a class
        //        Visible to all parts of a class

        Dice_Roller dice_roller = new Dice_Roller();
    }

}
*/

//OVERLOADED CONSTRUCTORS
/*
//[See Pizza.java]
public class Main
{
    public static void main(String args[])
    {
        //overloaded constructors = multiple constructors within a class with the same name,
//                                    but have different parameters
//                                    name + parameters = signature
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");
        System.out.println("Here are the ingedients of your pizza: ");
        System.out.println("\t" + pizza.bread);
        System.out.println("\t" + pizza.sauce);
        System.out.println("\t" + pizza.cheese);
        System.out.println("\t" + pizza.topping);
        System.out.println();

        Pizza cheese_pizza = new Pizza("thicc crust", "tomato", "mozzerella");
        System.out.println("Here are the ingedients of your pizza: ");
        System.out.println("\t" + cheese_pizza.bread);
        System.out.println("\t" + cheese_pizza.sauce);
        System.out.println("\t" + cheese_pizza.cheese);
        System.out.println();

        Pizza vegan_pizza = new Pizza("thicc curst", "tomato");
        System.out.println("Here are the ingedients of your pizza: ");
        System.out.println("\t" + vegan_pizza.bread);
        System.out.println("\t" + vegan_pizza.sauce);
        System.out.println("\t" + vegan_pizza.cheese); //This will print null since there is no cheese argument
        System.out.println();

        Pizza bread_only = new Pizza("thicc crust");
        System.out.println("Here are the ingedients of your pizza: ");
        System.out.println("\t" + bread_only.bread);
        System.out.println("\t" + bread_only.sauce);
        System.out.println("\t" + bread_only.cheese); //This will print null since there is no cheese argument
        System.out.println();

    }

}
*/

//"toString" METHOD
/*
//[Check out New_Car_Class.java]
public class Main
{
    public static void main(String args[])
    {
        //toString() = special method that all objects inherit,
//                        that returns a string that "textually represents" an object.
//                        Can be used both implicily and explicily.

        New_Car_Class car = new New_Car_Class();
//        System.out.println(car); //Prints the address of the car object before overriding method
//        System.out.println(car.toString()); //Prints the address in a textual representation before overriding method

        System.out.println(car.toString()); //Prints explicitly (manually)
        System.out.println();
        System.out.println(car); //Prints implicitly (automatic)
    }

}
*/

//ARRAY OF OBJECTS
/*
//[See Food.java]
public class Main
{
    public static void main(String args[])
    {
        int numbers[] = new int[5];
        char characters[] = new char[4];
        String strings[] = new String[5];

        Food refrigerator[] = new Food[3];

        Food food_1 = new Food("pizza");
        Food food_2 = new Food("hamburger");
        Food food_3 = new Food("hotdog");

        refrigerator[0] = food_1;
        refrigerator[1] = food_2;
        refrigerator[2] = food_3;

//        System.out.println(refrigerator[0]); //prints address of food_1
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
        System.out.println();

        Food refridgerator_1[] = {food_1, food_2, food_3};

        System.out.println(refridgerator_1[0].name);
        System.out.println(refridgerator_1[1].name);
        System.out.println(refridgerator_1[2].name);



    }

}
*/

//OBJECT PASSING
/*
//[See Garage.java & New_Car_Class_1.java]
public class Main
{
    public static void main(String args[])
    {
        Garage garage = new Garage();
        New_Car_Class_1 car = new New_Car_Class_1("BMW");
        New_Car_Class_1 car_2 = new New_Car_Class_1("Tesla");

        garage.park(car);
        garage.park(car_2);

    }

}
*/

//STATIC KEYWORD
/*
//[See Friend.java]
public class Main
{
    public static void main(String args[])
    {
        //static = modifier. A single copy of a variable/method is created and shared.
//                    This class "owns" the static member.

        Friend friend_1 = new Friend("Spongebob");
        Friend friend_2 = new Friend("Patrick");
        Friend friend_3 = new Friend("Squidward");
        Friend friend_4 = new Friend("Sandy");


//        System.out.println(Friend.number_of_friends);

        Friend.display_friends();
    }

}
*/

//INHERITANCE
/*
//[See Vehicle.java, New_Car_Class_2.java, & Bicycle.java]

public class Main
{
    public static void main(String args[])
    {
        //inheritance = the process where one class accquires, the attributes and methods of another

        New_Car_Class_2 car =new  New_Car_Class_2();
        car.go();

        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);
        System.out.println();

        System.out.println(car.doors);
        System.out.println(bike.pedals);

    }

}
 */

//METHOD OVERRIDING
/*
// [See Animal.java and Dog.java]
public class Main
{
    public static void main(String args[])
    {
        //method overriding = Declaring a method in sub class
        //                    which is already present in parent class
        //                   Done so that a child class ca give its own implementation

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak();
        dog.speak();

    }

}
*/

//"super" KEYWORD
/*
//[see Person.java and Hero.java]
public class Main
{
    public static void main(String args[])
    {
        //super = keyword refers to the superclass (parent) of an object
        //         very similar to "this" keyword

        Hero hero_1 = new Hero("Batman", 42, "$$$$");
        Hero hero_2 = new Hero("Superman", 43, "everything");

//        System.out.println(hero_1.age);
//        System.out.println(hero_1.name);
//        System.out.println(hero_1.power);

        System.out.println(hero_2.toString());

    }

}
*/

//INTERFACE
/*
//[open Rabit.java, Hawk.java, and Fish.java, Prey.java, Predator.java]
public class Main
{
    public static void main(String args[])
    {
//        interface = a template that can be applied to a class,
//                    Similar to inheritance, but specifies what a class has/must do
//                    Classes can apply more than one interface, inheritance is limited to 1 super
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();

    }

}
*/

//POLYMORPHISM
/*
//[Open New_Veihcle_Class.java, New_Car_Class_3.java, Boat.java, and New_Bicycle_Class.java]
public class Main
{
    public static void main(String args[])
    {
        //polymorphism = greek word poly-"many", morph-"form"
//                        The ability of an object to identify as more than one type

        New_Car_Class_3 car = new New_Car_Class_3();
        New_Bicycle_Class bicycle = new New_Bicycle_Class();
        Boat boat = new Boat();

        New_Vehicle_Class racers[] = {car, bicycle, boat};

        car.go();
        bicycle.go();
        boat.go();
        System.out.println();

        //Using a for loop
        for(New_Vehicle_Class x: racers)
        {
            x.go();
        }

    }

}
*/

//DYNAMIC POLYMORPHISM
/*
//[See New_Animal_Class.java, Cat.java, and New_Dog_Class.java]

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
//        polymorphism = many shapes/forms
//        dynamic = after compilation (during runtime)

//        ex. A corvette is a: corvette, and a car, and a vehicle, and an object

        Scanner scanner = new Scanner(System.in);
        New_Animal_Class animal;

        System.out.println("What animal do you want?");
        System.out.println("(1=dog) or (2-cat): ");
        int choice = scanner.nextInt();

        if(choice == 1)
        {
            animal = new New_Dog_Class();
            animal.speak();
        }
        else if(choice==2)
        {
            animal = new Cat();
            animal.speak();
        }
        else
        {
            animal = new New_Animal_Class();
            System.out.println("That choice was invalid");
            animal.speak();

        }

    }

}
*/

//EXCEPTION HANDLING
/*
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
//        exception = an event that occurs during the execution of  a program that,
//                    disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println("Result: " + z);

        }
        catch(ArithmeticException e) //When there is a Arithmetic expetion in the try block, this block will execute
        {
            System.out.println("You can't divide by zero!");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter a number!");
        }
        catch(Exception e) //Gerneric exception for any exception
        {
            System.out.println("Something went wrong.");
        }
        finally //Will always run even there is or not an exception
        {
            scanner.close();
            System.out.println("This will always print");
        }
    }

}
*/

//FILE CLASS
/*
import java.io.File;

public class Main
{
    public static void main(String args[])
    {
        //file = an abstract representation of file and directory pathnames


//        File file = new File("C:\\Users\\jjohn\\OneDrive\\Desktop\\secret_message.txt"); //if your file is within the project folder, you just need to write the file.
                                                                                                //if it's anywhere else, then you need to write the full path

        File file = new File("secret_message.txt"); //if your file is within the project folder, you just need to write the file.


        if(file.exists())
        {
            System.out.println("That file exists :O");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile()); //Checks if its a file, if not its a directory
            file.delete();
        }
        else
            System.out.println("That file doesn't exists :(");
    }
}
*/

//FILEWRITER (WRITE TO A FILE)
/*
import java.io.FileWriter;
import java.io.IOException;

public class Main
{
    public static void main(String args[])
    {
        try
        {
            FileWriter writer = new FileWriter("poem.txt");

            writer.write("Roses are red\nViolets are blue\nHahahah\nRocking everywhere");
            writer.append("\n(A poem by Jeffin)");

            writer.close();
        }
        catch(IOException e)
        {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
*/

//FILEREADER (READ A FILE)
/*
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String args[])
    {
//        FileReader = read the contents of a file as a stream of characters. One by one.
//                    read() returns an int value which contains byte value
//                    When read() returns -1, there is no more data to be read
        try
        {
            FileReader reader = new FileReader("art.txt");

            int data = reader.read();

            while(data != -1)
            {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

}
*/

//AUDIO
/*
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main
{
    public static void main(String args[]) throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        Scanner scanner = new Scanner(System.in);

        File file = new File("noncopyright_background_music.wav");
        AudioInputStream audio_stream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audio_stream);

        String response = "";

        while(!response.equals("Q"))
        {
            System.out.println("P = play, S = stop, R = reset, Q = quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch(response)
            {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid response");
            }

        }

        System.out.println("BYEEEEE");


    }

}
*/

//INTRO TO GUI (GRPAHIC USER INTERFACE)
/*
//[Open My_Frame.java]
import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String args[])
    {
        // JFrame = a GUI window to add components to

        //Option 1:
//        JFrame frame = new JFrame(); //creates a frame
//        frame.setTitle("JFrame title goes here"); //This srts title of frame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application.
//        frame.setResizable(false); //prevent frame from being resized
//        frame.setSize(420, 420); //sets the X-dimension and Y-dimension of frame
//        frame.setVisible(true); //make frame visible
//
//        ImageIcon image = new ImageIcon("TBRaptorsLogo.png"); //create an ImageIcon
//        frame.setIconImage(image.getImage()); //change icon of frame
//        frame.getContentPane().setBackground(new Color(123, 50, 250)); //change color of background

        //Option 2:
        //From My_Frame class
        My_Frame my_frame = new My_Frame();

    }

}
*/

//LABELS
/*
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main
{
    public static void main(String args[])
    {
        //JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("tbRaptorsLogo.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); //create a label
        label.setText("Bro, do you even code?");  //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); //set text, TOP, CENTER, BOTTOM of image icon
        label.setForeground(new Color(0x00FF00)); //set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font of text
        label.setIconTextGap(100); //set gap of text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set verticle position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        //label.setBounds(100, 100, 250, 250); //set x and y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //add this after adding labels

    }

}
*/

// PANELS
/*
import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String args[])
    {
        //JPanel = a GUI component that functions as a contianer to hold other compnents

        ImageIcon icon = new ImageIcon("thumbs_up.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,75,75);

        JPanel red_panel = new JPanel();
        red_panel.setBackground(Color.red);
        red_panel.setBounds(0, 0, 250, 250);
        red_panel.setLayout(null);


        JPanel blue_panel = new JPanel();
        blue_panel.setBackground(Color.blue);
        blue_panel.setBounds(250, 0, 250, 250);
        blue_panel.setLayout(null);


        JPanel green_panel = new JPanel();
        green_panel.setBackground(Color.green);
        green_panel.setBounds(0, 250, 500, 250);
        green_panel.setLayout(null);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.add(red_panel);
        green_panel.add(label);
        frame.add(blue_panel);
        frame.add(green_panel);
    }

}
*/





















