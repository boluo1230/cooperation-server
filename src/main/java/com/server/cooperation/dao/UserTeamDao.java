package com.server.cooperation.dao;

import com.server.cooperation.entity.mongo.UserTeam;

import java.util.List;

public interface UserTeamDao {

    List<UserTeam> getUserTeamList(String userId);

}
