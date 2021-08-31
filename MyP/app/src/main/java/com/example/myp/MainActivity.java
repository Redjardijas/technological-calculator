package com.example.myp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.myp.R.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn, btn2;
    Double pech, pril, podr, perepl, g;
    Integer param;
    EditText edt1, edt2, edt3, edt5, edt6, edt7, edt9;
    CheckBox dCheckBox, rBCheckBox, kCheckBox;
    TextView txt1, txt2, txt3, txt4, txt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        btn = findViewById(id.button);
        edt1 = findViewById(id.ed1);
        edt2 = findViewById(id.ed2);
        edt3 = findViewById(id.ed4);
        edt9 = findViewById(id.ed9);
        dCheckBox = findViewById(id.checkBox2);
        rBCheckBox = findViewById(id.checkBox);
        kCheckBox = findViewById(id.checkBox3);
        edt5 = findViewById(id.ed5);
        edt6 = findViewById(id.ed6);
        edt7 = findViewById(id.ed7);
      btn2 = findViewById(id.button2);
        txt1 = findViewById(id.size);
        txt2 = findViewById(id.textView2);
        txt3 = findViewById(id.edition);
        txt4 = findViewById(id.txtPages);
        txt5 = findViewById(id.txtPaper);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {   double a = (edt1.getText() == null) ? 0 : Integer.parseInt(edt1.getText().toString());
                double b = (edt2.getText() == null) ? 0 : Integer.parseInt(edt2.getText().toString());
                double c = (edt3.getText() == null) ? 0 : Integer.parseInt(edt3.getText().toString());
                double d = (edt5.getText() == null) ? 0 : Integer.parseInt(edt5.getText().toString());
                double e = (edt6.getText() == null) ? 0 : Integer.parseInt(edt6.getText().toString());
                double f = (edt7.getText() == null) ? 0 : Integer.parseInt(edt7.getText().toString());
                double s = (edt9.getText() == null) ? 0 : Integer.parseInt(edt9.getText().toString());
                if(dCheckBox.isChecked()) {
                    pril = 20.0;
                    podr = 0.2;
                    perepl = 0.8;
                    pech = 1.7;
                    param = 2;
                    g = a*b/s;
                   /* switch (a){

                    }*/
                }
                if(rBCheckBox.isChecked()) {
                    pril = 3.6;
                    podr = 0.2;
                    perepl = 0.4;
                    pech = 10.0;
                    param = 4;
                    g = 2*a*b/s;
                }
                if(kCheckBox.isChecked()) {
                    pril = 0.0;
                    podr = 0.2;
                    perepl = 0.8;
                    pech = 0.0;
                    param = 4;
                    g = 2*a*b/s;
                }
                Double h = g*perepl/100;
                Double i = pril*f;
                Double j = g*podr/100;
                Double k = f*pech*g/100;
                double m = c/1000;
                double n1 = e/100;
                double n2 = d/100;
                Double l= g + h + i + j + k;
                double o = l/param;
                txt2.setText(Double.toString(o*m*n1*n2));
            }
        });

        btn2.setOnClickListener(v -> {
            edt1.getText().clear();
            edt2.getText().clear();
            edt3.getText().clear();
            edt5.getText().clear();
            edt6.getText().clear();
            edt7.getText().clear();
            edt9.getText().clear();
        });
    }


    @Override
    public void onClick(View v) {

    }
}