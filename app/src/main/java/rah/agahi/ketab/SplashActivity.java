package rah.agahi.ketab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.method.CharacterPickerDialog;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

import rah.agahi.ketab.util.Base;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends Base {
    Boolean isLogin = false;
    private static final String LOGIN = "LOGIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getData();

        new Handler().postDelayed(new Runnable() {
            @SuppressLint("CommitPrefEdits")
            @Override
            public void run() {

                Intent intent;
                if (isLogin) {
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                } else {
                    intent = new Intent(SplashActivity.this, LoginActivity.class);
                }
                startActivity(intent);
                finish();

            }
        }, 3000);
    }

    private void getData() {
        SharedPreferences sharedPreferences = getSharedPreferences(LOGIN, MODE_PRIVATE);
        isLogin = sharedPreferences.getBoolean("isLogin", false);

    }
}