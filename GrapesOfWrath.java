import java.util.*;
import java.text.DecimalFormat;

public class GrapesOfWrath
{
    private static final String cities [] = {"Gore", "Warner", "Checotah", "Paden", "Meeker", "Harrah", "Oklahoma City", "Bethany", "El Reno", "Clinton",
            "Elk City", "Sayre", "Texola", "Shamrock", "Alanreed", "Groom", "Amarillo", "Vega", "Glenrio", "Santa Rosa", "Albuquerque", "Gallup",
            "Holbrook", "Joseph City", "Winslow", "Flagstaff", "Oatman", "Topock", "Needles", "Daggett", "Barstow", "Mojave", "Tehachapi", "Bakersfield"};
    private static final int distances [] = {22, 34, 49, 114, 134, 150, 180, 192, 216, 274, 302, 319, 342, 359, 388, 411, 456, 492, 529, 638, 756, 894, 990, 1001, 1023, 1081, 1256, 1277, 1286, 1421, 1431, 1502, 1524, 1565};
    private static int p = 0;
    private static int distance = 0;
    private static Scanner console = new Scanner(System.in);
    private static int gas = 500;
    private static int initialFood = 0;
    private static int food = 0;
    private static double initialMoney = 0.0;
    private static double money = 0.0;
    private static int cityIndex = 0;
    private static int restingPlace = 0;
    private static DecimalFormat d = new DecimalFormat("0.00");
    public static void main(String[] args)
    {
        System.out.println("While the story of the Joads may be fictional, it was inspired by the many real families migrating from places like Oklahoma \nto California in search of jobs during the Great Depression. Put yourself in the shoes of one of these families and simulate \nwhat it may have been like to embark on such a journey.");
        List<Person> people = new ArrayList<>(20);
        while (p > 20|| p < 1)
        {
            System.out.println("How many people are in your party (1-20)? ");
            p = console.nextInt();
            console.nextLine();
        } 
        food = 2500*p;
        initialFood = food;
        money = 16.0*p;
        initialMoney = money;
        for (int i = 0; i < p; i++)
        {
            System.out.println("What is the name of party member #"+(i+1)+"? ");
            String name = console.nextLine();
            people.add(new Person(name));
        }
        System.out.println("The car engine rumbles and starts away from the home you once knew, kicking up a cloud of dust. Your home slowly fades \ninto the distance as the life you once knew disappears behind you.");
        while (distance < 1565)
        {
            if (distance > 0)
            {
                System.out.println("Would you like to travel today? Yes (Type 1) or No (Type 0).");
                int travel = console.nextInt();
                if (travel % 2 == 1)
                    takeTurn(people);
                else
                    rest(people);
            }
            else
                takeTurn(people);
        } 
    }
    private static void takeTurn(List<Person> people)
    {
        System.out.println("You currently have $"+d.format(money)+", "+(food/100.0)+" pounds of food, and "+(gas/25.0)+" gallons of gas.");
        restingPlace = 0;
        int event = 0;
        for (int travelled = 0; travelled < 75; travelled++)
        {
            if (distance <= 1565)
            {
                gas--;
                distance++;
                if (distance%10 == 0)
                    System.out.println(".");
               
                if (distance >= distances[cityIndex])
                { 
                    System.out.println("You've arrived at "+cities[cityIndex]+".");
                    cityIndex++;
                    if (cityIndex >= 34)
                    {
                        goodEnding(people);
                    }
                    buy();
                    RandomEvents.cityEvents();
                    if (travelled >= 60)
                    {
                        restingPlace = 2;
                        break;
                    }
                }
                if (distance == 343)
                {
                    System.out.println("You cross the border from Oklahoma into Texas. It feels odd, almost like betrayal, to leave the state you've lived in for all \nyour life. The sun shines brightly over the endless sea of the brown Texan plains, dotted by dry trees and brushes along the dusty roads.");
                }
                else if (distance == 528)
                {
                    System.out.println("You drive across Texas to New Mexico. The sun beats down upon the dry wilted landscape, and what trees there are have little color.\nThe sun is oppressive, only remedied slightly by the occasional passing of a cloud.");
                }
                else if (distance == 917)
                {
                    System.out.println("The sun is harsh and unrelenting as you drive into Arizona. Beside the road, ancient rocks, red and layered, speckled with shrubs,\nhave watched thousands of years and cars go by. The rocks loom above the flat road, and will continue to be as they have been\nfor years upon years, in some form or another.");
                }
                else if (distance == 1282)
                {
                    System.out.println("Your mood lightens as you enter California. Clouds pass over a clear blue sky, encasing the rugged sandy hills and valleys \nof the Californian landscape. However your journey is not over. You must still travel through the harsh California desert\nbefore you can get to where you can settle down.");
                }
                event = RandomEvents.roadEvents();
                if (event == 1)
                    break;
                else if (event == 2)
                    gasStation();
                if (gas == 0)
                {
                    System.out.println("You've run out of gas.");
                    badEnding(people);
                }
            }
        }
        if (event == 1)
            breakDown(people);
        else
        {
            if (restingPlace != 2)
                restingPlace = (int) (Math.random()*2);
            stay(people);
        }
    }
    private static void buy()
    {
        System.out.println("You currently have $" + d.format(money)+ " and " + (gas/25.0) + " gallons of gas.");
        double gasPrice = round(Math.random()*1.5+0.1);
        System.out.println("Gas here costs $"+d.format(gasPrice)+" per gallon. How many gallons of gas would you like to buy?");
        int gasQuantity = console.nextInt();
        console.nextLine();
        while (gasQuantity * gasPrice > money)
        {
            System.out.println("You can't afford that. How many gallons of gas would you like to buy?");
            gasQuantity = console.nextInt();
            console.nextLine();
        }
        money -= gasQuantity*gasPrice;
        gas += gasQuantity*25;
        System.out.println("You currently have $" + d.format(money)+ " and " + (food/100.0)+" pounds of food.");
        double foodPrice = round(Math.random()*1.5+0.1);
        System.out.println("Food here costs $"+d.format(foodPrice)+" per pound. How many pounds of food would you like to buy?");
        int foodQuantity = console.nextInt();
        console.nextLine();
        while (foodQuantity * foodPrice > money)
        {
            System.out.println("You can't afford that. How many pounds of food would you like to buy?");
            foodQuantity = console.nextInt();
            console.nextLine();
        }
        money -= foodQuantity*foodPrice;
        food += foodQuantity*100;
    }
    private static void stay(List<Person> people)
    {
        if (restingPlace == 0)
            System.out.println("You camp on the side of the road for the night.");
        else if (restingPlace == 1)
            System.out.println("You stay in a migrant camp for the night.");
        else
            System.out.println("You stay in the city for the night.");
        if (restingPlace == 1)
            RandomEvents.campEvents();
        else if (restingPlace == 2)
            RandomEvents.cityEvents();
        for (int i = 0; i < people.size(); i++)
        {
            int num = (int)(1+Math.random()*200);
            if (num < 6 && !people.get(i).isSick())
            {
                System.out.println(people.get(i).getName() + " has gotten sick.");
                people.get(i).infect();
            }
            else if (num < 7)
            {
                if (people.get(i).getName().toLowerCase().equals("pablo"))
                {
                    System.out.println(people.get(i).getName() + " was arrested for smuggling cocaine.");
                } else
                {
                    System.out.println(people.get(i).getName() + " was arrested in a disagreement with the police.");
                }
                people.get(i).addHealth(-99999);
            }
        }
        for (int i = 0; i < people.size(); i++)
        {
            if (people.get(i).isAlive())
            {
                people.get(i).feed(min(people.get(i).getFoodNeeded(), food));
                food = max(0, food-people.get(i).getFoodNeeded());
                if (!people.get(i).isAlive())
                    death(people.get(i));
            }
        }
        for (int i = 0; i < people.size(); i++)
        {
            if (people.get(i).isAlive() && people.get(i).isSick())
            {
                people.get(i).hurtSick();
                if (!people.get(i).isAlive())
                    death(people.get(i));
            }
        } 
        for (int i = 0; i < people.size(); i++)
        {
            if (!people.get(i).isAlive())
            {
                people.remove(i);
                i--;
            }
        } 
        if (people.size() == 0)
        {
            badEnding(people);
        }
        System.out.println("You currently have $"+d.format(money)+", "+(food/100.0)+" pounds of food, and "+(gas/25.0)+" gallons of gas.");
    }
    private static void rest(List<Person> people)
    {
        System.out.println("You rest for the day.");
        for (int i = 0; i < people.size(); i++)
        {
            if (people.get(i).isAlive())
                people.get(i).addHealth(10);
            if (people.get(i).isSick())
            {
                int num = (int)(1+Math.random()*100);
                if (num < 16)
                {
                    System.out.println(people.get(i).getName() + " has recovered.");
                    people.get(i).recover();
                }
            }
        } 
        if (restingPlace == 2)
            buy();
        stay(people);
    } 
    private static void calcScore(boolean won, List<Person> people)
    {
        int score = distance;
        System.out.println("Distance travelled: "+distance+" . . . . "+distance);
        if (won)
        {
            score += 1500;
            System.out.println("Victory bonus: 1500 . . . . 1500");
        } else
        {
            System.out.println("Victory bonus: 0 . . . . 0");
        }
        score += (int)(people.size()*1500.0/p);
        System.out.println("Party members remaining: "+people.size()+" . . . . "+(int)(people.size()*1500.0/p));
        int healthyPeople = 0;
        for (int i = 0; i < people.size(); i++)
        {
            if (people.get(i).inGoodHealth())
            {
                healthyPeople++;
            }
        }
        score += (int)(healthyPeople*500.0/p);
        System.out.println("Party members in good health: "+healthyPeople+" . . . . "+(int)(healthyPeople*500.0/p));
        score += (int)(money/initialMoney*100.0);
        System.out.println("Money remaining: $"+d.format(money)+" . . . . . "+(int)(money/initialMoney*100.0));
        score += gas;
        System.out.println("Gas remaining: "+d.format(gas/25.0)+" gallons . . . . "+gas/2);
        score += (int)(food*750.0/initialFood);
        System.out.println("Food remaining: "+d.format(food/100.0)+" pounds . . . . "+(int)(food*750.0/initialFood));
        System.out.println("Total score: . . . . "+score);
    }
    private static void goodEnding(List<Person> people)
    {
        System.out.println("From the top of a hill you can see the green field below, covered in fruit trees and white houses, just like the handbills.\nYour party chats giddily about the peaches to be picked, the houses to be lived in, and the money to be earned. \nYou smile at the long-awaited beauty. However, this is merely the start of your new life. Jobs are scarce, and don't pay\nmuch even if you can find one. There are not nearly enough jobs or pay to feed you and your family. Your people are not \nwelcomed here. Whether it be the police or the residents, people look down upon the 'Okies.' You may have reached \nthe end of this journey, but for your party, this is certainly not the end to their problems.");
        for (int i = 0; i < people.size()-1; i++)
        {
            System.out.print(people.get(i).getName()+", ");
        }
        System.out.println("and "+people.get(people.size()-1).getName()+" made it to the end of the journey.");
        calcScore(true, people);
        System.exit(0);
    } 
    private static void badEnding(List<Person> people)
    {
        System.out.println("You weren't able to make it to California. You travelled "+ distance + " miles.");
        calcScore(false, people);
        System.exit(0);
    } 
    private static int min(int a, int b)
    {
        if (a <= b)
            return a;
        return b;
    } 
    private static int max(int a, int b)
    {
        if (a >= b)
            return a;
        return b;
    }
    private static double doubMax(double a, double b)
    {
        if (a >= b)
            return a;
        return b;
    } 
    private static void gasStation()
    {
        System.out.println("You stop by a gas station.");
        System.out.println("You currently have $" + d.format(money)+ " and " + (gas/25.0) + " gallons of gas.");
        double gasPrice = round(Math.random()*1.5+0.1);
        System.out.println("Gas here costs $"+d.format(gasPrice)+" per gallon. How many gallons of gas would you like to buy?");
        int gasQuantity = console.nextInt();
        console.nextLine();
        while (gasQuantity * gasPrice > money)
        {
            System.out.println("You can't afford that. How many gallons of gas would you like to buy?");
            gasQuantity = console.nextInt();
            console.nextLine();
        }
        money -= gasQuantity*gasPrice;
        gas += gasQuantity*25;
    }
    private static void breakDown(List<Person> people)
    {
        System.out.println("Your car broke down.");
        stay(people);
        System.out.println("You were able to fix the car, but it's too late to travel now.");
        stay(people);
    }
    private static void death(Person per)
    {
        int num = (int)(1+Math.random()*2);
        if (money > 30.0)
        {
            if (num < 2)
                System.out.println("You recall how " + per.getName() + " had always wanted a proper burial.");
            System.out.println("A coroner costs $30. Will you go to a coroner (Type 1) or bury " + per.getName() + " on the side of the road (Type 0)?");
            int response = console.nextInt();
            console.nextLine();
            if (response % 2 == 1)
                money -= 30;
        } else
        {
            System.out.println("You are too poor to afford a coroner, so you bury " + per.getName() + " on the side of the road.");
        }
    }
    public static int getFood()
    {
        return food;
    } 
    public static int getGas()
    {
        return gas;
    } 
    public static double getMoney()
    {
        return money;
    } 
    public static void setRestingPlace(int n)
    {
        restingPlace = n;
    } 
    public static void addFood(int n)
    {
        food += n;
        food = max(food, 0);
    }
    public static void addGas(int n)
    {
        gas += n;
        gas = max(gas, 0);
    }
    public static void addMoney(double n)
    {
        money += n;
        money = doubMax(money, 0);
    }
    public static double round(double n)
    {
        return ((int)(n*100.0))/100.0;
    }
} 
