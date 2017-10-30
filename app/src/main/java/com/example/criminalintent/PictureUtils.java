package com.example.criminalintent;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;

/**
 * Created by 王宇飞 on 2017/10/29/029.
 */

public class PictureUtils {

    //合理缩放
    public static Bitmap getScaledBitmap(String path, Activity activity){
        Point size = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(size);

        return getScaledBitmap(path,size.x,size.y);
    }

    public static Bitmap getScaledBitmap(String path,int destWidth,int destHeiht){

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path,options);

        float srcWidth = options.outWidth;
        float srcHeight = options.outHeight;

        int inSampleSize = 1;
        if (srcHeight > destHeiht || srcWidth > destWidth){
            float heightScale = srcHeight / destHeiht;
            float widthScale = srcWidth / destWidth;

            inSampleSize = Math.round(heightScale > widthScale ? heightScale : widthScale);
        }

        options = new BitmapFactory.Options();
        options.inSampleSize = inSampleSize;

        return BitmapFactory.decodeFile(path,options);
    }
}
