package com.server.cooperation.dao;

import com.server.cooperation.entity.mongo.UserGroup;

import java.util.List;

public interface UserGroupDao {

    List<UserGroup> getUserGroupByUserId(String userId);

}
