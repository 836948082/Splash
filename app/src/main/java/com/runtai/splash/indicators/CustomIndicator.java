package com.runtai.splash.indicators;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.runtai.appintrolibrary.AppIntro;
import com.runtai.appintrolibrary.IndicatorController;
import com.runtai.splash.R;
import com.runtai.splash.SampleSlide;

public class CustomIndicator extends AppIntro {

    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(SampleSlide.newInstance(R.layout.intro));
        addSlide(SampleSlide.newInstance(R.layout.intro2));
        addSlide(SampleSlide.newInstance(R.layout.intro3));
        addSlide(SampleSlide.newInstance(R.layout.intro4));

        setCustomIndicator(new CustomIndicatorController());
    }

    private void loadMainActivity() {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        this.finish();
    }

    @Override
    public void onSkipPressed() {
        loadMainActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNextPressed() {

    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
    }

    @Override
    public void onSlideChanged() {

    }

    public void getStarted(View v) {
        loadMainActivity();
    }

    private class CustomIndicatorController implements IndicatorController {
        private static final int FIRST_PAGE_NUM = 0;
        private TextView mTextView;
        private int mSlideCount;

        @Override
        public View newInstance(@NonNull Context context) {
            mTextView = (TextView) View.inflate(context, R.layout.custom_indicator, null);
            return mTextView;
        }

        @Override
        public void initialize(int slideCount) {
            mSlideCount = slideCount;
            selectPosition(FIRST_PAGE_NUM);
        }

        @Override
        public void selectPosition(int index) {
            mTextView.setText(String.format("%d/%d", index + 1, mSlideCount));
        }

        @Override
        public void setSelectedIndicatorColor(int color) {

        }

        @Override
        public void setUnselectedIndicatorColor(int color) {

        }
    }
}
