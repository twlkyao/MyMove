package com.twlkyao.mymove;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by steveqi on 2016/4/15.
 */
public class MyViewByScroll extends TextView {

    private int mLastX = 0;

    private int mLastY = 0;

    public MyViewByScroll(Context context) {
        super(context);
    }

    public MyViewByScroll(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewByScroll(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:{
                break;
            }
            case MotionEvent.ACTION_MOVE:{
                int deltaX = x - mLastX;
                int deltaY = y - mLastY;
                scrollBy(-deltaX, -deltaY); // scrollBy() is scroll the content, so the deltaX and deltaY is opposite.
                Log.d("steveqi", "scroll scrollX=" + getScrollX() + " scrollY=" + getScaleY());
                break;
            }
            case MotionEvent.ACTION_UP:{
                break;
            }
        }
        mLastX = x;
        mLastY = y;
        return true;
    }
}
