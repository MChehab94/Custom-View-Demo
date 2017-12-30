package mchehab.com.kotlinapp

import android.content.Context
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import com.squareup.picasso.Picasso

/**
 * Created by muhammadchehab on 12/30/17.
 */
class MyImageView : AppCompatImageView {

    var url: String = ""

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs){
        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.MyImageView,
                0, 0)
        url = typedArray.getString(R.styleable.MyImageView_imageURL)
        Picasso.with(context).load(url).into(this)
    }
}