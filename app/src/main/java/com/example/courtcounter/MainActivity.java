package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreForA=0;
int scoreForB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeTeamA(View V) {
        scoreForA = scoreForA + 3;
        displayForTeamA(scoreForA);
    }

    public void addTwoTeamA(View V) {
        scoreForA = scoreForA + 2;
        displayForTeamA(scoreForA);
    }

    public void addOneTeamA(View V) {
        scoreForA = scoreForA +1;
        displayForTeamA(scoreForA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeTeamB(View V) {
        scoreForB = scoreForB + 3;
        displayForTeamB(scoreForB);
    }

    public void addTwoTeamB(View V) {
        scoreForB = scoreForB + 2;
        displayForTeamB(scoreForB);
    }

    public void addOneTeamB(View V) {
        scoreForB = scoreForB +1;
        displayForTeamB(scoreForB);
    }

    public void reset(View V) {
        scoreForA = 0;
        scoreForB = 0;
        displayForTeamA(scoreForA);
        displayForTeamB(scoreForB);
    }
}
