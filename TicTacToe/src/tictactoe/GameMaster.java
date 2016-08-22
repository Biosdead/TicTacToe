/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hekatonkiros
 * Classe responsavel por verificar quem ganhou a partida.
 * E por determinar os turnos de cada jogador
 * E por escrever os scores nas labels /Player, Ties, Computer.
 * E por resetar o Jogo
 */
public class GameMaster {
    
    boolean turn;
    int countTurn;
    int[] Game;
    int contPlayer1, contPlayer2, contTies; // Contador para saber quantas vezes cada um ganhou
    View view = Main.v;
    AI ai;
    
    public GameMaster() {
    countTurn = 0;    
    Game = new int[9];
    Arrays.fill(Game, 0);
    turn = false;
    contPlayer1 = 0; contPlayer2 = 0; contTies = 0;
    ai = new AI();
    }
    
    /*Verifica a vitoria do player 1 ou do player 2 ou o empate*/
    public void VerifyVictory(){
        //Inicio Espaço de vitória do player 1
        if ((Game[0] == 1)&&(Game[1] == 1)&&(Game[2]== 1)) {
            WriteScore(0);
        }else if ((Game[3] == 1)&&(Game[4] == 1)&&(Game[5]== 1)) {
            WriteScore(0);
        }else if ((Game[6] == 1)&&(Game[7] == 1)&&(Game[8]== 1)) {
            WriteScore(0);
        }else if ((Game[0] == 1)&&(Game[3] == 1)&&(Game[6]== 1)) {
            WriteScore(0);
        }else if ((Game[1] == 1)&&(Game[4] == 1)&&(Game[7]== 1)) {
            WriteScore(0);
        }else if ((Game[2] == 1)&&(Game[5] == 1)&&(Game[8]== 1)) {
            WriteScore(0);
        }else if ((Game[0] == 1)&&(Game[4] == 1)&&(Game[8]== 1)) {
            WriteScore(0);
        }else if ((Game[6] == 1)&&(Game[4] == 1)&&(Game[2]== 1)) {
            WriteScore(0);
        }else if(countTurn == 9) // Aqui se ninguem ganhar empata
            WriteScore(2);
        // Fim do espaço de Vitória do player 1
        
        //Inicio do espaço de vitória do player 2
        if ((Game[0] == 2)&&(Game[1] == 2)&&(Game[2]== 2)) {
            WriteScore(1);
        }else if ((Game[3] == 2)&&(Game[4] == 2)&&(Game[5]== 2)) {
            WriteScore(1);
        }else if ((Game[6] == 2)&&(Game[7] == 2)&&(Game[8]== 2)) {
            WriteScore(1);
        }else if ((Game[0] == 2)&&(Game[3] == 2)&&(Game[6]== 2)) {
            WriteScore(1);
        }else if ((Game[1] == 2)&&(Game[4] == 2)&&(Game[7]== 2)) {
            WriteScore(1);
        }else if ((Game[2] == 2)&&(Game[5] == 2)&&(Game[8]== 2)) {
            WriteScore(1);
        }else if ((Game[0] == 2)&&(Game[4] == 2)&&(Game[8]== 2)) {
            WriteScore(1);
        }else if ((Game[6] == 2)&&(Game[4] == 2)&&(Game[2]== 2)) {
            WriteScore(1);
        }else if(countTurn == 9) // Aqui se ninguem ganhar empata
            WriteScore(2);
        // Fim do espaço de Vitória do player 2
        
    UpdateTurn();    
    }
    /*Atualiza o turno sempre após uma jogada*/
    public void UpdateTurn(){
        turn = !turn;
        countTurn++;
        if (turn) {
            ai.SelectToWin();
        }
    }
    
    /*Escreve a pontuação das labels player | computer | ties
    Quando a variavel win é igual a 0 o player1 ganhou
    Quando a variavel win é igual a 1 o player2 ganhou
    Quando a variavel win é igual a 2 o ties ganhou
    */
    public void WriteScore(int win){
        
        if (win == 0) {
            contPlayer1++;
            view.getLblPlayer1().setText(""+contPlayer1);
        }else if(win == 1){
            contPlayer2++;
            view.getLblPlayer2().setText(""+contPlayer2);
        }else if (win == 2){
            contTies++;
            view.getLblTies().setText(""+contTies);
        }       
        
        //timer antes de resetar
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(GameMaster.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fim do Timer
        
        ResetGame();
    }
    public void ResetGame(){
    Arrays.fill(Game, 0); // preenche o vetor do game com zeros
    countTurn = 0;
    view.getButton1().setText("");
    view.getButton1().setEnabled(true);
    view.getButton2().setText("");
    view.getButton2().setEnabled(true);
    view.getButton3().setText("");
    view.getButton3().setEnabled(true);
    view.getButton4().setText("");
    view.getButton4().setEnabled(true);
    view.getButton5().setText("");
    view.getButton5().setEnabled(true);
    view.getButton6().setText("");
    view.getButton6().setEnabled(true);
    view.getButton7().setText("");
    view.getButton7().setEnabled(true);
    view.getButton8().setText("");
    view.getButton8().setEnabled(true);
    view.getButton9().setText("");
    view.getButton9().setEnabled(true);
    }
    
}
