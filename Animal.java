package PetShop;

import java.io.Serializable;

public class Animal implements Serializable {

    // Atributos

    private String nomeAnimal;
    private String porteAnimal;
    private String tipoAnimal;

    // Geters and Setters

    public String getnomeAnimal() {
        return nomeAnimal;
    }

    public void setnomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getporteAnimal() {
        return porteAnimal;
    }

    public void setporteAnimal(String porteAnimal) {
        this.porteAnimal = porteAnimal;
    }

    public String gettipoAnimal() {
        return tipoAnimal;
    }

    public void settipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
