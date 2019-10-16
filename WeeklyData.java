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

    public WeeklyTotals(int firstGame, int secondGame, int thirdGame, int fourthGame, int fifthGame, int sixthGame) {
        game1 = firstGame;
        game2 = secondGame;
        game3 = thirdGame;
        game4 = fourthGame;
        game5 = fifthGame;
        game6 = sixthGame;
    }
    
    public double calculateAverageWinpoints() {
        //resume here:
        //https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html
        // do i want to do anythign with win total here, or just simply get it, which then it should be a class attribute
        // add all win points together per week and divide by total games
        return game1;
    }
    public static void main(String[] args ) {
        WeeklyTotals weeklyData = new WeeklyTotals();
        System.out.println(weeklyData.winPoints(100.05));
    }
}
