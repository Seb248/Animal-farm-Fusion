
/**
 * Write a description of class InteractionChamber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class InteractionChamber
{
    // instance variables - replace the example below with your own
    private int x;
    private List<Animal> animalList;
    /**
     * Constructor for objects of class InteractionChamber
     */
    
    
    public InteractionChamber(List<Animal> list){
        this.animalList = list;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private int animalX;
    private int animalK;
    private int animalZ;
    private int animalY;
    private int numAnimales;
    static int C;
    static int h;
    static int e;
    static int l;
    private int b;
    Animal creatura = new Animal();
    Animal creatura2 = new Animal();
    Animal creatura3 = new Animal();
    public String hello(){
        // first syntax
        Animal creatura = animalList.get(0);
        return creatura.frase();
    }
    public int gComer(int animalParaComer){
        // first syntax
        Animal creatura = animalList.get(animalParaComer);
        String type = creatura.getType();
        if (type.equalsIgnoreCase("Bunny")){
            h = 30;
        }else if (type.equalsIgnoreCase("Cow")){
            h = 100;
        }else if (type.equalsIgnoreCase("Dog")){
            h = 50;
        }else if (type.equalsIgnoreCase("Cat")){
            h = 35;
        }else if (type.equalsIgnoreCase("Horse")){
            h = 95;
        }else if (type.equalsIgnoreCase("Chicken")){
            h = 40;
        }else if (type.equalsIgnoreCase("Donkey")){
            h = 20;
        }else if (type.equalsIgnoreCase("Pig")){
            h = 85;
        }else if (type.equalsIgnoreCase("Mule")){
            h = 20;
        }else if (type.equalsIgnoreCase("Duck")){
            h = 50;
        }else if (type.equalsIgnoreCase("Goose")){
            h = 45;
        }else if (type.equalsIgnoreCase("Turkey")){
            h = 60;
        }else if (type.equalsIgnoreCase("Goat")){
            h = 75;
        }else if (type.equalsIgnoreCase("Rooster")){
            h = 35;
        }else if (type.equalsIgnoreCase("Unicorn")){
            h = -100000000;
        }else if (type.equalsIgnoreCase("Bull")){
            h = 95;
        }
        return h;
    }
    public int ejercicio(int animalParaComer){
        // first syntax
        int ver = 0;
        Animal creatura = animalList.get(animalParaComer);
        String type = creatura.getType();
        if (type.equalsIgnoreCase("Bunny")){
            if (creatura.getFuerza() > 45){
                ver = 1;
                creatura.setFuerza(45);
            }
        }else if (type.equalsIgnoreCase("Cow")){
            if (creatura.getFuerza() > 100){
                ver = 1;
                creatura.setFuerza(100);
            }
        }else if (type.equalsIgnoreCase("Dog")){
            if (creatura.getFuerza() > 80){
                ver = 1;
                creatura.setFuerza(80);
            }
        }else if (type.equalsIgnoreCase("Cat")){
            if (creatura.getFuerza() > 55){
                ver = 1;
                creatura.setFuerza(55);
            }
        }else if (type.equalsIgnoreCase("Horse")){
            if (creatura.getFuerza() > 100){
                ver = 1;
                creatura.setFuerza(100);
            }
        }else if (type.equalsIgnoreCase("Chicken")){
            if (creatura.getFuerza() > 50){
                ver = 1;
                creatura.setFuerza(50);
            }
        }else if (type.equalsIgnoreCase("Donkey")){
            if (creatura.getFuerza() > 100){
                ver = 1;
                creatura.setFuerza(100);
            }
        }else if (type.equalsIgnoreCase("Pig")){
            if (creatura.getFuerza() > 65){
                ver = 1;
                creatura.setFuerza(65);
            }
        }else if (type.equalsIgnoreCase("Mule")){
            if (creatura.getFuerza() > 100){
                ver = 1;
                creatura.setFuerza(100);
            }
        }else if (type.equalsIgnoreCase("Duck")){
            if (creatura.getFuerza() > 50){
                ver = 1;
                creatura.setFuerza(50);
            }
        }else if (type.equalsIgnoreCase("Goose")){
            if (creatura.getFuerza() > 55){
                ver = 1;
                creatura.setFuerza(55);
            }
        }else if (type.equalsIgnoreCase("Turkey")){
            if (creatura.getFuerza() > 55){
                ver = 1;
                creatura.setFuerza(55);
            }
        }else if (type.equalsIgnoreCase("Goat")){
            if (creatura.getFuerza() > 70){
                ver = 1;
                creatura.setFuerza(70);
            }
        }else if (type.equalsIgnoreCase("Rooster")){
            if (creatura.getFuerza() > 50){
                ver = 1;
                creatura.setFuerza(50);
            }
        }else if (type.equalsIgnoreCase("Unicorn")){
            
        }else if (type.equalsIgnoreCase("Bull")){
            if (creatura.getFuerza() > 110){
                ver = 1;
                creatura.setFuerza(110);
            }
        }
        return ver;
    }
    public ArrayList<Integer> emparejarse(int numAnimales)
    {
        this.numAnimales = numAnimales;
        int x = numAnimales - 1;
        int b = 0;
        ArrayList<Integer> animals = new ArrayList<Integer>();
        l = 0;
        for (int i = 0; i < numAnimales; i++)
        {
            int es = i;
            creatura = animalList.get(es);
            for (int z = 0; z < numAnimales; z++){
                int es2 = z;
                if(es != es2){
                    creatura2 = animalList.get(es2);
                    if(creatura.getInteligencia() >= creatura2.getInteligencia()){
                        creatura.setIntC(creatura.getIntC() + 1);
                    }
                }
            }
        }
        creatura = animalList.get(b);
        for (int i = 0; i < numAnimales; i++){
            int es2 = i;
            if (b != es2){
               creatura2 = animalList.get(es2);
                if(creatura2.getIntC() > creatura.getIntC()){
                    b = es2;
                    creatura = animalList.get(b);
                }
            }
        }
        animals.add(b);
        for (int i = 0; i < numAnimales; i++){
            creatura = animalList.get(b);
            creatura2 = animalList.get(i);
            if(b != i){
                if(creatura2.getIntC() == creatura.getIntC()){
                    animals.add(i);
                }
            }
        }
        e = b;
        return animals;
    }public ArrayList<Integer> másFuerte(int numAnimales)
    {
        this.numAnimales = numAnimales;
        int x = numAnimales - 1;
        int b = 0;
        ArrayList<Integer> animals = new ArrayList<Integer>();
        l = 0;
        for (int i = 0; i < numAnimales; i++)
        {
            int es = i;
            creatura = animalList.get(es);
            for (int z = 0; z < numAnimales; z++){
                int es2 = z;
                if(es != es2){
                    creatura2 = animalList.get(es2);
                    if(creatura.getFuerza() >= creatura2.getFuerza()){
                        creatura.setIntC(creatura.getIntC() + 1);
                    }
                }
            }
        }
        creatura = animalList.get(b);
        for (int i = 0; i < numAnimales; i++){
            int es2 = i;
            if (b != es2){
               creatura2 = animalList.get(es2);
                if(creatura2.getIntC() > creatura.getIntC()){
                    b = es2;
                    creatura = animalList.get(b);
                }
            }
        }
        animals.add(b);
        for (int i = 0; i < numAnimales; i++){
            creatura = animalList.get(b);
            creatura2 = animalList.get(i);
            if(b != i){
                if(creatura2.getIntC() == creatura.getIntC()){
                    animals.add(i);
                }
            }
        }
        e = b;
        return animals;
    }
    public ArrayList<Integer> hambrientos(int numAnimales)
    {
        this.numAnimales = numAnimales;
        int x = numAnimales - 1;
        int b = 0;
        ArrayList<Integer> animals = new ArrayList<Integer>();
        l = 0;
        for (int i = 0; i < numAnimales; i++)
        {
            int es = i;
            creatura = animalList.get(es);
            for (int z = 0; z < numAnimales; z++){
                int es2 = z;
                if(es != es2){
                    creatura2 = animalList.get(es2);
                    if(creatura.getHambre() >= creatura2.getHambre()){
                        creatura.setIntC(creatura.getIntC() + 1);
                    }
                }
            }
        }
        creatura = animalList.get(b);
        for (int i = 0; i < numAnimales; i++){
            int es2 = i;
            if (b != es2){
               creatura2 = animalList.get(es2);
                if(creatura2.getIntC() < creatura.getIntC()){
                    b = es2;
                    creatura = animalList.get(b);
                }
            }
        }
        animals.add(b);
        for (int i = 0; i < numAnimales; i++){
            creatura = animalList.get(b);
            creatura2 = animalList.get(i);
            if(b != i){
                if(creatura2.getIntC() == creatura.getIntC()){
                    animals.add(i);
                }
            }
        }
        e = b;
        return animals;
    }
    public int criar(int animalX, int animalK, int numAnimales, int animalZ, int animalY)
    {
        // put your code here
        this.animalX = animalX;
        this.animalK = animalK;
        this.animalZ = animalZ;
        this.animalY = animalY;
        this.numAnimales = numAnimales;
        creatura = animalList.get(animalX);
        creatura2 = animalList.get(animalK);
        boolean generoCom = creatura.getgénero().equalsIgnoreCase(creatura2.getgénero());
        boolean TipoCom = creatura.getType().equalsIgnoreCase(creatura2.getType());
        boolean Padres = creatura.getPadre1() == animalK || creatura.getPadre2() == animalK || creatura2.getPadre1() == animalX || creatura2.getPadre2() == animalX;
        boolean Gemelos = creatura.getGemelo() == creatura2.getGemelo();
        boolean PG = creatura.getGemelo() != 0 || creatura2.getGemelo() != 0;
        boolean Maduro = creatura.getEdad() >= creatura.getMaduro() && creatura2.getEdad() >= creatura2.getMaduro();
        int j = Randomizer.nextInt(1, 10);
        
        //que va hacer esto
        if (Maduro){
            if (j == 1)
            {
                C = 100;
            }else{
                if (generoCom != true)
                {
                    //acción 1
                    if (TipoCom)
                    {
                        //acción 1
                        if (Padres){
                            C = 70;
                        }else{
                            if (Gemelos && PG){
                                C = 80;
                            }else{
                                if (creatura.getType().equalsIgnoreCase("Bunny"))
                                {
                                    C = 10;
                                    b = Randomizer.nextInt(1, 12);
                                    for (int i = 0; i < b; i++)
                                    {
                                           animalList.add(new Animal());
                                           creatura3 = animalList.get(animalList.size() - 1);
                                           numAnimales = numAnimales + 1;
                                           
                                           if(creatura3.getgénero().equalsIgnoreCase(creatura.getgénero())){
                                              creatura3.setTipo(creatura.getTipo());
                                              creatura3.setType(creatura.getType());
                                           }else{
                                              creatura3.setTipo(creatura2.getTipo());
                                              creatura3.setType(creatura2.getType());
                                                
                                           }
                                                
                                           if(creatura.getInteligencia() > creatura2.getInteligencia()){
                                              creatura3.setInteligencia(creatura.getInteligencia());
                                           }else{
                                              creatura3.setInteligencia(creatura2.getInteligencia());
                                           }
                                           if(creatura.getPrecio() > creatura2.getPrecio()){
                                              creatura3.setPrecio(creatura.getPrecio());
                                           }else{
                                              creatura3.setPrecio(creatura2.getPrecio());
                                           }
                                           creatura3.setPadre1(animalX);
                                           creatura3.setPadre2(animalK);
                                           creatura3.setGemelo((animalZ * animalY) - (animalZ + animalY));
                                           
                                    }
                                }else if (creatura.getType().equalsIgnoreCase("Mule")){
                                    C = 20;
                                }else{
                                    C = 30;
                                    animalList.add(new Animal());
                                    creatura3 = animalList.get(animalList.size() - 1);
                                    numAnimales = numAnimales + 1;
                                    if(creatura3.getgénero().equalsIgnoreCase(creatura.getgénero())){
                                         creatura3.setTipo(creatura.getTipo());
                                         creatura3.setType(creatura.getType());
                                    }else{
                                         creatura3.setTipo(creatura2.getTipo());
                                         creatura3.setType(creatura2.getType());
                                    }
                                    if(creatura.getInteligencia() > creatura2.getInteligencia()){
                                        creatura3.setInteligencia(creatura.getInteligencia());
                                    }else{
                                        creatura3.setInteligencia(creatura2.getInteligencia());
                                    }
                                    if(creatura.getPrecio() > creatura2.getPrecio()){
                                       creatura3.setPrecio(creatura.getPrecio());
                                    }else{
                                       creatura3.setPrecio(creatura2.getPrecio());
                                    }
                                    creatura3.setPadre1(animalX);
                                    creatura3.setPadre2(animalK);
                                    creatura3.setGemelo((animalZ * animalY) - (animalZ + animalY));
                                }
                            }
                        }
                    }else{
                        if (creatura.getTipo().equalsIgnoreCase("Yegua") || creatura2.getTipo().equalsIgnoreCase("Yegua"))
                        {
                            //si sí
                            if (creatura.getTipo().equalsIgnoreCase("Asno/Burro") || creatura2.getTipo().equalsIgnoreCase("Asno/Burro")){
                                //si sí
                                if (Padres){
                                    C = 70;
                                }else{
                                    if (Gemelos && PG){
                                        C = 80;
                                    }else{
                                        C = 30;
                                        animalList.add(new Animal());
                                        creatura3 = animalList.get(animalList.size() - 1);
                                        numAnimales = numAnimales + 1;
                                        if(creatura3.getgénero().equalsIgnoreCase("masculino")){
                                            creatura3.setTipo("Mulo");
                                        }else{
                                            creatura3.setTipo("Mula");
                                        }
                                        creatura3.setType("Mule");
                                        if(creatura.getInteligencia() > creatura2.getInteligencia()){
                                            creatura3.setInteligencia(creatura.getInteligencia() - 5);
                                        }else{
                                            creatura3.setInteligencia(creatura2.getInteligencia() - 5);
                                        }
                                        if(creatura.getPrecio() > creatura2.getPrecio()){
                                            creatura3.setPrecio(creatura.getPrecio());
                                        }else{
                                            creatura3.setPrecio(creatura2.getPrecio());
                                         }
                                        creatura3.setPadre1(animalX);
                                        creatura3.setPadre2(animalK);
                                        creatura3.setGemelo((animalZ * animalY) - (animalZ + animalY));
                                    }
                                }
                            }else{
                                //si no
                                C = 50;
                            }
                        }else{
                            //si no
                            if (creatura.getType().equalsIgnoreCase("Rooster") || creatura2.getType().equalsIgnoreCase("Rooster"))
                            {
                                if (creatura.getType().equalsIgnoreCase("Chicken") || creatura2.getType().equalsIgnoreCase("Chicken"))
                                {
                                    if (Padres){
                                        C = 70;
                                    }else{
                                        if (Gemelos && PG){
                                            C = 80;
                                        }else{
                                            C = 30;
                                            animalList.add(new Animal());
                                            creatura3 = animalList.get(animalList.size() - 1);
                                            numAnimales = numAnimales + 1;
                                            if(creatura3.getgénero().equalsIgnoreCase("masculino")){
                                                creatura3.setTipo("Gallo");
                                                creatura3.setType("Rooster"); 
                                            }else{
                                                creatura3.setTipo("Gallina");
                                                creatura3.setType("Chicken"); 
                                            }
                                            if(creatura.getInteligencia() > creatura2.getInteligencia()){
                                                creatura3.setInteligencia(creatura.getInteligencia());
                                            }else{
                                                creatura3.setInteligencia(creatura2.getInteligencia());
                                             }
                                            if(creatura.getPrecio() > creatura2.getPrecio()){
                                                creatura3.setPrecio(creatura.getPrecio());
                                            }else{
                                                creatura3.setPrecio(creatura2.getPrecio());
                                            }
                                            creatura3.setPadre1(animalX);
                                            creatura3.setPadre2(animalK);
                                            creatura3.setGemelo((animalZ * animalY) - (animalZ + animalY));
                                        }
                                    }
                                }else{
                                    C = 50;
                                }
                            }else{
                                if (creatura.getType().equalsIgnoreCase("Cow") || creatura2.getType().equalsIgnoreCase("Cow")){
                                    if (creatura.getType().equalsIgnoreCase("Bull") || creatura2.getType().equalsIgnoreCase("Bull")){
                                        if (Padres){
                                            C = 70;
                                        }else{
                                            if (Gemelos && PG){
                                                C = 80;
                                            }else{
                                                C = 30;
                                                animalList.add(new Animal());
                                                creatura3 = animalList.get(animalList.size() - 1);
                                                numAnimales = numAnimales + 1;
                                                if(creatura3.getgénero().equalsIgnoreCase("masculino")){
                                                    creatura3.setTipo("Toro/Bueye");
                                                    creatura3.setType("Bull"); 
                                                }else{
                                                    creatura3.setTipo("Vaca");
                                                    creatura3.setType("Cow"); 
                                                }
                                                if(creatura.getInteligencia() > creatura2.getInteligencia()){
                                                    creatura3.setInteligencia(creatura.getInteligencia());
                                                }else{
                                                    creatura3.setInteligencia(creatura2.getInteligencia());
                                                }
                                                if(creatura.getPrecio() > creatura2.getPrecio()){
                                                    creatura3.setPrecio(creatura.getPrecio());
                                                }else{
                                                    creatura3.setPrecio(creatura2.getPrecio());
                                                }
                                                creatura3.setPadre1(animalX);
                                                creatura3.setPadre2(animalK);
                                                creatura3.setGemelo((animalZ * animalY) - (animalZ + animalY));
                                            }
                                        }
                                    }else{
                                        C = 50;
                                    }
                                }else{
                                    C = 50;
                                }
                            }
                        }
                    }
                }else{
                    //acción 2
                     C = 90;
                }
            }
        }else{
            C = 110;
        }
        return C;
    }
    public int devolverB(){
        // first syntax
        
        return b;
    }
}
