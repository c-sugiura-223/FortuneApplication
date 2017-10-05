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

        // おみくじ結果画像view
        ImageView resultImageView = (ImageView) findViewById(R.id.imageResult);

        // おみくじ結果文字列view
        TextView textView = (TextView) findViewById(R.id.resultText);

        // 画像を設定
        if( 0 <= fortune &&  fortune < 5){
            resultImageView.setImageResource(R.drawable.daikichi);  //大吉：10%
        } else if( 5 <= fortune &&  fortune < 15){
            resultImageView.setImageResource(R.drawable.kichi);     //吉：20%
        } else if( 15 <= fortune &&  fortune < 30){
            resultImageView.setImageResource(R.drawable.chukichi);  //中吉：30%
        } else if( 30 <= fortune &&  fortune < 45){
            resultImageView.setImageResource(R.drawable.shokichi);  //小吉：30%
        } else if( 45 <= fortune &&  fortune < 50){
            resultImageView.setImageResource(R.drawable.kyo);       //凶：10%
        }

        // 文字列を設定
        switch (fortune){
            case 0 :
                textView.setText("【願望】気ながくすればととのう安心せよ");
                break;
            case 1 :
                textView.setText("【学問】安心して勉学せよ");
                break;
            case 2 :
                textView.setText("【学業・技芸・試験】知識のある人の知恵を借りて方針を決めるとよい。");
                break;
            case 3 :
                textView.setText("【旅行】十分でない　控えよ");
                break;
            case 4 :
                textView.setText("【商売】物価下る買うはわるし");
                break;

            case 5 :
                textView.setText("【待人】来るがおそい");
                break;
            case 6 :
                textView.setText("【相場】売れ　大利あり");
                break;
            case 7 :
                textView.setText("【争事】人に任せるが利");
                break;
            case 8 :
                textView.setText("【恋愛】あわてず心をつかめ");
                break;
            case 9 :
                textView.setText("【転居】さしつかえなし");
                break;
            case 10 :
                textView.setText("【病気】気を強くもてなおる");
                break;
            case 11 :
                textView.setText("【願望】おそいが思う通りになる");
                break;
            case 12 :
                textView.setText("【待人】音信あり来る");
                break;
            case 13 :
                textView.setText("【学問】努力すればよろし");
                break;
            case 14 :
                textView.setText("【相場】変動する手を打て");
                break;
            case 15 :
                textView.setText("【争い】心和かにして吉");

                break;
            case 16 :
                textView.setText("【恋愛】恋敵に注意");
                break;
            case 17 :
                textView.setText("【病気】軽し安定してよい");
                break;
            case 18 :
                textView.setText("【願望】思いのまゝです他人の世話よくせよ");
                break;
            case 19 :
                textView.setText("【願望】油断すれば叶わず");
                break;
            case 20 :
                textView.setText("【待人】来るが遅し");
                break;
            case 21 :
                textView.setText("【失物】遅くとも出る");
                break;
            case 22 :
                textView.setText("【旅行】利益あり");
                break;
            case 23 :
                textView.setText("【商売】買うに吉");
                break;
            case 24 :
                textView.setText("【学問】安心して勉学せよ");
                break;
            case 25 :
                textView.setText("【相場】買え　今が良い");
                break;
            case 26 :
                textView.setText("【願望】他人を助けよ　他人の助けにて叶う");
                break;
            case 27 :
                textView.setText("【商売】利益相当あり");
                break;
            case 28 :
                textView.setText("【学問】雑念多し全力を尽くせ");
                break;
            case 29 :
                textView.setText("【争事】控えて人に任せるが吉");
                break;
            case 30 :
                textView.setText("【転居】急ぐが吉");
                break;

            case 31 :
                textView.setText("【待人】時後（おく）れて必ずくる");
                break;
            case 32 :
                textView.setText("【失物】身近の者に問うて探せ");
                break;
            case 33 :
                textView.setText("【旅行】早くしてよろし");
                break;
            case 34 :
                textView.setText("【商売】利あり損はなし");
                break;
            case 35 :
                textView.setText("【学問】決心が足りない勉学せよ");
                break;
            case 36 :
                textView.setText("【相場】買え先で利あり");
                break;
            case 37 :
                textView.setText("【失物】すぐには出ない");
                break;
            case 38 :
                textView.setText("【争事】勝つ　人に頼むが吉");
                break;
            case 39 :
                textView.setText("【恋愛】再出発せよ");
                break;
            case 40 :
                textView.setText("【転居】さしつかえなし");
                break;
            case 41 :
                textView.setText("【出産】さわりなし信神せよ");
                break;
            case 42 :
                textView.setText("【病気】なおる　よき医師にたのめ");
                break;
            case 43 :
                textView.setText("【縁談】心和（やわ）らかに待てば疑い晴れて思い叶う");
                break;
            case 44 :
                textView.setText("【試験】準備は必ず報いられる");
                break;

            case 45 :
                textView.setText("【願望】駄目と思って落胆すれば失う");
                break;
            case 46 :
                textView.setText("【縁談】一途に意志を通しなさい");
                break;
            case 47 :
                textView.setText("【転居】十分でない");
                break;
            case 48 :
                textView.setText("【学業・技芸・試験】いまの力量以上の無理をしてもけっして実らない。");
                break;
            case 49 :
                textView.setText("【失物】物にかくれて出ず");
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



