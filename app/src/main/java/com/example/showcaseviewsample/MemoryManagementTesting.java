package com.example.showcaseviewsample;

import android.app.Activity;
import android.os.Bundle;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.SimpleShowcaseEventListener;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

public class MemoryManagementTesting extends Activity {

    int currentShowcase = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showcase();
    }

    private void showcase() {
        new ShowcaseView.Builder(this)
                .withMaterialShowcase()
                .setContentText(String.format("Showing %1$d", currentShowcase))
                .setTarget(new ViewTarget(R.id.buttonBlocked, this))
                .setShowcaseEventListener(
                        new SimpleShowcaseEventListener() {
                            @Override
                            public void onShowcaseViewDidHide(ShowcaseView showcaseView) {
                                currentShowcase++;
                                showcase();
                            }
                        }
                )
                .build();
    }

}

