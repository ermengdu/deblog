package com.deblog.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 友情链接表
 * </p>
 *
 * @author jobob
 * @since 2022-07-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 友情链接id
     */
    @TableId(value = "link_id")
    private String linkId;

    /**
     * 友情链接标题
     */
    private String linkTitle;

    /**
     * 友情链接地址
     */
    private String linkUrl;

    /**
     * 友情链接logo
     */
    private String linkLogoUrl;

    /**
     * 友情链接添加时间
     */
    private LocalDateTime linkAddTime;


}
