package com.campus.system.storage.filter;

import com.campus.system.storage.model.IPoint;

public class NearWithInKilometersFilter extends IFilter {
    private IPoint mPoint;
    private String mLatName;
    private String mLngName;
    private int mKilometer;

    public NearWithInKilometersFilter(IPoint point, String latName
            , String lngName, int kilometer) {
        mPoint = point;
        mLatName = latName;
        mLngName = lngName;
        mKilometer = kilometer;
    }
}
