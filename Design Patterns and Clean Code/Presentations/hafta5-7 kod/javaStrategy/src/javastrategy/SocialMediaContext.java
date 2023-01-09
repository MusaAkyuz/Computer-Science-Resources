/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastrategy;

/**
 *
 * @author Önder Eyecioğlu
 */
public class SocialMediaContext
{
    ISocialMediaStrategy smStrategy;
    public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy) 
    {
        this.smStrategy = smStrategy;
    } 
    public void connect(String name) 
    {
        smStrategy.connectTo(name);
    }
}
