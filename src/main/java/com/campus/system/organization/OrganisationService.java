package com.campus.system.organization;

import com.campus.system.organization.model.Organization;
import com.campus.system.service.Service;

import java.util.List;

public abstract class OrganisationService extends Service {

    public abstract Organization createOrganization(String token, Organization organization);

    public abstract List<Organization> queryOrgList(String token, String preId, int pageSize);

    public abstract Organization resetOrgLogo(String token, String orgId, String logo);

    public abstract Organization resetOrgDesc(String token, String orgId, String desc);

    public abstract Organization resetOrgName(String token, String orgId, String name);

    public abstract Organization queryOrgById(String token, String orgId);
}
