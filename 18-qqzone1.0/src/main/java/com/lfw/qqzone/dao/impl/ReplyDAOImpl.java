package com.lfw.qqzone.dao.impl;

import com.lfw.myssm.basedao.BaseDAO;
import com.lfw.qqzone.dao.ReplyDAO;
import com.lfw.qqzone.pojo.Reply;
import com.lfw.qqzone.pojo.Topic;

import java.util.List;

public class ReplyDAOImpl extends BaseDAO<Reply> implements ReplyDAO {
    @Override
    public List<Reply> getReplyList(Topic topic) {
        return executeQuery("select * from t_reply where topic = ? ", topic.getId());
    }

    @Override
    public void addReply(Reply reply) {
        executeUpdate("insert into t_reply values(0,?,?,?,?)", reply.getContent(), reply.getReplyDate(), reply.getAuthor().getId(), reply.getTopic().getId());
    }

    @Override
    public void delReply(Integer id) {
        executeUpdate("delete from t_reply where id = ? ", id);
    }

    @Override
    public Reply getReply(Integer id) {
        return load("select * from t_reply where id =? ", id);
    }
}
