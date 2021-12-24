package com.example.scorecounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets score to 0
     */
    public void resetScore(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    /**
     * +3 score for Team A
     */
    public void scoreA3(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    /**
     * +2 score for Team A
     */
    public void scoreA2(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    /**
     * +1(free throw) score for Team A
     */
    public void scoreA1(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }

    /**
     * +3 score for Team B
     */
    public void scoreB3(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    /**
     * +2 score for Team B
     */
    public void scoreB2(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    /**
     * +1(free throw) score for Team B
     */
    public void scoreB1(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }

}