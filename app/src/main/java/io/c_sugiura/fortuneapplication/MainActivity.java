package io.c_sugiura.fortuneapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 現在日時の取得
        Date now = new Date(System.currentTimeMillis());

        // 日時のフォーマットオブジェクト作成
        DateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分");

        // フォーマット
        String nowText = formatter.format(now);


        // 表示
        TextView textView = (TextView)findViewById(R.id.textDate);
        textView.setText(nowText);          // 文字
        textView.setTextColor(Color.GREEN); // 色
        textView.setTextSize(30.0f);        // サイズ



    }

    /**
     * 「占う」ボタンタップ時イベント
     * @param view ビュー
     */
    public void onFortuneButtonTapped(View view){
        // 乱数を整数型で取得
        int fortune = (int)(Math.random() * 50);

        // ログ出力し、乱数を確認
        Log.d("＊＊＊＊＊＊＊＊＊＊","fortuneは「" + fortune + "」");

        // 画面遷移用オブジェクトを作成
        Intent intent = new Intent(this, ResultActivity.class);

        // intentにデータをセット
        intent.putExtra("fortune", fortune);

        // 画面遷移
        startActivity(intent);
    }
}
