import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/*
CHALLENGE WEEK 2

Write a program that will allow a robot to assemble 10 burritos. Use a random generator for each burrito option and build a
list of 10 burrito customizations:

Rice: white, brown, no rice, all
Meat: chicken, steak, carnidas, chorizo, sofritas, veggies, none, all
Beans: pinto, black, no beans
Salsa: mild, medium, hot, no salsa,all
Veggies: lettuce, fajita veggies, no veggies, all
Cheese: yes/no
Guac: yes/no
Queso: yes/no
Sour cream: yes/no

Randomly generate a number of ingredients per burrito. Each burrito should have a minimum of 5 ingredients and a maximum of 9 ingredients. Save the finished burritos and display the contents.

Calculate and display a price for each burrito. Pricing will be $3.00 plus 0.50 for each additional ingredient

Modify your program to use methods. For example, you can call a method from main whose sole purpose is to calculate the price of the burrito.

Part three is to add all the ingredients you used for the order and print them out in one line. So you example is if you
have 25 chicken burritos then you must say you used 25 chicken, 25 black beans and so on. Of course your numbers will change because you have
randomly generated burritos each time.

Now if you have finished this, now for part 4 you must print out a receipt order for the burrito order like before ,
but wrap with with 50 characters so you must only let 50 characters print out.

psuedocode

-create 5 arrays of food category and store the types of ingredients there
- the overall  loop should run 10 times and display "burrito number: ingridients 1 from each of the 5 arrays;
-utiliits for random and also for arraylist
-randind(random index generator) will generate int to gen index number (rx upto 3 for rice, beans andveggies); (ry upto 4 for salsa); (rz upto 5 for meat)
-ur gonna get the generated randind and store the index numbers in x, y,z consequently;
-ur gonna get the value from array and put it custom

arraylist <array> customized = {custom}
*/
public class ChipotleJrPlus {

    public static void main(String[] args) {

            Random r = new Random();

//food categories declared
            String[] rice = {"white rice", "brown rice", "no rice", };
            String[] meat = {"chicken meat", "steak meat", "chorizo", "carnidas", "sofritas", "veggies"};
            String[] beans = {"pinto beans", "black beans", "no beans"};
            String[] salsa = {"mild salsa", "medium salsa", "hot salsa", "no salsa"};
            String[] veggies = {"lettuce", "fajita veggies", "no veggies"};

            String[] cheese = {"", "cheese"};
            String[] guac = {"", "guac"};
            String[] queso = {"", "queso"};
            String[] scrm = {"", "Sour Cream"};
       // for (int i = 0; i < 25; i++){
          int ing = r.nextInt(5) + 5;  //this will generate number of ingredient per burrito
//        System.out.println(ing);}


            for (int i = 0; i < 25; i++) { // will prepare 25 burritos

 //Multi dimentional array is needed here;
















                //will generate the index
                int rc = r.nextInt(2), rg = r.nextInt(2), rq = r.nextInt(2), rsc = r.nextInt(2);
                int rr = r.nextInt(3), rb = r.nextInt(3), rv = r.nextInt(3);
                int rs = r.nextInt(4);
                int rm = r.nextInt(6);
//
//                cheese = r.nextBoolean();
//                guac = r.nextBoolean();
//                q = r.nextBoolean();
//                cheese = r.nextBoolean();


                int no = i + 1;
                System.out.print(" Burrito " + no + ":  ");
String category [] = {};
                String custom[] = {rice[rr], meat[rm], beans[rb], salsa[rs], veggies[rv]}; // custom is built

                for (String gen : custom)
                    // System.out.print(gen + ",   "); //will display the custom array content
                    System.out.print("");

                // 'store' is array where every finished custom made burrito is stored
                ArrayList<String> store = new ArrayList<String>(Arrays.asList(custom));

                //will show Final ArrayList content display using for
                for (String str : store)
                    System.out.print(str + ",   ");
                System.out.println();

            }

        }

    }


