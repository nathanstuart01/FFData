// make a class that breaks down the the weekly matchup
// gathers winning points/ losing points
//gets points by position
//eventually use this data to see which positions are producing most points
// make this weekly class into a yearly class and a other stuff
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
        
        //resume here:
        //https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html
        // do i want to do anythign with win total here, or just simply get it, which then it should be a class attribute
        // add all win points together per week and divide by total games
    }

    public static void main(String[] args ) {
        WeeklyTotals weeklyData = new WeeklyTotals(6, 139.83, 133.34, 108.45, 142.83, 129.24, 107.85);
        System.out.println(weeklyData.calculateAverageWinpoints());
    }
}
