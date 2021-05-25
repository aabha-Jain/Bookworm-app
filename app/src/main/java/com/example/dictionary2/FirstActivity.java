package com.example.dictionary2;


import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import java.io.File;
import java.util.Locale;

public class FirstActivity extends AppCompatActivity {

    private TextToSpeech textToSpeech;
    private EditText editText;
    private SeekBar Pitch;
    private SeekBar Speed;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        button=findViewById(R.id.button_speak);

        textToSpeech=new TextToSpeech(FirstActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status==TextToSpeech.SUCCESS)
                {
                    int result=textToSpeech.setLanguage(Locale.UK);
                    if(result==TextToSpeech.LANG_MISSING_DATA||result==TextToSpeech.LANG_NOT_SUPPORTED)
                    {
                        Log.e("TTS","Language not supported");
                    }
                    else
                    {
                        button.setEnabled(true);
                    }

                }else
                {
                    Log.e("TTS","Initialization Failed");
                }

            }
        });

        editText=findViewById(R.id.edit_text);
        Pitch=findViewById(R.id.seek_bar_pitch);
        Speed=findViewById(R.id.seek_bar_Speed);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                speak();
            }
        });
    }

    private void speak()
    {
        String text=editText.getText().toString();
        float pitch=(float)Pitch.getProgress()/50;
        if(pitch<0.1)
        {
            pitch=0.1f;
        }

        float speed=(float)Speed.getProgress()/50;
        if(speed<0.1)
        {
            speed=0.1f;
        }

        textToSpeech.setPitch(pitch);
        textToSpeech.setSpeechRate(speed);

        textToSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null);


    }

    @Override
    protected void onDestroy()
    {
        if(textToSpeech!=null)
        {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
    }

}

