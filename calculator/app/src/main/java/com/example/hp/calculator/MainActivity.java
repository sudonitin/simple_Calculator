package com.example.hp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String counter;
    int count, count2;
    char op;
    Button ad, su, mu, di, on, zer, tw, thre, fou, fiv, si, seve, eigh, nin, eqls, clr;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = 0;
        count2 = 0;
        //linking variables with XML with respective buttons
            //operators
        ad = (Button) findViewById(R.id.add);
        su = (Button) findViewById(R.id.sub);
        mu = (Button) findViewById(R.id.mul);
        di = (Button) findViewById(R.id.div);
            //numbers
        on = (Button) findViewById(R.id.one);
        tw = (Button) findViewById(R.id.two);
        thre = (Button) findViewById(R.id.three);
        fou = (Button) findViewById(R.id.four);
        fiv = (Button) findViewById(R.id.five);
        si = (Button) findViewById(R.id.six);
        seve = (Button) findViewById(R.id.seven);
        eigh = (Button) findViewById(R.id.eight);
        nin = (Button) findViewById(R.id.nine);
        zer = (Button) findViewById(R.id.zero);
            //special operations
        eqls = (Button) findViewById(R.id.equals);
        clr = (Button) findViewById(R.id.clear);
            //text box
        display = (TextView) findViewById(R.id.disp);

        //what each button does when it is clicked

        zer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check the string for operator
                if(counter.charAt(counter.length() - 1) == '+' || counter.charAt(counter.length() - 1) == '-' || counter.charAt(counter.length() - 1) == '*' || counter.charAt(counter.length() - 1) == '/'){
                    op = counter.charAt(counter.length() - 1);
                    counter = "";
                    count2 = count;
                }

                else {
                    counter = counter + '0';
                    count = Integer.valueOf(counter);
                }
            }
        });

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = counter.charAt(counter.length() - 1);
                if (op == '+' || op == '-' || op == '*' || op == '/'){
                    counter = "";
                    count2 = count;
                }

                else {
                    counter = counter + '1';
                    count = Integer.valueOf(counter);
                }
            }
        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = counter.charAt(counter.length() - 1);
                if (op == '+' || op == '-' || op == '*' || op == '/'){
                    counter = "";
                    count2 = count;
                }
                else {
                    counter = counter + '2';
                    count = Integer.valueOf(counter);
                }
            }
        });

        thre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = counter.charAt(counter.length() - 1);
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    counter = "";
                    count2 = count;
                } else {
                    counter = counter + '3';
                    count = Integer.valueOf(counter);
                }
            }
        });

        fou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = counter.charAt(counter.length() - 1);
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    counter = "";
                    count2 = count;
                } else {
                    counter = counter + '4';
                    count = Integer.valueOf(counter);
                }
            }
        });

        fiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = counter.charAt(counter.length() - 1);
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    counter = "";
                    count2 = count;
                } else {
                    counter = counter + '5';
                    count = Integer.valueOf(counter);
                }
            }
        });

        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + '6';
                count = Integer.valueOf(counter);
            }
        });

        seve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = counter.charAt(counter.length() - 1);
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    counter = "";
                    count2 = count;
                } else {
                    counter = counter + '7';
                    count = Integer.valueOf(counter);
                }
            }
        });

        eigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = counter.charAt(counter.length() - 1);
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    counter = "";
                    count2 = count;
                } else {
                    counter = counter + '8';
                    count = Integer.valueOf(counter);
                }
            }
        });

        nin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = counter.charAt(counter.length() - 1);
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    counter = "";
                    count2 = count;
                } else {
                    counter = counter + '9';
                    count = Integer.valueOf(counter);
                }
            }
        });

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count + count2;
            }
        });

        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count - count2;
            }
        });

        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count2 == 0) {
                    count = count;
                } else {
                    count = count * count2;
                }
            }
        });

        di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count2 == 0) {
                    count = count;
                } else {
                    count = count / count2;
                }
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = "0";
                count = 0;
                count2 = 0;
                display.setText(count);
            }
        });

        eqls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == '+'){
                    count = count + count2;
                    display.setText(count);
                }
                else if (op == '-'){
                    count = count - count2;
                    display.setText(count);
                }
                else if (op == '*'){
                    count = count * count2;
                    display.setText(count);
                }
                else {
                    count = count / count2;
                    display.setText(count);
                }
            }
        });



    }
}
