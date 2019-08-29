package com.example.latcoding2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnEqual, btnDot,
            btnMin, btnPlus, btnClear, btnDivide, btnMultiply;
    private TextView tvResultSmall, txtScreen;
    String number = "";
    Double num1, num2, result;
    int choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnMin.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
    }

    private void initialize() {
        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnMin = (Button) findViewById(R.id.btnMin);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        txtScreen = (TextView) findViewById(R.id.txtScreen);
        tvResultSmall = (TextView) findViewById(R.id.tvResultSmall);
    }

    @Override
    public void onClick(View v) {
//        String codeOperation = txtScreen.getText().toString();
        switch (v.getId()) {
            case R.id.btnZero:
                number += 0;
                txtScreen.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation).toString());
                break;
            case R.id.btnOne:
                number += 1;
                txtScreen.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnTwo:
                number += 2;
                txtScreen.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnThree:
                number += 3;
                txtScreen.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnFour:
                number += 4;
                txtScreen.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnFive:
                number += 5;
                txtScreen.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnSix:
                number += 6;
                txtScreen.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnSeven:
                number += 7;
                txtScreen.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnEight:
                number += 8;
                txtScreen.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnNine:
                number += 9;
                txtScreen.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnPlus:
                num1 = Double.parseDouble(number);
                txtScreen.setText(num1 + "+");
                number = "";
                choice = 1;
                break;
            case R.id.btnMin:
                num1 = Double.parseDouble(number);
                txtScreen.setText(num1 + "-");
                number = "";
                choice = 2;
                break;
            case R.id.btnDivide:
                num1 = Double.parseDouble(number);
                txtScreen.setText(num1 + "/");
                number = "";
                choice = 4;
                break;
            case R.id.btnMultiply:
                num1 = Double.parseDouble(number);
                txtScreen.setText(num1 + "*");
                number = "";
                choice = 3;
                break;
            case R.id.btnDot:
                number += ".";
                txtScreen.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnClear:
                number = "";
                num1 = 0.0;
                num2 = 0.0;
                result = 0.0;
                txtScreen.setText(number);
                tvResultSmall.setText(number);
                break;
            case R.id.btnEqual:
//                txtScreen.setText(executeOperation(codeOperation));
//                tvResultSmall.setText("");
                switch (choice) {
                    case 1:
                        num2 = Double.parseDouble(String.valueOf(txtScreen.getText()));
                        result = num1 + num2;
                        tvResultSmall.setText(num1 + " + " + num2);
                        number = Double.toString(result);
                        break;
                    case 2:
                        num2 = Double.parseDouble(String.valueOf(txtScreen.getText()));
                        result = num1 - num2;
                        tvResultSmall.setText(num1 + " - " + num2);
                        number = Double.toString(result);
                        break;
                    case 3:
                        num2 = Double.parseDouble(String.valueOf(txtScreen.getText()));
                        result = num1 * num2;
                        tvResultSmall.setText(num1 + " x " + num2);
                        number = Double.toString(result);
                        break;
                    case 4:
                        num2 = Double.parseDouble(String.valueOf(txtScreen.getText()));
                        result = num1 / num2;
                        tvResultSmall.setText(num1 + " / " + num2);
                        number = Double.toString(result);
                        break;
                }
                txtScreen.setText(number);
                break;
        }
    }

    private Double executeOperation(String code) {
        Double value;
        value = Double.parseDouble(code);
        return value;
    }
}
