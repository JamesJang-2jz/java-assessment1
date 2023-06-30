package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    public String getWinningMove(String handSign) {
        String win = "";
        switch(handSign){
            case ROCK:
                win = PAPER;
                break;
            case PAPER:
                win = SCISSOR;
                break;
            case SCISSOR:
                win = ROCK;
                break;
        }
        return win;
    }

    public String getLosingMove(String handSign) {
        String lose = "";
        switch(handSign){
            case ROCK:
                lose = SCISSOR;
                break;
            case PAPER:
                lose = ROCK;
                break;
            case SCISSOR:
                lose = PAPER;
                break;
        }
        return lose;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if (getLosingMove(handSignOfPlayer1) == handSignOfPlayer2){
            return handSignOfPlayer1;
        } else {
            return handSignOfPlayer2;
        }
    }
}
