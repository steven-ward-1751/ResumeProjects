/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BusinessLogic;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
/**
 *
 * @author Steven
 */


public class PlayerParser {
    private LinkedList<Player> players=new LinkedList<Player>();
    private LinkedList<Team> teams=new LinkedList<Team>();
    public PlayerParser(String position){
        switch(position){
            case "qb" :
                try{
                    File file = new File("C:\\Users\\Greg\\ResumeProjects\\WiseGuysFantasyFootball\\src\\BusinessLogic\\formatted_qb.txt");
                    Scanner scanner = new Scanner(file);
                    while(scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        String[] info = line.split("::");
                        Player player = new Player(info[1],info[2],info[3]);                     
                        LinkedList stats = new LinkedList();
                        String[] stat_desc = {"Gms","Comp","Att","Pct","Yds","Yds/Att","TD","Int","QB Rating",
                                    "Att","RushYds","RushYds/Att","RushTD","PPG","Fantasy Points"};
                        for(int i = 4; i < info.length; i++){
                            stats.add(Double.parseDouble(info[i]));
                        }
                        StatSpec statspec = new StatSpec(stats,stat_desc);
                        player.setStats(statspec);
                        players.add(player);
                    }
                }
                catch (FileNotFoundException e) {         
                        e.printStackTrace();
                }
            case "rb" :
                try{
                    File file = new File("C:\\Users\\Greg\\ResumeProjects\\WiseGuysFantasyFootball\\src\\BusinessLogic\\formatted_rb.txt");
                    Scanner scanner = new Scanner(file);
                    while(scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        String[] info = line.split("::");
                        Player player = new Player(info[1],info[2],info[3]);                     
                        LinkedList stats = new LinkedList();
                        String[] stat_desc = {"Gms","Att","Yds","Yds/Att","TD","Targets",
                                    "Rec","RecYds","RecTD","Fum","Lost","PPG","Fantasy Points"};
                        for(int i = 4; i < info.length; i++){
                            stats.add(Double.parseDouble(info[i]));
                        }
                        StatSpec statspec = new StatSpec(stats,stat_desc);
                        player.setStats(statspec);
                        players.add(player);
                    }
                }
                catch (FileNotFoundException e) {         
                        e.printStackTrace();
                }
            case "wr" :
                try{
                    File file = new File("C:\\Users\\Greg\\ResumeProjects\\WiseGuysFantasyFootball\\src\\BusinessLogic\\formatted_wr.txt");
                    Scanner scanner = new Scanner(file);
                    while(scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        String[] info = line.split("::");
                        Player player = new Player(info[1],info[2],info[3]);                     
                        LinkedList stats = new LinkedList();
                        String[] stat_desc = {"Gms","Targets","Rec","Pct","Yds","TD","Long","Yds/Target",
                                    "Yds/Rec","Rush","RushYds","RushTD","Fum","Lost","PPG","Fantasy Points"};
                        for(int i = 4; i < info.length; i++){
                            stats.add(Double.parseDouble(info[i]));
                        }
                        StatSpec statspec = new StatSpec(stats,stat_desc);
                        player.setStats(statspec);
                        players.add(player);
                    }
                }
                catch (FileNotFoundException e) {         
                        e.printStackTrace();
                }
            case "te" :
                try{
                    File file = new File("C:\\Users\\Greg\\ResumeProjects\\WiseGuysFantasyFootball\\src\\BusinessLogic\\formatted_te.txt");
                    Scanner scanner = new Scanner(file);
                    while(scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        String[] info = line.split("::");
                        Player player = new Player(info[1],info[2],info[3]);                     
                        LinkedList stats = new LinkedList();
                        String[] stat_desc = {"Gms","Targets","Rec","Pct","Yds","TD","Long","Yds/Target",
                                    "Yds/Rec","Rush","RushYds","RushTD","Fum","Lost","PPG","Fantasy Points"};
                        for(int i = 4; i < info.length; i++){
                            stats.add(Double.parseDouble(info[i]));
                        }
                        StatSpec statspec = new StatSpec(stats,stat_desc);
                        player.setStats(statspec);
                        players.add(player);
                    }
                }
                catch (FileNotFoundException e) {         
                        e.printStackTrace();
                }  
            case "def" :
                try{
                    File file = new File("C:\\Users\\Greg\\ResumeProjects\\WiseGuysFantasyFootball\\src\\BusinessLogic\\formatted_def.txt");
                    Scanner scanner = new Scanner(file);
                    while(scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        String[] info = line.split("::");
                        Team team = new Team(info[1],info[2]);                    
                        LinkedList stats = new LinkedList();
                        String[] stat_desc = {"Yds","PLY","Y/P","TO","FL","1stD","Cmp",
                                              "PassAtt","PassYds","PassTD","Int","NY/A","Pass1stD",
                                              "RushAtt","RushYds","RushTD","Y/A","Rush1stD"};
                        for(int i = 5; i < info.length; i++){
                            stats.add(Double.parseDouble(info[i]));
                        }
                        StatSpec statspec = new StatSpec(stats,stat_desc);
                        team.setStats(statspec);
                        teams.add(team);
                    }
                }
                catch (FileNotFoundException e) {         
                        e.printStackTrace();
                }
    
        }
    }
        
    public LinkedList<Player> getPlayers() {
        return players;
    }

    public LinkedList<Team> getTeams() {
        return teams;
    }
       
}
