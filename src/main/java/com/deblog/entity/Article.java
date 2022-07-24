package com.deblog.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author jobob
 * @since 2022-07-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
    @TableId(value = "article_id")
    private String articleId;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 文章标题
     */
    private String articleTitle;

    /**
     * 文章添加时间
     */
    private LocalDateTime articleAddTime;

    /**
     * 文章内容
     */
    private String articleCentext;

    /**
     * 点赞次数
     */
    private Integer articleLike;

    /**
     * 浏览次数
     */
    private Integer articleViews;

    /**
     * 收藏次数
     */
    private Integer articleCollectionTimes;


}
