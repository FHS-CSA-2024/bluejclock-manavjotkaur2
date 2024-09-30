package src.main.java;


public class ClockDisplaySeconds
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    
    public ClockDisplaySeconds() {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        this.seconds = new NumberDisplay(60);
    }
    
    public ClockDisplaySeconds(int hour, int minute, int second){
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        this.seconds = new NumberDisplay(60);
        setTime(hour,minute,second);
    }
    
    public void setTime(int hour, int minute, int second){
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
        this.seconds.setValue(second);
    }
    
    public String getTime() {
        return hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue();
    }
    
    public void timeTick() {
        seconds.increments();
        if(seconds.getValue()==0){
            minutes.increments();
            if(minutes.getValue() == 0){
                hours.increments();
            }
        }
    }
}
