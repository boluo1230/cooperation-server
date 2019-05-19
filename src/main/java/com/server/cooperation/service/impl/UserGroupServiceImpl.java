package com.server.cooperation.service.impl;

import com.server.cooperation.dao.GroupDao;
import com.server.cooperation.dao.UserGroupDao;
import com.server.cooperation.entity.mongo.Group;
import com.server.cooperation.entity.mongo.UserGroup;
import com.server.cooperation.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    private GroupDao groupDao;
    @Autowired
    private UserGroupDao userGroupDao;

    @Override
    public List<Group> getGroupListByUserId(String userId, String teamId) {
        List<UserGroup> userGroupList = userGroupDao.getUserGroupByUserId(userId, teamId);
        List<String> groupIds = userGroupList.stream().map(UserGroup::getGroupId).collect(Collectors.toList());
        return groupDao.getGroupByIds(groupIds);
    }

}
