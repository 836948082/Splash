package com.runtai.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.runtai.splash.animations.ColorAnimation;
import com.runtai.splash.animations.CustomAnimation;
import com.runtai.splash.animations.DepthAnimation;
import com.runtai.splash.animations.FadeAnimation;
import com.runtai.splash.animations.FlowAnimation;
import com.runtai.splash.animations.SlideOverAnimation;
import com.runtai.splash.animations.ZoomAnimation;
import com.runtai.splash.indicators.CustomColorIndicator;
import com.runtai.splash.indicators.CustomIndicator;
import com.runtai.splash.indicators.ProgressIndicator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startDefaultIntro(View v) {
        Intent intent = new Intent(this, DefaultIntro.class);
        startActivity(intent);
    }

    public void startSecondLayoutIntro(View v) {
        Intent intent = new Intent(this, DefaultIntro2.class);
        startActivity(intent);
    }

    public void startCustomIntro(View v) {
        Intent intent = new Intent(this, CustomIntro.class);
        startActivity(intent);
    }

    public void disableSwipeIntro1(View v) {
        Intent intent = new Intent(this, DisableSwipeIntro1.class);
        startActivity(intent);
    }

    public void disableSwipeIntro2(View v) {
        Intent intent = new Intent(this, DisableSwipeIntro2.class);
        startActivity(intent);
    }

    public void slidePolicyDemo(View v) {
        Intent intent = new Intent(this, IntroDemoPolicy.class);
        startActivity(intent);
    }

    public void startPermissionsIntro(View view) {
        Intent intent = new Intent(this, PermissionsIntro.class);
        startActivity(intent);
    }

    public void startPermissionsIntro2(View view) {
        Intent intent = new Intent(this, PermissionsIntro2.class);
        startActivity(intent);
    }

    public void customBackgroundView(View v) {
        Intent intent = new Intent(this, IntroWithBackground.class);
        startActivity(intent);
    }


    /**
     * 动画引导页
     */
    public void startColorAnimation(View view) {
        Intent intent = new Intent(this, ColorAnimation.class);
        startActivity(intent);
    }

    public void startFadeAnimation(View v) {
        Intent intent = new Intent(this, FadeAnimation.class);
        startActivity(intent);
    }

    public void startZoomAnimation(View v) {
        Intent intent = new Intent(this, ZoomAnimation.class);
        startActivity(intent);
    }

    public void startFlowAnimation(View v) {
        Intent intent = new Intent(this, FlowAnimation.class);
        startActivity(intent);
    }

    public void startDepthAnimation(View v) {
        Intent intent = new Intent(this, DepthAnimation.class);
        startActivity(intent);
    }

    public void startSlideOverAnimation(View v) {
        Intent intent = new Intent(this, SlideOverAnimation.class);
        startActivity(intent);
    }

    public void TransformerAnimation(View v) {
        Intent intent = new Intent(this, CustomAnimation.class);
        startActivity(intent);
    }

    /**
     * 指示器引导页
     */
    public void startProgressIndicator(View v) {
        Intent intent = new Intent(this, ProgressIndicator.class);
        startActivity(intent);
    }

    public void startCustomIndicator(View v) {
        Intent intent = new Intent(this, CustomIndicator.class);
        startActivity(intent);
    }

    public void startCustomColorIndicator(View v) {
        Intent intent = new Intent(this, CustomColorIndicator.class);
        startActivity(intent);
    }

    /**
     * 自定义字体引导页
     */
    public void simpleCustomTypeface(View view) {
        Intent intent = new Intent(this, CustomTypefaceActivity.class);
        startActivity(intent);
    }

    /**
     * 向导模式引导页
     */
    public void wizardMode(View view) {
        Intent intent = new Intent(this, WizardActivity.class);
        startActivity(intent);
    }
}
