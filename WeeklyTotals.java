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

    public double calculateAveragePointsPerPlayer(double averagePoints) {
        double pointsPerPlayer = averagePoints/9;
        return pointsPerPlayer;
    }

    public static void main(String[] args ) {
        WeeklyTotals weeklyData6 = new WeeklyTotals(6, 139.83, 133.34, 108.45, 142.83, 129.24, 107.85);
        WeeklyTotals weeklyData5 = new WeeklyTotals(5, 154.97, 127.50, 115.43, 151.07, 147.16, 150.08);
        WeeklyTotals weeklyData4 = new WeeklyTotals(4, 112.57, 117.51, 148.91, 105.77, 118.82, 108.78);
        WeeklyTotals weeklyData3 = new WeeklyTotals(3, 135.31, 144.98, 158.26, 120.81, 134.68, 128.04);
        WeeklyTotals weeklyData2 = new WeeklyTotals(2, 108.12, 142.30, 134.62, 124.86, 95.97, 126.22);
        WeeklyTotals weeklyData1 = new WeeklyTotals(1, 118.47, 136.89, 122.52, 159.17, 112.29, 136.07);

        double weekSix = weeklyData6.calculateAverageWinpoints();
        double weekFive = weeklyData5.calculateAverageWinpoints();
        double weekFour = weeklyData4.calculateAverageWinpoints();
        double weekThree = weeklyData3.calculateAverageWinpoints();
        double weekTwo = weeklyData2.calculateAverageWinpoints();
        double weekOne = weeklyData1.calculateAverageWinpoints();
        double pointsPerPlayerWeekOne = weeklyData1.calculateAveragePointsPerPlayer(weekOne);
        double pointsPerPlayerWeekTwo = weeklyData2.calculateAveragePointsPerPlayer(weekTwo);
        double pointsPerPlayerWeekThree = weeklyData3.calculateAveragePointsPerPlayer(weekThree);
        double pointsPerPlayerWeekFour = weeklyData4.calculateAveragePointsPerPlayer(weekFour);
        double pointsPerPlayerWeekFive = weeklyData5.calculateAveragePointsPerPlayer(weekFive);
        double pointsPerPlayerWeekSix = weeklyData6.calculateAveragePointsPerPlayer(weekSix);

        System.out.println("Week 6 average points to win");
        System.out.println(weekSix);
        System.out.println("Week 6 average points scored per player");
        System.out.println(pointsPerPlayerWeekSix);
        System.out.println("Week 5 average points to win");
        System.out.println(weekFive);
        System.out.println("Week 5 average points scored per player");
        System.out.println(pointsPerPlayerWeekFive);
        System.out.println("Week 4 average points to win");
        System.out.println(weekFour);
        System.out.println("Week 4 average points scored per player");
        System.out.println(pointsPerPlayerWeekFour);
        System.out.println("Week 3 average points to win");
        System.out.println(weekThree);
        System.out.println("Week 3 average points scored per player");
        System.out.println(pointsPerPlayerWeekThree);
        System.out.println("Week 2 average points to win");
        System.out.println(weekTwo);
        System.out.println("Week 2 average points scored per player");
        System.out.println(pointsPerPlayerWeekTwo);
        System.out.println("Week 1 average points to win");
        System.out.println(weekOne);
        System.out.println("Week 1 average points scored per player");
        System.out.println(pointsPerPlayerWeekOne);

        double weeklyAverage = (weekSix + weekFive + weekFour + weekThree + weekTwo + weekOne) /6;
        double weeklyAveragePointsPerPlayer = (pointsPerPlayerWeekSix + pointsPerPlayerWeekFive + pointsPerPlayerWeekFour + pointsPerPlayerWeekThree + pointsPerPlayerWeekTwo + pointsPerPlayerWeekOne)/6;
        System.out.println("Average points needed to win for all weeks");
        System.out.println(weeklyAverage);

        System.out.println("Average points scored by each player to win for all weeks");
        System.out.println(weeklyAveragePointsPerPlayer);
    }
}
