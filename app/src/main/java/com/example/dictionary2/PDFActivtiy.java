package com.example.dictionary2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class PDFActivtiy extends AppCompatActivity {

    TextView book1,book2,book3,book4,book5,book6,book7,book8,book9,book10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfactivtiy);


        book1=(TextView)findViewById(R.id.book1);
        book2=(TextView)findViewById(R.id.book2);
        book3=(TextView)findViewById(R.id.book3);
        book4=(TextView)findViewById(R.id.book4);
        book5=(TextView)findViewById(R.id.book5);
        book6=(TextView)findViewById(R.id.book6);
        book7=(TextView)findViewById(R.id.book7);
        book8=(TextView)findViewById(R.id.book8);
        book9=(TextView)findViewById(R.id.book9);
        book10=(TextView)findViewById(R.id.book10);

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PDFActivtiy.this,SecondActivity.class);
                intent.putExtra("book","1984.pdf");
                startActivity(intent);
            }
        });
        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PDFActivtiy.this,SecondActivity.class);
                intent.putExtra("book","Fahrenheit 451.pdf");
                startActivity(intent);
            }
        });
        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PDFActivtiy.this,SecondActivity.class);
                intent.putExtra("book","harper_li_masqarachini_oldurmek-eng.pdf");
                startActivity(intent);
            }
        });
        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PDFActivtiy.this,SecondActivity.class);
                intent.putExtra("book","Markus_Zusak_-_The_Book_Thief.pdf");
                startActivity(intent);
            }
        });
        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PDFActivtiy.this,SecondActivity.class);
                intent.putExtra("book","prideandprejudice.pdf");
                startActivity(intent);
            }
        });
        book6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PDFActivtiy.this,SecondActivity.class);
                intent.putExtra("book","The Lord Of The Ring 1-The Fellowship Of The Ring.pdf");
                startActivity(intent);
            }
        });
        book7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PDFActivtiy.this,SecondActivity.class);
                intent.putExtra("book","The Lord Of The Ring 1-The Two Towers.pdf");
                startActivity(intent);
            }
        });
        book8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PDFActivtiy.this,SecondActivity.class);
                intent.putExtra("book","The Return Of The King - Lord of the Ring.pdf");
                startActivity(intent);
            }
        });
        book9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PDFActivtiy.this,SecondActivity.class);
                intent.putExtra("book","the-great-gatsby.pdf");
                startActivity(intent);
            }
        });
        book10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PDFActivtiy.this,SecondActivity.class);
                intent.putExtra("book","The-Hobbit-byJ-RR-Tolkien-EBOOK.pdf");
                startActivity(intent);
            }
        });


    }
}

