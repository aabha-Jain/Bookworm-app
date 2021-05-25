package com.example.dictionary2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button TexttoSpeech;
    Button Pdfreader;
    Button Dict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TexttoSpeech=(Button)findViewById(R.id.texttospeech);
        Pdfreader=(Button)findViewById(R.id.pdfreader);
        Dict=(Button)findViewById(R.id.Dictionary);

        TexttoSpeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FirstActivity.class);
                startActivity(intent);
            }
        });

        Pdfreader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,PDFActivtiy.class);
                startActivity(intent);

            }
        });
        Dict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);

            }
        });

    }
}
