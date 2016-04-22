package com.twlkyao.mymove;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.nineoldandroids.view.ViewHelper;

/**
 * Created by steveqi on 2016/4/11.
 */
public class MyViewByAnimation extends View {

    private int mLastX = 0;
    private int mLastY = 0;

    public MyViewByAnimation(Context context) {
        super(context);
    }

    public MyViewByAnimation(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewByAnimation(Context context, AttributeSet attrs, int defStyleAttr) {
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
                int translationX = (int) (getTranslationX() + deltaX);
                int translationY = (int) (getTranslationY() + deltaY);

               setTranslationX(translationX);
               setTranslationY(translationY);
                break;
            }
            case MotionEvent.ACTION_UP: {
                break;
            }
            default: {
                break;
            }
        }

        mLastX = x;
        mLastY = y;
        return true;
    }
}
