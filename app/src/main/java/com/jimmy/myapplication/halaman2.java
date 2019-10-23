package com.jimmy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class halaman2 extends AppCompatActivity {
    TextView txtdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        txtdata = (TextView) findViewById(R.id.txtdata);
        Intent datas = getIntent();
        String Npm = datas.getStringExtra("data");
        String Nama = datas.getStringExtra("data1");
        txtdata.setText(Nama +"\n"+Npm);


    }
    @Override
    public void onBackPressed() {
        Intent back = new Intent(halaman2.this,MainActivity.class);
        startActivity(back);
        finish();

        }


}
