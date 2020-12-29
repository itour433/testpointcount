package com.mou78.testpointcount;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Savelist3Activity extends AppCompatActivity {
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savelist3);
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

        //---リスト22---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint0 = pref.getInt("number22",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename0 = pref.getString("name22","データー未登録");

        //TextViewに代入
        pointtext.setText(testpoint0 +"");
        titletext.setText(titlename0 +"");

        //---リスト23---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint1 = pref.getInt("number23",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename1 = pref.getString("name23","データー未登録");

        //TextViewに代入
        pointtext1.setText(testpoint1 +"");
        titletext1.setText(titlename1 +"");

        //---リスト24---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint2 = pref.getInt("number24",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename2 = pref.getString("name24","データー未登録");

        //TextViewに代入
        pointtext2.setText(testpoint2 +"");
        titletext2.setText(titlename2 +"");

        //---リスト25---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint3 = pref.getInt("number25",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename3 = pref.getString("name25","データー未登録");

        //TextViewに代入
        pointtext3.setText(testpoint3 +"");
        titletext3.setText(titlename3 +"");

        //---リスト26---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint4 = pref.getInt("number26",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename4 = pref.getString("name26","データー未登録");

        //TextViewに代入
        pointtext4.setText(testpoint4 +"");
        titletext4.setText(titlename4 +"");

        //---リスト27---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint5 = pref.getInt("number27",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename5 = pref.getString("name27","データー未登録");

        //TextViewに代入
        pointtext5.setText(testpoint5 +"");
        titletext5.setText(titlename5 +"");

        //---リスト28---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint6 = pref.getInt("number28",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename6 = pref.getString("name28","データー未登録");

        //TextViewに代入
        pointtext6.setText(testpoint6 +"");
        titletext6.setText(titlename6 +"");

        //---リスト29---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint7 = pref.getInt("number29",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename7 = pref.getString("name29","データー未登録");

        //TextViewに代入
        pointtext7.setText(testpoint7 +"");
        titletext7.setText(titlename7 +"");

        //---リスト30---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint8 = pref.getInt("number30",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename8 = pref.getString("name30","データー未登録");

        //TextViewに代入
        pointtext8.setText(testpoint8 +"");
        titletext8.setText(titlename8 +"");

        //---リスト31---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint9 = pref.getInt("number31",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename9 = pref.getString("name31","データー未登録");

        //TextViewに代入
        pointtext9.setText(testpoint9 +"");
        titletext9.setText(titlename9 +"");

        //---リスト32---

        //SharedPreference
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        //SharedPreferenceのintの数字を呼び出し
        int testpoint10 = pref.getInt("number32",0);
        //SharedPreferenceのStringの文字を呼び出し
        String titlename10 = pref.getString("name32","データー未登録");

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
                = ShareCompat.IntentBuilder.from(Savelist3Activity.this);
        String subject = "カウントした数字について";
        String bodyText = "テスト点数" + pointtext + "" + titletext + "" + pointtext1 + "" + titletext1 + "" + pointtext2 + "" + titletext2 + "";
        builder.setSubject(subject)
                .setText(bodyText)
                .setType("text/plain");
        Intent intent = builder.createChooserIntent();

        builder.startChooser();
    }

    public void next(View v){
//        Intent intent = new Intent(this, SavelistActivity.class);
//        startActivity(intent);
        Toast.makeText(getApplicationContext(),"これ以上ページがありません",Toast.LENGTH_SHORT).show();
    }
    public void back(View v){
        finish();
    }
        public void backhome(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}