package com.example.myp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.myp.R.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn, btn2;
    Double pech, pril, podr, perepl, g;
    Integer param;
    EditText edt1, edt2, edt3, edt5, edt6, edt7, edt9, grsl;
    CheckBox dCheckBox, rBCheckBox, kCheckBox;
    TextView txt1, txt2, txt3, txt4, txt5;
    Spinner sp3, sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        sp1 = findViewById(id.spinner);
        sp3 = findViewById(id.spinner3);
        btn = findViewById(id.button);
        grsl = findViewById(id.grsl);
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
               ArrayAdapter<?> adapter =
                ArrayAdapter.createFromResource(this, array.sizes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp3.setAdapter(adapter);
        ArrayAdapter<?> adapter1 =
                ArrayAdapter.createFromResource(this, array.colors, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {   double[] dominantFirstKoefs = {4.0, 3.8, 3.6, 3.3, 3.2, 3.0, 1.7, 1.4, 1.3, 1.2, 1.1, 1.0, 0.9, 0.8, 0.4 };
                double[] dominantSecondtKoefs = {4.6, 4.5, 4.4, 4.2, 3.9, 3.2, 1.8, 1.7, 1.6, 1.5, 1.4, 1.3, 1.2, 1.1, 0.5 };
                double[] dominantThiirdKoefs = {5.0, 4.8, 4.6, 4.3, 4.0, 3.5, 2.0, 1.8, 1.7, 1.6, 1.5, 1.4, 1.3, 1.2, 0.6 };
                double[] romayorFirstKoefs = {3.8, 3.6, 3.5, 3.2, 3.0, 2.5, 1.5, 1.3, 1.2, 1.1, 1.0, 0.9, 0.8, 0.7 };
                double[] romayorSecondKoefs = {4.4, 4.3, 4.2, 4.0, 3.8, 3.0, 1.7, 1.6, 1.5, 1.4, 1.3, 1.2, 1.1, 1.0 };
                double[] romayorThirdKoefs = {4.8, 4.6, 4.4, 4.2, 4.0, 3.8, 3.0, 1.7, 1.6, 1.5, 1.4, 1.3, 1.2, 1.1, 1.0 };
                double a = (edt1.getText() == null) ? 0 : Integer.parseInt(edt1.getText().toString());
                double b = (edt2.getText() == null) ? 0 : Integer.parseInt(edt2.getText().toString());
                double c = (edt3.getText() == null) ? 0 : Integer.parseInt(edt3.getText().toString());
                double d = (edt5.getText() == null) ? 0 : Integer.parseInt(edt5.getText().toString());
                double e = (edt6.getText() == null) ? 0 : Integer.parseInt(edt6.getText().toString());
                double f = (edt7.getText() == null) ? 0 : Integer.parseInt(edt7.getText().toString());
                double s = (edt9.getText() == null) ? 0 : Integer.parseInt(edt9.getText().toString());
                int gr = (grsl.getText() == null) ? 0 : Integer.parseInt(edt9.getText().toString());
                double[] priladkaD = {20, 25, 30};
                double[] priladkaR = {10, 14, 16};
                if(dCheckBox.isChecked()) {
                    if(gr == 1){ pril = priladkaD[0];}
                    if(gr == 2){ pril = priladkaD[1];}
                    if(gr == 3){ pril = priladkaD[2];}
                    podr = 0.2;
                    perepl = 0.8;
                    pech = 1.7;
                    param = 2;
                    g = a * b / s;
                    if (a > 10) {
                        pech = 4.0;
                    } else {
                        if (a > 100) {
                            pech = 3.8;
                        } else {
                            if (a > 1000) {
                                pech = 1.7;
                            } else {
                                if (a > 2000) {
                                    pech = 1.4;
                                } else {
                                    if (a > 7000) {
                                        pech = 0.9;
                                    }
                                }
                            }
                        }
                    }
                }
                if(rBCheckBox.isChecked()) {
                    if(gr == 1){ pril = priladkaR[0];}
                    if(gr == 2){ pril = priladkaD[1];}
                    if(gr == 3){ pril = priladkaD[3];}
                    podr = 0.2;
                    perepl = 0.4;
                    pech = 10.0;
                    param = 4;
                    g = 2*a*b/s;
                    if (a > 10) {
                        pech = 3.8;
                    } else {
                        if (a > 100) {
                            pech = 3.6;
                        } else {
                            if (a > 1000) {
                                pech = 1.5;
                            } else {
                                if (a > 2000) {
                                    pech = 1.3;
                                } else {
                                    if (a > 7000) {
                                        pech = 0.8;
                                    }
                                }
                            }
                        }
                    }
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