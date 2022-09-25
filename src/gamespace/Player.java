package gamespace;

import java.util.UUID;


public class Player {
    private String codePlayer;
    private String firstNamePlayer;
    private String lastNamePlayer;


    public Player(){}

    public Player(String fName,String lName){
        this.codePlayer = generateCode();
        this.firstNamePlayer = fName;
        this.lastNamePlayer = lName;
    }

    /*
    getters and setters
     */
    public String getCodePlayer(){return this.codePlayer;}
    public String getFirstNamePlayer(){return this.firstNamePlayer;}
    public String getLastNamePlayer(){return this.lastNamePlayer;}



    /*
    Function to generate Code
     */
    private String generateCode(){
        String uniqueID = UUID.randomUUID().toString();
        String[] parts = uniqueID.split("-");
        return parts[0];
    }
}
