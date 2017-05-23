/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.LinkedList;

/**
 *
 * @author Steven
 */
public class StatSpec {
    private LinkedList stats= new LinkedList();
    private String[] stat_desc;
    
    public StatSpec(LinkedList stat_list, String[] stat_desc){
        this.stats = stat_list;
        this.stat_desc = stat_desc;
    }
    
    public LinkedList getStats() {
        return stats;
    }

    public String[] getStat_desc() {
        return stat_desc;
    }
    
    public double getStat(String stat_name){
        int stat_index= -1;
        for(int i=0;i<stat_desc.length;i++){
            if(stat_name.matches(stat_desc[i])){
                stat_index = i;
                break;
            }
        }
        return (double) stats.get(stat_index);
    }
    
}