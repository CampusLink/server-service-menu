package com.campus.system.storage;

import com.campus.system.service.Service;
import com.campus.system.storage.model.BoxStore;

public abstract class StorageService extends Service {

    //TODO 服务端的话，需要配置url
    public abstract BoxStore obtainBoxStore(String type, String storeName, String userName, String password);

    public abstract BoxStore obtainBoxStore(String storeName, String userName, String password);
}
