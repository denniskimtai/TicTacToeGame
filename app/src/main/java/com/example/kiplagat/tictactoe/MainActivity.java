package com.example.kiplagat.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset;
    TextView player1score,player2score;
    int scoreCount = 0;
    int scoreCount2 = 0;
    int round = 0;
    int turn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        player1score = findViewById(R.id.player1score);
        player2score = findViewById(R.id.player2score);
        reset = findViewById(R.id.reset);
         b1 =  findViewById(R.id.b1);
         b2 =  findViewById(R.id.b2);
         b3 =  findViewById(R.id.b3);
         b4 =  findViewById(R.id.b4);
         b5 =  findViewById(R.id.b5);
         b6 =  findViewById(R.id.b6);
         b7 =  findViewById(R.id.b7);
         b8 =  findViewById(R.id.b8);
         b9 =  findViewById(R.id.b9);


         turn = 1;

//         click listeners for all buttons

         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 if (b1.getText().toString().equals("")) {
                     if (turn == 1) {
                         turn = 2;
                         b1.setText("X");
                     } else if (turn == 2) {
                         turn = 1;
                         b1.setText("O");
                     }

                 }
                 endGame();

             }
         });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                    }

                }
                endGame();


            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                    }

                }
                endGame();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                    }

                }
                endGame();

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                    }

                }
                endGame();

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                    }

                }
                endGame();

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                    }

                }
                endGame();

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                    }

                }
                endGame();

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                    }

                }
                endGame();

            }
        });


    }

//    endgame method when three consecutive squares have same symbol and disable remaining squares when game is won
    public void endGame(){
        String a,b,c,d,e,f,g,h,i;


        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if (a.equals(b) && a.equals(c) && a.equals("X")&& b.equals("X")&& c.equals("X")){
            scoreCount++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player X wins!!", Toast.LENGTH_SHORT).show();

        }
        if (a.equals(d) && a.equals(g) && a.equals("X") && d.equals("X")&& g.equals("X")){
            scoreCount++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player X wins!!", Toast.LENGTH_SHORT).show();

        }
        if (a.equals(e) && a.equals(i) && a.equals("X") && e.equals("X") && i.equals("X")){
            scoreCount++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player X wins!!", Toast.LENGTH_SHORT).show();

        }
        if (b.equals(e) && b.equals(h) && b.equals("X") && e.equals("X") && h.equals("X")){
            scoreCount++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player X wins!!", Toast.LENGTH_SHORT).show();

        }
        if (c.equals(f) && c.equals(i) && c.equals("X") && f.equals("X") && i.equals("X")){
            scoreCount++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player X wins!!", Toast.LENGTH_SHORT).show();

        }
        if (c.equals(e) && c.equals(g) && c.equals("X") && e.equals("X") && g.equals("X")){
            scoreCount++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player X wins!!", Toast.LENGTH_SHORT).show();

        }
        if (g.equals(h) && g.equals(i) && g.equals("X") && h.equals("X") && i.equals("X")){
            scoreCount++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player X wins!!", Toast.LENGTH_SHORT).show();

        }
        if (d.equals(e) && d.equals(f) && d.equals("X") && e.equals("X") && f.equals("X")){
            scoreCount++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player X wins!!", Toast.LENGTH_SHORT).show();

        }

        //if player O wins

        if (a.equals(b) && a.equals(c) && a.equals("O") && b.equals("O") && c.equals("O")){
            scoreCount2++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player O wins!!", Toast.LENGTH_SHORT).show();

        }
        if (a.equals(d) && a.equals(g) && a.equals("O") && d.equals("O") && g.equals("O")){
            scoreCount2++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player O wins!!", Toast.LENGTH_SHORT).show();

        }
        if (a.equals(e) && a.equals(i) && a.equals("O") && e.equals("O") && i.equals("O")){
            scoreCount2++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player O wins!!", Toast.LENGTH_SHORT).show();

        }
        if (b.equals(e) && b.equals(h) && b.equals("O") && e.equals("O") && h.equals("O")){
            scoreCount2++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player O wins!!", Toast.LENGTH_SHORT).show();

        }
        if (c.equals(f) && c.equals(i) && c.equals("O") && f.equals("O") && i.equals("O")){
            scoreCount2++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player O wins!!", Toast.LENGTH_SHORT).show();

        }
        if (c.equals(e) && c.equals(g) && c.equals("O") && e.equals("O") && g.equals("O")){
            scoreCount2++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player O wins!!", Toast.LENGTH_SHORT).show();

        }
        if (g.equals(h) && g.equals(i) && g.equals("O") && h.equals("O") && i.equals("O")){
            scoreCount2++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player O wins!!", Toast.LENGTH_SHORT).show();

        }
        if (d.equals(e) && d.equals(f) && d.equals("O") && e.equals("O") && f.equals("O")){
            scoreCount2++;
            round++;
            updateScore();
            newGame();
            clearBoard();
            turn = 1;
            Toast.makeText(this, "Player O wins!!", Toast.LENGTH_SHORT).show();

        }

    }

//    method to reset game on click of reset game button and enable all square


    public void clearBoard(){

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");


        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
    }

//    Update score method
    public void updateScore(){

        player1score.setText("Player 1:" + scoreCount);
        player2score.setText("Player 2:" + scoreCount2);


    }

    public void newGame(){

//if player one has highest scores
        if (round == 3 && scoreCount > scoreCount2){
            Toast player1Wins = Toast.makeText(this, "PLAYER 1 WINS BY  "  + scoreCount + " GAMES. CLICK NEW GAME TO PLAY AGAIN", Toast.LENGTH_LONG);
            player1Wins.setGravity(Gravity.CENTER,0,0);
            player1Wins.show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");


            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            reset.setEnabled(false);


            round = 0;
            scoreCount = 0;
            scoreCount2 = 0;

        }

//        if player 2 has the highest score
        if (round == 3 && scoreCount2>scoreCount){
            Toast player2Wins = Toast.makeText(this,"PLAYER 2 WINS BY  "  + scoreCount2 + " GAMES. CLICK NEW GAME TO PLAY AGAIN" , Toast.LENGTH_LONG);
            player2Wins.setGravity(Gravity.CENTER,0,0);
            player2Wins.show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            reset.setEnabled(false);


            round = 0;
            scoreCount = 0;
            scoreCount2 = 0;
        }

//        if the game ends a draw
        if (round == 3 && scoreCount == scoreCount2){
            Toast Draw = Toast.makeText(this,"GAME ENDS DRAW. CLICK NEW GAME TO PLAY AGAIN  "  , Toast.LENGTH_LONG);
            Draw.setGravity(Gravity.CENTER,0,0);
            Draw.show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            reset.setEnabled(false);

            round = 0;
            scoreCount = 0;
            scoreCount2 = 0;

        }
    }

    public void reset(View v ){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");


        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

        player1score.setText("Player 1: 0");
        player2score.setText("Player 2: 0");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.easy){
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        } else if (item.getItemId() == R.id.hard){

            Intent intent = new Intent(this,Activity5by5.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
