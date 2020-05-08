package com.example.aplikasilimassegiempat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ETluasalas, ETtinggi;
    private TextView hasil;
    private Button hitung, reset;
    double i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETluasalas = (EditText)findViewById(R.id.editText);
        ETtinggi   = (EditText)findViewById(R.id.editText2);

        hitung  = (Button)findViewById(R.id.btnhitung);
        reset   = (Button)findViewById(R.id.btnriset);

        hasil      = (TextView)findViewById(R.id.txthasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(ETluasalas.getText().toString());
                int b = Integer.parseInt(ETtinggi.getText().toString());
                 i = 0.33*a*b;
                hasil.setText("Hasil :  "+i);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETluasalas.setText("");
                ETtinggi.setText("");
                hasil.setText("");
                ETluasalas.setActivated(false);
                ETtinggi.setActivated(false);
                hasil.setActivated(false);
            }
        });


    }
}
