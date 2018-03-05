package org.futurebrains.store.store.model;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

/**
 * Created by Divya on 2/22/2018.
 */

public class AppModel implements Parcelable
{
    private Drawable appImageResource;
    private String appName;
    private String appUrl;

    public AppModel(Drawable appImageResource, String appName, String appUrl)
    {
        this.appImageResource = appImageResource;
        this.appName = appName;
        this.appUrl = appUrl;
    }

    protected AppModel(Parcel in) {
        appName = in.readString();
        appUrl = in.readString();
    }

    public static final Creator<AppModel> CREATOR = new Creator<AppModel>() {
        @Override
        public AppModel createFromParcel(Parcel in) {
            return new AppModel(in);
        }

        @Override
        public AppModel[] newArray(int size) {
            return new AppModel[size];
        }
    };

    public Drawable getAppImageResource() {  return appImageResource; }
    public void setAppImageResource(Drawable appImageResource) { this.appImageResource = appImageResource; }

    public String getAppName() { return appName; }
    public void setAppName(String appName) { this.appName = appName; }

    public String getAppUrl() { return appUrl; }
    public void setAppUrl(String appUrl) { this.appUrl = appUrl; }

    @Override
    public int describeContents() {  return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(appName);
        dest.writeString(appUrl);
    }
}
