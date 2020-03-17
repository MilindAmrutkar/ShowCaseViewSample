package com.example.showcaseviewsample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.Target;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

public class SingleShotActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_shot);

        Target viewTarget = new ViewTarget(R.id.button, this);
        new ShowcaseView.Builder(this)
                .setTarget(viewTarget)
                .setContentTitle(R.string.title_single_shot)
                .setContentText(R.string.R_string_desc_single_shot)
                .singleShot(42)
                .build();
    }
}
