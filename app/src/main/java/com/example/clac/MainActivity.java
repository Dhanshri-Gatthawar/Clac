package com.example.clac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AppCompatButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPi,bDot,bEqual,bAdd,bSubtract,bMultiply,bDivision,bRational,bSquareRoot,bSquare,bFactorial,bLn,bSin,bCos,bTan,bLog,bClosedBrace,bOpenBrace,bC,bAC;
    TextView txtExpression,txtResult;
    double pi = 3.14159265;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bDot = findViewById(R.id.bDot);
        bPi = findViewById(R.id.bPi);
        bEqual = findViewById(R.id.bEqual);
        bAdd = findViewById(R.id.bAdd);
        bSubtract = findViewById(R.id.bSubtract);
        bDivision = findViewById(R.id.bDivision);
        bMultiply = findViewById(R.id.bMultiply);
        bSquare = findViewById(R.id.bSquare);
        bSquareRoot = findViewById(R.id.bSquareRoot);
        bFactorial = findViewById(R.id.bFactorial);
        bRational = findViewById(R.id.bRational);
        bSin = findViewById(R.id.bSin);
        bCos = findViewById(R.id.bCos);
        bTan = findViewById(R.id.bTan);
        bLog = findViewById(R.id.bLog);
        bLn = findViewById(R.id.bIn);
        bAC = findViewById(R.id.bAC);
        bC = findViewById(R.id.bC);
        bOpenBrace = findViewById(R.id.bOpenBraces);
        bClosedBrace = findViewById(R.id.bClosedBraces);

        txtExpression = findViewById(R.id.txtExpression);
        txtResult = findViewById(R.id.txtResult);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"0");
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+".");
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"+");
            }
        });
        bSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"-");
            }
        });
        bDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"÷");
            }
        });
        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"x");
            }
        });
        bOpenBrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+"(");
            }
        });
        bClosedBrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText()+")");
            }
        });
        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText("");
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = txtExpression.getText().toString();
                val = val.substring(0,val.length()-1);
                txtExpression.setText(val);
            }
        });
        bSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = txtExpression.getText().toString();
                double s  = Math.sqrt(Double.parseDouble(val));
                txtExpression.setText("√"+txtExpression.getText());
                txtResult.setText(String.valueOf(s));
            }
        });
        bSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = txtExpression.getText().toString();
                int sq = (int) Math.pow(Integer.parseInt(val),2);
                txtResult.setText(String.valueOf(sq));
                txtExpression.setText(val+"²");
            }
        });
        bPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(bPi.getText());
                txtExpression.setText(txtExpression.getText().toString()+pi);
            }
        });
        bSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(bPi.getText());
                txtExpression.setText(txtExpression.getText().toString()+"sin");
            }
        });
        bCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(bPi.getText());
                txtExpression.setText(txtExpression.getText().toString()+"cos");
            }
        });
        bTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(bPi.getText());
                txtExpression.setText(txtExpression.getText().toString()+"tan");
            }
        });
        bLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText().toString()+"log");
            }
        });
        bLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpression.setText(txtExpression.getText().toString()+"ln");
            }
        });
        bRational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = txtExpression.getText().toString();
                Double res = (double)(1/Double.parseDouble(val));
                txtExpression.setText(txtExpression.getText().toString()+"^"+"(-1)");
                txtResult.setText(String.valueOf(res));
            }
        });
        bPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = txtExpression.getText().toString();
                double b = (double) ((Double.parseDouble(val))*pi);
                txtResult.setText(String.valueOf(b));
                txtExpression.setText(txtExpression.getText()+"π");
            }
        });
        bFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = txtExpression.getText().toString();
                int fact = factorial(Integer.parseInt(val));
                txtResult.setText(String.valueOf(fact));
                txtExpression.setText(val+"!");
            }
        });
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = txtExpression.getText().toString();
                String replacedstr = val.replace("÷","/").replace("x","*");
                double result = eval(replacedstr);
                txtResult.setText(String.valueOf(result));
                txtExpression.setText(val);
            }
        });

    }
    // factorial function
    int factorial(int n)
    {
        return ( n==1 || n==0 ) ? 1 : n*factorial(n-1);
    }
    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}