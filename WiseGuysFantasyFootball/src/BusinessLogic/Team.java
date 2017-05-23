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
public class Team {
    private String name;
    private String name_abbrev;
    private StatSpec stats;
    
    public Team(String name, String name_abbrev){
        this.name = name;
        this.name_abbrev = name_abbrev;
    }

    public String getName() {
        return name;
    }

    public String getName_abbrev() {
        return name_abbrev;
    }

    public void setStats(StatSpec stats) {
        this.stats = stats;
    }

    public StatSpec getStats() {
        return stats;
    }
    
}
