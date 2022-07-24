package com.deblog.service.impl;

import com.deblog.entity.Article;
import com.deblog.mapper.ArticleMapper;
import com.deblog.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-07-23
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
