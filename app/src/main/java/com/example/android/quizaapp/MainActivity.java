package com.example.android.quizaapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.android.quizaapp.R.id.Answer_1;

public class MainActivity extends AppCompatActivity {
   public CheckBox Ans1,Ans2,Ans3;
    private EditText Name;
    int score = 0;
    public boolean isChoiceAns1 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ans1  = (CheckBox) findViewById(Answer_1);
        Ans2 = (CheckBox) findViewById(R.id.Answer_2);
        Ans3 = (CheckBox) findViewById(R.id.Answer_3);
        Name  = (EditText) findViewById(R.id.Name);

    }
    public void checkResult(View v) {

        RadioButton rb2;
        RadioButton rb3;
        RadioButton rb4;
        RadioButton rb5;
        RadioButton rb6;
        RadioButton rb7;
        RadioButton rb8;
        RadioButton rb9;
        RadioButton rb10;

        rb2 = (RadioButton) findViewById(R.id.A2);
        rb3 = (RadioButton) findViewById(R.id.A3);
        rb4 = (RadioButton) findViewById(R.id.A4);
        rb5 = (RadioButton) findViewById(R.id.A5);
        rb6 = (RadioButton) findViewById(R.id.A6);
        rb7 = (RadioButton) findViewById(R.id.A7);
        rb8 = (RadioButton) findViewById(R.id.A8);
        rb9 = (RadioButton) findViewById(R.id.A9);
        rb10 = (RadioButton) findViewById(R.id.A10);
        if (rb2.isChecked()) {
            score = score + 1;
        }
        if (rb3.isChecked()) {
            score = score + 1;
        }
        if (rb4.isChecked()) {
            score = score + 1;
        }
        if (rb5.isChecked()) {
            score = score + 1;
        }
        if (rb6.isChecked()) {
            score = score + 1;
        }
        if (rb7.isChecked()) {
            score = score + 1;
        }
        if (rb8.isChecked()) {
            score = score + 1;
        }
        if (rb9.isChecked()) {
            score = score + 1;
        }
        if (rb10.isChecked()) {
            score = score + 1;
        }
        onCheckboxClicked();
        displayScore(score);
        score = 0;
    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case Answer_1:
                if (checked)
                isChoiceAns1 = true;
                 score = score+1;
                break;
            case R.id.Answer_2:
                if (checked)
                isChoiceAns1 = false;
                break;
            case R.id.Answer_3:
                if (checked)
                    isChoiceAns1 = false;

        }
    }

    private void displayScore(int number) {
        Context context = getApplicationContext();
        CharSequence text =  Name +"Scored "+number +" out of 10";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onClick(View v) {
        score = 0;
        displayScore(score);
        RadioGroup q2radiobox = (RadioGroup) findViewById(R.id.q2radiobox);
        q2radiobox.clearCheck();
        RadioGroup q3radiobox = (RadioGroup) findViewById(R.id.q3radiobox);
        q3radiobox.clearCheck();
        RadioGroup q4radiobox = (RadioGroup) findViewById(R.id.q4radiobox);
        q4radiobox.clearCheck();
        RadioGroup q5radiobox = (RadioGroup) findViewById(R.id.q5radiobox);
        q5radiobox.clearCheck();
        RadioGroup q6radiobox = (RadioGroup) findViewById(R.id.q6radiobox);
        q6radiobox.clearCheck();
        RadioGroup q7radiobox = (RadioGroup) findViewById(R.id.q7radiobox);
        q7radiobox.clearCheck();
        RadioGroup q8radiobox = (RadioGroup) findViewById(R.id.q8radiobox);
        q8radiobox.clearCheck();
        RadioGroup q9radiobox = (RadioGroup) findViewById(R.id.q9radiobox);
        q9radiobox.clearCheck();
        RadioGroup q10radiobox = (RadioGroup) findViewById(R.id.q10radiobox);
        q10radiobox.clearCheck();

    }
}
