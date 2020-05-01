package com.andoidapp.pizzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button comand;
    private ImageButton mBuc, pBuc, mSuc, pSuc, mSos, pSos;
    private EditText sos, suc, bucati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comand = findViewById(R.id.Comanda);
        bucati = findViewById(R.id.Bucati);
        sos = findViewById(R.id.Sos);
        suc = findViewById(R.id.Suc);
        mBuc = findViewById(R.id.MinusBucati);
        pBuc = findViewById(R.id.PlusBucati);
        mSos = findViewById(R.id.MinusSos);
        pSos = findViewById(R.id.PlusSos);
        pSuc = findViewById(R.id.PlusSuc);
        mSuc = findViewById(R.id.MinusSuc);



        comand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt="", sBuc, sSos, sSuc;
                sBuc=bucati.getText().toString();
                sSos=sos.getText().toString();
                sSuc=suc.getText().toString();

                txt = "Ati comandat " + sBuc + " pizza, " + sSos + " sos(uri), " + sSuc + " suc(uri)";


            }
        });

        mBuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bucati.getText().toString().trim().length() <= 0)bucati.setText("0");
                int nr = Integer.parseInt(bucati.getText().toString());
                if(nr<1)bucati.setText("0");
                else if(nr>9)bucati.setText("9");
                else {
                    nr--;
                    bucati.setText(Integer.toString(nr));
                }
            }
        });

        pBuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bucati.getText().toString().trim().length() <= 0)bucati.setText("0");
                int nr = Integer.parseInt(bucati.getText().toString());
                if(nr<1)bucati.setText("1");
                else if(nr>9)bucati.setText("10");
                else {
                    nr++;
                    bucati.setText(Integer.toString(nr));
                }
            }
        });

        mSuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(suc.getText().toString().trim().length() <= 0)suc.setText("0");
                int nr = Integer.parseInt(suc.getText().toString());
                if(nr<1)suc.setText("0");
                else if(nr>9)suc.setText("9");
                else {
                    nr--;
                    suc.setText(Integer.toString(nr));
                }

            }
        });

        pSuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(suc.getText().toString().trim().length() <= 0)suc.setText("0");
                int nr = Integer.parseInt(suc.getText().toString());
                if(nr<1)suc.setText("1");
                else if(nr>9)suc.setText("10");
                else {
                    nr++;
                    suc.setText(Integer.toString(nr));
                }

            }
        });

        mSos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sos.getText().toString().trim().length() <= 0)sos.setText("0");
                int nr = Integer.parseInt(sos.getText().toString());
                if(nr<1)sos.setText("0");
                else if(nr>9)sos.setText("9");
                else {
                    nr--;
                    sos.setText(Integer.toString(nr));
                }

            }
        });

        pSos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sos.getText().toString().trim().length() <= 0)sos.setText("0");
                int nr = Integer.parseInt(sos.getText().toString());
                if(nr<1)sos.setText("1");
                else if(nr>9)sos.setText("10");
                else {
                    nr++;
                    sos.setText(Integer.toString(nr));
                }
            }
        });
    }
}
