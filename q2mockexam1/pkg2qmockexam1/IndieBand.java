package pkg2qmockexam1;

import java.util.*;

public class IndieBand extends Band implements SelfPromoting {
    private String origin;

    public IndieBand(String s, int p, String o){
        super(s, p);
        origin = o;
    }
    public void reserve(Venue v){
        if(v.checkAvailability()){
            v.reserve();
            selectedVenue = v;
        }
    }
    
    @Override
    public void perform(){
        if(selectedVenue != null){
            selectedVenue.hostEvent();
            selectedVenue = null;
            
            if(selectedVenue.getName() == origin) {
                popularity += 10;
            }
            else {
                popularity += 5;
            }
            
            performances++;
        }
    }
    
    public void advertise(){
        popularity += Math.round(performances/10);
        
    }
}
