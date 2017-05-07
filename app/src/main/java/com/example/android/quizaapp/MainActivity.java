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
import static com.example.android.quizaapp.R.id.EntryTxt;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitResult(View v) {
        CheckBox Answer1CheckBox = (CheckBox) findViewById(Answer_1);
        boolean Answer1 = Answer1CheckBox.isChecked();
        CheckBox Answer4CheckBox = (CheckBox) findViewById(R.id.Answer_4);
        boolean Answer4 = Answer4CheckBox.isChecked();
        EditText editText = (EditText) findViewById(EntryTxt);
        String EntryAns = editText.getText().toString();

//
    score = Calculatescore(Answer1,Answer4,EntryAns);
        displayScore(score);
        score = 0;
    }
  private int Calculatescore(boolean HasAns1,boolean HasAns4,String EntryAns){
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
     int score = 0;
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
      if (HasAns1 && HasAns4){
          score = score + 1;
      }
      else if(HasAns1){
          score = score+1;
      }
      else if (HasAns4){
          score = score +1;
      }


      if (EntryAns == "Venus" ){
          score = score +1;
      }
      if (EntryAns == "venus"){
          score = score + 1;
      }


    return score;
  }

    private void displayScore(int number) {
        Context context = getApplicationContext();
        CharSequence text = "you Scored "+number +" out of 11";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    public void Reset(View v) {
        score = 0;
        EditText editText = (EditText) findViewById(EntryTxt);
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
        editText.setText("");
    }
}
