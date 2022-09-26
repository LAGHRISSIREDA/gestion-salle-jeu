package gamespace;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Poste {
    private String namePoste;
    private Integer numPoste;
    private boolean posteAvailable;

    private String dateEnd ;

/*
Constructor
 */
    public Poste(){}
    public Poste(Integer i ,String nameOfePoste){
        this.numPoste = i;
        this.namePoste = nameOfePoste;
        this.posteAvailable = true;
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

    public void setPosteAvailable(){this.posteAvailable = false ;}
    public void setPosteNonAvailable(){this.posteAvailable = true;}

    //setters of date end occupation of poste
    public void setDateEnd(String l){this.dateEnd = l;}
    public String getDateEnd(){return this.dateEnd;}
}

