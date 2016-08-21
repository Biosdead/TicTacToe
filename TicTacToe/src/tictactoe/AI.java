/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Hekatonkiros
 * Classe da inteligência artificial do segundo player.
 * 
 */
public class AI {
    View view =  Main.v;
    Random rd;
    
    public AI(){
    rd = new Random();
    }
    
    public void RandomSelect(){
    while(true){
    int temp = rd.nextInt(9);
    if (Main.GM.Game[temp] == 0) {
            switch(temp){
                case 0:
                    view.getButton1().doClick();
                    break;
                case 1:
                    view.getButton2().doClick();
                    break;
                case 2:
                    view.getButton3().doClick();
                    break;
                case 3:
                    view.getButton4().doClick();
                    break;
                case 4:
                    view.getButton5().doClick();
                    break;
                case 5:
                    view.getButton6().doClick();
                    break;
                case 6:
                    view.getButton7().doClick();
                    break;
                case 7:
                    view.getButton8().doClick();
                    break;
                case 8:
                    view.getButton9().doClick();
                    break;
                }
            break;   
        }
        }
    }
 }
