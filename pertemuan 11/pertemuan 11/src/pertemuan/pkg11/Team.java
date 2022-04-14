package pertemuan.pkg11;

class Team {
    private String name;
    private int wins, losses, ties, goals_scored, goals_allowed;

    public Team(String name){
        this.name = name;
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
        this.goals_scored = 0;
        this.goals_allowed = 0;
}
    public String getName(){
        return name;
    }

    public int getWins(){
        return wins;
    }

    public int getLosses(){
        return losses;
    }

    public int getTies(){
        return ties;
    }

    public int getGoals_scored(){
        return goals_scored;
    }

    public int getGoals_allowed(){
        return goals_allowed;
    }

    public int setWins(int wins){
        this.wins = wins;
        return 0;
    }

    public int setLosses(int losses){
        this.losses = losses;
        return 0;
    }

    public int setTies(int ties){
        this.ties = ties;
        return 0;
    }

    public int setGoals_scored(int goals_scored){
        this.goals_scored = goals_scored;
        return 0;
    }

    public int setGoals_allowed(int goals_allowed){
        this.goals_allowed = goals_allowed;
        return 0;
    }
}
