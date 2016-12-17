package com.runtai.splash.indicators;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.runtai.appintrolibrary.AppIntro2;
import com.runtai.splash.R;
import com.runtai.splash.SampleSlide;

public class CustomColorIndicator extends AppIntro2 {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(SampleSlide.newInstance(R.layout.intro));
        addSlide(SampleSlide.newInstance(R.layout.intro2));
        addSlide(SampleSlide.newInstance(R.layout.intro3));
        addSlide(SampleSlide.newInstance(R.layout.intro4));

        setIndicatorColor(Color.parseColor("#ff0000"), Color.parseColor("#00ff00"));
        showSkipButton(false);
    }

    private void loadMainActivity() {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        this.finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        loadMainActivity();
    }

    public void getStarted(View v) {
        loadMainActivity();
    }
}
