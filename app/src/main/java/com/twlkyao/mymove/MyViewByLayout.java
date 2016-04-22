package com.twlkyao.mymove;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by steveqi on 2016/4/15.
 */
public class MyViewByLayout extends View {

    private int mLastX = 0;

    private int mLastY = 0;

    public MyViewByLayout(Context context) {
        super(context);
    }

    public MyViewByLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewByLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                break;
            }
            case MotionEvent.ACTION_MOVE: {
                int deltaX = x - mLastX;
                int deltaY = y - mLastY;
                ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                layoutParams.leftMargin += deltaX;
                layoutParams.topMargin += deltaY;
                setLayoutParams(layoutParams);
                break;
            }
            case MotionEvent.ACTION_UP: {
                break;
            }
        }

        mLastX = x;
        mLastY = y;
        return true;
    }
}
