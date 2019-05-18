package com.server.cooperation.dao.impl;

import com.server.cooperation.dao.UserGroupDao;
import com.server.cooperation.entity.mongo.UserGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserGroupDaoImpl implements UserGroupDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<UserGroup> getUserGroupByUserId(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        return mongoTemplate.find(query, UserGroup.class);
    }
}
