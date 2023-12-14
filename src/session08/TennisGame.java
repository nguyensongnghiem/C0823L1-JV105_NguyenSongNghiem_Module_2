package session08;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;

        String[] scoreStrings = { "Love", "Fifteen", "Thirty", "Forty" };
        boolean sameScore = player1Score == player2Score;
        boolean hasAdvanced = player1Score >= 4 || player2Score >= 4;
        if (sameScore) {
            switch (player1Score) {
            case 0, 1, 2, 3:
                score = scoreStrings[player1Score] + " All";
                break;
            default:
                score = "Deuce";
                break;
            }
        } else if (hasAdvanced) {
            int scoreDiff = player1Score - player2Score;
            if (scoreDiff == 1)
                score = "Advantage " + player1Name;
            else if (scoreDiff == -1)
                score = "Advantage" + player2Name;
            else if (scoreDiff >= 2)
                score = "Win for " + player1Name;
            else
                score = "Win for " + player2Name;
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1)
                    tempScore = player1Score;
                else {
                    score += "-";
                    tempScore = player2Score;
                }
                switch (tempScore) {
                case 0, 1, 2, 3:
                    score = scoreStrings[tempScore];
                    break;
                }
            }
        }
        return score;
    }
}