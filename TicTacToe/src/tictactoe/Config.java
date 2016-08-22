/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Lennon S Furtado classe de configuração para os atributos do jogo
 */
public class Config {

    String PlayerOneSymbol;
    String PlayerTwoSymbol;
    boolean PlayerTwoHuman = false;

    public Config() {
        PlayerOneSymbol = "O"; //Simbolo do player 1
        PlayerTwoSymbol = "X";
        PlayerTwoHuman = false;
    }

    public void TurnOnAI(boolean Humano) { // Liga/Desliga a IA do jogo
        PlayerTwoHuman = !Humano;
    }

    public boolean GetPlayerTwo() { // retorna se a IA está ativada ou não
        return PlayerTwoHuman;
    }
}
