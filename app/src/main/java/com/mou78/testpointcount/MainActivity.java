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
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 1;
                        } else if(numberselect == 1) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number1", testpoint);
                            editor.putString("name1", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 2;
                        } else if(numberselect == 2) {

                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number2", testpoint);
                            editor.putString("name2", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 3;
                        } else if(numberselect == 3) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number3", testpoint);
                            editor.putString("name3", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 4;
                        } else if(numberselect == 4) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number4", testpoint);
                            editor.putString("name4", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 5;

                        } else if(numberselect == 5) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number5", testpoint);
                            editor.putString("name5", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 6;
                        } else if(numberselect == 6) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number6", testpoint);
                            editor.putString("name6", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 7;
                        } else if(numberselect == 7) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number7", testpoint);
                            editor.putString("name7", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 8;
                        } else if(numberselect == 8) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number8", testpoint);
                            editor.putString("name8", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 9;
                        } else if(numberselect == 9) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number9", testpoint);
                            editor.putString("name9", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 10;
                        } else if(numberselect == 10) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number10", testpoint);
                            editor.putString("name10", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 11;
                        } else if(numberselect == 11) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number11", testpoint);
                            editor.putString("name11", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 12;
                        } else if(numberselect == 12) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number12", testpoint);
                            editor.putString("name12", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 13;
                        } else if(numberselect == 13) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number13", testpoint);
                            editor.putString("name13", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 14;
                        } else if(numberselect == 14) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number14", testpoint);
                            editor.putString("name14", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 15;
                        } else if(numberselect == 15) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number15", testpoint);
                            editor.putString("name15", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 16;
                        } else if(numberselect == 16) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number16", testpoint);
                            editor.putString("name16", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 17;
                        } else if(numberselect == 17) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number17", testpoint);
                            editor.putString("name17", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 18;
                        } else if(numberselect == 18) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number18", testpoint);
                            editor.putString("name18", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 19;
                        } else if(numberselect == 19) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number19", testpoint);
                            editor.putString("name19", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 20;
                        } else if(numberselect == 20) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number20", testpoint);
                            editor.putString("name20", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 21;
                        } else if(numberselect == 21) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number21", testpoint);
                            editor.putString("name21", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 22;
                        } else if(numberselect == 22) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number22", testpoint);
                            editor.putString("name22", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 23;
                        } else if(numberselect == 23) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number23", testpoint);
                            editor.putString("name23", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 24;
                        } else if(numberselect == 24) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number24", testpoint);
                            editor.putString("name24", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 25;
                        } else if(numberselect == 25) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number25", testpoint);
                            editor.putString("name25", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 26;
                        } else if(numberselect == 26) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number26", testpoint);
                            editor.putString("name26", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 27;
                        } else if(numberselect == 27) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number27", testpoint);
                            editor.putString("name27", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 28;
                        } else if(numberselect == 28) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number28", testpoint);
                            editor.putString("name28", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 29;
                        } else if(numberselect == 29) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number29", testpoint);
                            editor.putString("name29", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 30;
                        } else if(numberselect == 30) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number30", testpoint);
                            editor.putString("name30", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 31;
                        } else if(numberselect == 31) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number31", testpoint);
                            editor.putString("name31", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 32;
                        } else if(numberselect == 32) {
                            String titlename =editText.getText().toString();
                            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putInt("number32", testpoint);
                            editor.putString("name32", titlename);
                            editor.commit();
                            Toast.makeText(getApplicationContext(),"保存しました",Toast.LENGTH_SHORT).show();
                            numberselect = 33;
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