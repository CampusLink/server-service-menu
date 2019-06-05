package com.campus.system.storage.filter;

import com.campus.system.storage.model.IPoint;

public class NearFilter extends IFilter {
    private IPoint mPoint;
    private String mLatName;
    private String mLngName;

    public NearFilter(IPoint point, String latName, String lngName) {
        mPoint = point;
        mLatName = latName;
        mLngName = lngName;
    }

    public IPoint getPoint() {
        return mPoint;
    }

    public String getLatName() {
        return mLatName;
    }

    public String getLngName() {
        return mLngName;
    }
}
