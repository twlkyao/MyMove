package com.twlkyao.mymove;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button button;

    private MyViewByScroller myViewByScroller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        myViewByScroller = (MyViewByScroller) findViewById(R.id.myViewByScroller);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewByScroller.smoothScrollTo(-40, 10);
            }
        });

    }
}
