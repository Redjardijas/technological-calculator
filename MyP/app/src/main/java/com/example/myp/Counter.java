package com.example.myp;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Counter extends AppCompatActivity {
    //public EditText edt1, edt2, edt3, edt5, edt6, edt7, edt9, grsl;
  //  public RadioButton rB, rB2, rB3;
   /* public Integer param;
   public MainActivity getgr, geta, getb, gets, getrb, getrb2, getrb3;
    public boolean checkerM1, checkerM2, checkerM3, checkerG1, checkerG2, checkerG3, checkerEd1, checkerEd100,checkerEd200,
            checkerEd300, checkerEd400, checkerEd500, checkerEd1000, checkerEd2000, checkerEd3000, checkerEd4000, checkerEd5000,
            checkerEd6000, checkerEd7000, checkerEd8000, checkerEd10000, checkerEd25000;
    public Double pech, pril, podr, perepl, g;
    public double[] dominantFirstKoefs = {4.0, 3.8, 3.6, 3.3, 3.2, 3.0, 1.7, 1.4, 1.3, 1.2, 1.1, 1.0, 0.9, 0.8, 0.4};
    public double[] dominantSecondtKoefs = {4.6, 4.5, 4.4, 4.2, 3.9, 3.2, 1.8, 1.7, 1.6, 1.5, 1.4, 1.3, 1.2, 1.1, 0.5};
    public double[] dominantThiirdKoefs = {5.0, 4.8, 4.6, 4.3, 4.0, 3.5, 2.0, 1.8, 1.7, 1.6, 1.5, 1.4, 1.3, 1.2, 0.6};
    public double[] romayorFirstKoefs = {3.8, 3.6, 3.5, 3.2, 3.0, 2.5, 1.5, 1.3, 1.2, 1.1, 1.0, 0.9, 0.8, 0.7};
    public double[] romayorSecondKoefs = {4.4, 4.3, 4.2, 4.0, 3.8, 3.0, 1.7, 1.6, 1.5, 1.4, 1.3, 1.2, 1.1, 1.0};
    public double[] romayorThirdKoefs = {4.8, 4.6, 4.4, 4.2, 4.0, 3.8, 3.0, 1.7, 1.6, 1.5, 1.4, 1.3, 1.2, 1.1, 1.0};
   /* double gr = getgr.get_my_gr();
    double a = geta.get_my_a();
    double b = getb.get_my_b();
    double s = gets.get_my_s();
    RadioButton rB = getrb.get_my_rb();
    RadioButton rB2 = getrb2.get_my_rb2();
    RadioButton rB3 = getrb3.get_my_rb3();*/
  /*  public void CountMeNow(View view) {
        // setContentView(R.layout.activity_main);
       /* edt1 = findViewById(R.id.ed1);
        edt2 = findViewById(R.id.ed2);
        edt3 = findViewById(R.id.ed4);
        edt9 = findViewById(R.id.ed9);
        edt5 = findViewById(R.id.ed5);
        edt6 = findViewById(R.id.ed6);
        edt7 = findViewById(R.id.ed7);
        double a = (edt1.getText() == null) ? 0 : Integer.parseInt(edt1.getText().toString());
        double b = (edt2.getText() == null) ? 0 : Integer.parseInt(edt2.getText().toString());
        double c = (edt3.getText() == null) ? 0 : Integer.parseInt(edt3.getText().toString());
        double d = (edt5.getText() == null) ? 0 : Integer.parseInt(edt5.getText().toString());
        double e = (edt6.getText() == null) ? 0 : Integer.parseInt(edt6.getText().toString());
        double f = (edt7.getText() == null) ? 0 : Integer.parseInt(edt7.getText().toString());
        double s = (edt9.getText() == null) ? 0 : Integer.parseInt(edt9.getText().toString());
        double gr = (grsl.getText() == null) ? 0 : Integer.parseInt(edt9.getText().toString());*/
        /*checkerG1 = gr < 2;
        checkerG2 = gr < 3;
        checkerG3 = gr > 2;
        checkerEd1 = a > 1;
        checkerEd100 = a >= 100;
        checkerEd200 = a >= 200;
        checkerEd300 = a >= 300;
        checkerEd400 = a >= 400;
        checkerEd500 = a >= 500;
        checkerEd1000 = a >= 1000;
        checkerEd2000 = a >= 2000;
        checkerEd3000 = a >= 3000;
        checkerEd4000 = a >= 4000;
        checkerEd5000 = a >= 5000;
        checkerEd6000 = a >= 6000;
        checkerEd7000 = a >= 7000;
        checkerEd8000 = a >= 8000;
        checkerEd10000 = a >= 10000;
        checkerEd25000 = a >= 25000;
        //проверка группы и машины
        boolean prD1 = checkerM1 && checkerG1;
        boolean prD2 = checkerM1 && checkerG2;
        boolean prD3 = checkerM1 && checkerG3;
        boolean prR1 = checkerM2 && checkerG1;
        boolean prR2 = checkerM2 && checkerG2;
        boolean prR3 = checkerM2 && checkerG3;
        boolean prK = !checkerM1 && !checkerM2;*/

        //назначение коэффициента приладки

        /*if (prD1) {
            pril = 20.0;
        } else if (prD2) {
            pril = 25.0;
        } else if (prD3) {
            pril = 30.0;
        } else if (prR1) {
            pril = 10.0;
        } else if (prR2) {
            pril = 14.0;
        } else if (prR3) {
            pril = 16.0;
        } else if (prK) {
            pril = 0.0;
        }



        // РОмайор проверка первой группы и назначение коэффициента печати
        if (checkerEd1 && prR1) {
            pech = romayorFirstKoefs[0];
        } else if (checkerEd100 && prR1) {
            pech = romayorFirstKoefs[1];
        } else if (checkerEd200 && prR1) {
            pech = romayorFirstKoefs[2];
        } else if (checkerEd300 && prR1) {
            pech = romayorFirstKoefs[3];
        } else if (checkerEd400 && prR1) {
            pech = romayorFirstKoefs[4];
        } else if (checkerEd500 && prR1) {
            pech = romayorFirstKoefs[5];
        } else if (checkerEd1000 && prR1) {
            pech = romayorFirstKoefs[6];
        } else if (checkerEd2000 && prR1) {
            pech = romayorFirstKoefs[7];
        } else if (checkerEd3000 && prR1) {
            pech = romayorFirstKoefs[8];
        } else if (checkerEd4000 && prR1) {
            pech = romayorFirstKoefs[9];
        } else if (checkerEd5000 && prR1) {
            pech = romayorFirstKoefs[10];
        } else if (checkerEd6000 && prR1) {
            pech = romayorFirstKoefs[11];
        } else if (checkerEd7000 && prR1) {
            pech = romayorFirstKoefs[12];
        } else if (checkerEd8000 && prR1) {
            pech = romayorFirstKoefs[13];
        } else if (checkerEd10000 && prR1) {
            pech = romayorFirstKoefs[13];
        } else if (checkerEd25000 && prR1) {
            pech = romayorFirstKoefs[13];
        }

        // Ромайор проверка второй группы и назначение коэффициента печати
        if (checkerEd1 && prR2) {
            pech = romayorSecondKoefs[0];
        } else if (checkerEd100 && prR2) {
            pech = romayorSecondKoefs[1];
        } else if (checkerEd200 && prR2) {
            pech = romayorSecondKoefs[2];
        } else if (checkerEd300 && prR2) {
            pech = romayorSecondKoefs[3];
        } else if (checkerEd400 && prR2) {
            pech = romayorSecondKoefs[4];
        } else if (checkerEd500 && prR2) {
            pech = romayorSecondKoefs[5];
        } else if (checkerEd1000 && prR2) {
            pech = romayorSecondKoefs[6];
        } else if (checkerEd2000 && prR2) {
            pech = romayorSecondKoefs[7];
        } else if (checkerEd3000 && prR2) {
            pech = romayorSecondKoefs[8];
        } else if (checkerEd4000 && prR2) {
            pech = romayorSecondKoefs[9];
        } else if (checkerEd5000 && prR2) {
            pech = romayorSecondKoefs[10];
        } else if (checkerEd6000 && prR2) {
            pech = romayorSecondKoefs[11];
        } else if (checkerEd7000 && prR2) {
            pech = romayorSecondKoefs[12];
        } else if (checkerEd8000 && prR2) {
            pech = romayorSecondKoefs[13];
        } else if (checkerEd10000 && prR2) {
            pech = romayorSecondKoefs[13];
        } else if (checkerEd25000 && prR2) {
            pech = romayorSecondKoefs[13];
        }


        //Ромайор проверка третьей группы и назначение коэффициента печати
        if (checkerEd1 && prR3) {
            pech = romayorThirdKoefs[0];
        } else if (checkerEd100 && prR3) {
            pech = romayorThirdKoefs[1];
        } else if (checkerEd200 && prR3) {
            pech = romayorThirdKoefs[2];
        } else if (checkerEd300 && prR3) {
            pech = romayorThirdKoefs[3];
        } else if (checkerEd400 && prR3) {
            pech = romayorThirdKoefs[4];
        } else if (checkerEd500 && prR3) {
            pech = romayorThirdKoefs[5];
        } else if (checkerEd1000 && prR3) {
            pech = romayorThirdKoefs[6];
        } else if (checkerEd2000 && prR3) {
            pech = romayorThirdKoefs[7];
        } else if (checkerEd3000 && prR3) {
            pech = romayorThirdKoefs[8];
        } else if (checkerEd4000 && prR3) {
            pech = romayorThirdKoefs[9];
        } else if (checkerEd5000 && prR3) {
            pech = romayorThirdKoefs[10];
        } else if (checkerEd6000 && prR3) {
            pech = romayorThirdKoefs[11];
        } else if (checkerEd7000 && prR3) {
            pech = romayorThirdKoefs[12];
        } else if (checkerEd8000 && prR3) {
            pech = romayorThirdKoefs[13];
        } else if (checkerEd10000 && prR3) {
            pech = romayorThirdKoefs[13];
        } else if (checkerEd25000 && prR3) {
            pech = romayorThirdKoefs[13];
        }





        // Доминант проверка первой группы и назначение коэффициента печати
        if (checkerEd1 && prD1) {
            pech = dominantFirstKoefs[0];
        } else if (checkerEd100 && prD1) {
            pech = dominantFirstKoefs[1];
        } else if (checkerEd200 && prD1) {
            pech = dominantFirstKoefs[2];
        } else if (checkerEd300 && prD1) {
            pech = dominantFirstKoefs[3];
        } else if (checkerEd400 && prD1) {
            pech = dominantFirstKoefs[4];
        } else if (checkerEd500 && prD1) {
            pech = dominantFirstKoefs[5];
        } else if (checkerEd1000 && prD1) {
            pech = dominantFirstKoefs[6];
        } else if (checkerEd2000 && prD1) {
            pech = dominantFirstKoefs[7];
        } else if (checkerEd3000 && prD1) {
            pech = dominantFirstKoefs[8];
        } else if (checkerEd4000 && prD1) {
            pech = dominantFirstKoefs[9];
        } else if (checkerEd5000 && prD1) {
            pech = dominantFirstKoefs[10];
        } else if (checkerEd6000 && prD1) {
            pech = dominantFirstKoefs[11];
        } else if (checkerEd7000 && prD1) {
            pech = dominantFirstKoefs[12];
        } else if (checkerEd8000 && prD1) {
            pech = dominantFirstKoefs[13];
        } else if (checkerEd10000 && prD1) {
            pech = dominantFirstKoefs[14];
        } else if (checkerEd25000 && prD1) {
            pech = dominantFirstKoefs[14];
        }

        // Доминант проверка второй группы и назначение коэффициента печати
        if (checkerEd1 && prD2) {
            pech = dominantSecondtKoefs[0];
        } else if (checkerEd100 && prD2) {
            pech = dominantSecondtKoefs[1];
        } else if (checkerEd200 && prD2) {
            pech = dominantSecondtKoefs[2];
        } else if (checkerEd300 && prD2) {
            pech = dominantSecondtKoefs[3];
        } else if (checkerEd400 && prD2) {
            pech = dominantSecondtKoefs[4];
        } else if (checkerEd500 && prD2) {
            pech = dominantSecondtKoefs[5];
        } else if (checkerEd1000 && prD2) {
            pech = dominantSecondtKoefs[6];
        } else if (checkerEd2000 && prD2) {
            pech = dominantSecondtKoefs[7];
        } else if (checkerEd3000 && prD2) {
            pech = dominantSecondtKoefs[8];
        } else if (checkerEd4000 && prD2) {
            pech = dominantSecondtKoefs[9];
        } else if (checkerEd5000 && prD2) {
            pech = dominantSecondtKoefs[10];
        } else if (checkerEd6000 && prD2) {
            pech = dominantSecondtKoefs[11];
        } else if (checkerEd7000 && prD2) {
            pech = dominantSecondtKoefs[12];
        } else if (checkerEd8000 && prD2) {
            pech = dominantSecondtKoefs[13];
        } else if (checkerEd10000 && prD2) {
            pech = dominantSecondtKoefs[14];
        } else if (checkerEd25000 && prD2) {
            pech = dominantSecondtKoefs[14];
        }


        //Доминант проверка третьей группы и назначение коэффициента печати
        if (checkerEd1 && prD3) {
            pech = dominantThiirdKoefs[0];
        } else if (checkerEd100 && prD3) {
            pech = dominantThiirdKoefs[1];
        } else if (checkerEd200 && prD3) {
            pech = dominantThiirdKoefs[2];
        } else if (checkerEd300 && prD3) {
            pech = dominantThiirdKoefs[3];
        } else if (checkerEd400 && prD3) {
            pech = dominantThiirdKoefs[4];
        } else if (checkerEd500 && prD3) {
            pech = dominantThiirdKoefs[5];
        } else if (checkerEd1000 && prD3) {
            pech = dominantThiirdKoefs[6];
        } else if (checkerEd2000 && prD3) {
            pech = dominantThiirdKoefs[7];
        } else if (checkerEd3000 && prD3) {
            pech = dominantThiirdKoefs[8];
        } else if (checkerEd4000 && prD3) {
            pech = dominantThiirdKoefs[9];
        } else if (checkerEd5000 && prD3) {
            pech = dominantThiirdKoefs[10];
        } else if (checkerEd6000 && prD3) {
            pech = dominantThiirdKoefs[11];
        } else if (checkerEd7000 && prD3) {
            pech = dominantThiirdKoefs[12];
        } else if (checkerEd8000 && prD3) {
            pech = dominantThiirdKoefs[13];
        } else if (checkerEd10000 && prD3) {
            pech = dominantThiirdKoefs[14];
        } else if (checkerEd25000 && prD3) {
            pech = dominantThiirdKoefs[14];
        }

        if (prK) {
            pech = dominantFirstKoefs[0];
        }*/

      /*  if (rB.isChecked()) {
            checkerM2 = false;
            checkerM1 = true;
            checkerM3 = false;
            g = a * b / s;
            param = 2;
        }

        if (rB2.isChecked()) {
            checkerM2 = true;
            checkerM1 = false;
            checkerM3 = false;
            perepl = 0.4;
            param = 4;
            g = 2 * a * b / s;
        }

        if (rB3.isChecked()) {
            checkerM2 = false;
            checkerM1 = false;
            checkerM3 = true;
            podr = 0.2;
            perepl = 0.8;
            param = 4;
            g = 2*a*b/s;
            System.out.println(g);

        }
    }*/


   /* public Double get_my_pril(){
        return this.pril;
    }
    public Double get_my_pech(){
        return this.pech;
    }
    public Double get_my_g(){
        return this.g;
    }
    public Double get_my_podr(){
        return this.podr;
    }
    public Double get_my_perepl(){
        return this.perepl;
    }
    public Integer get_my_param(){
        return this.param;
    }*/
    }

