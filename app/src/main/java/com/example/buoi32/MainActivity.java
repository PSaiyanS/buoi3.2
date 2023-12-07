package com.example.buoi32;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat ;
import android.os.Bundle;
import android.view.View;
import android.widget.Button ;
import android.widget.EditText ;

public class MainActivity extends AppCompatActivity {
    Button btnBMI;
    EditText edtten, edtheight, edtweight, edtBMI, edtchuandoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBMI= findViewById(R.id.btnBMI);
        edtten = findViewById(R.id.edtten);
        edtheight = findViewById(R.id.edtheight);
        edtweight = findViewById(R.id.edtweight);
        edtBMI = findViewById(R.id.edtBMI);
        edtchuandoan = findViewById(R.id.edtchuandoan);
        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h =Double.parseDouble(edtheight.getText().toString());
                double w =Double.parseDouble(edtweight.getText().toString());
                double BMI = w/Math.pow(h,2);
                String chuandoan="";
                if (BMI<18)
                {
                    chuandoan="Bạn gầy";
                }
                else if (BMI<=24.9)
                {
                    chuandoan="Bạn bình thường";
                }else if (BMI<=29.9)
                {
                    chuandoan="Bạn béo phì độ 1";
                }else if (BMI<=34.9)
                {
                    chuandoan="Bạn béo phì độ 2";
                }else
                {
                    chuandoan="Bạn béo phì độ 3";
                }
                DecimalFormat dcf=new DecimalFormat("#.0");
                edtBMI.setText(dcf.format(BMI));
                edtchuandoan.setText(chuandoan);
            }
        });
    }
}
