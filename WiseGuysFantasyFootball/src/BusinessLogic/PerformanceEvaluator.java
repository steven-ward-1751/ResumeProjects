/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author Steven
 */
public class PerformanceEvaluator {
    //scoring type: standard or ppr
    private String scoring_type;
    
    public PerformanceEvaluator(String scoring_type){
        this.scoring_type=scoring_type;
    }
    
    public String predictStats(Player player,Team opponent){
        String stat_prediction=player.getName() + " vs " + opponent.getName() + "\n";
        double fantasy_points;
        if(scoring_type.matches("standard")){
            if(player.getPosition().matches("QB")){
                //stats for qbs vs stats for defense and get averages
                double yards;
                double tds;
                double ints;
                double games;
                double rush_yards;
                double rush_tds;
                games = player.getStats().getStat("Gms");
                
                //skew passing averages toward player stats: factor of 3:1 importance
                yards = ((player.getStats().getStat("Yds")/games * 3) + (opponent.getStats().getStat("PassYds")/16)) /4;
                tds = ((player.getStats().getStat("TD")/games * 3) + (opponent.getStats().getStat("PassTD")/16)) /4;
                ints = ((player.getStats().getStat("Int")/games * 3) + (opponent.getStats().getStat("Int")/16)) /4;
                rush_yards = (player.getStats().getStat("RushYds")/games);
                rush_tds = (player.getStats().getStat("RushTD")/games);
                
                //calculate for standard
                fantasy_points = ((yards/25) + (tds*4) - (ints*2) + (rush_yards/10) + (rush_tds*6));
                stat_prediction += Double.toString(fantasy_points) + " points";
            }
            if(player.getPosition().matches("RB")){
                //stats for rbs vs stats for defense and get averages
                double yards;
                double tds;
                double games;
                double rec_yards;
                double rec_tds;
                double fumbles;
                games = player.getStats().getStat("Gms");
                
                //skew rushing averages toward player stats: factor of 3:1 importance
                yards = ((player.getStats().getStat("Yds")/games * 3) + (opponent.getStats().getStat("RushYds")/16)) /4;
                tds = ((player.getStats().getStat("TD")/games * 3) + (opponent.getStats().getStat("RushTD")/16)) /4;
                fumbles = ((player.getStats().getStat("Fum")/games * 3) + (opponent.getStats().getStat("FL")/16)) /4;
                rec_yards = (player.getStats().getStat("RecYds")/games);
                rec_tds = (player.getStats().getStat("RecTD")/games);
                
                //calculate for standard
                fantasy_points = ((yards/10) + (tds*6) - (fumbles*2) + (rec_yards/10) + (rec_tds*6));
                stat_prediction += Double.toString(fantasy_points) + " points";
            }
            if(player.getPosition().matches("WR") || player.getPosition().matches("TE")){
                //stats for rbs vs stats for defense and get averages
                double rec;
                double yards;
                double yards_per_rec;
                double tds;
                double games;
                double rush_yards;
                double rush_tds;
                double fumbles;
                games = player.getStats().getStat("Gms");
                
                //skew recieving averages toward player stats: factor of 5:1 importance
                yards = ((player.getStats().getStat("Yds/Rec") 
                        + (opponent.getStats().getStat("NY/A")*2)
                        * (player.getStats().getStat("Rec")/games))
                        + (player.getStats().getStat("Yds")/games))/2;
                tds = (player.getStats().getStat("TD")/games);
                fumbles = ((player.getStats().getStat("Fum")/games * 5) + (opponent.getStats().getStat("FL")/16))/6;
                rush_yards = (player.getStats().getStat("RushYds")/games);
                rush_tds = (player.getStats().getStat("RushTD")/games);
                
                //calculate for standard
                fantasy_points = ((yards/10) + (tds*6) - (fumbles*2) + (rush_yards/10) + (rush_tds*6));
                stat_prediction += Double.toString(fantasy_points) + " points";
            }
            
            return stat_prediction;
        }
        else if(scoring_type.matches("PPR")){
            //TO DO: scoring predicition implemented for standard scoring only
             return "not yet implemented";
        }
        else{
            return "Choose standard or PPR for scoring type";
        }
    }
}
