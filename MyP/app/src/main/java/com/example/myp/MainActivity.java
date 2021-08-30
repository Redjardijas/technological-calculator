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
    Double pech, pril, podr, perepl, v1;
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
            {
                if(dCheckBox.isChecked()) {
                    pril = 0.048;
                    podr = 0.002;
                    perepl = 0.008;
                    pech = 20.0;
                    param = 2;
                    v1 = 1.0;
                }
                if(rBCheckBox.isChecked()) {
                    pril = 0.036;
                    podr = 0.002;
                    perepl = 0.004;
                    pech = 10.0;
                    param = 4;
                    v1 = 0.5;
                }
                if(kCheckBox.isChecked()) {
                    pril = 0.0;
                    podr = 0.002;
                    perepl = 0.008;
                    pech = 0.0;
                    param = 4;
                    v1 = 0.5;
                }
                int a = (edt1.getText() == null) ? 0 : Integer.parseInt(edt1.getText().toString());
                int b = (edt2.getText() == null) ? 0 : Integer.parseInt(edt2.getText().toString());
                int c = (edt3.getText() == null) ? 0 : Integer.parseInt(edt3.getText().toString());
                int d = (edt5.getText() == null) ? 0 : Integer.parseInt(edt5.getText().toString());
                int e = (edt6.getText() == null) ? 0 : Integer.parseInt(edt6.getText().toString());
                int f = (edt7.getText() == null) ? 0 : Integer.parseInt(edt7.getText().toString());
                int s = (edt9.getText() == null) ? 0 : Integer.parseInt(edt9.getText().toString());
                double g = a * b/v1*s;
                Double h = g*perepl*f;
                Double i = pril*f*g;
                Double j = g*podr;
                Double k = f*pech;
                Double l= g + h + i + j + k;
                txt2.setText(Double.toString(l/param*c/1000*e/100*d/100));
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