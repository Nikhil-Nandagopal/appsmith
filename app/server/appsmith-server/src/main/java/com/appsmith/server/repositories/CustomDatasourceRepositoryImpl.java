package com.appsmith.server.repositories;

import com.appsmith.server.domains.Datasource;
import com.appsmith.server.helpers.PolicyUtils;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

@Component
public class CustomDatasourceRepositoryImpl extends BaseAppsmithRepositoryImpl<Datasource> implements CustomDatasourceRepository {

    private final PolicyUtils policyUtils;

    public CustomDatasourceRepositoryImpl(ReactiveMongoOperations mongoOperations, MongoConverter mongoConverter, PolicyUtils policyUtils) {
        super(mongoOperations, mongoConverter, policyUtils);
        this.policyUtils = policyUtils;
    }
}
