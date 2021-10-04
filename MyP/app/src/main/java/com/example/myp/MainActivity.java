package com.example.myp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.myp.R.*;

public class MainActivity extends AppCompatActivity {
    public Button btn, btn2;
  //public Counter getpril, getpech, getpodr, getperepl, getparam, getg;
  // public double gr, a, b, s;
       // public Double pech, pril, podr, perepl, g, prilD, prilR;
    //public Integer param;
    /*public boolean checkerM1, checkerM2, checkerM3, checkerG1, checkerG2, checkerG3, checkerEd1, checkerEd100,checkerEd200,
    checkerEd300, checkerEd400, checkerEd500, checkerEd1000, checkerEd2000, checkerEd3000, checkerEd4000, checkerEd5000,
    checkerEd6000, checkerEd7000, checkerEd8000, checkerEd10000, checkerEd25000;*/
 // public EditText edt1, edt2, edt3, edt5, edt6, edt7, edt9, grsl;
    public TextView txt1, txt2, txt3, txt4, txt5;
   /* public Spinner sp3, sp1;
    public RadioButton rB, rB2, rB3;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        // найти все что требуется через айди
       /* sp1 = findViewById(R.id.spinner);
        sp3 = findViewById(R.id.spinner3);
        btn = findViewById(id.button);
        grsl = findViewById(id.grsl);
        edt1 = findViewById(id.ed1);
        edt2 = findViewById(id.ed2);
        edt3 = findViewById(id.ed4);
        edt9 = findViewById(id.ed9);
        edt5 = findViewById(id.ed5);
        edt6 = findViewById(id.ed6);
        edt7 = findViewById(id.ed7);
        btn2 = findViewById(id.button2);
        txt1 = findViewById(id.size);
        txt2 = findViewById(id.textView2);
        txt3 = findViewById(id.edition);
        txt4 = findViewById(id.txtPages);
        txt5 = findViewById(id.txtPaper);
       /* sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                                       View itemSelected, int selectedItemPosition, long selectedId) {

                String[] choose = getResources().getStringArray(array.sizes);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                toast.show();
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });*/
// дать адаптеры спиннерам (их два, не забудь)
      /*  ArrayAdapter<?> adapter =
                ArrayAdapter.createFromResource(this, array.sizes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp3.setAdapter(adapter);
        ArrayAdapter<?> adapter1 =
                ArrayAdapter.createFromResource(this, array.colors, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter1);

        double a = (edt1.getText() == null) ? 0 : Integer.parseInt(edt1.getText().toString());
        double b = (edt2.getText() == null) ? 0 : Integer.parseInt(edt2.getText().toString());
        double c = (edt3.getText() == null) ? 0 : Integer.parseInt(edt3.getText().toString());
        double d = (edt5.getText() == null) ? 0 : Integer.parseInt(edt5.getText().toString());
        double e = (edt6.getText() == null) ? 0 : Integer.parseInt(edt6.getText().toString());
        double f = (edt7.getText() == null) ? 0 : Integer.parseInt(edt7.getText().toString());
        double s = (edt9.getText() == null) ? 0 : Integer.parseInt(edt9.getText().toString());
        double gr = (grsl.getText() == null) ? 0 : Integer.parseInt(edt9.getText().toString());*/
        /*Double pril = getpril.get_my_pril();
        Double pech = getpech.get_my_pech();
        Double g = getg.get_my_g();
        Double perepl = getperepl.get_my_perepl();
        Double podr = getpodr.get_my_podr();
        Integer param = getparam.get_my_param();*/

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //получить введенные данные о тираже, группе, формате(спиннер), объеме, плотности бумаги,
                // формате бумаги, красочности (спиннер)

                /*if (rB.isChecked()) {
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
                }*/
                /*double c = (edt3.getText() == null) ? 0 : Integer.parseInt(edt3.getText().toString());
                double d = (edt5.getText() == null) ? 0 : Integer.parseInt(edt5.getText().toString());
                double e = (edt6.getText() == null) ? 0 : Integer.parseInt(edt6.getText().toString());
                double f = (edt7.getText() == null) ? 0 : Integer.parseInt(edt7.getText().toString());

                Double h = g * perepl / 100;
                Double i = pril * f;
                Double k = f * pech * g / 100;
                double m = c / 1000;
                double n1 = e / 100;
                double n2 = d / 100;
                Double j = g * podr / 100;
                Double l = g + h + i + j + k;
                double o = l / param;
                double zz = o * m * n1 * n2;*/
                double zz = 20.0;
                txt2.setText(Double.toString(zz));

            }
        });


        // очистить все поля эдиттекст
      /*  btn2.setOnClickListener(v -> {
            edt1.getText().clear();
            edt2.getText().clear();
            edt3.getText().clear();
            edt5.getText().clear();
            edt6.getText().clear();
            edt7.getText().clear();
            edt9.getText().clear();
            grsl.getText().clear();
        });*/
//зачем здесь массивы коэффициентов не понимаю, но я их запишу

        //учимся делать экземпляры классов
/*
        Counter dominant = new Counter( "Доминант", 20.0, 25.0, 30.0,
               dominantFirstKoefs, dominantSecondtKoefs, dominantThiirdKoefs);
        Counter romajor = new Counter( "Ромайор", 10.0, 14.0, 16.0,
                romayorFirstKoefs, romayorSecondKoefs, romayorThirdKoefs);*/

    }
   /* public Double get_my_gr(){
        return this.gr;
    }
    public Double get_my_a(){
        return this.a;
    }
    public Double get_my_b(){
        return this.b;
    }
    public Double get_my_s(){
        return this.s;
    }
    public RadioButton get_my_rb(){
        return this.rB;
    }
    public RadioButton get_my_rb2(){
        return this.rB2;
    }
    public RadioButton get_my_rb3(){
        return this.rB3;
    }*/
}