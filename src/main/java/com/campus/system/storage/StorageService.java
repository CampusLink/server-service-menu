package com.campus.system.storage;

import com.campus.system.service.Service;
import com.campus.system.storage.box.BoxStore;

public abstract class StorageService extends Service {
    public abstract BoxStore obtainBoxStore(String url, String storeName, String userName, String password);
}
