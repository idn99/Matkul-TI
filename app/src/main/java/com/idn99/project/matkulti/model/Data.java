package com.idn99.project.matkulti.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Data implements Parcelable {

    private String semester;
    private ArrayList<Matkul> matkul;

    public Data(String semester, ArrayList<Matkul> matkul) {
        this.semester = semester;
        this.matkul = matkul;
    }

    protected Data(Parcel in) {
        semester = in.readString();
        matkul = in.createTypedArrayList(Matkul.CREATOR);
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public String getSemester() {
        return semester;
    }

    public ArrayList<Matkul> getMatkul() {
        return matkul;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(semester);
        dest.writeTypedList(matkul);
    }
}
