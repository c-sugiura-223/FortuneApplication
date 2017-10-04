package io.c_sugiura.fortuneapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // MainActivityからのデータを取得
        Intent intent = getIntent();
        int fortune = intent.getIntExtra("fortune", 0);

        // おみくじ結果view
        ImageView resultImageView = (ImageView) findViewById(R.id.imageResult);

        // おみくじ結果文字列view
        TextView textView = (TextView) findViewById(R.id.resultText);

        // 画像を判断
        switch (fortune){
            case 0 :
                // 画像を設定
                resultImageView.setImageResource(R.drawable.daikichi);
                // 文字列を設定
                textView.setText("おめでとう！！　1%の確率で大吉を引きました！！");
                break;
            case 1 :
                // 画像を設定
                resultImageView.setImageResource(R.drawable.kichi);
                // 文字列を設定
                textView.setText("待ち人：遅いが来る");
                break;
            case 2 :
                // 画像を設定
                resultImageView.setImageResource(R.drawable.kichi);
                // 文字列を設定
                textView.setText("失物：出にくい");
                break;
            case 3 :
                // 画像を設定
                resultImageView.setImageResource(R.drawable.kichi);
                // 文字列を設定
                textView.setText("旅行：盗難に用心せよ");
                break;
            case 4 :
                // 画像を設定
                resultImageView.setImageResource(R.drawable.kichi);
                // 文字列を設定
                textView.setText("いつもと変わらぬ日々に感謝しよう");
                break;

            case 5 :
                // 画像を設定
                resultImageView.setImageResource(R.drawable.cyukichi);
                // 文字列を設定
                textView.setText("良いことと悪いことに一喜一憂して疲れないように");
                break;

            case 6 :
            case 7 :
                // 画像を設定
                resultImageView.setImageResource(R.drawable.syokichi);
                // 文字列を設定
                textView.setText("悪いことがあれば、良いことがあるよ");
                break;

            case 8 :
            case 9 :
                // 画像を設定
                resultImageView.setImageResource(R.drawable.kyo);
                // 文字列を設定
                textView.setText("残念！でもきっと明日はいいことあるよ！！");
                break;
        }

    }

    /**
     * 「戻る」ボタンタップ時イベント
     * @param view ビュー
     */
    public void onReturnButtonTapped(View view){
        finish();
    }
}



