/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wiseguysfantasyfootball;

import BusinessLogic.PerformanceEvaluator;
import BusinessLogic.Player;
import BusinessLogic.PlayerParser;
import BusinessLogic.Team;
import java.util.LinkedList;
/**
 *
 * @author Steven
 */
public class WiseGuysFantasyFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Player> qbs = new LinkedList<Player>();
        PlayerParser qb = new PlayerParser("qb");
        qbs = qb.getPlayers();
        
        LinkedList<Player> rbs = new LinkedList<Player>();
        PlayerParser rb = new PlayerParser("rb");
        rbs = rb.getPlayers();
        
        LinkedList<Player> wrs = new LinkedList<Player>();
        PlayerParser wr = new PlayerParser("wr");
        wrs = wr.getPlayers();
        
        LinkedList<Player> tes = new LinkedList<Player>();
        PlayerParser te = new PlayerParser("te");
        tes = te.getPlayers();
        
        LinkedList<Team> teams = new LinkedList<Team>();
        PlayerParser team = new PlayerParser("def");
        teams = team.getTeams();
        
        PerformanceEvaluator eval = new PerformanceEvaluator("standard");
        System.out.println(eval.predictStats(qbs.get(0),teams.get(3)));
        System.out.println(eval.predictStats(qbs.get(0),teams.get(29)));
        System.out.println(teams.size());
    }
    
}
