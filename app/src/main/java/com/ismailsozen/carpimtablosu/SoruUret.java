package com.ismailsozen.carpimtablosu;

import java.util.Random;

public class SoruUret {


    int a,b;
    int carpim;

    public int SoruUret()
    {
        // For Question rand number
        Random r=new Random(); //random sınıfı
        a=r.nextInt(10);
        b=r.nextInt(10);
        carpim=a*b;
        return carpim;



    }

}
