package com.lfw.qqzone.service;

import com.lfw.qqzone.pojo.HostReply;

public interface HostReplyService {
    HostReply getHostReplyByReplyId(Integer replyId);

    void delHostReply(Integer id);
}
