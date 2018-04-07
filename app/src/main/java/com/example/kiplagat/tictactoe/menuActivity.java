package com.example.kiplagat.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class menuActivity extends AppCompatActivity {

    TextView easy, hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        easy = findViewById(R.id.easy);
        hard = findViewById(R.id.hard);


    }

    public void easyActivity(View v ){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void hardActivity(View v ){
        Intent intent = new Intent(this,Activity5by5.class);
        startActivity(intent);
    }
}
