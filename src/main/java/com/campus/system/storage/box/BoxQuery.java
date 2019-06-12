package com.campus.system.storage.box;

import com.campus.system.storage.filter.*;
import com.campus.system.storage.model.IPoint;
import com.campus.system.storage_annotation.property.Property;

import java.util.ArrayList;
import java.util.List;

public class BoxQuery<T> {
    private Box<T> mBox;
    private List<IFilter> mFilters;
    private String mBoxName;//要查询的对象的名字
    private String mTag;//用该查询去干啥的唯一标识，为了在回调中进行区别对待
    private int mLimit = -1;//要查询多少条 若为-1 则不对条数做限制
    private Property mOrderAsc;//排序语句
    private Property mOrderDesc;//排序语句
    private List<Property> mKeys;//要返回的字段

    protected BoxQuery(Box<T> box) {
        mBoxName = box.getName();
        mFilters = new ArrayList();
        mKeys = new ArrayList();
        mBox = box;
    }

    /**
     * 添加查询条件 key = value
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereEqualTo(Property key, Object value){
        EqualToFilter etf = new EqualToFilter(key.getNameInDb(), value);
        mFilters.add(etf);
        return this;
    }

    /**
     * 添加查询条件 key != value
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereNotEqualTo(Property key, Object value){
        NotEqualToFilter netf = new NotEqualToFilter(key.getNameInDb(), value);
        mFilters.add(netf);
        return this;
    }

    /**
     * 添加查询条件 key > value
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereGreaterThan(Property key, Object value){
        GreaterThanFilter gtf = new GreaterThanFilter(key.getNameInDb(), value);
        mFilters.add(gtf);
        return this;
    }

    /**
     * 添加查询条件 key < value
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereLessThan(Property key, Object value){
        LessThanFilter ltf = new LessThanFilter(key.getNameInDb(), value);
        mFilters.add(ltf);
        return this;
    }

    /**
     * 添加查询条件 key >= value
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereGreaterThanOrEqualTo(Property key, Object value){
        GreaterThanEqualToFilter gtetf = new GreaterThanEqualToFilter(key.getNameInDb(), value);
        mFilters.add(gtetf);
        return this;
    }

    /**
     * 添加查询条件 key <= value
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereLessThanOrEqualTo(Property key, Object value){
        LessThanEqualToFilter ltetf = new LessThanEqualToFilter(key.getNameInDb(), value);
        mFilters.add(ltetf);
        return this;
    }

    /**
     * 添加查询条件 in
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereContainedIn(Property key, List value){
        ContainedInFilter cf = new ContainedInFilter(key.getNameInDb(), value);
        mFilters.add(cf);
        return this;
    }

    /**
     * 不包含 not in
     * @param key
     * @param value
     * @return
     */
    public BoxQuery whereNotContainedIn(Property key, List value){
        NotContainedInFilter ncf = new NotContainedInFilter(key.getNameInDb(), value);
        mFilters.add(ncf);
        return this;
    }

    /**
     * 添加查询条件 (select * from className where key like '%value%')
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereContains(Property key, String value){
        ContainsFilter cf = new ContainsFilter(key.getNameInDb(), value);
        mFilters.add(cf);
        return this;
    }
    /**
     * 以指定字符创开头 添加查询条件 where key like 'value%'
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereStartWith(Property key, String value){
        StartWithFilter swf = new StartWithFilter(key.getNameInDb(), value);
        mFilters.add(swf);
        return this;
    }

    /**
     * 以指定字符串结尾 添加查询条件 where key like '%value'
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereEndWith(Property key, String value){
        EndWithFilter ewf = new EndWithFilter(key.getNameInDb(), value);
        mFilters.add(ewf);
        return this;
    }

    /**
     * 根据指定位置查询附近的对象，由近到远
     * @param latName
     * @param lngName
     * @param point
     */
    public BoxQuery whereNear(String latName, String lngName, IPoint point){
        NearFilter nearFilter = new NearFilter(point, latName, lngName);
        mFilters.add(nearFilter);
        return this;
    }

    /**
     * 查询指定范围内的附近的点，排序：由近到远
     * @param latName
     * @param lngName
     * @param point
     * @param kilometers
     */
    public BoxQuery whereNearWithInKilometers(String latName, String lngName, IPoint point, int kilometers){
        NearWithInKilometersFilter nearWithInKilometersFilter =
                new NearWithInKilometersFilter(point, latName, lngName, kilometers);
        mFilters.add(nearWithInKilometersFilter);
        return this;
    }
    /**
     * 设置查询返回条数
     * @param limit 要返回多少条数据
     */
    public BoxQuery limit(int limit){
        mLimit = limit;
        return this;
    }

    public BoxQuery orderByASC(Property key){
        mOrderAsc = key;
        return this;
    }

    public BoxQuery orderByDESC(Property key){
        mOrderDesc = key;
        return this;
    }

    /**
     * 设置查询返回的字段
     * @param keys
     */
    public BoxQuery setKeys(List<Property> keys){
        mKeys.addAll(keys);
        return this;
    }

    public BoxQuery addKey(Property key){
        if(!mKeys.contains(key)){
            mKeys.add(key);
        }
        return this;
    }

    public List<T> query(){
        return mBox.query(this);
    }

    public List<IFilter> getFilters(){
        return mFilters;
    }

    public String getBoxName() {
        return mBoxName;
    }

    public String getTag() {
        return mTag;
    }

    public int getLimit() {
        return mLimit;
    }

    public Property getOrderAsc() {
        return mOrderAsc;
    }

    public Property getOrderDesc() {
        return mOrderDesc;
    }

    public List<Property> getKeys() {
        return mKeys;
    }
}
