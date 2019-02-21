package com.ismailsozen.carpimtablosu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    TextView textViewSonuc;
    Button buttonTekrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        textViewSonuc=findViewById(R.id.textViewSonuc);
        buttonTekrar=findViewById(R.id.buttonTekrar);

        Intent intent=getIntent();
        int sonuc=intent.getIntExtra("gelen",0);

        textViewSonuc.setText(""+sonuc);

        buttonTekrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ana=new Intent(ScoreActivity.this,SoruActivity.class);
                startActivity(ana);



            }
        });




    }


}
