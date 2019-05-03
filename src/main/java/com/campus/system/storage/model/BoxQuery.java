package com.campus.system.storage.model;

import com.campus.system.storage.filter.*;

import java.util.ArrayList;
import java.util.List;

public class BoxQuery<T extends BoxObj> {
    private Box<T> mBox;
    private List<IFilter> mFilters;
    private String mBoxName;//要查询的对象的名字
    private String mTag;//用该查询去干啥的唯一标识，为了在回调中进行区别对待
    private int mLimit = -1;//要查询多少条 若为-1 则不对条数做限制
    private String mOrderAsc = "";//排序语句
    private String mOrderDesc = "";//排序语句
    private List<String> mKeys;//要返回的字段

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
    public BoxQuery whereEqualTo(String key, Object value){
        EqualToFilter etf = new EqualToFilter(key, value);
        mFilters.add(etf);
        return this;
    }

    /**
     * 添加查询条件 key != value
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereNotEqualTo(String key, Object value){
        NotEqualToFilter netf = new NotEqualToFilter(key, value);
        mFilters.add(netf);
        return this;
    }

    /**
     * 添加查询条件 key > value
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereGreaterThan(String key, double value){
        GreaterThanFilter gtf = new GreaterThanFilter(key, value);
        mFilters.add(gtf);
        return this;
    }

    /**
     * 添加查询条件 key < value
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereLessThan(String key, double value){
        LessThanFilter ltf = new LessThanFilter(key, value);
        mFilters.add(ltf);
        return this;
    }

    /**
     * 添加查询条件 key >= value
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereGreaterThanEqualTo(String key, double value){
        GreaterThanEqualToFilter gtetf = new GreaterThanEqualToFilter(key, value);
        mFilters.add(gtetf);
        return this;
    }

    /**
     * 添加查询条件 key <= value
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereLessThanEqualTo(String key, double value){
        LessThanEqualToFilter ltetf = new LessThanEqualToFilter(key, value);
        mFilters.add(ltetf);
        return this;
    }

    /**
     * 添加查询条件 where key like '%value%'
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereContains(String key, String value){
        ContainFilter cf = new ContainFilter(key, value);
        mFilters.add(cf);
        return this;
    }

    /**
     * 添加查询条件 where objectId not in (select * from className where key like '%value%')
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereNotContains(String key, String value){
        NotContainFilter ncf = new NotContainFilter(key, value);
        mFilters.add(ncf);
        return this;
    }
    /**
     * 以指定字符创开头 添加查询条件 where key like 'value%'
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereStartWith(String key, String value){
        StartWithFilter swf = new StartWithFilter(key, value);
        mFilters.add(swf);
        return this;
    }

    /**
     * 以指定字符串结尾 添加查询条件 where key like '%value'
     * @param key 属性
     * @param value 属性值
     */
    public BoxQuery whereEndWith(String key, String value){
        EndWithFilter ewf = new EndWithFilter(key, value);
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

    public BoxQuery orderByASC(String key){
        mOrderAsc = key;
        return this;
    }

    public BoxQuery orderByDESC(String key){
        mOrderDesc = key;
        return this;
    }

    /**
     * 设置查询返回的字段
     * @param keys
     */
    public BoxQuery setKeys(List<String> keys){
        mKeys.addAll(keys);
        return this;
    }

    public List<T> query(){
        return mBox.query(this);
    }

    public void queryInBackground(BoxQueryListener<T> listener){
        mBox.queryInBackground(this, listener);
    }

    public static interface BoxQueryListener<T>{
        public void done();
    }
}
