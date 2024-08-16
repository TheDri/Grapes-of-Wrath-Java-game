// public class Person
// {
//    private int health;
//    private int startHealth;
//    private int foodNeeded;
//    private boolean sick;
//    private String name;
//    public Person(String newName)
//    {
//        health = (int) (Math.random() * 65 + 60);
//        startHealth = health;
//        foodNeeded = (int)  (Math.random() * 100 + 200);
//        sick = false;
//        name = newName;
//    }
//    public void feed(int lbs)
//    {
//        health -= (foodNeeded-lbs)/6;
//        if (!isAlive())
//        {
//            System.out.println(name + " has died of starvation.\n");
//        }
//    }
//    public void hurtSick()
//    {
//        health -= (int) (Math.random() * 25);
//        if (!isAlive())
//        {
//            if (getName().toLowerCase().equals("pablo"))
//            {
//                System.out.println(name + " was shot by a rival cartel.\n");
//            } else
//            {
//                System.out.println(name + " has died of disease.\n");
//            }
//        }
//    }
//    public boolean isAlive()
//    {
//        return health > 0;
//    }
//    public String getName()
//    {
//        return name;
//    }
//    public boolean isSick()
//    {
//        return sick;
//    }
//    public void addHealth(int n)
//    {
//        if (isAlive())
//        {
//            health += n;
//        }
//    }
//    public int getFoodNeeded()
//    {
//        return foodNeeded;
//    }
//    public void recover()
//    {
//       sick = false;
//    }
//    public void infect()
//    {
//        sick = true;
//    }
//    public boolean inGoodHealth()
//    {
//       return health > startHealth/2;
//    }
// }
