package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    EditText alas, tinggi, hasil;
    Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas =
                (EditText)findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.input_tinggi);

        final EditText hasil =
                (EditText)findViewById(R.id.output_hasil);

        final Button hitung = (Button)findViewById(R.id.btn_hitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alas.length() == 0 && tinggi.length() ==0 ) {
                    Toast.makeText(getApplication(),"Alas dan Tinggi Tidak Boleh Kosong ",Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext alas kosong
                else if (alas.length() == 0){
                    Toast.makeText(getApplication(),"Alas Tidak Boleh Kosong ",Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext tinggi kosong
                else if (tinggi.length() ==0 ){
                    Toast.makeText(getApplication(),"Tinggi Tidak Boleh Kosong ", Toast.LENGTH_SHORT).show();
                }

                else {
                    //ambil nilai dari txtAlas dan txtTinggi
                    String isiAlas = alas.getText().toString();
                    String isiTinggi = tinggi.getText().toString();

                    //parsing isiAlas dan isiTinggi menjadi double
                    double pj = Double.parseDouble(isiAlas);
                    double lb = Double.parseDouble(isiTinggi);

                    //panggil method LuasSegitiga
                    double hs = LuasSegitiga(pj, lb);

                    //parsing hasil menjadi string
                    String output = String.valueOf(hs);

                    //set txtHasil dengan output (string hasil parsing)
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasSegitiga(double p, double l){
        return p*l;
    }
}