package com.lfw.qqzone.service.impl;

import com.lfw.qqzone.dao.TopicDAO;
import com.lfw.qqzone.pojo.Topic;
import com.lfw.qqzone.pojo.UserBasic;
import com.lfw.qqzone.service.TopicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {
    private TopicDAO topicDAO = null;

    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return null;
    }
}
