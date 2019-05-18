package com.server.cooperation.dao;

import com.server.cooperation.entity.mongo.Group;

import java.util.List;

public interface GroupDao {

    List<Group> getGroupByIds(List<String> groupIds);

}
