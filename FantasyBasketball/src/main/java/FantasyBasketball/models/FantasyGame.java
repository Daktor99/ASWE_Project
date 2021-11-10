package FantasyBasketball.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fantasyGame")
public class FantasyGame {

    // data members
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private int scheduleID;

    @Column(name = "league_id")
    private int leagueID;

    @Column(name = "home_team_id")
    private int homeTeamID;

    @Column(name = "away_team_id")
    private int awayTeamID;

    @Column(name = "game_start_date")
    private Date gameStartDate;

    @Column(name = "game_end_date")
    private Date gameEndDate;

    @Column(name = "winner_id")
    private int winner;

    @Column(name = "home_points")
    private int homePoints;

    @Column(name = "away_points")
    private int awayPoints;

    @Column(name = "home_start_pg_id")
    private int startHomePG;

    @Column(name = "home_start_sg_id")
    private int startHomeSG;

    @Column(name = "home_start_sf_id")
    private int startHomeSF;

    @Column(name = "home_start_pf_id")
    private int startHomePF;

    @Column(name = "home_start_c_id")
    private int startHomeC;

    @Column(name = "home_bench_1_id")
    private int homebench1;

    @Column(name = "home_bench_2_id")
    private int homebench2;

    @Column(name = "away_start_pg_id")
    private int startAwayPG;

    @Column(name = "away_start_sg_id")
    private int startAwaySG;

    @Column(name = "away_start_sf_id")
    private int startAwaySF;

    @Column(name = "away_start_pf_id")
    private int startAwayPF;

    @Column(name = "away_start_c_id")
    private int startAwayC;

    @Column(name = "away_bench_1_id")
    private int awaybench1;

    @Column(name = "away_bench_2_id")
    private int awaybench2;


    // class methods
    public int getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }

    public int getLeagueID() {
        return leagueID;
    }

    public void setLeagueID(int leagueID) {
        this.leagueID = leagueID;
    }

    public int getHomeTeamID() {
        return homeTeamID;
    }

    public void setHomeTeamID(int homeTeamID) {
        this.homeTeamID = homeTeamID;
    }

    public int getAwayTeamID() {
        return awayTeamID;
    }

    public void setAwayTeamID(int awayTeamID) {
        this.awayTeamID = awayTeamID;
    }

    public Date getGameStartDate() {
        return gameStartDate;
    }

    public void setGameStartDate(Date gameStartDate) {
        this.gameStartDate = gameStartDate;
    }

    public Date getGameEndDate() {
        return gameEndDate;
    }

    public void setGameEndDate(Date gameEndDate) {
        this.gameEndDate = gameEndDate;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public int getHomePoints() {
        return homePoints;
    }

    public void setHomePoints(int homePoints) {
        this.homePoints = homePoints;
    }

    public int getAwayPoints() {
        return awayPoints;
    }

    public void setAwayPoints(int awayPoints) {
        this.awayPoints = awayPoints;
    }

    public int getStartHomePG() {
        return startHomePG;
    }

    public void setStartHomePG(int startHomePG) {
        this.startHomePG = startHomePG;
    }

    public int getStartHomeSG() {
        return startHomeSG;
    }

    public void setStartHomeSG(int startHomeSG) {
        this.startHomeSG = startHomeSG;
    }

    public int getStartHomeSF() {
        return startHomeSF;
    }

    public void setStartHomeSF(int startHomeSF) {
        this.startHomeSF = startHomeSF;
    }

    public int getStartHomePF() {
        return startHomePF;
    }

    public void setStartHomePF(int startHomePF) {
        this.startHomePF = startHomePF;
    }

    public int getStartHomeC() {
        return startHomeC;
    }

    public void setStartHomeC(int startHomeC) {
        this.startHomeC = startHomeC;
    }

    public int getHomebench1() {
        return homebench1;
    }

    public void setHomebench1(int homebench1) {
        this.homebench1 = homebench1;
    }

    public int getHomebench2() {
        return homebench2;
    }

    public void setHomebench2(int homebench2) {
        this.homebench2 = homebench2;
    }

    public int getStartAwayPG() {
        return startAwayPG;
    }

    public void setStartAwayPG(int startAwayPG) {
        this.startAwayPG = startAwayPG;
    }

    public int getStartAwaySG() {
        return startAwaySG;
    }

    public void setStartAwaySG(int startAwaySG) {
        this.startAwaySG = startAwaySG;
    }

    public int getStartAwaySF() {
        return startAwaySF;
    }

    public void setStartAwaySF(int startAwaySF) {
        this.startAwaySF = startAwaySF;
    }

    public int getStartAwayPF() {
        return startAwayPF;
    }

    public void setStartAwayPF(int startAwayPF) {
        this.startAwayPF = startAwayPF;
    }

    public int getStartAwayC() {
        return startAwayC;
    }

    public void setStartAwayC(int startAwayC) {
        this.startAwayC = startAwayC;
    }

    public int getAwaybench1() {
        return awaybench1;
    }

    public void setAwaybench1(int awaybench1) {
        this.awaybench1 = awaybench1;
    }

    public int getAwaybench2() {
        return awaybench2;
    }

    public void setAwaybench2(int awaybench2) {
        this.awaybench2 = awaybench2;
    }

}
