package com.idn99.project.matkulti.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Matkul implements Parcelable {
    private String namaMatkul;
    private String sks;
    private String keterangan;

    public Matkul(String namaMatkul, String sks, String keterangan) {
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.keterangan = keterangan;
    }

    public Matkul(Parcel in) {
        namaMatkul = in.readString();
        sks = in.readString();
        keterangan = in.readString();
    }

    public static final Creator<Matkul> CREATOR = new Creator<Matkul>() {
        @Override
        public Matkul createFromParcel(Parcel in) {
            return new Matkul(in);
        }

        @Override
        public Matkul[] newArray(int size) {
            return new Matkul[size];
        }
    };

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public String getSks() {
        return sks;
    }

    public String getKeterangan() {
        return keterangan;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(namaMatkul);
        dest.writeString(sks);
        dest.writeString(keterangan);
    }
}