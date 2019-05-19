package com.server.cooperation.dao.impl;

import com.server.cooperation.base.db.MongoUtil;
import com.server.cooperation.dao.TeamDao;
import com.server.cooperation.entity.mongo.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Repository
public class TeamDaoImpl implements TeamDao {

    private final MongoTemplate mongoTemplate;
    private final MongoUtil mongoUtil;

    @Override
    public List<Team> getTeamList() {
        Query query = new Query();
        return mongoTemplate.find(query, Team.class);
    }

    //Todo
    @Override
    public List<Team> getTeamByTeamIds(List<String> teamIds) {
        return null;
    }

    @Override
    public int saveTeam(Team team) {
        Query query = new Query().addCriteria(Criteria.where("_id").is(team.getId()));
        return mongoUtil.upsertOne(team, query, Team.class);
    }
}
