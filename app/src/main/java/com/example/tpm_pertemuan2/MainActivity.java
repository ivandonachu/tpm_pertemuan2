package com.example.tpm_pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btn_Segitiga,btn_Jajargenjang;//deklarasi button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Segitiga = findViewById(R.id.btn_luasSegitiga);//identifikasi id btn segitiga pada activity_main.xml
        btn_Jajargenjang = findViewById(R.id.btn_luasJajargenjang);//identifikasi id btn segitiga pada activity_main.xml

        //proses pindah layer button segitiga
        btn_Segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent segitga = new Intent(MainActivity.this , segitiga.class);
                startActivity(segitga);
            }
        });

        //proses pindah layer button jajargenjang
        btn_Jajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jajargenjang = new Intent(MainActivity.this , jajargenjang.class);
                startActivity(jajargenjang);
            }
        });
    }
}
