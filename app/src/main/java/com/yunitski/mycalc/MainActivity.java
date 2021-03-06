package com.yunitski.mycalc;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
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
    Button bracketOpen, bracketClose, mc, mPlus, mMinus, mr, _2nd, x2, x3, xy, ex, _10x, _1delx, _2sqrtx, _3sqrtx, ysqrtx, ln, log10, xfact, sin, cos, tan, e, ee, rad, sinh, cosh, tanh, pi, rand;
    EditText result;
    String inputString, prevInputString, status, fileName;
    float inputFloat, prevInputFloat;
    boolean commaIn;
    int inputInt, prevInputInteger;
    SharedPreferences sharedPreferences;

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
        if (getApplicationContext().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
        bracketOpen = findViewById(R.id._bracket_open);
        bracketOpen.setOnClickListener(this);
        bracketClose = findViewById(R.id._bracket_close);
        bracketClose.setOnClickListener(this);
        mc = findViewById(R.id._mc);
        mc.setOnClickListener(this);
        mPlus = findViewById(R.id._m_plus);
        mPlus.setOnClickListener(this);
        mMinus = findViewById(R.id._m_minus);
        mMinus.setOnClickListener(this);
        mr = findViewById(R.id._mr);
        mr.setOnClickListener(this);
        _2nd = findViewById(R.id._2nd);
        _2nd.setOnClickListener(this);
            x2 = findViewById(R.id._x2);
            x2.setOnClickListener(this);
            x3 = findViewById(R.id._x3);
            x3.setOnClickListener(this);
        xy = findViewById(R.id._xy);
        xy.setOnClickListener(this);
        ex = findViewById(R.id._ex);
        ex.setOnClickListener(this);
            _10x = findViewById(R.id._10x);
            _10x.setOnClickListener(this);
        _1delx = findViewById(R.id._1delx);
        _1delx.setOnClickListener(this);
        _2sqrtx = findViewById(R.id._2sqrtx);
        _2sqrtx.setOnClickListener(this);
        _3sqrtx = findViewById(R.id._3sqrtx);
        _3sqrtx.setOnClickListener(this);
        ysqrtx = findViewById(R.id._ysqrtx);
        ysqrtx.setOnClickListener(this);
        ln = findViewById(R.id._ln);
        ln.setOnClickListener(this);
        log10 = findViewById(R.id._log10);
        log10.setOnClickListener(this);
        xfact = findViewById(R.id._xfactotrial);
        xfact.setOnClickListener(this);
        sin = findViewById(R.id._sin);
        sin.setOnClickListener(this);
        cos = findViewById(R.id._cos);
        cos.setOnClickListener(this);
        tan = findViewById(R.id._tan);
        tan.setOnClickListener(this);
        e = findViewById(R.id._e);
        e.setOnClickListener(this);
        ee = findViewById(R.id._ee);
        ee.setOnClickListener(this);
        rad = findViewById(R.id._rad);
        rad.setOnClickListener(this);
        sinh = findViewById(R.id._sinh);
        sinh.setOnClickListener(this);
        cosh = findViewById(R.id._cosh);
        cosh.setOnClickListener(this);
        tanh = findViewById(R.id._tanh);
        tanh.setOnClickListener(this);
        pi = findViewById(R.id._pi);
        pi.setOnClickListener(this);
        rand = findViewById(R.id._rand);
        rand.setOnClickListener(this);
    }
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
        fileName = "myFile";
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
        if (getApplicationContext().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            if (id == R.id._10x) {
                tenXMethod();
            } else if (id == R.id._x2) {
                x2Method();
            } else if (id == R.id._x3) {
                x3Method();
            } else if (id == R.id._xfactotrial){
                xFactorialMethod();
            } else if (id == R.id._xy){
                xyMethod();
            } else if (id == R.id._1delx){
                oneDelXMethod();
            } else if (id == R.id._ex){
                exMethod();
            } else if (id == R.id._2sqrtx){
                twoSqrtMethod();
            } else if (id == R.id._3sqrtx){
                threeSqrtMethod();
            } else if (id == R.id._ysqrtx){
                ySqrtMethod();
            } else if (id == R.id._e){
                eMethod();
            } else if (id == R.id._pi){
                piMethod();
            } else if (id == R.id._ln){
                lnMethod();
            } else if (id == R.id._log10){
                log10Method();
            } else if (id == R.id._sin){
                sinMethod();
            } else if (id == R.id._cos){
                cosMethod();
            } else if (id == R.id._tan){
                tanMethod();
            } else if (id == R.id._sinh){
                sinhMethod();
            } else if (id == R.id._cosh){
                coshMethod();
            } else if (id == R.id._tanh){
                tanhMethod();
            } else if (id == R.id._ee){
                eeMethod();
            } else if (id == R.id._rand){
                randMethod();
            } else if (id == R.id._m_plus){
                mPlusMethod();
            } else if (id == R.id._mr){
                mrMethod();
            } else if (id == R.id._mc){
                mcMethod();
            } else if (id == R.id._m_minus){
                mMinusMethod();
            }
        }
    }

    private void mMinusMethod() {
        sharedPreferences = getSharedPreferences(fileName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear().apply();
    }

    private void mcMethod() {
        sharedPreferences = getSharedPreferences(fileName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear().apply();
    }

    private void mrMethod() {
        sharedPreferences = getSharedPreferences(fileName, Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("name", "????????????!");
        result.setText(name);
    }

    private void mPlusMethod() {
        String strName = result.getText().toString();
        sharedPreferences = getSharedPreferences(fileName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", strName);
        editor.apply();
    }

    private void randMethod() {
        float r = (float) Math.random();
        result.setText("" + r);
    }

    private void eeMethod() {
        calculate();
        status = "ee";
    }

    private void tanhMethod() {
        float mVar = Float.parseFloat(result.getText().toString());
        double d;
        if (mVar >= 0){
            d = Math.tanh(mVar);
            result.setText(""+d);
        } else {
            result.setText("????????????!");
        }
    }

    private void coshMethod() {
        float mVar = Float.parseFloat(result.getText().toString());
        double d;
        if (mVar >= 0){
            d = Math.cosh(mVar);
            result.setText(""+d);
        } else {
            result.setText("????????????!");
        }
    }

    private void sinhMethod() {
        float mVar = Float.parseFloat(result.getText().toString());
        double d;
        if (mVar >= 0){
            d = Math.sinh(mVar);
            result.setText(""+d);
        } else {
            result.setText("????????????!");
        }
    }

    private void tanMethod() {
        float mVar = Float.parseFloat(result.getText().toString());
        double d;
        if (mVar >= 0){
            d = Math.tan(mVar);
            result.setText(""+d);
        } else {
            result.setText("????????????!");
        }
    }

    private void cosMethod() {
        float mVar = Float.parseFloat(result.getText().toString());
        double d;
        if (mVar >= 0){
            d = Math.cos(mVar);
            result.setText(""+d);
        } else {
            result.setText("????????????!");
        }
    }

    private void sinMethod() {
        float mVar = Float.parseFloat(result.getText().toString());
        double d;
        if (mVar >= 0){
            d = Math.sin(mVar);
            result.setText(""+d);
        } else {
            result.setText("????????????!");
        }
    }

    private void log10Method() {
        float mVar = Float.parseFloat(result.getText().toString());
        double d;
        if (mVar >= 0){
            d = Math.log10(mVar);
            result.setText(""+d);
        } else {
            result.setText("????????????!");
        }
    }

    private void lnMethod() {
        float mVar = Float.parseFloat(result.getText().toString());
        double d;
        if (mVar >= 0){
            d = Math.log(mVar);
            result.setText(""+d);
        } else {
            result.setText("????????????!");
        }
    }

    private void piMethod() {
        result.setText(""+Math.PI);
    }

    private void eMethod() {
        result.setText(""+Math.E);
    }

    private void ySqrtMethod() {
        calculate();
        status = "ysqrtx";
    }

    private void threeSqrtMethod() {
        float mVar = Float.parseFloat(result.getText().toString());
        double d = Math.sqrt(Math.sqrt(mVar));
        if (isItFloat((float) d)){
            result.setText(""+d);
        } else {
            int i = (int) d;
            result.setText("" + i);
        }
    }

    private void twoSqrtMethod() {
        float mVar = Float.parseFloat(result.getText().toString());
        double d = Math.sqrt(mVar);
        if (isItFloat((float) d)){
            result.setText(""+d);
        } else {
            int i = (int) d;
            result.setText("" + i);
        }
    }

    private void exMethod() {
        float mVar = Float.parseFloat(result.getText().toString());
        double d = Math.pow(Math.E, mVar);
        result.setText(""+d);
    }

    private void oneDelXMethod() {
        float mVar = 1 / Float.parseFloat(result.getText().toString());
        result.setText(""+mVar);
    }

    private void xyMethod() {
        calculate();
        status = "xy";
    }

    private void xFactorialMethod() {
        float toExp = Float.parseFloat(result.getText().toString());
        if (isItFloat(toExp)){
            result.setText("????????????!");
        } else {
            int k = (int) toExp;
            int r = 1;
            for (int i = 1; i <= k; i++){
                r *= i;
            }
            result.setText("" + r);
        }
        inputString = "";
        inputFloat = 0;
        prevInputFloat = 0;
        commaIn = false;
        status = "";
        sizeLess();

    }

    private void x3Method() {
        float toExp = Float.parseFloat(result.getText().toString()) * Float.parseFloat(result.getText().toString()) * Float.parseFloat(result.getText().toString());
        if (isItFloat(toExp)){
            result.setText("" + toExp);
        } else {
            int i = (int) toExp;
            result.setText("" + i);
        }
        inputString = "";
        inputFloat = 0;
        prevInputFloat = 0;
        commaIn = false;
        status = "";
        sizeLess();
    }

    private void x2Method() {
        float toExp = Float.parseFloat(result.getText().toString()) * Float.parseFloat(result.getText().toString());
        if (isItFloat(toExp)){
            result.setText("" + toExp);
        } else {
            int i = (int) toExp;
            result.setText("" + i);
        }
        inputString = "";
        inputFloat = 0;
        prevInputFloat = 0;
        commaIn = false;
        status = "";
        sizeLess();
    }

    private void tenXMethod() {
        if (!isItFloat(Float.parseFloat(result.getText().toString()))) {
            int mPow = (int) (Math.pow(10, Integer.parseInt(result.getText().toString())));
            result.setText("" + mPow);
        }
        inputString = "";
        inputFloat = 0;
        prevInputFloat = 0;
        commaIn = false;
        status = "";
        sizeLess();
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
                    if(inputString.equals(".")){
                        inputFloat = Float.parseFloat("0.");
                    } else {
                        inputFloat = Float.parseFloat(inputString);
                    }

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
                if (inputFloat == 0){
                    result.setText("????????????!");
                } else {
                    prevInputFloat /= inputFloat;
                    if (isItFloat(prevInputFloat)) {
                        result.setText("" + prevInputFloat);
                    } else {
                        int i = (int) prevInputFloat;
                        result.setText("" + i);
                    }
                    prevInputFloat = Float.parseFloat(result.getText().toString());
                }
                inputString = "";
                commaIn = false;
                break;
            case "xy":
                double f = Math.pow(prevInputFloat, inputFloat);
                if (isItFloat((float) f)){
                    result.setText("" + f);
                } else {
                    int i = (int) f;
                    result.setText("" + i);
                }
                prevInputFloat = Float.parseFloat(result.getText().toString());
                inputString = "";
                commaIn = false;
                break;
            case "ysqrtx":
                int k = (int) prevInputFloat;
                double rr = inputFloat;
                for (int i = 0; i < k; i++){
                    rr = Math.sqrt(rr);
                }
                if (isItFloat((float) rr)){
                    result.setText("" + rr);
                } else {
                    int i = (int) rr;
                    result.setText("" + i);
                }
                prevInputFloat = Float.parseFloat(result.getText().toString());
                inputString = "";
                commaIn = false;
                break;
            case "ee":
                float w1 = prevInputFloat;
                float w2 = inputFloat;
                double d = w1 * (Math.pow(10, w2));
                if (isItFloat((float) d)) {
                    result.setText("" + d);
                } else {
                    int i = (int) d;
                    result.setText("" + i);
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
        if (getApplicationContext().getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            if (result.getText().toString().length() == 13) {
                result.setTextSize(getResources().getDimension(R.dimen._14sdp));
            } else if (result.getText().toString().length() == 14) {
                result.setTextSize(getResources().getDimension(R.dimen._13sdp));
            } else if (result.getText().toString().length() == 15) {
                result.setTextSize(getResources().getDimension(R.dimen._12sdp));
            } else if (result.getText().toString().length() == 16) {
                result.setTextSize(getResources().getDimension(R.dimen._12sdp));
            } else if (result.getText().toString().length() == 17) {
                result.setTextSize(getResources().getDimension(R.dimen._11sdp));
            } else if (result.getText().toString().length() == 18) {
                result.setTextSize(getResources().getDimension(R.dimen._10sdp));
            } else if (result.getText().toString().length() == 19) {
                result.setTextSize(getResources().getDimension(R.dimen._10sdp));
            } else if (result.getText().toString().length() == 20) {
                result.setTextSize(getResources().getDimension(R.dimen._9sdp));
            }
        }
    }
    private void sizeNormal(){
        result.setTextSize(getResources().getDimension(R.dimen._14sdp));
    }
}
