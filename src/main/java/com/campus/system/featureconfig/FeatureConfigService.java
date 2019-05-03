package com.campus.system.featureconfig;

import com.campus.system.featureconfig.model.FeatureConfig;
import com.campus.system.service.Service;

import java.util.List;

public abstract class FeatureConfigService extends Service {
    public abstract void inserFeature(String token, FeatureConfig config);

    public abstract List<FeatureConfig> queryFeatures(String token, String preId, int pageSize);

    public abstract boolean removeFeature(String token, String featureId);

    public abstract FeatureConfig updateFeatureValue(String token, String featureId, String value);

    public abstract FeatureConfig updateFeatureName(String token, String featureId, String name);

    public abstract FeatureConfig updateFeatureStatus(String token, String featureId, int status);

}
