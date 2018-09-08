package cn.itlowly.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;

import cn.itlowly.coverimageview.R;

/**
 * Created by itlowly on 2018/9/7/007.
 */
public class CoverImageView extends ImageView {

    private int coverColor = 0x00000000;

    public CoverImageView(Context context) {
        super(context);
    }

    public CoverImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CoverImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.cImg, defStyleAttr, 0);
        coverColor = typedArray.getColor(R.styleable.cImg_cover_color, 0x00000000);
        typedArray.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (coverColor != 0) {
            getDrawable().setColorFilter(coverColor, PorterDuff.Mode.SRC_ATOP);
        }
        super.onDraw(canvas);
        getDrawable().clearColorFilter();
    }

    public void setCoverColor(int coverColor) {
        this.coverColor = coverColor;
        invalidate();
    }
}
