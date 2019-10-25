public class WeeklyTotals {

    public int week;
    public double game1;
    public double game2;
    public double game3;
    public double game4;
    public double game5;
    public double game6;
    public double[] weeklyPointTotals = new double[6];

    public WeeklyTotals(int weekNumber, double firstGame, double secondGame, double thirdGame, double fourthGame, double fifthGame, double sixthGame) {
        week = weekNumber;
        game1 = firstGame;
        game2 = secondGame;
        game3 = thirdGame;
        game4 = fourthGame;
        game5 = fifthGame;
        game6 = sixthGame;
    }
    
    public double calculateAverageWinpoints() {
        double x = 0;
        weeklyPointTotals[0] = game1;
        weeklyPointTotals[1] = game2;
        weeklyPointTotals[2] = game3;
        weeklyPointTotals[3] = game4;
        weeklyPointTotals[4] = game5;
        weeklyPointTotals[5] = game6;
        for (int i = 0; i < weeklyPointTotals.length; i++) {
            x += weeklyPointTotals[i];
        }
        return x/6;
    }

}
