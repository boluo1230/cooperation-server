package com.server.cooperation.dao.impl;

import com.server.cooperation.dao.UserTeamDao;
import com.server.cooperation.entity.mongo.UserTeam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserTeamDaoImpl implements UserTeamDao {

    private final MongoTemplate mongoTemplate;

    @Override
    public List<UserTeam> getUserTeamList(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        return mongoTemplate.find(query, UserTeam.class);
    }
}
