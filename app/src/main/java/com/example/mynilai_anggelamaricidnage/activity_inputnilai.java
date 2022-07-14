package com.example.mynilai_anggelamaricidnage;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_inputnilai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputnilai);

        Button SUBMIT = findViewById(R.id.SUBMIT);
    }

    public void SUBMIT(View view) {
        Intent intent = new Intent(isiData.this,     hitung_nilai.class);
        startActivity(intent);
    }
}