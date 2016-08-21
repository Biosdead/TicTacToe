/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hekatonkiros
 */
public class BtnListener implements ActionListener {
View view = Main.v;
GameMaster master = Main.GM;
Config cg = Main.CG;
    @Override
    public void actionPerformed(ActionEvent acao) {
        
        if (acao.getSource() == view.getButton1()){
            if (master.turn == false){
            view.getButton1().setText(cg.PlayerOneSymbol);
            master.Game[0] = 1;
            }else if(master.turn == true){
            view.getButton1().setText(cg.PlayerTwoSymbol);
            master.Game[0] = 2;
            }
            view.getButton1().setEnabled(false);
        }
        if (acao.getSource() == view.getButton2()) {
            if (master.turn == false){
            view.getButton2().setText(cg.PlayerOneSymbol);
            master.Game[1] = 1;
            }else if(master.turn == true){
            view.getButton2().setText(cg.PlayerTwoSymbol);
            master.Game[1] = 2;
            }
            view.getButton2().setEnabled(false);
            }
        if (acao.getSource() == view.getButton3()) {
            if (master.turn == false){
            view.getButton3().setText(cg.PlayerOneSymbol);
            master.Game[2] = 1;
            }else if(master.turn == true){
            view.getButton3().setText(cg.PlayerTwoSymbol);
            master.Game[2] = 2;
            }
            view.getButton3().setEnabled(false);
            }
        if (acao.getSource() == view.getButton4()){
            if (master.turn == false){
            view.getButton4().setText(cg.PlayerOneSymbol);
            master.Game[3] = 1;
            }else if(master.turn == true){
            view.getButton4().setText(cg.PlayerTwoSymbol);
            master.Game[3] = 2;
            }
            view.getButton4().setEnabled(false);
        }
        if (acao.getSource() == view.getButton5()) {
            if (master.turn == false){
            view.getButton5().setText(cg.PlayerOneSymbol);
            master.Game[4] = 1;
            }else if(master.turn == true){
            view.getButton5().setText(cg.PlayerTwoSymbol);
            master.Game[4] = 2;
            }
            view.getButton5().setEnabled(false);
            }
        if (acao.getSource() == view.getButton6()) {
            if (master.turn == false){
            view.getButton6().setText(cg.PlayerOneSymbol);
            master.Game[5] = 1;
            }else if(master.turn == true){
            view.getButton6().setText(cg.PlayerTwoSymbol);
            master.Game[5] = 2;
            }
            view.getButton6().setEnabled(false);
            }
        if (acao.getSource() == view.getButton7()){
            if (master.turn == false){
            view.getButton7().setText(cg.PlayerOneSymbol);
            master.Game[6] = 1;
            }else if(master.turn == true){
            view.getButton7().setText(cg.PlayerTwoSymbol);
            master.Game[6] = 2;
            }
            view.getButton7().setEnabled(false);
        }
        if (acao.getSource() == view.getButton8()) {
            if (master.turn == false){
            view.getButton8().setText(cg.PlayerOneSymbol);
            master.Game[7] = 1;
            }else if(master.turn == true){
            view.getButton8().setText(cg.PlayerTwoSymbol);
            master.Game[7] = 2;
            }
            view.getButton8().setEnabled(false);
            }
        if (acao.getSource() == view.getButton9()) {
            if (master.turn == false){
            view.getButton9().setText(cg.PlayerOneSymbol);
            master.Game[8] = 1;
            }else if(master.turn == true){
            view.getButton9().setText(cg.PlayerTwoSymbol);
            master.Game[8] = 2;
            }
            view.getButton9().setEnabled(false);
            }

        master.VerifyVictory();
}
    
}
