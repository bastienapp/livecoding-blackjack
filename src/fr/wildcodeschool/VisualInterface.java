package fr.wildcodeschool;

import java.util.Scanner;

public class VisualInterface {

    public static boolean endGame(boolean playerWins) {
        if (playerWins) {
            System.out.println("GG WP");
        } else {
            System.out.println("You lose !");
        }
        System.out.println("Souhaitez-vous rejouer ? (y/n)");
        Scanner sc = new Scanner(System.in);
        String entry = sc.next();
        return entry.equalsIgnoreCase("y");
    }

    public static boolean playerContinue() {
        System.out.println("Souhaitez-vous piocher une nouvelle carte ? (y/n)");
        Scanner sc = new Scanner(System.in);
        String entry = sc.next();
        return entry.equalsIgnoreCase("y");
    }

    public static void hideCard() {
        System.out.println("Le croupier a tiré une carte face cachée");
    }

    public static void revealCard() {
        System.out.println("Le croupier révèle sa carte face cachée");
    }

    public static void showCard(boolean isPlayer, int card) {
        if (isPlayer) {
            System.out.println("Le croupier a donné une carte au joueur : " + card);
        } else {
            System.out.println("Le croupier a tiré la carte pour lui-même : " + card);
        }
    }

    public static void showScore(boolean isPlayer, int score) {
        if (isPlayer) {
            System.out.println("Le score du joueur est : " + score);
        } else {
            System.out.println("Le score du croupier est : " + score);
        }
    }
}
