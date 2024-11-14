package com.example.domek_w_gorach;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    private Button but_polub;
    private Button but_usun;
    private Button but_zapisz;
    private TextView likes;
    private int likes_count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        but_polub = findViewById(R.id.polub);
        but_usun = findViewById(R.id.usun);
        but_zapisz =  findViewById(R.id.zapisz);
        likes =  findViewById(R.id.No_likes);


        but_polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                likes_count++;
                likes.setText(likes_count + " polubien");
            }
        });

        but_usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(likes_count > 0) {
                    likes_count--;
                    likes.setText(likes_count + " polubien");
                }
            }
        });
    }

}