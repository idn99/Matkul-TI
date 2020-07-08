package com.idn99.project.matkulti.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.idn99.project.matkulti.R;
import com.idn99.project.matkulti.adapter.MatkulAdapter;
import com.idn99.project.matkulti.model.Data;
import com.idn99.project.matkulti.model.Matkul;

import java.util.ArrayList;

public class MatkulActivity extends AppCompatActivity {

    private RecyclerView rvMatkul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matkul);

        rvMatkul = findViewById(R.id.rv_matkul);

        Data data = getIntent().getParcelableExtra("matkul");

        MatkulAdapter matkulAdapter = new MatkulAdapter(data.getMatkul(), MatkulActivity.this);
        rvMatkul.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvMatkul.setAdapter(matkulAdapter);
    }

}
