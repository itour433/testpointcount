package com.mou78.testpointcount;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Savelist extends AppCompatActivity {
    SharedPreferences pref;
    TextView pointtext;
    TextView titletext;
    TextView pointtext1;
    TextView titletext1;
    TextView pointtext2;
    TextView titletext2;
    TextView pointtext3;
    TextView titletext3;
    TextView pointtext4;
    TextView titletext4;
    TextView pointtext5;
    TextView titletext5;
    TextView pointtext6;
    TextView titletext6;
    TextView pointtext7;
    TextView titletext7;
    TextView pointtext8;
    TextView titletext8;
    TextView pointtext9;
    TextView titletext9;
    TextView pointtext10;
    TextView titletext10;
    int testpoint0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savelist);

        pointtext = (TextView)findViewById(R.id.pointtext);
        titletext = (TextView)findViewById(R.id.titletext);
        pointtext1 = (TextView)findViewById(R.id.pointtext1);
        titletext1 = (TextView)findViewById(R.id.titletext1);
        pointtext2 = (TextView)findViewById(R.id.pointtext2);
        titletext2 = (TextView)findViewById(R.id.titletext2);
        pointtext3 = (TextView)findViewById(R.id.pointtext3);
        titletext3 = (TextView)findViewById(R.id.titletext3);
        pointtext4 = (TextView)findViewById(R.id.pointtext4);
        titletext4 = (TextView)findViewById(R.id.titletext4);
        pointtext5 = (TextView)findViewById(R.id.pointtext5);
        titletext5 = (TextView)findViewById(R.id.titletext5);
        pointtext6 = (TextView)findViewById(R.id.pointtext6);
        titletext6 = (TextView)findViewById(R.id.titletext6);
        pointtext7 = (TextView)findViewById(R.id.pointtext7);
        titletext7 = (TextView)findViewById(R.id.titletext7);
        pointtext8 = (TextView)findViewById(R.id.pointtext8);
        titletext8 = (TextView)findViewById(R.id.titletext8);
        pointtext9 = (TextView)findViewById(R.id.pointtext9);
        titletext9 = (TextView)findViewById(R.id.titletext9);
        pointtext10 = (TextView)findViewById(R.id.pointtext10);
        titletext10 = (TextView)findViewById(R.id.titletext10);

        //---リスト0---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint0 = pref.getInt("number",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename0 = pref.getString("name","データー未登録");

        //TextViewに代入
        pointtext.setText(testpoint0 +"");
        titletext.setText(titlename0 +"");

        //---リスト1---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint1 = pref.getInt("number1",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename1 = pref.getString("name1","データー未登録");

        //TextViewに代入
        pointtext1.setText(testpoint1 +"");
        titletext1.setText(titlename1 +"");

        //---リスト2---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint2 = pref.getInt("number2",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename2 = pref.getString("name2","データー未登録");

        //TextViewに代入
        pointtext2.setText(testpoint2 +"");
        titletext2.setText(titlename2 +"");

        //---リスト3---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint3 = pref.getInt("number3",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename3 = pref.getString("name3","データー未登録");

        //TextViewに代入
        pointtext3.setText(testpoint3 +"");
        titletext3.setText(titlename3 +"");

        //---リスト4---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint4 = pref.getInt("number4",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename4 = pref.getString("name4","データー未登録");

        //TextViewに代入
        pointtext4.setText(testpoint4 +"");
        titletext4.setText(titlename4 +"");

        //---リスト5---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint5 = pref.getInt("number5",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename5 = pref.getString("name5","データー未登録");

        //TextViewに代入
        pointtext5.setText(testpoint5 +"");
        titletext5.setText(titlename5 +"");

        //---リスト6---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint6 = pref.getInt("number6",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename6 = pref.getString("name6","データー未登録");

        //TextViewに代入
        pointtext6.setText(testpoint6 +"");
        titletext6.setText(titlename6 +"");

        //---リスト7---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint7 = pref.getInt("number7",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename7 = pref.getString("name7","データー未登録");

        //TextViewに代入
        pointtext7.setText(testpoint7 +"");
        titletext7.setText(titlename7 +"");

        //---リスト8---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint8 = pref.getInt("number8",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename8 = pref.getString("name8","データー未登録");

        //TextViewに代入
        pointtext8.setText(testpoint8 +"");
        titletext8.setText(titlename8 +"");

        //---リスト9---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint9 = pref.getInt("number9",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename9 = pref.getString("name9","データー未登録");

        //TextViewに代入
        pointtext9.setText(testpoint9 +"");
        titletext9.setText(titlename9 +"");

        //---リスト10---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint10 = pref.getInt("number10",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename10 = pref.getString("name10","データー未登録");

        //TextViewに代入
        pointtext10.setText(testpoint10 +"");
        titletext10.setText(titlename10 +"");
    }
    public void share(View v){

//        //SharedPreference
//        pref = getSharedPreferences("countbox",MODE_PRIVATE);
//        //SharedPreferenceのintの数字を呼び出し
//        int testpoint0 = pref.getInt("number",0);
        ShareCompat.IntentBuilder builder
                = ShareCompat.IntentBuilder.from(Savelist.this);
        String subject = "カウントした数字について";
        String bodyText = "テスト点数" + pointtext + "" + titletext + "" + pointtext1 + "" + titletext1 + "" + pointtext2 + "" + titletext2 + "";
        builder.setSubject(subject)
                .setText(bodyText)
                .setType("text/plain");
        Intent intent = builder.createChooserIntent();

        builder.startChooser();
    }
}