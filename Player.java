import java.lang.Math;

public class Player {

    //method that takes over under line and determines this players teams implied point total
    //static double impliedTeamPointTotals

    //method that calculates range of outcomes of opposing defense to one standard deviation

    //method that takes average points scored per team and divides by six to show how many potetial tds can be scored
    // data source espn.com avg points per game eventually will crawl this
    static double teamTouchdownsScoredPerGame(double teamPPG) {
        double teamTouchdowns = Math.round((teamPPG / 6) * 10.0) / 10.0;
        return teamTouchdowns;
    }

    // make a method that then shows how many td's this player could be expected to score

    public static void main(String[] args) {
        double test = Player.teamTouchdownsScoredPerGame(12);
        System.out.println(test);
    }

} 