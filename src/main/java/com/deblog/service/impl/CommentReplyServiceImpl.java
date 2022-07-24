package com.deblog.service.impl;

import com.deblog.entity.CommentReply;
import com.deblog.mapper.CommentReplyMapper;
import com.deblog.service.ICommentReplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论回复表
 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-07-23
 */
@Service
public class CommentReplyServiceImpl extends ServiceImpl<CommentReplyMapper, CommentReply> implements ICommentReplyService {

}
