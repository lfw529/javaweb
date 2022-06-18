package com.lfw.qqzone.service;

import com.lfw.qqzone.dao.UserBasicDAO;
import com.lfw.qqzone.pojo.UserBasic;

import java.util.List;

public interface UserBasicService {
    UserBasic login(String loginId, String pwd);

    List<UserBasic> getFriendList(UserBasic userBasic);

    //根据id获取指定用户信息
    UserBasic getUserBasicById(Integer id);
}
