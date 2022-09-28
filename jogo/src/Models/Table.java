/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * @author Andrey
 */
public class Table {

    private Player player1;
    private Player player2;
    private Shape currentPlayer = Shape.Cross;

    public Table(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // Função que verifica se o jogador atual pode jogar na posição
    private boolean canTouch(JButton button) {
        return button.getToolTipText().equals("Empty");
    }

    // Função que verifica se o jogador atual ganhou
    public String matchCheck(JButton firstButton, JButton firstButton2, JButton firstButton3, JButton secondButton,
            JButton secondButton2, JButton secondButton3, JButton thirdButton, JButton thirdButton2,
            JButton thirdButton3, JLabel text) {
        if (firstButton.getToolTipText() == "Has a Cross Here" && firstButton2.getToolTipText() == "Has a Cross Here"
                && firstButton3.getToolTipText() == "Has a Cross Here") {
            text.setText(player1.getName() + " é o ganhador!");
            return player1.getName() + " é o ganhador!";
        } else if (secondButton.getToolTipText() == "Has a Cross Here"
                && secondButton2.getToolTipText() == "Has a Cross Here"
                && secondButton3.getToolTipText() == "Has a Cross Here") {
            text.setText(player1.getName() + " é o ganhador!");
            return player1.getName() + " é o ganhador!";
        } else if (thirdButton.getToolTipText() == "Has a Cross Here"
                && thirdButton2.getToolTipText() == "Has a Cross Here"
                && thirdButton3.getToolTipText() == "Has a Cross Here") {
            text.setText(player1.getName() + " é o ganhador!");
            return player1.getName() + " é o ganhador!";
        } else if (firstButton.getToolTipText() == "Has a Cross Here"
                && secondButton2.getToolTipText() == "Has a Cross Here"
                && thirdButton3.getToolTipText() == "Has a Cross Here") {
            text.setText(player1.getName() + " é o ganhador!");
            return player1.getName() + " é o ganhador!";
        } else if (firstButton3.getToolTipText() == "Has a Cross Here"
                && secondButton2.getToolTipText() == "Has a Cross Here"
                && thirdButton.getToolTipText() == "Has a Cross Here") {
            text.setText(player1.getName() + " é o ganhador!");
            return player1.getName() + " é o ganhador!";
        } else if (firstButton.getToolTipText() == "Has a Cross Here"
                && secondButton.getToolTipText() == "Has a Cross Here"
                && thirdButton.getToolTipText() == "Has a Cross Here") {
            text.setText(player1.getName() + " é o ganhador!");
            return player1.getName() + " é o ganhador!";
        } else if (firstButton2.getToolTipText() == "Has a Cross Here"
                && secondButton2.getToolTipText() == "Has a Cross Here"
                && thirdButton2.getToolTipText() == "Has a Cross Here") {
            text.setText(player1.getName() + " é o ganhador!");
            return player1.getName() + " é o ganhador!";
        } else if (firstButton3.getToolTipText() == "Has a Cross Here"
                && secondButton3.getToolTipText() == "Has a Cross Here"
                && thirdButton3.getToolTipText() == "Has a Cross Here") {
            text.setText(player1.getName() + " é o ganhador!");
            return player1.getName() + " é o ganhador!";
        } else if (secondButton.getToolTipText() == "Has a Circle Here"
                && secondButton2.getToolTipText() == "Has a Circle Here"
                && secondButton3.getToolTipText() == "Has a Circle Here") {
            text.setText(player2.getName() + " é o ganhador!");
            return player2.getName() + " é o ganhador!";
        } else if (thirdButton.getToolTipText() == "Has a Circle Here"
                && thirdButton2.getToolTipText() == "Has a Circle Here"
                && thirdButton3.getToolTipText() == "Has a Circle Here") {
            text.setText(player2.getName() + " é o ganhador!");
            return player2.getName() + " é o ganhador!";
        } else if (firstButton.getToolTipText() == "Has a Circle Here"
                && secondButton2.getToolTipText() == "Has a Circle Here"
                && thirdButton3.getToolTipText() == "Has a Circle Here") {
            text.setText(player2.getName() + " é o ganhador!");
            return player2.getName() + " é o ganhador!";
        } else if (firstButton3.getToolTipText() == "Has a Circle Here"
                && secondButton2.getToolTipText() == "Has a Circle Here"
                && thirdButton.getToolTipText() == "Has a Circle Here") {
            text.setText(player2.getName() + " é o ganhador!");
            return player2.getName() + " é o ganhador!";
        } else if (firstButton.getToolTipText() == "Has a Circle Here"
                && secondButton.getToolTipText() == "Has a Circle Here"
                && thirdButton.getToolTipText() == "Has a Circle Here") {
            text.setText(player2.getName() + " é o ganhador!");
            return player2.getName() + " é o ganhador!";
        } else if (firstButton2.getToolTipText() == "Has a Circle Here"
                && secondButton2.getToolTipText() == "Has a Circle Here"
                && thirdButton2.getToolTipText() == "Has a Circle Here") {
            text.setText(player2.getName() + " é o ganhador!");
            return player2.getName() + " é o ganhador!";
        } else if (firstButton3.getToolTipText() == "Has a Circle Here"
                && secondButton3.getToolTipText() == "Has a Circle Here"
                && thirdButton3.getToolTipText() == "Has a Circle Here") {
            text.setText(player2.getName() + " é o ganhador!");
            return player2.getName() + " é o ganhador!";
        } else if (firstButton.getToolTipText() == "Has a Circle Here"
                && firstButton2.getToolTipText() == "Has a Circle Here"
                && firstButton3.getToolTipText() == "Has a Circle Here") {
            text.setText(player2.getName() + " é o ganhador!");
            return player2.getName() + " é o ganhador!";
        } else if (!firstButton.isEnabled() && !firstButton2.isEnabled() && !firstButton3.isEnabled()
                && !secondButton.isEnabled() && !secondButton2.isEnabled() && !secondButton3.isEnabled()
                && !thirdButton.isEnabled() && !thirdButton2.isEnabled() && !thirdButton3.isEnabled()) {
            text.setText("Deu Velha!");
            return "Deu Velha!";
        }
        return "Jogo continua!";
    }

    // Função que faz a troca de jogadores
    private void nextTurn() {
        currentPlayer = (currentPlayer == Shape.Circle) ? Shape.Cross : Shape.Circle;
    }

    // Função que checa quem é o jogador atual
    public void checkTurn(JLabel turnText) {
        if (currentPlayer == Shape.Cross) {
            turnText.setText("Vez de " + player1.getName());
        } else {
            turnText.setText("Vez de " + player2.getName());
        }
    }

    // Função que faz a jogada
    public void makePlay(JButton button, JLabel turnText) {
        if (canTouch(button)) {
            if (currentPlayer == Shape.Cross) {
                Icon icone = new ImageIcon(getClass().getResource("../Assets/cross_100x100.png"));
                button.setIcon(icone);
                button.setEnabled(false);
                button.setToolTipText("Has a Cross Here");
            } else if (currentPlayer == Shape.Circle) {
                Icon icone = new ImageIcon(getClass().getResource("../Assets/circle_100x100.png"));
                button.setIcon(icone);
                button.setEnabled(false);
                button.setToolTipText("Has a Circle Here");
            }
            nextTurn();
            checkTurn(turnText);
        }
    }

    @Override
    public String toString() {
        return "Nome do Player 1: " + player1.getName()
                + " | Shape: " + player1.getShape()
                + "\nNome do Player 2: " + player2.getName()
                + " | Shape: " + player2.getShape();
    }

}
