/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gm1942;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class KeyControl extends KeyAdapter{
    private GameEvents gameEvent;
    public KeyControl(){
        
    }
    public KeyControl(GameEvents gameEvents){
        this.gameEvent=gameEvents;
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
            gameEvent.setValue(e);
    }
    
}

