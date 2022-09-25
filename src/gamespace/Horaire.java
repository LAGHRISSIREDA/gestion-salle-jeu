package gamespace;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Horaire {
    private LocalDateTime timeOfStart ;
    private LocalDateTime timeOfEnd;
    private Duration diffDate;

    public Horaire(int n){
        this.timeOfStart =LocalDateTime.now();
        this.timeOfEnd =LocalDateTime.now().plusMinutes(n);
    }

    public void showTime(){
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = this.timeOfStart.format(myFormatObj);
        System.out.println(formattedDate);
    }

    /*
    getters and setters
     */
    public String getTimeOfStart(){
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = this.timeOfStart.format(myFormatObj);
        return formattedDate;
    }

    public String getTimeOfEnd(){
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = this.timeOfEnd.format(myFormatObj);
        return formattedDate;
    }

    public void getDiffDate(){
        this.diffDate = Duration.between(this.timeOfStart,this.timeOfEnd);
        System.out.println("Minutes .............. : " + this.diffDate.toMinutes() +" minutes Vous reste !!!");
    }
}

