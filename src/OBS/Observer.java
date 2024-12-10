package OBS;
import java.util.ArrayList;
import java.util.List;

public class Observer {
    List<Observable> list =new ArrayList<>();
         
    public void add(Observable ob){
        list.add(ob);           
     }
    
    public void changesliderset(int value) {
        list.forEach((t)->{
        t.WarStrength(value);
        });   
    }

    public void AreaChangecleared(boolean selected) {
        list.forEach((t)->{
        t.areaMsg(selected);
        });
    }

    public void AreaChangecleared(int value) {
        list.forEach((t)->{
        t.WarStrength(value);
        });    
    } 
    
    public void sendMessage(String msg){
        list.forEach((t)->{
         t.SendMsg(msg);
        });
    }
}

   

  
