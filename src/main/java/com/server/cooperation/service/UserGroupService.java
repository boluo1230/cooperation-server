package com.server.cooperation.service;

import com.server.cooperation.entity.mongo.Group;

import java.util.List;

public interface UserGroupService {

    List<Group> getGroupListByUserId(String userId, String teamId);

}
