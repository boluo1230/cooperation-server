package com.server.cooperation.dao.impl;

import com.server.cooperation.dao.GroupDao;
import com.server.cooperation.entity.mongo.Group;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GroupDaoImpl implements GroupDao {

    private final MongoTemplate mongoTemplate;

    //Todo
    @Override
    public List<Group> getGroupByIds(List<String> groupIds) {
        return null;
    }
}
