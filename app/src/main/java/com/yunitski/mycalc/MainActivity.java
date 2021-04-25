package com.yunitski.mycalc;

import android.graphics.Color;
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
    String inputString, prevInputString, status;
    float inputFloat, prevInputFloat;
    boolean commaIn;
    int inputInt, prevInputInteger;

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
        inputString = "";
        prevInputString = "";
        commaIn = false;
        inputFloat = 0;
        prevInputFloat = 0;
        inputInt = 0;
        prevInputInteger = 0;
        status = "";
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id._0) {
            numInputMethod("0");
        } else if (id == R.id._1) {
            numInputMethod("1");
        } else if (id == R.id._2) {
            numInputMethod("2");
        } else if (id == R.id._3) {
            numInputMethod("3");
        } else if (id == R.id._4) {
            numInputMethod("4");
        } else if (id == R.id._5) {
            numInputMethod("5");
        } else if (id == R.id._6) {
            numInputMethod("6");
        } else if (id == R.id._7) {
            numInputMethod("7");
        } else if (id == R.id._8) {
            numInputMethod("8");
        } else if (id == R.id._9) {
            numInputMethod("9");
        } else if (id == R.id._comma) {
            numInputMethod(".");
        } else if (id == R.id._plus) {
            plusMethod();
        } else if (id == R.id._minus) {
            minusMethod();
        } else if (id == R.id._eq) {
            resultMethod();
        } else if (id == R.id._multiply){
            multiplyMethod();
        } else if (id == R.id._ac){
            acMethod();
        } else if (id == R.id._divide){
            divideMethod();
        } else if (id == R.id._plus_minus){
            plusMinusMethod();
        } else if (id == R.id._percent){
            percentMethod();
        }
    }

    private void percentMethod() {
        float toPM = Float.parseFloat(result.getText().toString()) * (0.01f);
        if (isItFloat(toPM)){
            result.setText("" + toPM);
        } else {
            int tPMI = (int) toPM;
            result.setText("" + tPMI);
        }
    }

    private void plusMinusMethod() {
        float toPM = Float.parseFloat(result.getText().toString()) * (-1.0f);
        if (isItFloat(toPM)){
            result.setText("" + toPM);
        } else {
            int tPMI = (int) toPM;
            result.setText("" + tPMI);
        }
    }

    private void divideMethod() {
        calculate();
        status = "divide";
    }

    private void acMethod() {
        sizeNormal();
        inputString = "";
        inputFloat = 0;
        prevInputFloat = 0;
        commaIn = false;
        status = "";
        int i = (int) inputFloat;
        result.setText(""+i);
    }

    private void numInputMethod(String s) {
        if (result.getText().toString().length() < 20) {
            sizeNormal();
            if (s.equals(".")) {
                if (!commaIn) {
                    inputString += s;
                    inputFloat = Float.parseFloat(inputString);
                    result.setText("" + inputString);
                    commaIn = true;
                    sizeLess();
                }
            } else {
                inputString += s;
                inputFloat = Float.parseFloat(inputString);
                result.setText(inputString);
                sizeLess();
            }
        }

    }
    private void plusMethod() {
        calculate();
        status = "plus";
    }
    private void minusMethod(){
        calculate();
        status = "minus";
    }

    private void resultMethod(){
        calculate();
        inputString = "";
        inputFloat = 0;
        prevInputFloat = 0;
        commaIn = false;
        status = "";
        sizeLess();
    }

    private void multiplyMethod(){
        calculate();
        status = "multiply";
    }

    private void calculate(){
        switch (status) {
            case "plus":
                prevInputFloat += inputFloat;
                if (isItFloat(prevInputFloat)) {
                    result.setText("" + prevInputFloat);
                } else {
                    int i = (int) prevInputFloat;
                    result.setText(""+i);
                }
                prevInputFloat = Float.parseFloat(result.getText().toString());
                inputString = "";
                commaIn = false;
                break;
            case "minus":
                prevInputFloat -= inputFloat;
                if (isItFloat(prevInputFloat)) {
                    result.setText("" + prevInputFloat);
                } else {
                    int i = (int) prevInputFloat;
                    result.setText(""+i);
                }
                prevInputFloat = Float.parseFloat(result.getText().toString());
                inputString = "";
                commaIn = false;
                break;
            case "":
                prevInputFloat = Float.parseFloat(result.getText().toString());
                inputString = "";
                commaIn = false;
                break;
            case "multiply":
                prevInputFloat *= inputFloat;
                if (isItFloat(prevInputFloat)) {
                    result.setText("" + prevInputFloat);
                } else {
                    int i = (int) prevInputFloat;
                    result.setText(""+i);
                }
                prevInputFloat = Float.parseFloat(result.getText().toString());
                inputString = "";
                commaIn = false;
                break;
            case "divide":
                prevInputFloat /= inputFloat;
                if (isItFloat(prevInputFloat)) {
                    result.setText("" + prevInputFloat);
                } else {
                    int i = (int) prevInputFloat;
                    result.setText(""+i);
                }
                prevInputFloat = Float.parseFloat(result.getText().toString());
                inputString = "";
                commaIn = false;
                break;
        }
    }

    private boolean isItFloat(float tf){
        boolean itIsFloat;
        int ti = (int) tf;
        itIsFloat = tf - ti != 0;
        return itIsFloat;
    }
    private void sizeLess(){
        if (result.getText().toString().length() == 10){
            result.setTextSize(65);
        } else if (result.getText().toString().length() == 11){
            result.setTextSize(60);
        } else if (result.getText().toString().length() == 12){
            result.setTextSize(55);
        } else if (result.getText().toString().length() == 13){
            result.setTextSize(50);
        } else if (result.getText().toString().length() == 14){
            result.setTextSize(47);
        } else if (result.getText().toString().length() == 15){
            result.setTextSize(44);
        } else if (result.getText().toString().length() == 16){
            result.setTextSize(42);
        } else if (result.getText().toString().length() == 17){
            result.setTextSize(40);
        } else if (result.getText().toString().length() == 18){
            result.setTextSize(38);
        } else if (result.getText().toString().length() == 19){
            result.setTextSize(36);
        } else if (result.getText().toString().length() == 20){
            result.setTextSize(34);
        }
    }
    private void sizeNormal(){
        result.setTextSize(70);
    }
}
