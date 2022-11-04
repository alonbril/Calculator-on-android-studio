package com.example.mycalc_hit_work_number_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    double num1, num2, calc_res;
    char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.textViewRes);


    }

    public void buttonFunctionNumber(View view) {
        if (view instanceof Button) {
            Button b = (Button) view;
            String str = b.getText().toString();
            result.append(str);

        }
    }

    public void onActClick(View view) {
        if (view instanceof Button) {
            String str1 = result.getText().toString();
            num1 = Integer.parseInt(str1);
            Button b = (Button) view;
            operator = b.getText().charAt(0);
            result.setText(null);

        }
    }

    public void Calc_manage(View view){
        if (view instanceof Button){
            String str2=result.getText().toString();
            num2=Integer.parseInt(str2);
            calc_res=math_math(num1,num2,operator);
            
            result.setText(calc_res +"");
        }
    }

    public void ClearAll(View view) {
        if (view instanceof Button) {
            result.setText("");
        }
    }

    public double math_math(double number1, double number2, char OP) {
        switch (OP) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number1 == 0) {
                    return 0;
                }


                 else {
                    return number1 / number2;
                }

            default:return 0;
        }

    }

}