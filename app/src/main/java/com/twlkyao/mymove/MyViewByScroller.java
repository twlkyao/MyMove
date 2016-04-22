package com.twlkyao.mymove;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Scroller;
import android.widget.TextView;

/**
 * Created by steveqi on 2016/4/21.
 */
public class MyViewByScroller extends TextView {

    private Scroller mScroller;

    private int mCurrentX = 0;
    private int mCurrentY = 0;

    public MyViewByScroller(Context context) {
        super(context);
        init();
    }

    public MyViewByScroller(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    public MyViewByScroller(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        mScroller = new Scroller(getContext());
    }



    /**
     * scroll the view by deltaX and deltaY
     * @param destX the distance to scroll on X axis.
     * @param destY the distance to scroll on Y axis.
     */
    public void smoothScrollTo(int destX, int destY){
        mCurrentX = getScrollX();
        mCurrentY = getScrollY();
        int deltaX = destX - mCurrentX;
        int deltaY = destY - mCurrentY;

        mScroller.startScroll(mCurrentX, mCurrentY, deltaX, deltaY);

        invalidate();
    }

    @Override
    public void computeScroll() {
        if(mScroller.computeScrollOffset()){
            scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
            postInvalidate();
        }
    }
}
