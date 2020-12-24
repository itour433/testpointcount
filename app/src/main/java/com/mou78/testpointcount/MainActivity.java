package com.mou78.testpointcount;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textuum;
    int testpoint;
    int numberselect;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.count3);
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        textView.setText(testpoint +"点");
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        int numberselect = pref.getInt("select",0);
    }

    //各種点数ボタンが押されたときの動作コード
    public void two(View v){
        testpoint = testpoint + 2;
        textView.setText(testpoint +"点");

//        int setCount = pref.getInt("number",0);
//        setCount = setCount + 1;
//        SharedPreferences.Editor editor = pref.edit();
//        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
//        editor.putInt("number", setCount);
//        editor.commit();
    }

    public  void one(View v) {
        testpoint = testpoint + 1;
        textView.setText(testpoint +"点");
    }
    public void three(View v){
        testpoint = testpoint + 3;
        textView.setText(testpoint +"点");
    }

    public void four(View v){
        testpoint = testpoint + 4;
        textView.setText(testpoint +"点");
    }

    public void five(View v){
        testpoint = testpoint + 5;
        textView.setText(testpoint +"点");
    }

    public void minus(View v){
        testpoint = testpoint + -1;
        textView.setText(testpoint +"点");
    }

    public void ten(View v){
        testpoint = testpoint + 10;
        textView.setText(testpoint +"点");
    }

    public void twelve(View v){
        testpoint = testpoint + 20;
        textView.setText(testpoint +"点");
    }

    //int testpointに保存された数値を0にする
    public void delete(View v){
        testpoint = 0;
        textView.setText(testpoint +"点");

//        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = pref.edit();
//        editor.clear();
//        editor.commit();

//        textView.setText(setCount +"");
    }

    //int testpointの値をSharedPreferenceに保存する
    public void save(View v){
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        numberselect = pref.getInt("select",0);

        //アラードダイアログを出す
        final EditText editText = new EditText(this);
        editText.setHint("名前・管理番号など");
        new AlertDialog.Builder(this)
                .setTitle("保存名称")
                .setMessage("タイトル名を入力してください")
                .setView(editText)
                .setPositiveButton("保存", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        if(numberselect == 0){
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number", testpoint);
                            editor.putString("name", titlename);
                            editor.commit();
                            numberselect = 1;
                        } else if(numberselect == 1) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number1", testpoint);
                            editor.putString("name1", titlename);
                            editor.commit();
                            numberselect = 2;
                        } else if(numberselect == 2) {

                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number2", testpoint);
                            editor.putString("name2", titlename);
                            editor.commit();
                            numberselect = 3;
                        } else if(numberselect == 3) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number3", testpoint);
                            editor.putString("name3", titlename);
                            editor.commit();
                            numberselect = 4;
                        } else if(numberselect == 4) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number4", testpoint);
                            editor.putString("name4", titlename);
                            editor.commit();
                            numberselect = 5;

                        } else if(numberselect == 5) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number5", testpoint);
                            editor.putString("name5", titlename);
                            editor.commit();
                            numberselect = 6;
                        } else if(numberselect == 6) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number6", testpoint);
                            editor.putString("name6", titlename);
                            editor.commit();
                            numberselect = 7;
                        } else if(numberselect == 7) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number7", testpoint);
                            editor.putString("name7", titlename);
                            editor.commit();
                            numberselect = 8;
                        } else if(numberselect == 8) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number8", testpoint);
                            editor.putString("name8", titlename);
                            editor.commit();
                            numberselect = 9;
                        } else if(numberselect == 9) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number9", testpoint);
                            editor.putString("name9", titlename);
                            editor.commit();
                            numberselect = 10;
                        } else if(numberselect == 10) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number10", testpoint);
                            editor.putString("name10", titlename);
                            editor.commit();
                            numberselect = 11;
                        } else { //リストの限界

                            Toast.makeText(getApplicationContext(),"保存数が限界に達しました",Toast.LENGTH_SHORT).show();

                        }
                        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = pref.edit();
                        editor.putInt("select", numberselect);
                        editor.commit();
                    }
                })
                .show();

    }

    //SharedPreferenceの保存内容を表示するActivityに移動する
    public void list(View v){
        Intent intent = new Intent(this, Savelist.class);
        startActivity(intent);
    }

    public void listdelete(View v) {
        SharedPreferences pref = getSharedPreferences("countbox", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();

        numberselect = 0;
    }
}