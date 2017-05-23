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
public class Player {

    private String name;
    private String position;
    private String team;
    private StatSpec stats;
    
    public Player(String name,String position,String team){
        this.name = name;
        this.position = position;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public StatSpec getStats() {
        return stats;
    }

    public void setStats(StatSpec stats) {
        this.stats = stats;
    }
    
}
