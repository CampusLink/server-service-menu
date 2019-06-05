package com.campus.system.storage.model;

public class IPoint {
    private double mLng;
    private double mLat;

    public IPoint(double lng, double lat) {
        mLng = lng;
        mLat = lat;
    }

    public double getLng() {
        return mLng;
    }

    public double getLat() {
        return mLat;
    }
}
