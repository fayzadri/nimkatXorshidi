package com.hallaji.farzad.nimkatxorshidi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.jsibbold.zoomage.ZoomageView;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;
import com.nightonke.boommenu.Util;


public class AxActivity extends AppCompatActivity {
    final CountDownTimer countDownTimer = new CountDownTimer(10000, 1000) {

        public void onTick(long millisUntilFinished) {
            //TODO: Do something every second
        }

        public void onFinish() {

            finish();
            Intent intent = new Intent(getApplication() , MainActivity.class);
            startActivity(intent);
            //YourActivity.finish();  outside the actvitiy

        }
    }.start();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ax);


        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);



        BoomMenuButton bmb = (BoomMenuButton) findViewById(R.id.bmb);
        bmb.setButtonEnum(ButtonEnum.SimpleCircle);

        bmb.setPiecePlaceEnum(PiecePlaceEnum.DOT_7_3);
        bmb.setButtonPlaceEnum(ButtonPlaceEnum.SC_7_3);
        //bmb.setShowMoveEaseEnum(EaseEnum.EaseOutBack);

//        bmb.setShowRotateEaseEnum(EaseEnum.EaseOutBack);
//        bmb.setShowScaleEaseEnum(EaseEnum.EaseOutBack);
//        bmb.setHideMoveEaseEnum(EaseEnum.EaseInBack);
//        bmb.setHideRotateEaseEnum(EaseEnum.EaseInBack);
//        bmb.setHideScaleEaseEnum(EaseEnum.EaseInBack);

        bmb.setUse3DTransformAnimation(true);
        //bmb.setBoomEnum(BoomEnum.HORIZONTAL_THROW_2);

        bmb.setShowDelay(100);
//        bmb.setShowDuration(1000);
//        bmb.setRotateDegree(1080);
//        bmb.setHideDelay(0);
//        bmb.setHideDuration(500);
//        bmb.setFrames(80);

//        for (int i = 0; i < bmb.getButtonPlaceEnum().buttonNumber(); i++) {
//            bmb.addBuilder(new SimpleCircleButton.Builder()
//                    .normalImageRes(R.drawable.ic_home_white_24dp));
//        }


        bmb.addBuilder(new SimpleCircleButton.Builder()
                .normalColor(R.color.btn1)
                .pieceColorRes(R.color.btn1)
                .highlightedColor(R.color.btn1)
                .unableColor(R.color.btn1)
                .normalColorRes(R.color.btn1)
                .listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        Bundle mBundle = new Bundle();
                        mBundle.putString("url", "http://www.havairan.com/");
                        Intent intent0 = new Intent(getApplication() , WebPageActivity.class);
                        intent0.putExtras(mBundle);
                        finish();
                        startActivity(intent0);
                    }
                })
                .buttonRadius(Util.dp2px(30))
                .imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(50), Util.dp2px(50)))
                //.imagePadding(new Rect(30, 10, 0, 0))
                //.imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(70), Util.dp2px(70)))
                .normalImageRes(R.drawable.if_weather02_1530391));

        bmb.addBuilder(new SimpleCircleButton.Builder()
                .normalColor(R.color.btn2)
                .pieceColorRes(R.color.btn2)
                .highlightedColor(R.color.btn2)
                .unableColor(R.color.btn2)
                //.buttonRadius(Util.dp2px(40))
                .normalColorRes(R.color.btn2)
                .buttonRadius(Util.dp2px(30))
                .imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(50), Util.dp2px(50)))
                .listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        Bundle mBundle1 = new Bundle();
                        mBundle1.putString("url", "http://techpark.ir/?login=true");
                        Intent intent1 = new Intent(getApplication() , WebPageActivity.class);
                        intent1.putExtras(mBundle1);
                        finish();
                        startActivity(intent1);
                    }
                })
                //.imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(50), Util.dp2px(50)))
                .normalImageRes(R.drawable.if_search_pointer_87916));

        bmb.addBuilder(new SimpleCircleButton.Builder()
                .normalColor(R.color.btn3)
                .pieceColorRes(R.color.btn3)
                .highlightedColor(R.color.btn3)
                .unableColor(R.color.btn3)
                .buttonRadius(Util.dp2px(30))
                .imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(50), Util.dp2px(50)))
                .normalColorRes(R.color.btn3)
                .listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        Bundle mBundle2 = new Bundle();
                        mBundle2.putString("url", "https://www.google.com/maps/place/Pardis+Technology+Park/@35.7298978,51.8227088,17z/data=!3m1!4b1!4m5!3m4!1s0x3f91da3b00f3efc9:0x383d79f4cad589c8!8m2!3d35.7298935!4d51.8248975");
                        Intent intent2 = new Intent(getApplication() , WebPageActivity.class);
                        intent2.putExtras(mBundle2);
                        finish();
                        startActivity(intent2);
                    }
                })
                //.imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(50), Util.dp2px(50)))
                .normalImageRes(R.drawable.if_pin_65865));

        bmb.addBuilder(new SimpleCircleButton.Builder()
                .normalColor(R.color.btn4)
                .pieceColorRes(R.color.btn4)
                .highlightedColor(R.color.btn4)
                .unableColor(R.color.btn4)
                .buttonRadius(Util.dp2px(30))
                .imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(50), Util.dp2px(50)))
                .normalColorRes(R.color.btn4)
                .listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        Bundle mBundle3 = new Bundle();
                        mBundle3.putString("url", "http://www.online-traffic.ir/");
                        Intent intent3 = new Intent(getApplication() , WebPageActivity.class);
                        intent3.putExtras(mBundle3);
                        finish();
                        startActivity(intent3);
                    }
                })
                .normalImageRes(R.drawable.if_trafficlight_416401));

        bmb.addBuilder(new SimpleCircleButton.Builder()
                .normalColor(R.color.btn5)
                .pieceColorRes(R.color.btn5)
                .highlightedColor(R.color.btn5)
                .unableColor(R.color.btn5)
                .buttonRadius(Util.dp2px(30))
                .imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(50), Util.dp2px(50)))
                .normalColorRes(R.color.btn5)
                .listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        // When the boom-button corresponding this builder is clicked.
                        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.sabaidea.aparat");
                        finish();
                        if (launchIntent != null) {
                            startActivity(launchIntent);//null pointer check in case package name was not found
                        }
                        startActivity(launchIntent);
                    }
                })
                //.imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(70), Util.dp2px(70)))
                .normalImageRes(R.drawable.aparat_512512));

        bmb.addBuilder(new SimpleCircleButton.Builder()
                .normalColor(R.color.btn6)
                .pieceColorRes(R.color.btn6)
                .highlightedColor(R.color.btn6)
                .unableColor(R.color.btn6)
                .buttonRadius(Util.dp2px(30))
                .imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(50), Util.dp2px(50)))
                .normalColorRes(R.color.btn6)
                .listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        // When the boom-button corresponding this builder is clicked.
                        finish();
                        Bundle mBundle5 = new Bundle();
                        mBundle5.putString("ax", "metro");
                        Intent intent5 = new Intent(getApplication() , AxActivity.class);
                        intent5.putExtras(mBundle5);
                        finish();
                        startActivity(intent5);
                    }
                })
                //.imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(70), Util.dp2px(70)))
                .normalImageRes(R.drawable.if_train_173119));

        bmb.addBuilder(new SimpleCircleButton.Builder()
                .normalColor(R.color.btn7)
                .pieceColorRes(R.color.btn7)
                .highlightedColor(R.color.btn7)
                .unableColor(R.color.btn7)
                .normalColorRes(R.color.btn7)
                .buttonRadius(Util.dp2px(30))
                .imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(50), Util.dp2px(50)))
                .listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        // When the boom-button corresponding this builder is clicked.
                        finish();
                        Bundle mBundle6 = new Bundle();
                        mBundle6.putString("ax", "brt");
                        Intent intent6 = new Intent(getApplication() , AxActivity.class);
                        intent6.putExtras(mBundle6);
                        finish();
                        startActivity(intent6);
                    }
                })

                //.imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(70), Util.dp2px(70)))
                .normalImageRes(R.drawable.if_bus_379558));





        Bundle extras = getIntent().getExtras();
        assert extras != null;
        String ax = extras.getString("ax");

        ZoomageView imageView = (ZoomageView) findViewById(R.id.imageView);

        assert ax != null;
        if(ax.equals("metro")){
            imageView.setImageResource(R.drawable.metro);
        }else{
            imageView.setImageResource(R.drawable.brt1);
        }


    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();

        Log.i("qwertyuikyhnghng" , "asasasas");
        countDownTimer.cancel();
        countDownTimer.start();

    }
}