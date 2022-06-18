package rah.agahi.ketab.util;

import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceControl;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import rah.agahi.ketab.R;

public abstract class Base extends AppCompatActivity {



    @Override
    public void finishAffinity() {
        super.finishAffinity();
        overridePendingTransition(R.anim.anim_alpha,R.anim.anim_alpha);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_alpha,R.anim.anim_alpha);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_alpha,R.anim.anim_alpha);
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.anim_alpha,R.anim.anim_alpha);

    }

    @Override
    public void startActivity(Intent intent, @Nullable Bundle options) {
        super.startActivity(intent, options);
        overridePendingTransition(R.anim.anim_alpha,R.anim.anim_alpha);
    }

    @Override
    public void startActivities(Intent[] intents) {
        super.startActivities(intents);
        overridePendingTransition(R.anim.anim_alpha,R.anim.anim_alpha);
    }

    @Override
    public void startActivities(Intent[] intents, @Nullable Bundle options) {
        super.startActivities(intents, options);
        overridePendingTransition(R.anim.anim_alpha,R.anim.anim_alpha);
    }
}




