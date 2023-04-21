
/**
 * Write a description of class AnimalTester here.
 *
 * @author (Seb)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class AnimalTester
{
    static double dinero;
    static int comida;
    private int c;
    public static void main(String[] args)
    {
        dinero = 10000.00;
        int turno = 0;
        int Nuestrahambre = 1000;
        int turnoSecreto = 0;
        int nuestraFuerza = 50;
        int nuestraSalud = 100;
        comida = 100;
        System.out.println("Would you like to play in English or Spanish?");
        System.out.println("Te gustaria jugar en Español o Ingles");
        String idioma = Input.nextLine();
        boolean selecionarIdioma = idioma.equalsIgnoreCase("Spanish") || idioma.equalsIgnoreCase("Español");
        if (selecionarIdioma != true){
           System.out.println("How many animals would you like in the Barn yard?");
       }else{
           System.out.println("¿Cuantos animales te gustaria tener en la granja?");
       }
        
        List<Animal> animalList = Collections.synchronizedList(new ArrayList<Animal>());
        InteractionChamber trys = new InteractionChamber(animalList);
        int numAnimales = Input.nextInt();
        for (int i = 0; i < numAnimales; i++)
        {
            /* Repeat code betweeen the brackets numAnimales times,
               * as the COUNT variable is numAnimales. */
               animalList.add(new Animal());
        }
        int z = 0;
        int y = 1;
        System.out.println("");
        System.out.println("");
        if (selecionarIdioma != true){
               System.out.println("Animal List: ");
          }else{
               System.out.println("Lista de Animales: ");
         }
        while (z < (numAnimales))
       {
           Animal creature = animalList.get(z);
           if (selecionarIdioma != true){
               System.out.println(y + " - " + creature.toString());
          }else{
               System.out.println(y + " - " + creature.frase());
         }
            z = z + 1;
            y = y + 1;
       }
       System.out.println("");
       System.out.println("");
        if (selecionarIdioma != true){
            print();
        } else{
           imprimir();
        }
        String question = "";
        boolean repeat = false;
        if (numAnimales == 0){
            repeat = true;
        }
        int animalZ = 0;
        int animalX = 0;
        Animal creatura = new Animal();
        Animal creatura2 = new Animal();
        Animal creatura3 = new Animal();
           while (!repeat)
           {
                   for (int i = 0; i < numAnimales; i++){
                        Animal creaturaz = animalList.get(i);
                        creaturaz.setIntC(0);
                    }
                 turno = turno + 1;
                 turnoSecreto = turnoSecreto + 1;
                 Nuestrahambre = Nuestrahambre - 10;
                 if (nuestraSalud <= 0){
                       if (selecionarIdioma != true){
                           System.out.println("You died of you of your injuries");
                       }else{
                           System.out.println("Muriste de tus heridas");
                       }
                       repeat = true;
                        }
                 System.out.println("");
                 System.out.println("");
                 if (selecionarIdioma != true){
                            System.out.println("Turn: " + turno + ", Do you wish to finish the game, if so enter in 0");
                            System.out.println("You have " + dinero + "€");
                            System.out.println("You have " + comida + " food");
                            System.out.println("You have " + nuestraSalud + " of health");
                            System.out.println("You are " + Nuestrahambre + " hungry");
                            System.out.println("You are " + nuestraFuerza + " strong");
                            System.out.println("Remember for any action use animal NUMBER not name or type");
                 }else{
                            System.out.println("Turno: " + turno + ", ¿Quieres terminar, si sí input dentro 0");
                            System.out.println("Tienes " + dinero + "€");
                            System.out.println("Tienes " + comida + " comida");
                            System.out.println("Tienes " + nuestraSalud + " de salud");
                            System.out.println("Estas " + Nuestrahambre + " de hambriento");
                            System.out.println("Eres " + nuestraFuerza + " de fuerte");
                            System.out.println("Acuerdate que por cualquier acción utiliza el NUMERO del animal no el nombre ni el tipo");
                 }
                 System.out.println("");
                 System.out.println("");
                   animalZ = Input.nextInt();
                   animalX = animalZ - 1;
                   
                    
                 for (int i = 0; i < numAnimales; i++)
                 {
                   /* Repeat code betweeen the brackets numAnimales times,
                   * as the COUNT variable is numAnimales. */
                   Animal creatura10 = animalList.get(i);
                   int f = creatura10.getEdad() + 1;
                   
                   creatura10.setEdad(f);
                 }
                 for (int i = 0; i < numAnimales; i++)
                 {
                    
                           /* Repeat code betweeen the brackets numAnimales times,
                           * as the COUNT variable is numAnimales. */
                           Animal creatura10 = animalList.get(i);
                                           
                           int quedan = i + 1;
                           int quedan2 = quedan + 1;
                           if (creatura10.getHambre() <= 0){
                                if (selecionarIdioma != true){
                                    System.out.println(creatura10.getNombre() + " is starving");
                                }else{
                                    if (creatura10.getgénero().equalsIgnoreCase("masculino"))
                                    {
                                        System.out.println(creatura10.getNombre() + " esta hambriento");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " esta hambriento");
                                    }
                                }
                                creatura10.attack(10);
                                if (creatura10.getPrecio() <= 0){
                                    creatura10.setPrecio(0);
                                }
                                quedan = i + 1;
                                if (creatura10.getHealth() == 0){
                                    if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of hunger");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de hambre");
                                    }
                                    dinero = dinero + creatura10.getPrecio();
                                    animalList.remove(i);
                                    numAnimales = numAnimales - 1;
                                    if ((quedan + 1) <= numAnimales){
                                        Animal creatura20 = animalList.get(quedan);
                                        if (creatura20.getHambre() <= 0){
                                            if (selecionarIdioma != true){
                                                System.out.println(creatura20.getNombre() + " is starving");
                                            }else{
                                                if (creatura20.getgénero().equalsIgnoreCase("masculino"))
                                                {
                                                    System.out.println(creatura20.getNombre() + " esta hambriento");
                                                }else{
                                                    System.out.println(creatura20.getNombre() + " esta hambriento");
                                                }
                                            }
                                            creatura20.attack(10);
                                            if (creatura20.getHealth() == 0){
                                                if (selecionarIdioma != true){
                                                    System.out.println(creatura20.getNombre() + " died of hunger");
                                                }else{
                                                    System.out.println(creatura20.getNombre() + " murio de hambre");
                                                }
                                                dinero = dinero + creatura20.getPrecio();
                                                animalList.remove(quedan);
                                                numAnimales = numAnimales - 1;
                                            }
                                            quedan2 = quedan + 1;
                                
                                        }
                                    }
                                }
                            }
                 }
                 if (numAnimales == 1){
                     Animal creatura10 = animalList.get(0);
                     if (creatura10.getHambre() <= 0){
                         if (selecionarIdioma != true){
                             System.out.println(creatura10.getNombre() + " is starving");
                            }else{
                                if (creatura10.getgénero().equalsIgnoreCase("masculino"))
                                {
                                    System.out.println(creatura10.getNombre() + " esta hambriento");
                                }else{
                                    System.out.println(creatura10.getNombre() + " esta hambriento");
                                }
                         }
                         creatura10.attack(10);
                         if (creatura10.getHealth() == 0){
                             if (selecionarIdioma != true){
                                 System.out.println(creatura10.getNombre() + " died of hunger");
                                }else{
                                    System.out.println(creatura10.getNombre() + " murio de hambre");
                                }
                                dinero = dinero + creatura10.getPrecio();
                                animalList.remove(0);
                                numAnimales = numAnimales - 1;
                            }
                     }
                 }
                 for (int i = 0; i < numAnimales; i++)
                 {
                   /* Repeat code betweeen the brackets numAnimales times,
                   * as the COUNT variable is numAnimales. */
                   Animal creatura10 = animalList.get(i);
                   creatura10.setHambre(creatura10.getHambre() - 10);
                 }
                   if (animalZ == 0){
                       repeat = true;
                    }else if (animalZ == -5){
                        if (selecionarIdioma != true){
                            print();
                       }else{
                            imprimir();
                        }
                    }else if (animalZ == -6){
                        double suficiente = dinero - 1000;
                        if (suficiente >= 0){
                            animalList.add(new Animal());
                            creatura3 = animalList.get(animalList.size() - 1);
                            dinero = dinero - 1000;
                            numAnimales = numAnimales + 1;
                            if (selecionarIdioma != true){
                                System.out.println(creatura3.toString());
                            }else{
                                System.out.println(creatura3.frase());
                            }
                        }else{
                            if (selecionarIdioma != true){
                                System.out.println("Sorry but you do not have enough money to buy a new animal");
                            }else{
                                System.out.println("Lo siento pero no tienes suficiente dinero para comprar un animal nuevo");
                            }
                        }
                    }else if (animalZ == -10){
                        int valido = turnoSecreto - 5;
                        if (valido >= 0){
                            turnoSecreto = 0;
                            int productos = 0;
                            for (int i = 0; i < numAnimales; i++)
                           {
                                /* Repeat code betweeen the brackets numAnimales times,
                                * as the COUNT variable is numAnimales. */
                              
                                Animal creature = animalList.get(i);
                                if (creature.getTipo().equalsIgnoreCase("Vaca")){
                                    productos = productos + 50;
                                }else if(creature.getTipo().equalsIgnoreCase("Oveja")){
                                    productos = productos + 100;
                                }else if(creature.getTipo().equalsIgnoreCase("Cabra")){
                                    productos = productos + 35;
                                }else if(creature.getTipo().equalsIgnoreCase("Gallina")){
                                    productos = productos + 5;
                                }else if(creature.getTipo().equalsIgnoreCase("Pata")){
                                    productos = productos + 10;
                                }                               
                            }
                            dinero = dinero + productos;
                            if (selecionarIdioma != true){
                                System.out.println("We milked the goats and cows and shaved the sheep, and collected the eggs we gained: " + productos + "€");
                            }else{
                                System.out.println("Le scamos la leche a las vacas y afeitamos las ovejas, y recojimos los huevos ganamos: " + productos + "€");
                            }
                        }else{
                            int productos = 0;
                            for (int i = 0; i < numAnimales; i++)
                           {
                                /* Repeat code betweeen the brackets numAnimales times,
                                * as the COUNT variable is numAnimales. */
                              
                                Animal creature = animalList.get(i);
                                if(creature.getTipo().equalsIgnoreCase("Gallina")){
                                    productos = productos + 5;
                                }else if(creature.getTipo().equalsIgnoreCase("Pata")){
                                    productos = productos + 10;
                                }                               
                            }
                            dinero = dinero + productos;
                            if (selecionarIdioma != true){
                                System.out.println("Sorry but it is still too soon to milk the goats and cows and shave the sheep, so we just collected the eggs");
                            }else{
                                System.out.println("Lo siento pero aún es muy temprano para sacarles la leche a las vacas y afeitar las ovejas,");
                                System.out.println("etonces solo recojimos los huevos");
                            }
                        }
                    }else if (animalZ == -13){
                            int comer = comida;
                            
                            int g = 0;
                            if (selecionarIdioma != true){
                                    System.out.println("How much would you like to feed each animal");
                                }else{
                                    System.out.println("Cuanto le quieres dar de comer a cada animal");
                            }
                            int comiendo = Input.nextInt();
                            int suficiente = comida - comiendo;
                            while (suficiente >= 0){
                                for (int i = 0; i < numAnimales; i++)
                               {
                                    /* Repeat code betweeen the brackets numAnimales times,
                                    * as the COUNT variable is numAnimales. */
                                    if(suficiente >= 0){
                                        Animal creature = animalList.get(i);
                                        creature.comer(comiendo);
                                        comida = comida - comiendo;
                                        suficiente = comida - comiendo;
                                    }else{
                                        g = g + 1;
                                    }
                                }                              
                            }
                            if ( g != 0){
                                if (selecionarIdioma != true){
                                    System.out.println(g + " animals could not be fed as much as the others");
                                }else{
                                    System.out.println(g + " animales no pudieron comer tanto como los otros");
                                }
                            }else{
                                if (selecionarIdioma != true){
                                    System.out.println("All animals were fed");
                                }else{
                                    System.out.println("Todos los animales comieron");
                                }
                            }
                    }else if (animalZ == -9){
                        if (selecionarIdioma != true){
                            System.out.println("How many animals would you like to sell");
                        }else{
                            System.out.println("Cuantos animales quieres vender");
                        }
                        int cuantos = Input.nextInt();
                        for (int i = 0; i < cuantos; i++)
                        {
                                if (selecionarIdioma != true){
                                    System.out.println("Which animal would you like to sell");
                                }else{
                                    System.out.println("Qual animal quieres vender");
                                }
                                animalZ = Input.nextInt();
                                animalX = animalZ - 1;
                                if (numAnimales >= animalX)
                                {
                                    if (0 <= animalX)
                                    {
                                        creatura = animalList.get(animalX);
                                        //que va hacer esto
                                        double ganado = creatura.getPrecio();
                                        dinero = dinero + ganado;
                                        if (selecionarIdioma != true){
                                            System.out.println(creatura.getNombre() + " was sold for " + creatura.getPrecio() + "€");
                                        }else{
                                            System.out.println(creatura.getNombre() + " se vendio por " + creatura.getPrecio() + "€");
                                        }
                                        animalList.remove(animalX);
                                        numAnimales = numAnimales - 1;
                                    }else{
                                        //si el numero es menos de 0 no puede estar en la lista de animales
                                        if (selecionarIdioma != true){
                                            System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                        }else{
                                            System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                                        }
                                    }
                                }else{
                                    //si el numero es más grande de animales creados no puede estar en la lista
                                    if (selecionarIdioma != true){
                                        System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                    }else{
                                        System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                                    }
                                }
                         }
                    }else if (animalZ == -11){
                        if (selecionarIdioma != true){
                                    System.out.println("How much food would you like to buy");
                                }else{
                                    System.out.println("Cuanta comida te gustaria comprar");
                        }
                        int comprarComida = Input.nextInt();
                        if (dinero - comprarComida >= 0)
                        {
                            dinero = dinero - comprarComida;
                            comida = comida + comprarComida;
                            if (selecionarIdioma != true){
                                    System.out.println("You now have " + comida + " food");
                                }else{
                                    System.out.println("Ahora tines " + comida + " comida");
                                }
                        }else{
                            //si el numero es más grande de animales creados no puede estar en la lista
                            if (selecionarIdioma != true){
                                    System.out.println("Sorry you do not have enough money to buy this much food");
                                }else{
                                    System.out.println("Lo siento no tienes suficiente dinero para comprar esta cantidad de comida");
                                }
                        }
                    }else if (animalZ == -12){
                        if (selecionarIdioma != true){
                                    System.out.println("How much food would you like to sell");
                                }else{
                                    System.out.println("Cuanta comida te gustaria vender");
                        }
                        int venderComida = Input.nextInt();
                        if (comida - venderComida >=0){
                            dinero = dinero + venderComida;
                            comida = comida - venderComida;
                            if (selecionarIdioma != true){
                                    System.out.println("You now have " + comida + " food");
                                }else{
                                    System.out.println("Ahora tines " + comida + " comida");
                                }
                        }else{
                            if (selecionarIdioma != true){
                                    System.out.println("Sorry you dont have that much food to sell");
                                }else{
                                    System.out.println("Lo siento pero no tienes tanta comida para vender");
                                }
                        }
                    }else if (animalZ == -2){
                        if (selecionarIdioma != true){
                                    System.out.println("Which animal would you like to train");
                                }else{
                                    System.out.println("Qual animal quieres entrenar");
                        }
                        animalZ = Input.nextInt();
                        animalX = animalZ - 1;
                        if (numAnimales >= animalX)
                        {
                            if (0 <= animalX)
                            {
                                creatura = animalList.get(animalX);
                                //que va hacer esto
                                if (selecionarIdioma != true){
                                    System.out.println("How much would you like to train it");
                                }else{
                                    System.out.println("Cuanto lo quieres entrenar");
                                }
                                int entrenar = Input.nextInt();
                                double costo = entrenar * 1.75;
                                if (dinero - costo >= 0){
                                    dinero = dinero - costo;
                                    creatura.entrenar(entrenar);
                                    if (selecionarIdioma != true){
                                        System.out.println(creatura.toString());
                                    }else{
                                        System.out.println(creatura.frase());
                                    }
                                }else{
                                    if (selecionarIdioma != true){
                                        System.out.println("Sorry you do not have enough money to train the animal this much");
                                    }else{
                                        System.out.println("Lo siento pero no tienes suficiente dinero para entrenar el animal tanto");
                                    }
                                }
                            }else{
                                //si el numero es menos de 0 no puede estar en la lista de animales
                                if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                                }
                            }
                        }else{
                            //si el numero es más grande de animales creados no puede estar en la lista
                            if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                            }
                        }
                   }else if (animalZ == -18){
                        if (selecionarIdioma != true){
                                    System.out.println("Which animal would you like to make excersise");
                                }else{
                                    System.out.println("Qual animal quieres que haga ejercicio");
                        }
                        animalZ = Input.nextInt();
                        animalX = animalZ - 1;
                        if (numAnimales >= animalX)
                        {
                            if (0 <= animalX)
                            {
                                creatura = animalList.get(animalX);
                                //que va hacer esto
                                
                                int ejercicio = 10;
                                double costo = ejercicio * 1.5;
                                if (dinero - costo >= 0){
                                    dinero = dinero - costo;
                                    creatura.ejercicio(ejercicio);
                                    int ver = trys.ejercicio(animalX);
                                    if (ver == 0){
                                        if (selecionarIdioma != true){
                                            System.out.println(creatura.toString());
                                        }else{
                                            System.out.println(creatura.frase());
                                        }
                                    }else{
                                        if (selecionarIdioma != true){
                                            System.out.println("Sorry this animal already was or went over its maximum strength");
                                        }else{
                                            System.out.println("Lo siento este animal ya estaba o se fue por encima el maximo nivel de fuerza que puede tener");
                                        }
                                    }
                                }else{
                                    if (selecionarIdioma != true){
                                        System.out.println("Sorry you do not have enough money to have the animal excersise");
                                    }else{
                                        System.out.println("Lo siento pero no tienes suficiente dinero para hacer que el animal haga ejercicio");
                                    }
                                }
                            }else{
                                //si el numero es menos de 0 no puede estar en la lista de animales
                                if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                                }
                            }
                        }else{
                            //si el numero es más grande de animales creados no puede estar en la lista
                            if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                            }
                        }
                   }else if (animalZ == -3){
                        if (selecionarIdioma != true){
                                    System.out.println("Which animal would you like to attack");
                                }else{
                                    System.out.println("Qual animal quieres atackar");
                        }
                        animalZ = Input.nextInt();
                        animalX = animalZ - 1;
                        if (numAnimales >= animalX)
                        {
                            if (0 <= animalX)
                            {
                                creatura = animalList.get(animalX);
                                if (selecionarIdioma != true){
                                    System.out.println("How much would you like to attack it");
                                }else{
                                    System.out.println("Cuanto lo quieres atackar");
                                }
                                int attack = Input.nextInt();
                                if (creatura.getFuerza() < nuestraFuerza){
                                    creatura.attack(attack);
                                    if (creatura.getHealth() == 0){
                                        if (selecionarIdioma != true){
                                            System.out.println(creatura.getNombre() + " died");
                                        }else{
                                            System.out.println(creatura.getNombre() + " murio");
                                        }
                                        animalList.remove(animalX);
                                        numAnimales = numAnimales - 1;
                                    }else{
                                        if (selecionarIdioma != true){
                                            System.out.println(creatura.toString());
                                        }else{
                                            System.out.println(creatura.frase());
                                        }
                                    }
                                }else{
                                    int insanity = Randomizer.nextInt(1, 20);
                                    if (insanity == 1){
                                        if (selecionarIdioma != true){
                                            System.out.println(creatura.getNombre() + " tried to attack you (since you are weaker than it) but you dodged it");
                                        }else{
                                            System.out.println(creatura.getNombre() + " intento attacarte (porque eres más debil) pero lo evitaste");
                                        }
                                    }else{
                                        nuestraSalud = nuestraSalud - attack;
                                        if (selecionarIdioma != true){
                                            System.out.println(creatura.getNombre() + " attacked you since you are weaker");
                                        }else{
                                            System.out.println(creatura.getNombre() + " te attaco porque eres más debil");
                                        }
                                    }
                                }
                            }else{
                                if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                                }
                            }
                        }else{
                            if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                            }
                        }
                        
                        
                   }else if (animalZ == -7){
                        if (selecionarIdioma != true){
                                    System.out.println("Which animal would you like to heal");
                                }else{
                                    System.out.println("Qual animal quieres curar");
                        }
                        animalZ = Input.nextInt();
                        animalX = animalZ - 1;
                        if (numAnimales >= animalX)
                        {
                            if (0 <= animalX)
                            {
                                creatura = animalList.get(animalX);
                                if (selecionarIdioma != true){
                                    System.out.println("How much would you like to heal it");
                                }else{
                                    System.out.println("Cuanto lo quieres curar");
                                }
                                int heal = Input.nextInt();
                                if (creatura.getHealth() > 100){
                                    if (selecionarIdioma != true){
                                        System.out.println(creatura.getNombre() + " could not be healed as it is already at max health");
                                    }else{
                                        System.out.println(creatura.getNombre() + " no se pudo curar porque ya está en la mixima salud");
                                    }
                                }else{
                                    creatura.heal(heal);
                                    if (selecionarIdioma != true){
                                        System.out.println(creatura.getNombre() + " was healed");
                                    }else{
                                        System.out.println(creatura.getNombre() + " se curo");
                                    }
                                }
                            }else{
                                if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                                }
                            }
                        }else{
                            if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                            }
                        }
                        
                        
                   }else if (animalZ == -1){
                       System.out.println("");
                       System.out.println("");
                       if (selecionarIdioma != true){
                           System.out.println("Animal List: ");
                        }else{
                            System.out.println("Lista de Animales: ");
                        }
                       for (int i = 0; i < numAnimales; i++)
                       {
                           /* Repeat code betweeen the brackets numAnimales times,
                              * as the COUNT variable is numAnimales. */
                              int L = i + 1;
                              Animal creature = animalList.get(i);
                              if (selecionarIdioma != true){
                                  System.out.println(L + " - " + creature.toString());
                              }else{
                                  System.out.println(L + " - " + creature.frase());
                                }
                            }
                       System.out.println("");
                       System.out.println("");
                    }else if (animalZ == -8){
                        int U = -1;
                       for (int i = 0; i < numAnimales; i++)
                       {
                           /* Repeat code betweeen the brackets numAnimales times,
                              * as the COUNT variable is numAnimales. */
                              Animal Unicorn = animalList.get(i);
                              if (Unicorn.getType().equalsIgnoreCase("Unicorn")){
                                  U = i;
                              }
                            }
                       if (U == -1){
                          if (selecionarIdioma != true){
                            System.out.println("Sorry you do not seem to have a Unicorn in your barn yard at the moment");
                            }else{
                            System.out.println("Lo siento pero aparentemente no tienes un unicornio en tu granja en este momento");
                          }
                       }else{
                          for (int i = 0; i < numAnimales; i++)
                           {
                           /* Repeat code betweeen the brackets numAnimales times,
                              * as the COUNT variable is numAnimales. */
                              Animal reset = animalList.get(i);
                              if (!reset.getType().equalsIgnoreCase("Unicorn")){
                                  reset.setSalud(100);
                                  reset.setEdad(0);
                                  reset.setHambre(100);
                              }
                            }
                          dinero = dinero + 10000;
                          comida = comida + 10000;
                          if (selecionarIdioma != true){
                              System.out.println("Unicorn Powers GOOOOOO!!!!!");
                          }else{
                              System.out.println("¡Magia de Unicornio!");
                          }
                       }
                    }else if (animalZ == -100){
                        ArrayList<Integer> animals = trys.emparejarse(numAnimales);
                        for (int i = 0; i < animals.size(); i++){
                            int s = animals.get(i);
                            creatura = animalList.get(s);
                            System.out.println(creatura.frase());
                        }
                    }else if (animalZ == -21){
                        if (selecionarIdioma != true){
                            System.out.println("How much would you like to heal (cost is 1.25 how much you want to heal)?");
                        }else{
                            System.out.println("¿Cuanto quieres curarte (costo es 1.25 lo que quieres curarte)?");
                        }
                        int curar = Input.nextInt();
                        double costo = curar * 1.25;
                                if (dinero - costo >= 0){
                                    dinero = dinero - costo;
                                    nuestraSalud = nuestraSalud + curar;
                                }else{
                                    if (selecionarIdioma != true){
                                        System.out.println("Sorry you do not have enough money to heal");
                                    }else{
                                        System.out.println("Lo siento pero no tienes suficiente dinero para curarte");
                                    }
                                }
                    }else if (animalZ == -20){
                        if (selecionarIdioma != true){
                            System.out.println("Would you like to do excersise?");
                        }else{
                            System.out.println("¿Quieres hacer ejercicio?");
                        }
                        nuestraFuerza = nuestraFuerza + 10;
                        if (selecionarIdioma != true){
                            System.out.println("Now you are " + nuestraFuerza + " strong");
                        }else{
                            System.out.println("Ahora eres " + nuestraFuerza + " de fuerte");
                        }
                    }else if (animalZ == -16){
                        ArrayList<Integer> animals = trys.hambrientos(numAnimales);
                        if (selecionarIdioma != true){
                            System.out.println("How much would you like to feed the hungriest animals");
                        }else{
                            System.out.println("Cuanta comida te gustaria dar a los animales más hambrientos");
                        }
                        int comiendo = Input.nextInt();
                        int suficiente = comida - comiendo;
                        if (suficiente >= 0){
                            int comidas = comiendo/animals.size();
                            for (int i = 0; i < animals.size(); i++){
                                int s = animals.get(i);
                                creatura = animalList.get(s);
                                creatura.comer(comidas);
                                comida = comida - comidas;
                            }
                            for (int i = 0; i < animals.size(); i++){
                                int s = animals.get(i);
                                creatura = animalList.get(s);
                                System.out.println(creatura.frase());
                            }
                        }else{
                            if (selecionarIdioma != true){
                                System.out.println("Sorry you do not have enough food to mathc what you asked");
                            }else{
                                System.out.println("Lo siento no tienes suficiente comida para dar lo que pediste");
                            }
                        }
                    }else if (animalZ == -15){
                        ArrayList<Integer> animals = trys.emparejarse(numAnimales);
                        if (selecionarIdioma != true){
                            System.out.println("How much food would you like to set out (warning only most intelegent animals get said food)");
                        }else{
                            System.out.println("Cuanta comida te gustaria dejar (Cuidado que solo los más inteligentes animales comeran)");
                        }
                        int comiendo = Input.nextInt();
                        int suficiente = comida - comiendo;
                        if (suficiente >= 0){
                            int comidas = comiendo/animals.size();
                            for (int i = 0; i < animals.size(); i++){
                                int s = animals.get(i);
                                creatura = animalList.get(s);
                                creatura.comer(comidas);
                                comida = comida - comidas;
                            }
                            for (int i = 0; i < animals.size(); i++){
                                int s = animals.get(i);
                                creatura = animalList.get(s);
                                System.out.println(creatura.frase());
                            }
                        }else{
                            if (selecionarIdioma != true){
                                System.out.println("Sorry you do not have enough food to match what you asked");
                            }else{
                                System.out.println("Lo siento no tienes suficiente comida para dar lo que pediste");
                            }
                        }
                    }else if (animalZ == -19){
                        ArrayList<Integer> animals = trys.másFuerte(numAnimales);
                        if (selecionarIdioma != true){
                            System.out.println("How much food would you like to set out (warning only the stronges animals get said food)");
                        }else{
                            System.out.println("Cuanta comida te gustaria dejar (Cuidado que solo los más fuertes animales comeran)");
                        }
                        int comiendo = Input.nextInt();
                        int suficiente = comida - comiendo;
                        if (suficiente >= 0){
                            int comidas = comiendo/animals.size();
                            for (int i = 0; i < animals.size(); i++){
                                int s = animals.get(i);
                                creatura = animalList.get(s);
                                creatura.comer(comidas);
                                comida = comida - comidas;
                            }
                            for (int i = 0; i < animals.size(); i++){
                                int s = animals.get(i);
                                creatura = animalList.get(s);
                                System.out.println(creatura.frase());
                            }
                        }else{
                            if (selecionarIdioma != true){
                                System.out.println("Sorry you do not have enough food to match what you asked");
                            }else{
                                System.out.println("Lo siento no tienes suficiente comida para dar lo que pediste");
                            }
                        }
                    }else if (animalZ == -17){
                        if (selecionarIdioma != true){
                            System.out.println("Which animal would you like to eat");
                        }else{
                            System.out.println("Cual animal quieres comer");
                        }
                        int animal = Input.nextInt() - 1;
                        if (numAnimales >= animal)
                        {
                            if (0 <= animal)
                            {
                                creatura = animalList.get(animal);
                                if (creatura.getFuerza() < nuestraFuerza){
                                    trys.gComer(animal);
                                    Nuestrahambre = Nuestrahambre + trys.gComer(animal);
                                    if (selecionarIdioma != true){
                                        System.out.println("You ate " + creatura.getNombre());
                                    }else{
                                        System.out.println("Comiste a " + creatura.getNombre());
                                    }
                                    animalList.remove(animal);
                                    numAnimales = numAnimales - 1;
                                }else{
                                    int insanity = Randomizer.nextInt(1, 20);
                                    if (insanity == 1){
                                        if (selecionarIdioma != true){
                                            System.out.println(creatura.getNombre() + " tried to attack you (since you are weaker than it) but you dodged it");
                                        }else{
                                            System.out.println(creatura.getNombre() + " intento attacarte (porque eres más debil) pero lo evitaste");
                                        }
                                    }else{
                                        nuestraSalud = nuestraSalud - 95;
                                        if (selecionarIdioma != true){
                                            System.out.println(creatura.getNombre() + " attacked you since you are weaker");
                                        }else{
                                            System.out.println(creatura.getNombre() + " te attaco porque eres más debil");
                                        }
                                    }
                                }
                            }else{
                                if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                                }
                            }
                        }else{
                            if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created please start again and if you preform this action again select an animal from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numero de la lista del principo.");
                            }
                        }
                        
                        
                    }else if (animalZ == -4){
                        double suficiente = dinero - 100;
                        if (suficiente >= 0){
                            dinero = dinero - 100;
                            if (selecionarIdioma != true){
                                    System.out.println("Which two animals would you like to breed together (They must be opoisite genders and of same type)");
                                }else{
                                    System.out.println("Quales dos animales te gustaria criar juntos (Tienen que ser de diferentes géneros y del mismo tipo)");
                            }
                            if (selecionarIdioma != true){
                                    System.out.println("First animal:");
                                }else{
                                    System.out.println("Primer Animal:");
                            }
                            animalZ = Input.nextInt();
                            animalX = animalZ - 1;
                            if (selecionarIdioma != true){
                                    System.out.println("Second animal:");
                                }else{
                                    System.out.println("Segundo Animal:");
                            }
                            int animalY = Input.nextInt();
                            int animalK = animalY - 1;
                            if (numAnimales >= animalX && numAnimales >= animalK)
                            {
                                if (0 <= animalX && 0 <= animalK)
                                {
                                    
                                    creatura = animalList.get(animalX);
                                    creatura2 = animalList.get(animalK);
                                    
                                    int c = trys.criar(animalX, animalK, numAnimales, animalZ, animalY);
                                    boolean TipoCom = creatura.getType().equalsIgnoreCase(creatura2.getType());
                                     
                                    
                                    //que va hacer esto
                                    
                                            //acción 1
                                            if (c == 10)
                                            {
                                                System.out.println("Buuuuuunnnnniiiiiieeeeeessssss");
                                                int b = trys.devolverB();
                                                int tet = b;
                                                numAnimales = numAnimales + b;
                                                for (int i = 0; i < b; i++)
                                                {
                                                    creatura3 = animalList.get(animalList.size() - tet);
                                                    
                                                    if (selecionarIdioma != true){
                                                        System.out.println(creatura3.toString());
                                                    }else{
                                                        System.out.println(creatura3.frase());
                                                    }
                                                    tet = tet - 1;
                                                }
                                            }else if (c == 20){
                                                if (selecionarIdioma != true){
                                                    System.out.println("We are sorry to say but Mules cannot breed");
                                                    System.out.println("In order to get a mule you must breed a female horse and a male donkey");
                                                }else{
                                                    System.out.println("Disculpanos pero Mulos no pueden Reproducir");
                                                    System.out.println("Para poder tener un mulo necesitas criar una Yegua y un Asno/Burro");
                                                }
                                            }else if (c == 30){
                                                System.out.println("Compatible");

                                                creatura3 = animalList.get(animalList.size() - 1);
                                                numAnimales = numAnimales + 1;
                                                if (selecionarIdioma != true){
                                                    System.out.println(creatura3.toString());
                                                }else{
                                                    System.out.println(creatura3.frase());
                                                }
                                            }else if (c == 50){
                                                            //si no
                                                            if (selecionarIdioma != true){
                                                                System.out.println("They could not be bred as the animals are not of the same species");
                                                            }else{
                                                                System.out.println("No se pudon criar porque no son del mismo especie");
                                                            }
                                            
                                            }else if (c == 70){
                                                            //si no
                                                            if (selecionarIdioma != true){
                                                                System.out.println("Sorry they could not be bred as one of the animals is the parent to the other");
                                                            }else{
                                                                System.out.println("Lo siento no se pudon criar porque uno de los animales son el padre para el otro");
                                                            }
                                            
                                            }else if (c == 80){
                                                            //si no
                                                            if (selecionarIdioma != true){
                                                                System.out.println("Sorry they could not be bred as the animals are siblings");
                                                            }else{
                                                                System.out.println("Lo siento no se pudon criar porque los animales son hermanos");
                                                            }
                                            
                                            }else if (c == 110){
                                                            //si no
                                                            if (selecionarIdioma != true){
                                                                System.out.println("Sorry they could not be bred as one or both of the animals are too young");
                                                            }else{
                                                                System.out.println("Lo siento no se pudon criar porque uno o ambos de los animales son demasiado joven");
                                                            }
                                            
                                            }else if (c == 90){
                                                //acción 2
                                                if (selecionarIdioma != true){
                                                    System.out.println("They could not be bred as the animals are of the same gender");
                                                }else{
                                                    System.out.println("No se pudon criar porque no son del mismo genero");
                                                }
                                    
                                            }else if (c == 100){
                                                if (selecionarIdioma != true){
                                                    System.out.println("They could not be bred as the animals won't cooperate");
                                                }else{
                                                    System.out.println("No se pudon criar porque no quieron");
                                                }
                                            }
                                }else{
                                    //si el numero es menos de 0 no puede estar en la lista de animales
                                    if (selecionarIdioma != true){
                                        System.out.println("One or both of these animals are not in the list created please start again and if you preform this action again select an animals from the list at the top.");
                                    }else{
                                        System.out.println("Uno o Ambos de estos animales no estan en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numeros de la lista del principo.");
                                    }
                                }
                            }else{
                                //si el numero es más grande de animales creados no puede estar en la lista
                                if (selecionarIdioma != true){
                                    System.out.println("One or both of these animals are not in the list created please start again and if you preform this action again select an animals from the list at the top.");
                                }else{
                                    System.out.println("Uno o Ambos de estos animales no estan en la lista vuelve a empezar y se vuelves a hacer está acción intenta un numeros de la lista del principo.");
                                }
                            }
                        }else{
                            if (selecionarIdioma != true){
                                System.out.println("We are sorry but you do not have enough money to breed animals");
                            }else{
                                System.out.println("Lo siento pero no tienes suficiente dinero para criar aniamles");
                            }
                        }
                    }else if (animalZ == -14){
                        if (selecionarIdioma != true){
                            System.out.println("Which animal would you like to feed");
                        }else{
                            System.out.println("Qual animal quieres darle de comer");
                        }
                        animalZ = Input.nextInt();
                        animalX = animalZ - 1;
                        if (numAnimales >= animalX && numAnimales > 0)
                        {
                            if (0 <= animalX)
                            {
                                
                                creatura = animalList.get(animalX);
                                if (selecionarIdioma != true){
                                    System.out.println("How much would you like to feed the animal");
                                }else{
                                    System.out.println("Cuanto le quieres dar de comer al animal");
                                }
                                int comiendo = Input.nextInt();
                                int suficiente = comida - comiendo;
                                if (suficiente >= 0){
                                    creatura.comer(comiendo);
                                    comida = comida - comiendo;
                                    if (selecionarIdioma != true){
                                        System.out.println(creatura.toString());
                                    }else{
                                        System.out.println(creatura.frase());
                                    }
                                }else{
                                    if (selecionarIdioma != true){
                                        System.out.println("You dont have enough food to feed the animal this much");
                                    }else{
                                        System.out.println("No tienes suficiente comida para darle tanta comida");
                                    }
                                }
                            }else{
                                if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created try a number from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista intenta un numero de la lista del principo.");
                                }
                            }
                        }else{
                            if (selecionarIdioma != true){
                                System.out.println("This animal is not in the list created try a number from the list at the top.");
                            }else{
                                System.out.println("Este animal no está en la lista intenta un numero de la lista del principo.");
                            }
                        }
                    }else{
                        if (numAnimales >= animalX && numAnimales > 0)
                        {
                            if (0 <= animalX)
                            {
                                creatura = animalList.get(animalX);
                                if (selecionarIdioma != true){
                                    System.out.println(creatura.toString());
                                }else{
                                    System.out.println(creatura.frase());
                                }
                            }else{
                                if (selecionarIdioma != true){
                                    System.out.println("This animal is not in the list created try a number from the list at the top.");
                                }else{
                                    System.out.println("Este animal no está en la lista intenta un numero de la lista del principo.");
                                }
                            }
                        }else{
                            if (selecionarIdioma != true){
                                System.out.println("This animal is not in the list created try a number from the list at the top.");
                            }else{
                                System.out.println("Este animal no está en la lista intenta un numero de la lista del principo.");
                            }
                        }
                    }
                    for (int i = 0; i < numAnimales; i++){
                        Animal creaturaz = animalList.get(i);
                        creaturaz.setIntC(0);
                    }
                 
                  for (int i = 0; i < numAnimales; i++)
                  {
                   /* Repeat code betweeen the brackets numAnimales times,
                   * as the COUNT variable is numAnimales. */
                   Animal creatura10 = animalList.get(i);
                   if (creatura10.getType().equalsIgnoreCase("Cow")){
                            if (creatura10.getEdad() == 25){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Dog")){
                            if (creatura10.getEdad() == 13){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Cat")){
                            if (creatura10.getEdad() == 18){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Horse")){
                            if (creatura10.getEdad() == 30){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Chicken")){
                            if (creatura10.getEdad() == 10){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Sheep")){
                            if (creatura10.getEdad() == 12){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Pig")){
                            if (creatura10.getEdad() == 20){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Donkey")){
                            if (creatura10.getEdad() == 40){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Mule")){
                            if (creatura10.getEdad() == 50){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Duck")){
                            if (creatura10.getEdad() == 10){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Goose")){
                            if (creatura10.getEdad() == 22){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Turkey")){
                            if (creatura10.getEdad() == 10){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Goat")){
                            if (creatura10.getEdad() == 18){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Rooster")){
                            if (creatura10.getEdad() == 10){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }else if(creatura10.getType().equalsIgnoreCase("Bunny")){
                            if (creatura10.getEdad() == 12){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }
                     else if(creatura10.getType().equalsIgnoreCase("Unicorn")){
                            if (creatura10.getEdad() == 10000){
                                if (selecionarIdioma != true){
                                        System.out.println(creatura10.getNombre() + " died of old age");
                                    }else{
                                        System.out.println(creatura10.getNombre() + " murio de viejo");
                                    }
                                dinero = dinero + (creatura10.getPrecio()/2);
                                animalList.remove(i);
                                numAnimales = numAnimales - 1;
                            }
                     }
                 }
                 if (numAnimales == 0){
                        if (turno <= 10){
                                if (selecionarIdioma != true){
                                    System.out.println("You failed miserably");
                                }else{
                                    System.out.println("Fallaste miserablemente");
                                }
                            }else if (turno <= 50){
                                if (selecionarIdioma != true){
                                    System.out.println("You failed");
                                }else{
                                    System.out.println("Fallaste");
                                }
                            }else if (turno <= 100){
                                if (selecionarIdioma != true){
                                    System.out.println("You did ok");
                                }else{
                                    System.out.println("Hiciste bien");
                                }
                            }else{
                                if (selecionarIdioma != true){
                                    System.out.println("Did you use a Unicorn?");
                                }else{
                                    System.out.println("¿Usaste un Unicornio?");
                                }
                            }
                       repeat = true; 
                    }
                    if (Nuestrahambre <= 0){
                        nuestraSalud = nuestraSalud -10;
                        if (nuestraSalud <= 0){
                            if (selecionarIdioma != true){
                                System.out.println("You died of hunger");
                            }else{
                                System.out.println("Muriste de hambre");
                            }
                            repeat = true;
                        }
                    }
                }
       if (selecionarIdioma != true){
           System.out.println("Thanks for playing");
       }else{
           System.out.println("Gracias por jugar");
       }
    }
    private static void print(){
            System.out.println("If you want to access any animal please type the correspnding number by it in the printed list.");
            System.out.println("");
            System.out.println("You have " + dinero + "€");
            System.out.println("You have " + comida + " food");
            System.out.println("Now when you are done please write '0' to finish the game");
            System.out.println("Print full Animal list = -1");
            System.out.println("Train an animal the selected amount for a price = -2");
            System.out.println("Attack the selected animal (If the health reaches 0 then they die) = -3");
            System.out.println("Heal Animal = -7");
            System.out.println("Feeding all animal, diving all your food in portions of your choosing = -13");
            System.out.println("Feeding one animal the prtion you choose = -14");
            System.out.println("Leave food outside (Warning only the most inteligent animals will eat this food) = -15");
            System.out.println("Feed the hungriest animals = -16");
            System.out.println("Eat one of your animals = -17");
            System.out.println("Breed = -4");
            System.out.println("Buy an Animal = -6");
            System.out.println("Sell animal = -9");
            System.out.println("Collect chicken eggs, milk cows and goats, and shave sheep = -10");
            System.out.println("Buy food = -11");
            System.out.println("Sell food = -12");
            System.out.println("Print Commands = -5");
            System.out.println("Unicorn Magic = -8");
       }
    private static void imprimir(){
           System.out.println("Si quieres acceder algún animal por favor escribe su numero corsipondente al lado del manimal en la lista.");
           System.out.println("");
           System.out.println("Tienes " + dinero + "€");
           System.out.println("Tienes " + comida + " comida");
           System.out.println("Ahora cuando termines escribe '0` para acabar el juego");
           System.out.println("Emprimir toda la lista de animales = -1");
           System.out.println("Entrenar = -2");
           System.out.println("Atacar (Si la salud del animal llega a 0 el animal muere) = -3");
           System.out.println("Curar Animal = -7");
           System.out.println("Dar todos los animales comida, dividiendo tu comida en prociónes de tu seleción = -13");
           System.out.println("Darle de comer a un animal la cantidad que quieras = -14");
           System.out.println("Dejar comida afuera (Cuidado que solo los más inteligentes animales comeran) = -15");
           System.out.println("Darle de comer a los animales más hambrientos = -16");
           System.out.println("Comer uno de tus animales = -17");
           System.out.println("Criar = -4");
           System.out.println("Comprar Animal = -6");
           System.out.println("Vender animal = -9");
           System.out.println("Recojer huevos de gallinas y leche de cabras y vacas y pelar ovejas = -10");
           System.out.println("Comprar comida = -11");
           System.out.println("Vender comida = -12");
           System.out.println("Imprimir Comandos = -5");
           System.out.println("Magia de Unicornio = -8");
        }
}