package com.example.mynilai_anggelamaricidnage;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


public class activity_nilaiakhir extends AppCompatActivity {
    EditText Enim, Enama, nakhir, gnilai;
    Spinner smatkul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilaiakhir);


        Enim = findViewById(R.id.editnim);
        Enama = findViewById(R.id.editnama);
        nakhir= findViewById(R.id.editAkhir);
        gnilai = findViewById(R.id.editGrade);

        String akhir = getIntent().getExtras().getString("akhir");
        String grade = getIntent().getExtras().getString("grade");

        nakhir.findViewById(R.id.editAkhir);
        nakhir.setText(akhir);

        gnilai.findViewById(R.id.editGrade);
        gnilai.setText(grade);

        String nim = getIntent().getExtras().getString("nim");
        String nama = getIntent().getExtras().getString("nama");


        Enim.findViewById(R.id.editnim);
        Enim.setText(nim);

        Enama.findViewById(R.id.editnama);
        Enama.setText(nama);





    }
}