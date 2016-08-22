package tictactoe;

import java.awt.Toolkit;

/**
 *
 * @author Lennon S Furtado Tic tac toe
 */
public class Main {

    public static View v;
    public static GameMaster GM;
    public static Config CG;
    public static int WidthScreen = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2; // Pega a largura da tela
    public static int HeightScreen = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2;// pega a altura da tela

    public static void main(String[] args) {
        v = new View();
        GM = new GameMaster();
        CG = new Config();
        CG.TurnOnAI(true); // true faz com que ligue a IA // false desliga IA e outro player jogue no lugar
        v.setSize(WidthScreen, HeightScreen); // seta a dimensão da tela para a métade do tamnho da tela
        v.AddListenrToAllButtons(); // Função necessaria para adicionar o listener nos botões da view
        v.SetLblPlayerOneSymbol(); // Função para setar o Simbolo do player 1 
        v.SetLblPlayerTwoSymbol();
        v.setVisible(true); // Deixa visível a view

    }

}
