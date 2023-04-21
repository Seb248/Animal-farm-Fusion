public class Farmer
{
    public DataWarehouse dataW;
    public static int age;
    public static int strength;
    public static int stamina;
    public static int money;
    public static int health;
    
    public Farmer()
    {
        this.age = Randomizer.nextInt(20, 45);
        this.strength = 1;
        this.stamina = 1;
    }    
    
    public static void getAge()
    {
        System.out.println("You are " + age + " years old.");
    }    
    
    public int gitAge()
    {
        return age;
    }    
    
    public static void getStrength()
    {
        System.out.println("Your strength is level " + strength + ".");
    }    
    
    public int gitStrength()
    {
        return strength;
    }   
    
    public static void getStamina()
    {
        System.out.println("Your stamina is level " + stamina + ".");
    }    
    
    public int gitStamina()
    {
        return stamina;
    }   
}    