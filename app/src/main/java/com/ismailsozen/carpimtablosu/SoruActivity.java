package com.ismailsozen.carpimtablosu;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SoruActivity extends AppCompatActivity {

    Button buttonA,buttonB,buttonC,buttonD,buttonSure;
    TextView textViewSoru;
    CountDownTimer sure;
     int secimA,secimB,secimC,secimD;
     int carpim;
     int puan=0;
    SoruUret soruUret=new SoruUret();
    TahminUret tahminUret=new TahminUret();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soru);


        buttonA=findViewById(R.id.buttonA);
        buttonB=findViewById(R.id.buttonB);
        buttonC=findViewById(R.id.buttonC);
        buttonD=findViewById(R.id.buttonD);
        buttonSure=findViewById(R.id.buttonSure);
        textViewSoru=findViewById(R.id.textViewSoru);





        carpim=soruUret.SoruUret();
        textViewSoru.setText(soruUret.a+" * "+soruUret.b);



        Random r=new Random(); //random sınıfı
        int degisken=r.nextInt(3);
        if (degisken==0)
        {
            buttonD.setText(String.valueOf(tahminUret.TahminUret4(carpim)));
            buttonA.setText(String.valueOf(tahminUret.TahminUret1(carpim)));
            buttonB.setText(String.valueOf(tahminUret.TahminUret2(carpim)));
            buttonC.setText(String.valueOf(tahminUret.TahminUret3(carpim)));
        }
        if (degisken==1)
        {
            buttonC.setText(String.valueOf(tahminUret.TahminUret4(carpim)));
            buttonA.setText(String.valueOf(tahminUret.TahminUret1(carpim)));
            buttonB.setText(String.valueOf(tahminUret.TahminUret2(carpim)));
            buttonD.setText(String.valueOf(tahminUret.TahminUret3(carpim)));
        }
        if (degisken==2)
        {
            buttonA.setText(String.valueOf(tahminUret.TahminUret4(carpim)));
            buttonD.setText(String.valueOf(tahminUret.TahminUret1(carpim)));
            buttonB.setText(String.valueOf(tahminUret.TahminUret2(carpim)));
            buttonC.setText(String.valueOf(tahminUret.TahminUret3(carpim)));
        }
        if (degisken==3)
        {
            buttonB.setText(String.valueOf(tahminUret.TahminUret4(carpim)));
            buttonA.setText(String.valueOf(tahminUret.TahminUret1(carpim)));
            buttonD.setText(String.valueOf(tahminUret.TahminUret2(carpim)));
            buttonC.setText(String.valueOf(tahminUret.TahminUret3(carpim)));
        }



        sure=new CountDownTimer(4000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                buttonSure.setText(""+millisUntilFinished/1000);


            }

            @Override
            public void onFinish() {


                Intent intent=new Intent(SoruActivity.this,ScoreActivity.class);
                intent.putExtra("gelen",puan);
                startActivity(intent);

            }
        }.start();



        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 secimA= Integer.valueOf( buttonA.getText().toString());


                if (secimA == carpim)
                {
                    puan=puan+1;
                    carpim=soruUret.SoruUret();
                    textViewSoru.setText(soruUret.a+" * "+soruUret.b);
                    YeniTahminUret(carpim);
                    sure.start();

                }
                else if (secimA !=carpim){


                    Intent intent=new Intent(SoruActivity.this,ScoreActivity.class);
                    intent.putExtra("gelen",puan);
                    startActivity(intent);
                    sure.cancel();




                }


            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 secimB= Integer.valueOf( buttonB.getText().toString());
                if (secimB == carpim)
                {
                    puan=puan+1;
                    carpim=soruUret.SoruUret();
                    textViewSoru.setText(soruUret.a+" * "+soruUret.b);
                    YeniTahminUret(carpim);
                    sure.start();


                }
                else if (secimB != carpim){

                    Intent intent=new Intent(SoruActivity.this,ScoreActivity.class);
                    intent.putExtra("gelen",puan);
                    startActivity(intent);
                    sure.cancel();

                }

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 secimC= Integer.valueOf( buttonC.getText().toString());
                if (secimC == carpim)
                {
                    puan=puan+1;
                    carpim=soruUret.SoruUret();
                    textViewSoru.setText(soruUret.a+" * "+soruUret.b);
                    YeniTahminUret(carpim);
                    sure.start();
                }
                else if (secimC !=carpim){

                    Intent intent=new Intent(SoruActivity.this,ScoreActivity.class);
                    intent.putExtra("gelen",puan);
                    startActivity(intent);
                    sure.cancel();

                }

            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 secimD= Integer.valueOf( buttonD.getText().toString());
                if (secimD == carpim)
                {
                    puan=puan+1;
                    carpim=soruUret.SoruUret();
                    textViewSoru.setText(soruUret.a+" * "+soruUret.b);
                    YeniTahminUret(carpim);
                    sure.start();

                }
                else if (secimD != carpim){

                    Intent intent=new Intent(SoruActivity.this,ScoreActivity.class);
                    intent.putExtra("gelen",puan);
                    startActivity(intent);
                    sure.cancel();

                }


            }
        });




    }

    public void YeniTahminUret(int gelen)
    {
        Random r=new Random(); //random sınıfı
        int degisken=r.nextInt(3);
        if (degisken==0)
        {
            buttonD.setText(String.valueOf(tahminUret.TahminUret4(gelen)));
            buttonA.setText(String.valueOf(tahminUret.TahminUret1(gelen)));
            buttonB.setText(String.valueOf(tahminUret.TahminUret2(gelen)));
            buttonC.setText(String.valueOf(tahminUret.TahminUret3(gelen)));
        }
        if (degisken==1)
        {
            buttonC.setText(String.valueOf(tahminUret.TahminUret4(gelen)));
            buttonA.setText(String.valueOf(tahminUret.TahminUret1(gelen)));
            buttonB.setText(String.valueOf(tahminUret.TahminUret2(gelen)));
            buttonD.setText(String.valueOf(tahminUret.TahminUret3(gelen)));
        }
        if (degisken==2)
        {
            buttonA.setText(String.valueOf(tahminUret.TahminUret4(gelen)));
            buttonD.setText(String.valueOf(tahminUret.TahminUret1(gelen)));
            buttonB.setText(String.valueOf(tahminUret.TahminUret2(gelen)));
            buttonC.setText(String.valueOf(tahminUret.TahminUret3(gelen)));
        }
        if (degisken==3)
        {
            buttonB.setText(String.valueOf(tahminUret.TahminUret4(gelen)));
            buttonA.setText(String.valueOf(tahminUret.TahminUret1(gelen)));
            buttonD.setText(String.valueOf(tahminUret.TahminUret2(gelen)));
            buttonC.setText(String.valueOf(tahminUret.TahminUret3(gelen)));
        }

    }

    @Override
    public void onBackPressed() {


        Intent intent=new Intent(SoruActivity.this,MainActivity.class);
        startActivity(intent);
        sure.cancel();

    }
}
