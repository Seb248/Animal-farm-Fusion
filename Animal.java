
/**
 * Write a description of class Animal here.
 *
 * @author (your nombre)
 * @version (a version number or a date)
 */
public class Animal
{
    // instance variables - replace the example below with your own
    private String tipo;
    private int edad;
    private int salud;
    private String nombre;
    private String type;
    private String género ;
    private String gender ;
    private String un;
    private String lleno;
    private int inteligencia;
    private int hambre;
    private int IntC;
    private int Padre1;
    private int Padre2;
    private int Gemelo;
    private int Maduro;
    private double precio;
    private int fuerza;
    // Add an instance variable here for nombre.
    int elegidorGénero = Randomizer.nextInt(0, 1);
    public Animal()
    {
        switch (elegidorGénero) {
            case 0:  género = "masculino";
                break;
            case 1:  género = "femenina";
                break;
            }
        switch (elegidorGénero) {
            case 0:  gender = "male";
                break;
            case 1:  gender = "female";
                break;
            }
        switch (elegidorGénero) {
            case 0:  un = " un ";
                break;
            case 1:  un = " una ";
                break;
            }
        switch (elegidorGénero) {
            case 0:  lleno = "lleno";
                break;
            case 1:  lleno = "llena";
                break;
            }
        this.edad = 0;
        this.salud = 100;
        switch (elegidorGénero) {
            case 0:  this.nombre = DataWarehouse.animalHombreNombre();
                break;
            case 1:  this.nombre = DataWarehouse.animalMujerNombre();
                break;
            }
        
        switch (elegidorGénero) {
            case 0:  this.tipo = DataWarehouse.tipoAnimalH();
                break;
            case 1:  this.tipo = DataWarehouse.tipoAnimalM();
                break;
            }
        this.type = DataWarehouse.tipoAnimalEng();
        if (type.equalsIgnoreCase("Unicorn")) {
            this.precio = 10000000;
        }else{
            this.precio = DataWarehouse.precio();
        }
        this.inteligencia = DataWarehouse.inteligencia();
        this.fuerza = DataWarehouse.fuerza();
        this.Maduro = DataWarehouse.maduridad();
        this.hambre = 100;
        this.IntC = 0;
        this.Padre1 = 0;
        this.Padre2 = 0;
        this.Gemelo = 0;
    }
    
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    public void setSalud(int salud)
    {
        this.salud = salud;
    }
    public void attack(int attack)
    {
        salud = this.salud - attack;
        if(precio <= 0){
            this.precio = 0;
        }else{
            if(salud == 0){
                precio = this.precio;
            }else{
                precio = this.precio - (attack * 2.5);
            }
        }
    }
    public void heal(int heal)
    {
        salud = this.salud + heal;
        precio = this.precio + (heal * 2);
    }
    public void setInteligencia(int inteligencias)
    {
        this.inteligencia = inteligencias;
    }
    public void entrenar(int entrenar)
    {
        inteligencia = this.inteligencia + entrenar;
        precio = this.precio + (entrenar * 0.75);
    }
    public void ejercicio(int ejercicio)
    {
        fuerza = this.fuerza + ejercicio;
        precio = this.precio + (ejercicio * 0.55);
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    public void setHambre(int hambre)
    {
        this.hambre = hambre;
    }
    public void comer(int comer)
    {
        this.hambre = hambre + comer;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    public void setIntC(int IntC)
    {
        this.IntC = IntC;
    }
    public void setPadre1(int Padre1)
    {
        this.Padre1 = Padre1;
    }
    public void setPadre2(int Padre2)
    {
        this.Padre2 = Padre2;
    }
    public void setGemelo(int Gemelo)
    {
        this.Gemelo = Gemelo;
    }
    public void setFuerza(int fuerza)
    {
        this.fuerza = fuerza;
    }
    public int getFuerza()
    {
        return fuerza;
    }
    public int getGemelo()
    {
        return Gemelo;
    }
    public int getMaduro()
    {
        return Maduro;
    }
    public int getIntC()
    {
        return IntC;
    }
    public int getPadre1()
    {
        return Padre1;
    }
    public int getPadre2()
    {
        return Padre2;
    }
    public double getPrecio()
    {
        return precio;
    }
    public int getEdad()
    {
        return edad;
    }
    public int getHealth()
    {
        return salud;
    }
    public int getInteligencia()
    {
        return inteligencia;
    }
    public int getHambre()
    {
        return hambre;
    }
    public String getgénero()
    {
        return género;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getTipo()
    {
        return tipo;
    }
    public String getType()
    {
        return type;
    }
    public String frase()
    {
        return nombre + " es" + un + tipo + " con una salud de " + salud + " y una edad de " + edad + " y su Índice de inteligencia es: " + inteligencia + " y es " + fuerza + " de fuerte " + " y es " + género + " y vale " + precio + "€" + "y está " + hambre + " " + lleno;
    }
    public String toString()
    {
        return nombre + " is a " + type + " with a health of " + salud + " and an age of " + edad + " and an inteligence index of: " + inteligencia + " and is " + fuerza + " strong " + " and is " + gender + " and is worth " + precio + "€" + " and is " + hambre + " full";
    }
}
