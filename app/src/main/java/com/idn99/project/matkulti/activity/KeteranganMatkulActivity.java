package com.idn99.project.matkulti.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.idn99.project.matkulti.R;
import com.idn99.project.matkulti.model.Matkul;

public class KeteranganMatkulActivity extends AppCompatActivity {

    private TextView tvMatkul, tvSks, tvKet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keterangan_matkul);

        tvMatkul = findViewById(R.id.tv_ket_matkul);
        tvSks = findViewById(R.id.tv_ket_sks);
        tvKet = findViewById(R.id.tv_ket);

        Matkul matkul = getIntent().getParcelableExtra("matkul");
        tvMatkul.setText(matkul.getNamaMatkul());
        tvSks.setText(matkul.getSks()+" SKS");
        tvKet.setText(matkul.getKeterangan());
    }
}
