package com.lfw.qqzone.service.impl;

import com.lfw.qqzone.dao.HostReplyDAO;
import com.lfw.qqzone.pojo.HostReply;
import com.lfw.qqzone.service.HostReplyService;

public class HostReplyServiceImpl implements HostReplyService {

    private HostReplyDAO hostReplyDAO;

    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return hostReplyDAO.getHostReplyByReplyId(replyId);
    }

    @Override
    public void delHostReply(Integer id) {
        hostReplyDAO.delHostReply(id);
    }
}
