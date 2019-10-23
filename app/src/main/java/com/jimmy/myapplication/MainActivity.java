package com.jimmy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtNpm ;
    EditText edtNama;
    Button btnsimpan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNpm =(EditText) findViewById(R.id.edtNpm);
        edtNama =(EditText) findViewById(R.id.edtNama);
        btnsimpan =(Button) findViewById(R.id.btnsimpan);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtNpm.getText().toString();
                String data1 = edtNama.getText().toString();

                Intent next = new Intent(MainActivity.this,halaman2
                        .class);
                next.putExtra("data",data);
                next.putExtra("data1",data1);
                startActivity(next);
                finish();
            }
        });
    }
}
