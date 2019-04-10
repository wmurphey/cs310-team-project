
package cs310.team.project;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.MINUTES;

public class Shift {
   
    private int id;
    private String description;
    private LocalTime start;
    private LocalTime stop;
    private int interval;
    private int graceperiod;
    private int dock;
    private int numOfDaysInShift;

    private LocalTime lunchstart;
    private LocalTime lunchstop;

    private int lunchdeduct;
    
    public Shift () {
        
       id = interval = graceperiod = dock = lunchdeduct = 0;
       description = "";
       
       start = LocalTime.now();
       stop = LocalTime.now();
       
       lunchstart = LocalTime.now();
       lunchstop = LocalTime.now();
    }
    public Shift(LocalTime st, LocalTime sto, int shiftid, LocalTime lunch_start, LocalTime lunch_stop){
        this.start = st;
        this.stop = sto;
        this.id = shiftid;
        this.lunchstart = lunch_start;
        this.lunchstop = lunch_stop;
        if(shiftid == 1 || shiftid == 2 || shiftid == 3 || shiftid == 4)
            this.numOfDaysInShift = 5;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getStop() {
        return stop;
    }

    public LocalTime getLunchstart() {
        return lunchstart;
    }

    public LocalTime getLunchstop() {
        return lunchstop;
    }
    
    public void setShiftStart(int hour, int minute) {
        
        start = LocalTime.of(hour, minute, 0);
        
    }
    
    // implement setShiftStop, setLunchStart, and setLunchStop here (follow the pattern shown above)
    
    public int getShiftLength() {
        int shiftLengthInMinutes = 0;

        
        shiftLengthInMinutes =  (int) (MINUTES.between(start, stop) - MINUTES.between(lunchstart, lunchstop));
        
       return shiftLengthInMinutes; 
    }
    
    public int getShiftStartHour() {
        return (start.getHour());
    }
    
    public int getShiftStartMinute() {
        return (start.getMinute());
    }
    
    // Follow the pattern shown above to provide getters for the hours/minutes for the other LocalTime fields
    
    public void setShiftStop(int hour, int minute) {
        
        stop = LocalTime.of(hour, minute, 0);
        
        
    }
    
    public int getShiftStopHour() {
        return (stop.getHour());
    }
    
    public int getShiftStopMinute() {
        return (stop.getMinute());
    }
    
    public void setShiftLunchStart(int hour, int minute) {
        
        lunchstart = LocalTime.of(hour, minute, 0);
        
    }
    
    public int getShiftLunchStartHour() {
        return (lunchstart.getHour());
    }
    
    public int getShiftLunchStartMinute() {
        return (lunchstart.getMinute());
    }
    
    public void setShiftLunchStop(int hour, int minute) {
        
        lunchstop = LocalTime.of(hour, minute, 0);
        
    }
    
    public int getShiftLunchStopHour() {
        return (lunchstop.getHour());
    }
    
    public int getShiftLunchStopMinute() {
        return (lunchstop.getMinute());
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getGraceperiod() {
        return graceperiod;
    }

    public void setGraceperiod(int graceperiod) {
        this.graceperiod = graceperiod;
    }

    public int getDock() {
        return dock;
    }

    public void setDock(int dock) {
        this.dock = dock;
    }

    public int getLunchdeduct() {
        return lunchdeduct;
    }

    public void setLunchdeduct(int lunchdeduct) {
        this.lunchdeduct = lunchdeduct;
    }

    @Override
    public String toString() {
        return "" + description + ": " + start + " - " + stop + " (" + MINUTES.between(start, stop) + " minutes); Lunch: " + lunchstart + " - " + lunchstop + " (" + MINUTES.between(lunchstart, lunchstop) + " minutes)";
    }


    public int getNumOfDaysInShift(){

        return this.numOfDaysInShift;
    }
     
}