import java.lang.Math;

public class Player {

    String weeklyPosition;
    double teamPoints;
    double overUnder;
    double pointsFavored;

    public Player(String position, double teamPPG, double overUnderLine, double pointsGiven) {
        weeklyPosition = position;
        teamPoints = teamPPG;
        overUnder = overUnderLine;
        pointsFavored = pointsGiven;
    }

    public double impliedTeamPointTotals(double overUnder, double pointsFavored) {
        double impliedPointTotal = overUnder / 2;
        if (pointsFavored > 0) {
            double expectedPoints = impliedPointTotal - pointsFavored;
            return expectedPoints;
        }
        else {
            double expectedPoints = impliedPointTotal - pointsFavored;
            return expectedPoints;
        }
    }

    //method that calculates range of outcomes of opposing defense to one standard deviation

    // put in a stat about touches/catches/percentage of snaps to show scoring potential

    //method that calculates the number of touchdowns this player may score based on their weekly position(rb1, rb2, etc. etc.)
    public double potentialTouchdowns(double teamPPG, String playerPosition) {
        // teamppg is the average points scored by the whole team
        double teamTouchdowns = teamPPG / 6;
        double potentialTDs = 0;

        //weighted average values by position
        double rb1 = 0.25;
        double rb2 = 0.15;
        double wr1 = 0.25;
        double wr2 = 0.15;
        double te = 0.08;
        double qb = 0.02;
        double flex = 0.10;

        switch(playerPosition) {
            case "rb1":
                potentialTDs = teamTouchdowns * rb1;
                break;
            case "rb2":
                potentialTDs = teamTouchdowns * rb2;
                break;
            case "wr1":
                potentialTDs = teamTouchdowns * wr1;
                break;
            case "wr2":
                potentialTDs = teamTouchdowns * wr2;
                break;
            case "te":
                potentialTDs = teamTouchdowns * te;
                break;
            case "qb":
                potentialTDs = teamTouchdowns * qb;
            case "flex":
                potentialTDs = teamTouchdowns * flex;
                break;
        }
        return potentialTDs;
    }

    // make a method that then shows how many td's this player could be expected to score
    public static void main(String[] args) {
        Player robertWoods = new Player("wr2", 26.8, 44.0, -3.5);
        double potentialTDs = robertWoods.potentialTouchdowns(robertWoods.teamPoints, robertWoods.weeklyPosition);
        double impliedPointTotal = robertWoods.impliedTeamPointTotals(robertWoods.overUnder, robertWoods.pointsFavored);
        System.out.println("Robert woods as wr2 potential tds: " + potentialTDs);
        System.out.println("Robert woods implied points: " + impliedPointTotal);

        Player zacPascal = new Player("wr1", 22.8, 44.0, -10.0);
        double potentialTDs2 = zacPascal.potentialTouchdowns(zacPascal.teamPoints, zacPascal.weeklyPosition);
        double impliedPointTotal2 = zacPascal.impliedTeamPointTotals(zacPascal.overUnder, zacPascal.pointsFavored);
        System.out.println("Zac Pascal as wr1 potential tds: " + potentialTDs2);
        System.out.println("Zac Pascal implied points: " + impliedPointTotal2);
    }


} 