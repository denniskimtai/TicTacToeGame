package com.example.kiplagat.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity5by5 extends AppCompatActivity implements View.OnClickListener {

    private int player1Points;

    private int Player2Points;

    private Button buttons[][] = new Button[5][5];

    private boolean player1Turn = true;

    private int roundCount;

    int rounds = 0;

    private TextView scores1;
    private TextView scores2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5by5);

        scores1 = findViewById(R.id.scores1);
        scores2 = findViewById(R.id.scores2);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                String buttonID = "btn" + i + j;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttons[i][j] = findViewById(resID);
                buttons[i][j].setOnClickListener(this);
            }
        }

        Button reset2 = findViewById(R.id.reset2);
        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public void onClick(View v) {

        if (!((Button) v).getText().toString().equals("")) {
            return;
        }

        if (player1Turn) {

            ((Button) v).setText("X");
        } else {
            ((Button) v).setText("O");
        }

        roundCount++;

        if (checkForWin()){
            if (player1Turn){
                player1wins();
            }
            else{
                player2Wins();
            }
        }else if (roundCount == 25) {

            draw();
        }else {
            player1Turn = !player1Turn;
        }


    }

    private boolean checkForWin() {

        String[][] field = new String[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                field[i][j] = buttons[i][j].getText().toString();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (field[i][0].equals(field[i][1]) && field[i][0].equals(field[i][2]) && field[i][0].equals(field[i][3]) && field[i][0].equals(field[i][4]) && !field[i][0].equals("")) {

                    return true;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (field[0][i].equals(field[1][i]) && field[0][i].equals(field[2][i]) && field[0][i].equals(field[3][i]) && field[0][i].equals(field[4][i]) && !field[0][i].equals("")) {

                    return true;
                }
            }

            if (field[0][0].equals(field[1][1]) && field[0][0].equals(field[2][2]) && field[0][0].equals(field[3][3]) && field[0][0].equals(field[4][4]) && !field[0][0].equals("")) {

                return true;
            }

            if (field[0][4].equals(field[1][3]) && field[0][4].equals(field[2][2]) && field[0][4].equals(field[3][1]) && field[0][4].equals(field[4][0]) && !field[0][4].equals("")) {

                return true;
            }

        }
        return false;
    }

    private void player1wins(){

        player1Points++;
        Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
        updatePointsText();
        resetBoard();

    }

    private void player2Wins(){

        Player2Points++;
        Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
        updatePointsText();
        resetBoard();

    }

    private void draw(){

        Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();
        resetBoard();

    }

    private void updatePointsText(){

        scores1.setText("Player 1: " + player1Points);
        scores2.setText("Player 2: " + Player2Points);
    }

    private void resetBoard(){
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                buttons[i][j].setText("");
            }
        }
        roundCount = 0;
        rounds++;
        player1Turn = true;

        if (rounds == 3 && player1Points > Player2Points){
            Toast player1wins = Toast.makeText(this, "PLAYER 1 WINS " + player1Points + " GAMES!!", Toast.LENGTH_LONG);
            player1wins.setGravity(Gravity.CENTER,0,0);
            player1wins.show();

            scores1.setText("Player 1: 0");
            scores2.setText("Player 2: 0");
        }else if (rounds == 3 && Player2Points>player1Points){
            Toast player2wins = Toast.makeText(this, "PLAYER 2 WINS " + Player2Points + "GAMES!!", Toast.LENGTH_LONG);
            player2wins.setGravity(Gravity.CENTER,0,0);
            player2wins.show();

            scores1.setText("Player 1: 0");
            scores2.setText("Player 2: 0");
        }else if (rounds == 3 && player1Points == Player2Points){

            Toast draw = Toast.makeText(this, "DRAW!! PLAY AGAIN TO GET A WINNER", Toast.LENGTH_LONG);
            draw.setGravity(Gravity.CENTER,0,0);
            draw.show();

        }

    }


}

