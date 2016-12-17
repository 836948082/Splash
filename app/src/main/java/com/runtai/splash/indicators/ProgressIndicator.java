package com.runtai.splash.indicators;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.runtai.appintrolibrary.AppIntro;
import com.runtai.splash.R;
import com.runtai.splash.SampleSlide;

public class ProgressIndicator extends AppIntro {

    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(SampleSlide.newInstance(R.layout.intro));
        addSlide(SampleSlide.newInstance(R.layout.intro2));
        addSlide(SampleSlide.newInstance(R.layout.intro3));
        addSlide(SampleSlide.newInstance(R.layout.intro4));

        setProgressIndicator();
    }

    private void loadAndFinishActivity() {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        this.finish();
    }

    @Override
    public void onSkipPressed() {
        loadAndFinishActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNextPressed() {

    }

    @Override
    public void onDonePressed() {
        loadAndFinishActivity();
    }

    @Override
    public void onSlideChanged() {

    }

    public void getStarted(View v) {
        loadAndFinishActivity();
    }
}
