package pkg2qmockexam1;

public abstract class Venue implements SelfPromoting {
    private String name, location;
    private double value;

    public Venue(String s, String l, double v){
        name = s;
        location = l;
        value = v;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public double getValue(){
        return value;
    }
    
    public void advertise(){
        value += 2;
    }
    
    public abstract boolean checkAvailability();
    public abstract void reserve();
    public abstract void hostEvent();
}
