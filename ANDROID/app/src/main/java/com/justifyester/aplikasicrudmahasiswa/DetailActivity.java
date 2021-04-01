package com.justifyester.aplikasicrudmahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvid,tvnama,tvnim,tvipk;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        //Initializing Views
        tvid = findViewById(R.id.txtid);
        tvnama = findViewById(R.id.txtnama);
        tvnim = findViewById(R.id.txtnim);
        tvipk = findViewById(R.id.txtipk);

        Intent intent =getIntent();
        position = intent.getExtras().getInt("position");

        tvid.setText("ID : "+MainActivity.employeeArrayList.get(position).getId());
        tvnama.setText("Nama : "+MainActivity.employeeArrayList.get(position).getNama());
        tvnim.setText("NIM : "+MainActivity.employeeArrayList.get(position).getNim());
        tvipk.setText("IPK : "+MainActivity.employeeArrayList.get(position).getIpk());
    }
}

