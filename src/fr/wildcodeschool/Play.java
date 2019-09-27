package fr.wildcodeschool;

import java.util.Random;

import static fr.wildcodeschool.VisualInterface.*;

public class Play {

    public static void main(String[] args) {
        while (game()) ;
    }

    public static boolean game() {
        int scorePlayer = 0;
        int scoreDealer = 0;

        for (int i = 0; i < 2; i++) {
            scorePlayer = getNewScore(scorePlayer, true);
        }
        scoreDealer = getNewScore(scoreDealer, false);

        hideCard();

        while (scorePlayer < 21 && playerContinue()) {
            scorePlayer = getNewScore(scorePlayer, true);
        }

        if (scorePlayer <= 21) {
            revealCard();
            // TODO : réléver correctement la carte du croupier
            scoreDealer = getNewScore(scoreDealer, false);

            while (scoreDealer < 17) {
                scoreDealer = getNewScore(scoreDealer, false);
            }
        } else {
            return endGame(false);
        }

        if (scoreDealer > 21 || scorePlayer > scoreDealer) {
            return endGame(true);
        }
        return endGame(false);
    }

    public static int getNewScore(int score, boolean isPlayer) {
        int currentCard = giveCard();
        showCard(isPlayer, currentCard);
        score += currentCard;
        showScore(isPlayer, score);

        return score;
    }

    public static int giveCard() {
        int card = new Random().nextInt(10) + 1;
        // TODO : traiter le cas du 10 pour les figures
        // TODO : traiter le cas de l'as

        return card;
    }
}
