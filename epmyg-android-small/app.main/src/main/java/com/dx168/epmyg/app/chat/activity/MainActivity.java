package com.dx168.epmyg.app.chat.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.dx168.epmyg.app.main.R;
import net.wequick.small.Small;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startIM(View v) {
        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Small.openUri("trade",MainActivity.this);
                finish();
            }
        });
    }
}
