package com.runtai.splash;

import com.runtai.appintrolibrary.AppIntro;

/**
 * Created by avluis on 08/08/2016.
 * Shared methods between classes
 */
public class BaseIntro extends AppIntro {

    void loadMainActivity() {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        this.finish();
    }
}
