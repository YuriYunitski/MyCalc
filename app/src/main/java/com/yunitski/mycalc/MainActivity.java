package com.yunitski.mycalc;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button ac, plus_minus, percent, divide, _7, _8, _9, multiply, _4, _5, _6, minus, _1, _2, _3, plus, _0, comma, eq;
    EditText result;
    TextView inputView;
    String etRes;
    float inputF, lastInputF;
    static String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ac = findViewById(R.id._ac);
        ac.setOnClickListener(this);
        plus_minus = findViewById(R.id._plus_minus);
        plus_minus.setOnClickListener(this);
        percent = findViewById(R.id._percent);
        percent.setOnClickListener(this);
        divide = findViewById(R.id._divide);
        divide.setOnClickListener(this);
        _7 = findViewById(R.id._7);
        _7.setOnClickListener(this);
        _8 = findViewById(R.id._8);
        _8.setOnClickListener(this);
        _9 = findViewById(R.id._9);
        _9.setOnClickListener(this);
        multiply = findViewById(R.id._multiply);
        multiply.setOnClickListener(this);
        _4 = findViewById(R.id._4);
        _4.setOnClickListener(this);
        _5 = findViewById(R.id._5);
        _5.setOnClickListener(this);
        _6 = findViewById(R.id._6);
        _6.setOnClickListener(this);
        minus = findViewById(R.id._minus);
        minus.setOnClickListener(this);
        _1 = findViewById(R.id._1);
        _1.setOnClickListener(this);
        _2 = findViewById(R.id._2);
        _2.setOnClickListener(this);
        _3 = findViewById(R.id._3);
        _3.setOnClickListener(this);
        plus = findViewById(R.id._plus);
        plus.setOnClickListener(this);
        _0 = findViewById(R.id._0);
        _0.setOnClickListener(this);
        comma = findViewById(R.id._comma);
        comma.setOnClickListener(this);
        eq = findViewById(R.id._eq);
        eq.setOnClickListener(this);
        result = findViewById(R.id.result);
        result.setInputType(InputType.TYPE_NULL);
        result.setText("0");
        inputView = findViewById(R.id.inputView);
        inputView.setText("0");
        etRes = "";
        inputF = 0;
        lastInputF = 0;
        status = "numIn";
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id._0:
                numInputMethod(0);
                break;
            case R.id._1:
                numInputMethod(1);
                break;
            case R.id._2:
                numInputMethod(2);
                break;
            case R.id._3:
                numInputMethod(3);
                break;
            case R.id._4:
                numInputMethod(4);
                break;
            case R.id._5:
                numInputMethod(5);
                break;
            case R.id._6:
                numInputMethod(6);
                break;
            case R.id._7:
                numInputMethod(7);
                break;
            case R.id._8:
                numInputMethod(8);
                break;
            case R.id._9:
                numInputMethod(9);
                break;
            case R.id._comma:
                break;
            case R.id._plus:
                plusMethod();
                break;
            case R.id._eq:
                break;
        }
    }

    private void numInputMethod(int i) {
        if (Float.parseFloat(inputView.getText().toString()) < (((Float.MAX_VALUE)/10)-1)) {
            if (status.equals("numIn")) {
                etRes += i;
                result.setText(etRes);
                inputF = Float.parseFloat(result.getText().toString());
                inputView.setText("" + inputF);
            } else if (status.equals("plusIn")){
                etRes += i;
                result.setText(etRes);
                inputF = Float.parseFloat(result.getText().toString());
                inputView.setText("" + inputF);
            }
        }
    }
    private void plusMethod(){
        if (status.equals("numIn")) {
            lastInputF = inputF;
            inputF = 0;
            etRes = "";
            status = "plusIn";
        } else if (status.equals("plusIn")){
            lastInputF += inputF;
            etRes = "" + lastInputF;
            result.setText(etRes);
            inputF = 0;
            etRes = "";
        }
    }
    private void resultMethod(){

    }

}
