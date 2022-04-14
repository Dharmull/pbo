package pertemuan.pkg11;

class Game {
    private int number;
    private int temp;
    private Team home, away;
    private int goals_home, goals_away;

    public Game (int number, int temp, Team home, Team away,
            int goals_home, int goals_away){
    this.number = number;
    this.temp = temp;
    this.home = home;
    this.away = away;
    this.goals_home = goals_home;
    this.goals_away = goals_away;

    if (goals_home > goals_away){
    
        home.setWins(home.getWins() + 1);
        away.setLosses(away.getLosses() + 1);

        } else if (goals_home==goals_away){
            away.setTies(away.getTies() + 1);
        
        } else {
            home.setLosses(home.getLosses() + 1);
            away.setWins(away.getWins() + 1);
        }
    home.setGoals_scored(home.getGoals_scored() + goals_home);
    home.setGoals_allowed(home.getGoals_allowed() + goals_away);

    away.setGoals_scored(home.getGoals_scored() + goals_away);
    away.setGoals_allowed(home.getGoals_allowed() + goals_home);

    }

    public int getNumber(){
        return number;
}

     public int getTemp(){
        return temp;
}

     public int getHome(){
        return home;
}
}