package com.yunitski.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button ac, plus_minus, percent, divide, _7, _8, _9, multiply, _4, _5, _6, minus, _1, _2, _3, plus, _0, comma, eq;
    EditText result;
    String input = "";
    String operator;
    double res = 0;
    boolean isOperatorSelected = false;
    double numberOnTheScreen;
    private static int COMMA_COUNT = 0;
    boolean isResulted = false;

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

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id._0:
                input += 0;
                result.setText(""+input);
                isOperatorSelected = false;
                isResulted = false;
                break;
            case R.id._1:
                input += 1;
                result.setText(""+input);
                isOperatorSelected = false;
                isResulted = false;
                break;
            case R.id._2:
                input += 2;
                result.setText(""+input);
                isOperatorSelected = false;
                isResulted = false;
                break;
            case R.id._3:
                input += 3;
                result.setText(""+input);
                isOperatorSelected = false;
                isResulted = false;
                break;
            case R.id._4:
                input += 4;
                result.setText(""+input);
                isOperatorSelected = false;
                isResulted = false;
                break;
            case R.id._5:
                input += 5;
                result.setText(""+input);
                isOperatorSelected = false;
                isResulted = false;
                break;
            case R.id._6:
                input += 6;
                result.setText(""+input);
                isOperatorSelected = false;
                isResulted = false;
                break;
            case R.id._7:
                input += 7;
                result.setText(""+input);
                isOperatorSelected = false;
                isResulted = false;
                break;
            case R.id._8:
                input += 8;
                result.setText(""+input);
                isOperatorSelected = false;
                isResulted = false;
                break;
            case R.id._9:
                input += 9;
                result.setText(""+input);
                isOperatorSelected = false;
                isResulted = false;
                break;
            case R.id._ac:
                clear();
                break;
            case R.id._plus:
                if (!isOperatorSelected) {
                        if (res == 0) {
                            numberOnTheScreen = Double.parseDouble(input);
                        } else {
                            numberOnTheScreen = Double.parseDouble(result.getText().toString());
                        }
                        operator = "+";
                        input = "";
                        isOperatorSelected = true;
                        COMMA_COUNT = 0;
                        isResulted = false;

                }
                break;
            case R.id._minus:
                if (!isOperatorSelected) {
                        if (res == 0) {
                            numberOnTheScreen = Double.parseDouble(input);
                        } else {
                            numberOnTheScreen = Double.parseDouble(result.getText().toString());
                        }
                        operator = "-";
                        input = "";
                        isOperatorSelected = true;
                        COMMA_COUNT = 0;
                        isResulted = false;

                }
                break;
            case R.id._multiply:
                if (!isOperatorSelected){
                        if (res == 0) {
                            numberOnTheScreen = Double.parseDouble(input);
                        } else {
                            numberOnTheScreen = Double.parseDouble(result.getText().toString());
                        }
                        operator = "*";
                        input = "";
                        isOperatorSelected = true;
                        COMMA_COUNT = 0;
                        isResulted = false;
                }
                break;
            case R.id._divide:
                if (!isOperatorSelected){
                        if (res == 0) {
                            numberOnTheScreen = Double.parseDouble(input);
                        } else {
                            numberOnTheScreen = Double.parseDouble(result.getText().toString());
                        }
                        operator = "/";
                        input = "";
                        isOperatorSelected = true;
                        COMMA_COUNT = 0;
                        isResulted = false;

                }
                break;
            case R.id._comma:
                if (COMMA_COUNT == 0){
                    input +=".";
                    result.setText(""+input);
                    COMMA_COUNT++;
                }
                break;
            case R.id._plus_minus:
                if (Double.parseDouble(result.getText().toString()) != 0) {
                    double d = Double.parseDouble(input);
                    int i = Integer.parseInt(input);
                    if (d - i == 0){
                        int i2 = Integer.parseInt(input) * (-1);
                        input = ""+i2;
                        result.setText(""+ i2);
                    } else {
                        double t = Double.parseDouble(input) * (-1);
                        input = "" + t;
                        result.setText("" + t);
                    }
                }
                break;
            case R.id._eq:
                if (!isOperatorSelected && !isResulted) {
                    res = Double.parseDouble(input);
                    if (operator.equals("+")) {
                        double r = numberOnTheScreen + res;
                        int y = (int) r;
                        int inte = (int) numberOnTheScreen;
                        double doube = (double) inte;
                        int intRes = (int) res;
                        double doubleRes = (double) intRes;
                        if ((numberOnTheScreen - doube) == 0 && (res - doubleRes) == 0 || (r - y) == 0) {
                            int i = (int) r;
                            String s = ""+i;
                            char[] toArr = s.toCharArray();
                            if (toArr.length > 9){
                                result.setTextSize(30);
                            }
                            result.setText("" + i);
                        } else {
                            String s = ""+r;
                            char[] toArr = s.toCharArray();
                            if (toArr.length > 9){
                                result.setTextSize(30);
                            }
                            result.setText("" + r);
                        }
                    } else if (operator.equals("-")) {
                        double r = numberOnTheScreen - res;
                        int intNum = (int) numberOnTheScreen;
                        int intRes = (int) res;
                        int y = (int) r;
                        double doubleRes = (double) intRes;
                        double doubleNum = (double) intNum;

                        if ((numberOnTheScreen - doubleNum) == 0 && (res - doubleRes) == 0 || (r - y) == 0) {
                            int i = (int) r;
                            String s = ""+i;
                            char[] toArr = s.toCharArray();
                            if (toArr.length > 9){
                                result.setTextSize(30);
                            }
                            result.setText("" + i);
                        } else {
                            String s = ""+r;
                            char[] toArr = s.toCharArray();
                            if (toArr.length > 9){
                                result.setTextSize(30);
                            }
                            result.setText("" + r);
                        }
                    } else if (operator.equals("*")) {
                        double r = numberOnTheScreen * res;
                        int intNum = (int) numberOnTheScreen;
                        int intRes = (int) res;
                        int y = (int) r;
                        double doubleRes = (double) intRes;
                        double doubleNum = (double) intNum;
                        if ((numberOnTheScreen - doubleNum) == 0 && (res - doubleRes) == 0 || (r - y) == 0) {
                            int i = (int) r;
                            String s = ""+i;
                            char[] toArr = s.toCharArray();
                            if (toArr.length > 9){
                                result.setTextSize(30);
                            }
                            result.setText("" + i);
                        } else {
                            String s = ""+r;
                            char[] toArr = s.toCharArray();
                            if (toArr.length > 9){
                                result.setTextSize(30);
                            }
                            result.setText("" + r);
                        }
                    } else if (operator.equals("/")){
                        double d = numberOnTheScreen % res;
                        double i = numberOnTheScreen / res;
                        if (d == 0){
                            int dr = (int) i;
                            String s = ""+dr;
                            char[] toArr = s.toCharArray();
                            if (toArr.length > 9){
                                result.setTextSize(30);
                            }
                            result.setText(""+dr);
                        }else {

                            double r = (double) numberOnTheScreen / res;
                            String s = ""+r;
                            char[] toArr = s.toCharArray();
                            if (toArr.length > 9){
                                result.setTextSize(30);
                            }
                            result.setText("" + r);
                        }
                    }
                    input = "";
                    COMMA_COUNT = 0;
                    isResulted = true;
                }
                break;
        }
    }
    private void clear(){
        input = "";
        result.setText("0");
        res = 0;
        numberOnTheScreen = 0;
        COMMA_COUNT = 0;
    }
    }
