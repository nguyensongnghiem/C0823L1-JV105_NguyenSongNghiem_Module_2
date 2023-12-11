package session08;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        final int ZERO = 0;
        final int FIFTEEN = 1;
        final int THIRTY = 2;
        final int FORTY = 3;
        boolean sameScore = player1Score == player2Score;
        boolean hasAdvanced = player1Score >= FORTY || player2Score >= FORTY;
        if (sameScore) {
            switch (player1Score) {
            case ZERO:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
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
                case ZERO:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FORTY:
                    score += "Forty";
                    break;
                }
            }
        }
        return score;
    }
}