package com.ismailsozen.carpimtablosu;

import java.util.Random;

public class TahminUret {

    int uret1, uret2,uret3,uret4 ;
    Random r=new Random(); //random sınıfı




    public int TahminUret1(int carpim)
    {

         uret1=carpim-(r.nextInt(7)+1);


         return uret1;
    }

    public int TahminUret2(int carpim)
    {
        uret2=carpim+(r.nextInt(12)+1);

        return uret2;
    }

    public int TahminUret3(int carpim)
    {
        uret3=carpim+(r.nextInt(10)+1);

        return uret3;
    }

    public int TahminUret4(int carpim)
    {
        uret4=carpim;

        return uret4;
    }






}
