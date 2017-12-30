package mchehab.com.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.squareup.picasso.Picasso;

/**
 * Created by muhammadchehab on 12/30/17.
 */

public class MyImageView extends AppCompatImageView {

    private String url;

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable
                .MyImageView, 0, 0);
        url = typedArray.getString(R.styleable.MyImageView_imageURL);
        Picasso.with(context).load(url).into(this);
    }

    public void setImageURL(String url){
        this.url = url;
        Picasso.with(getContext()).load(url).into(this);
    }
}