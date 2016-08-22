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
    
    //Seleciona o botão que está ameaçando o computador. Ou seja, se o player já tiver dois botões selecionados
    //em uma linha a IA vai selecionar o terceiro botão para impedir o player de ganhar.
    public void SelectToNotLose(){
        if ((Main.GM.Game[0] == 1)&&(Main.GM.Game[1] == 1)&&(Main.GM.Game[2] == 0)) { //inicio da verificação horizontal
            view.getButton3().doClick();
        }else if((Main.GM.Game[0] == 0)&&(Main.GM.Game[1]== 1)&&(Main.GM.Game[2] == 1)){
            view.getButton1().doClick();
        }else if ((Main.GM.Game[3] == 1)&&(Main.GM.Game[4] == 1)&&(Main.GM.Game[5] == 0)) {
            view.getButton6().doClick();
        }else if((Main.GM.Game[3] == 0)&&(Main.GM.Game[4]== 1)&&(Main.GM.Game[5] == 1)){
            view.getButton4().doClick();
        }else if ((Main.GM.Game[6] == 1)&&(Main.GM.Game[7] == 1)&&(Main.GM.Game[8] == 0)) {
            view.getButton9().doClick();
        }else if((Main.GM.Game[0] == 1)&&(Main.GM.Game[1]== 0)&&(Main.GM.Game[2] == 1)){ 
            view.getButton2().doClick();
        }else if((Main.GM.Game[3] == 1)&&(Main.GM.Game[4]== 0)&&(Main.GM.Game[5] == 1)){ 
            view.getButton5().doClick();
        }else if((Main.GM.Game[6] == 1)&&(Main.GM.Game[7]== 0)&&(Main.GM.Game[8] == 1)){ 
            view.getButton8().doClick();
        }else if((Main.GM.Game[6] == 0)&&(Main.GM.Game[7]== 1)&&(Main.GM.Game[8] == 1)){ // fim da verificação horizontal
            view.getButton7().doClick();
        }else if((Main.GM.Game[0] == 0)&&(Main.GM.Game[3]== 1)&&(Main.GM.Game[6] == 1)){ //inicio da verificação vertical
            view.getButton1().doClick();
        }else if ((Main.GM.Game[0] == 1)&&(Main.GM.Game[3] == 1)&&(Main.GM.Game[6] == 0)) {
            view.getButton7().doClick();
        }else if((Main.GM.Game[1] == 1)&&(Main.GM.Game[4]== 1)&&(Main.GM.Game[7] == 0)){
            view.getButton8().doClick();
        }else if ((Main.GM.Game[1] == 0)&&(Main.GM.Game[4] == 1)&&(Main.GM.Game[7] == 1)) {
            view.getButton2().doClick();
        }else if ((Main.GM.Game[2] == 0)&&(Main.GM.Game[5] == 1)&&(Main.GM.Game[8] == 1)) {
            view.getButton3().doClick();
        }else if ((Main.GM.Game[0] == 1)&&(Main.GM.Game[3] == 0)&&(Main.GM.Game[6] == 1)) {
            view.getButton4().doClick();
        }else if ((Main.GM.Game[1] == 1)&&(Main.GM.Game[4] == 0)&&(Main.GM.Game[7] == 1)) {
            view.getButton5().doClick();
        }else if ((Main.GM.Game[2] == 1)&&(Main.GM.Game[5] == 0)&&(Main.GM.Game[8] == 1)) {
            view.getButton6().doClick();
        }else if((Main.GM.Game[8] == 0)&&(Main.GM.Game[5]== 1)&&(Main.GM.Game[2] == 1)){ // fim da verifição vertical
            view.getButton9().doClick();
        }else if ((Main.GM.Game[0] == 1)&&(Main.GM.Game[4] == 1)&&(Main.GM.Game[8] == 0)) { // inicio da verificação diagonal
            view.getButton9().doClick();
        }else if((Main.GM.Game[0] == 0)&&(Main.GM.Game[4]== 1)&&(Main.GM.Game[8] == 1)){
            view.getButton1().doClick();
        }else if ((Main.GM.Game[2] == 1)&&(Main.GM.Game[4] == 1)&&(Main.GM.Game[6] == 0)) {
            view.getButton7().doClick();
        }else if ((Main.GM.Game[0] == 1)&&(Main.GM.Game[4] == 0)&&(Main.GM.Game[8] == 1)) {
            view.getButton5().doClick();
        }else if ((Main.GM.Game[2] == 1)&&(Main.GM.Game[4] == 0)&&(Main.GM.Game[6] == 1)) {
            view.getButton5().doClick();
        }else if((Main.GM.Game[2] == 0)&&(Main.GM.Game[4]== 1)&&(Main.GM.Game[6] == 1)){ // fim da verificação diagonal
            view.getButton3().doClick();
        }else
            RandomSelect();
    }
    
    public void SelectToWin(){
        if ((Main.GM.Game[0] == 2)&&(Main.GM.Game[1] == 2)&&(Main.GM.Game[2] == 0)) { //inicio da verificação horizontal
            view.getButton3().doClick();
        }else if((Main.GM.Game[0] == 0)&&(Main.GM.Game[1]== 2)&&(Main.GM.Game[2] == 2)){
            view.getButton1().doClick();
        }else if ((Main.GM.Game[3] == 2)&&(Main.GM.Game[4] == 2)&&(Main.GM.Game[5] == 0)) {
            view.getButton6().doClick();
        }else if((Main.GM.Game[3] == 0)&&(Main.GM.Game[4]== 2)&&(Main.GM.Game[5] == 2)){
            view.getButton4().doClick();
        }else if ((Main.GM.Game[6] == 2)&&(Main.GM.Game[7] == 2)&&(Main.GM.Game[8] == 0)) {
            view.getButton9().doClick();
        }else if ((Main.GM.Game[0] == 2)&&(Main.GM.Game[1] == 0)&&(Main.GM.Game[2] == 2)) {
            view.getButton2().doClick();
        }else if ((Main.GM.Game[3] == 2)&&(Main.GM.Game[4] == 0)&&(Main.GM.Game[5] == 2)) {
            view.getButton5().doClick();
        }else if ((Main.GM.Game[6] == 2)&&(Main.GM.Game[7] == 0)&&(Main.GM.Game[8] == 2)) {
            view.getButton8().doClick();
        }else if((Main.GM.Game[6] == 0)&&(Main.GM.Game[7]== 2)&&(Main.GM.Game[8] == 2)){ // fim da verificação horizontal
            view.getButton7().doClick();
        }else if((Main.GM.Game[0] == 0)&&(Main.GM.Game[3]== 2)&&(Main.GM.Game[6] == 2)){ //inicio da verificação vertical
            view.getButton1().doClick();
        }else if ((Main.GM.Game[0] == 2)&&(Main.GM.Game[3] == 2)&&(Main.GM.Game[6] == 0)) {
            view.getButton7().doClick();
        }else if((Main.GM.Game[1] == 2)&&(Main.GM.Game[4]== 2)&&(Main.GM.Game[7] == 0)){
            view.getButton8().doClick();
        }else if ((Main.GM.Game[1] == 0)&&(Main.GM.Game[4] == 2)&&(Main.GM.Game[7] == 2)) {
            view.getButton2().doClick();
        }else if ((Main.GM.Game[2] == 0)&&(Main.GM.Game[5] == 2)&&(Main.GM.Game[8] == 2)) {
            view.getButton3().doClick();
        }else if ((Main.GM.Game[0] == 2)&&(Main.GM.Game[3] == 0)&&(Main.GM.Game[6] == 2)) {
            view.getButton3().doClick();
        }else if ((Main.GM.Game[1] == 2)&&(Main.GM.Game[4] == 0)&&(Main.GM.Game[7] == 2)) {
            view.getButton5().doClick();
        }else if ((Main.GM.Game[2] == 2)&&(Main.GM.Game[5] == 0)&&(Main.GM.Game[8] == 2)) {
            view.getButton6().doClick();
        }else if((Main.GM.Game[8] == 0)&&(Main.GM.Game[5]== 2)&&(Main.GM.Game[2] == 2)){ // fim da verifição vertical
            view.getButton9().doClick();
        }else if ((Main.GM.Game[0] == 2)&&(Main.GM.Game[4] == 2)&&(Main.GM.Game[8] == 0)) { // inicio da verificação diagonal
            view.getButton9().doClick();
        }else if((Main.GM.Game[0] == 0)&&(Main.GM.Game[4]== 2)&&(Main.GM.Game[8] == 2)){
            view.getButton1().doClick();
        }else if ((Main.GM.Game[2] == 2)&&(Main.GM.Game[4] == 2)&&(Main.GM.Game[6] == 0)) {
            view.getButton7().doClick();
        }else if ((Main.GM.Game[2] == 2)&&(Main.GM.Game[4] == 0)&&(Main.GM.Game[6] == 2)) {
            view.getButton5().doClick();
        }else if ((Main.GM.Game[2] == 2)&&(Main.GM.Game[4] == 0)&&(Main.GM.Game[6] == 2)) {
            view.getButton5().doClick();
        }else if((Main.GM.Game[2] == 0)&&(Main.GM.Game[4]== 2)&&(Main.GM.Game[6] == 2)){ // fim da verificação diagonal
            view.getButton3().doClick();
        }else
            SelectToNotLose();
    }
 }
