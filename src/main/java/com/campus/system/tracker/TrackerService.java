package com.campus.system.tracker;

import com.campus.system.service.Service;
import com.campus.system.tracker.model.Tracker;

import java.util.List;

public abstract class TrackerService extends Service {

    public abstract void insertTracker(String token, Tracker tracker);

    public abstract void insertPatchTracker(String token, List<Tracker> trackers);

    public abstract List<Tracker> queryTrackersByLayout(String token, String layout, long preId, int pageSize);

    public abstract List<Tracker> queryTrackersByItem(String token, String layout, String item, long preId, int pageSize);

    public abstract List<Tracker> queryTrackersByOperate(String token, String layout, String item, String operate, long preId, int pageSize);
}
