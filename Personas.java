package ExamenParcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Personas {
    private static final String[] nombres = { "Dante el Elefante", "Andres Trozado", "Dolores Delano", "Aitor Tilla", "Ema Amado Bustos", "Monica Galindo", "Elvia Ratón Calvo", "Sofia", "Luz Divina", "Esteban Dido" };
    private static final List<String> nombresAleatorios = new ArrayList<String>();
    private String nombre;
    private boolean esEnano;
    private boolean esCabezon;
    private boolean esAlcoholico;
    private boolean esCalvo;
    private boolean sabeVolar;
    private boolean esInteligente;
    private boolean esAlto;
    private boolean estaFeliz;
    static {
        for (String nombre : nombres) {
            nombresAleatorios.add(nombre);
        }
        Collections.shuffle(nombresAleatorios, new Random());
    }
    public Personas() {
        this.nombre = nombresAleatorios.remove(0);
        this.esEnano = new Random().nextBoolean();
        this.esCabezon = new Random().nextBoolean();
        this.esAlcoholico = new Random().nextBoolean();
        this.esCalvo = new Random().nextBoolean();
        this.sabeVolar = new Random().nextBoolean();
        this.esInteligente = new Random().nextBoolean();
        this.esAlto = new Random().nextBoolean();
        this.estaFeliz = new Random().nextBoolean();
    }
    
    public String getNombre() {
        return nombre;
    }

    public boolean getEsEnano() {
        return esEnano;
    }

    public boolean getEsCabezon() {
        return esCabezon;
    }
    public boolean getEsAlcoholico() {
        return esAlcoholico;
    }
    public boolean getEsCalvo() {
        return esCalvo;
    }

    public boolean getSabeVolar() {
        return sabeVolar;
    }

    public boolean getEsInteligente() {
        return esInteligente;
    }

    public boolean getEsAlto() {
        return esAlto;
    }

    public boolean getEstaFeliz() {
        return estaFeliz;
    }


}