package com.yu.moreskills.serial;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by D22436 on 2017/8/8.
 * 序列化：实现Parcelable接口
 */

public class Info implements Parcelable {
    private String name;
    private int age;

    protected Info(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
    }

    public static final Creator<Info> CREATOR = new Creator<Info>() {
        @Override
        public Info createFromParcel(Parcel in) {
            return new Info(in);
        }

        @Override
        public Info[] newArray(int size) {
            return new Info[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
    }
}
