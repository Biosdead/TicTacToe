package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lennon S Furtado Classe pertencente ao pacote Controller do padrão
 * MVC Classe que contém toda a lógica de controle, ou seja, a lógica da
 * interação entre o homem e interface gráfica
 */
public class BtnListener implements ActionListener {

    View view = Main.v; // Instância as outras classes do MVC
    GameMaster master = Main.GM;
    Config cg = Main.CG;

    @Override
    public void actionPerformed(ActionEvent acao) { // Verifica quando há um evento ocorrido em algum botão da interface

        if (acao.getSource() == view.getButton1()) { // Ao clicar o botão 1 acontece o código abaixo. O mesmo serve para os outros botões
            if (master.turn == false) { // Se o turno for o do primeiro jogador
                view.getButton1().setText(cg.PlayerOneSymbol); // Seta o simbolo do primeiro jogador no botão 1
                master.Game[0] = 1; // Adiciona o 1 no vetor Game. Mostrando que o primeiro jogador marcou esta posição
            } else if (master.turn == true) { // Se for o segundo jogador
                view.getButton1().setText(cg.PlayerTwoSymbol); // Seta o simbolo do segundo jogador no botão 1
                master.Game[0] = 2; // Adiciona o 2 no vetor Game. Mostrando que o primeiro jogador marcou esta posição
            }
            view.getButton1().setEnabled(false); // Deixa o botão clicado desabilitado para o mesmo não poder ser clicado novamente.
        }
        if (acao.getSource() == view.getButton2()) {
            if (master.turn == false) {
                view.getButton2().setText(cg.PlayerOneSymbol);
                master.Game[1] = 1;
            } else if (master.turn == true) {
                view.getButton2().setText(cg.PlayerTwoSymbol);
                master.Game[1] = 2;
            }
            view.getButton2().setEnabled(false);
        }
        if (acao.getSource() == view.getButton3()) {
            if (master.turn == false) {
                view.getButton3().setText(cg.PlayerOneSymbol);
                master.Game[2] = 1;
            } else if (master.turn == true) {
                view.getButton3().setText(cg.PlayerTwoSymbol);
                master.Game[2] = 2;
            }
            view.getButton3().setEnabled(false);
        }
        if (acao.getSource() == view.getButton4()) {
            if (master.turn == false) {
                view.getButton4().setText(cg.PlayerOneSymbol);
                master.Game[3] = 1;
            } else if (master.turn == true) {
                view.getButton4().setText(cg.PlayerTwoSymbol);
                master.Game[3] = 2;
            }
            view.getButton4().setEnabled(false);
        }
        if (acao.getSource() == view.getButton5()) {
            if (master.turn == false) {
                view.getButton5().setText(cg.PlayerOneSymbol);
                master.Game[4] = 1;
            } else if (master.turn == true) {
                view.getButton5().setText(cg.PlayerTwoSymbol);
                master.Game[4] = 2;
            }
            view.getButton5().setEnabled(false);
        }
        if (acao.getSource() == view.getButton6()) {
            if (master.turn == false) {
                view.getButton6().setText(cg.PlayerOneSymbol);
                master.Game[5] = 1;
            } else if (master.turn == true) {
                view.getButton6().setText(cg.PlayerTwoSymbol);
                master.Game[5] = 2;
            }
            view.getButton6().setEnabled(false);
        }
        if (acao.getSource() == view.getButton7()) {
            if (master.turn == false) {
                view.getButton7().setText(cg.PlayerOneSymbol);
                master.Game[6] = 1;
            } else if (master.turn == true) {
                view.getButton7().setText(cg.PlayerTwoSymbol);
                master.Game[6] = 2;
            }
            view.getButton7().setEnabled(false);
        }
        if (acao.getSource() == view.getButton8()) {
            if (master.turn == false) {
                view.getButton8().setText(cg.PlayerOneSymbol);
                master.Game[7] = 1;
            } else if (master.turn == true) {
                view.getButton8().setText(cg.PlayerTwoSymbol);
                master.Game[7] = 2;
            }
            view.getButton8().setEnabled(false);
        }
        if (acao.getSource() == view.getButton9()) {
            if (master.turn == false) {
                view.getButton9().setText(cg.PlayerOneSymbol);
                master.Game[8] = 1;
            } else if (master.turn == true) {
                view.getButton9().setText(cg.PlayerTwoSymbol);
                master.Game[8] = 2;
            }
            view.getButton9().setEnabled(false);
        }

        master.VerifyVictory(); // Ao final de cada clique de botão pelos players o jogo verifica se houve algum ganhador ou se o jogo empatou
    }

}
