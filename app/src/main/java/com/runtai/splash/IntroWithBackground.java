package com.runtai.splash;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.runtai.appintrolibrary.AppIntro2Fragment;

public final class IntroWithBackground extends BaseIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntro2Fragment.newInstance("Title here", "Description here...\nYeah, I've added this fragment programmatically",
                R.drawable.ic_slide1, Color.TRANSPARENT));

        addSlide(AppIntro2Fragment.newInstance("HTML Description", Html.fromHtml("<b>Description bold...</b><br><i>Description italic...</i>"),
                R.drawable.ic_slide1, Color.TRANSPARENT));

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(android.R.drawable.ic_dialog_email);
        imageView.setBackgroundColor(Color.BLACK);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setBackgroundView(imageView);

        // 设置震动
        setVibrate(true);
        // 设置震动时长
        setVibrateIntensity(30);
        // 设置Skip按钮是否显示
        showSkipButton(true);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        loadMainActivity();
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSkipPressed() {
        super.onSkipPressed();
        loadMainActivity();
    }

    @Override
    public void onNextPressed() {
        super.onNextPressed();
        Toast.makeText(this, "下一页", Toast.LENGTH_SHORT).show();
    }
}
