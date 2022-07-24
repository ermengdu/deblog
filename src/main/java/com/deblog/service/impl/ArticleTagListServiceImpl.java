package com.deblog.service.impl;

import com.deblog.entity.ArticleTagList;
import com.deblog.mapper.ArticleTagListMapper;
import com.deblog.service.IArticleTagListService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章标签对应关系表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-07-23
 */
@Service
public class ArticleTagListServiceImpl extends ServiceImpl<ArticleTagListMapper, ArticleTagList> implements IArticleTagListService {

}
