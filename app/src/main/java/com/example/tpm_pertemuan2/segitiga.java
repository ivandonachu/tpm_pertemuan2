package com.example.tpm_pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class segitiga extends AppCompatActivity {

    private Button btnHasil;//deklarasi button
    private TextView tvHasil;//deklarasi view hasil
    private EditText  etAlas, etTinggi;//deklarasi alas dan tinggi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        //mencari data dari file xml
        btnHasil = findViewById(R.id.btn_hasil);
        tvHasil = findViewById(R.id.tv_hasil);
        etAlas = findViewById(R.id.et_alas);
        etTinggi = findViewById(R.id.et_tinggi);

        //action button jumlahkan/hasil
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //menyimpan data yang di temukan di xml dengan jenis string
                    String sAlas = etAlas.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    //merubah jenis data dari string ke doubel
                    double alas = Double.parseDouble(sAlas);
                    double tinggi = Double.parseDouble(sTinggi);
                    double hasil = (alas * tinggi)/2;

                    //membuat variabel string untuk menyimpan nilai hasil
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);//menampilkan hasil di view xml
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
