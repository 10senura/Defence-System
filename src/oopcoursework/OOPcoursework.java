
package oopcoursework;
import OBS.Observer;
 
public class OOPcoursework{
   
    public static void main(String[] args){
        
        Observer observer =new Observer();
        MainController mainController = new MainController(observer);
        mainController.setVisible(true);
        observer.add(new Tank(mainController));
        observer.add(new Helicopter(mainController));
        observer.add(new Submarine(mainController));
        }
}

