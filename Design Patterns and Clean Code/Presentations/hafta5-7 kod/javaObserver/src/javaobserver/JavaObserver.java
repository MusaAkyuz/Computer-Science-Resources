/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaobserver;
//package observer.pattern.demo;
import java.util.*;
/**
 *
 * @author Onder Eyecioglu
 */
class Observer
{
    private int _flag;
    public void update(int m){
        this._flag=m;
        
    }
    public void getFlag(){
        System.out.println("flag value changed in Subject::"+String.valueOf(this._flag));
    }
}
interface ISubject{
    void register(Observer o);
    void unregister( Observer o);
    void notifyObservers();
}
class Subject implements ISubject
{
    List<Observer> observerList = new ArrayList<Observer>();
    private int _flag;
    public int getFlag()
    {
        return _flag;
    }
    public void setFlag(int _flag)
    {
        this._flag=_flag;
        //flag value changed .So notify observer(s)
        notifyObservers();
    }
    @Override
    public void register(Observer o)
    {
        observerList.add(o);
    }
    @Override
    public void unregister(Observer o)
    {
        observerList.remove(o);
    }
    @Override
    public void notifyObservers()
    {
        for(int i=0;i<observerList.size();i++){
            observerList.get(i).update(this._flag);
        }
    }
}

public class JavaObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***Observer Pattern Demo***\n");
        Observer o1 = new Observer();
        Observer o2 = new Observer();
        Subject sub1 = new Subject();
        sub1.register(o1);
        sub1.register(o2);
        System.out.println("Setting Flag = 5 ");
        sub1.setFlag(5);
        o1.getFlag();
        o2.getFlag();
        
        System.out.println("Setting Flag = 25 ");
        sub1.setFlag(25);
        o1.getFlag();
        o2.getFlag();
        
        sub1.unregister(o1);
        //No notification this time to o1 .Since it is unregistered.
        System.out.println("Setting Flag = 50 ");
        sub1.setFlag(50);
        o1.getFlag();
        o2.getFlag();
    }
    
}
