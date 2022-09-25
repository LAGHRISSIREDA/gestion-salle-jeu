package gamespace;

import java.util.HashMap;

public class Poste {
    private String namePoste;
    private Integer numPoste;
    private boolean posteAvailable;

/*
Constructor
 */
    public Poste(Integer i ,String nameOfePoste){
        this.numPoste = i;
        this.namePoste = nameOfePoste;
        this.posteAvailable = false;
    }

    /*
        get available poste
     */

    public boolean getPosteAvailable(){return this.posteAvailable;}

    /*
    Show all infos about poste
    */
    public void showPoste(){
        System.out.println("Poste : "+this.numPoste+" : "+this.namePoste);
    }

    /*
    getters and setters
     */
    public Integer getNumPoste(){return this.numPoste;}
    public String getNamePoste(){return this.namePoste;}

    public void setPosteAvailable(){this.posteAvailable = true ;}
}
