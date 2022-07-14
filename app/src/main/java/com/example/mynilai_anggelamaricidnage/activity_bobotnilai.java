package com.example.mynilai_anggelamaricidnage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class activity_bobotnilai extends AppCompatActivity {
    EditText nilaikehadiran, nilaitugas, nilaiuts, nilaiuas;

    Double hadir, tugas, uts, uas, nakhir;
    String grade;
    TextView tugasAkhir, Grade;
    Button buttonHitung, next;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bobotnilai);

        String kehadiran = getIntent().getExtras().getString("kehadiran");
        String tugas = getIntent().getExtras().getString("tugas");
        String uts = getIntent().getExtras().getString("uts");
        String uas = getIntent().getExtras().getString("uas");


        nilaikehadiran = findViewById(R.id.nilaiKehadiran);
        nilaikehadiran.setText(kehadiran);

        nilaitugas = findViewById(R.id.nilaiTugas);
        nilaitugas.setText(tugas);

        nilaiuts = findViewById(R.id.nilaiUTS);
        nilaiuts.setText(uts);

        nilaiuas = findViewById(R.id.nilaiUAS);
        nilaiuas.setText(uas);




        tugasAkhir = findViewById(R.id.tugasakhir);
        Grade = findViewById(R.id.grade);
        buttonHitung = findViewById(R.id.buttonhitung);
        next = findViewById(R.id.next);


    }


    public void hitung(View view) {
        hadir = Double.parseDouble(nilaikehadiran.getText().toString());
        tugas = Double.parseDouble(nilaitugas.getText().toString());
        uts = Double.parseDouble(nilaiuts.getText().toString());
        uas = Double.parseDouble(nilaiuas.getText().toString());

        nakhir = (hadir * 0.1) + (tugas * 0.3) + (uts * 0.3) + (uas * 0.3);

        if (nakhir >= 90 && nakhir <= 100) {
            grade = "A";
        } else if (nakhir >= 80 && nakhir <= 89) {
            grade = "B";
        } else if (nakhir >= 60 && nakhir <= 69) {
            grade = "C";
        } else {
            grade = "E";
        }

        tugasAkhir.setText("" + nakhir);
        Grade.setText(" " + grade);

        tugasAkhir = findViewById(R.id.tugasakhir);
        Grade = findViewById(R.id.grade);

        next= findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(activity_bobotnilai.this, activity_bobotnilai.class);
                i.putExtra("akhir", tugasAkhir.getText().toString());
                i.putExtra("grade", Grade.getText().toString());
                startActivity(i);

            }
        });

    }
}