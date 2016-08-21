/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Hekatonkiros
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static View v;
    public static GameMaster GM;
    public static Config CG;
    public static int WidthScreen = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2; 
    public static int HeightScreen =(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2;
    
    public static void main(String[] args) {
        // TODO code application logic here
        v = new View();
        GM = new GameMaster();
        CG = new Config();
        v.setSize(WidthScreen,HeightScreen); // seta a dimensão da tela
        v.AddListenrToAllButtons();
        v.SetLblPlayerOneSymbol();
        v.SetLblPlayerTwoSymbol();
        v.setVisible(true);
        
    }
    
}


//Inteligência artificial 
