package com.deblog.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 广告表
 * </p>
 *
 * @author jobob
 * @since 2022-07-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Ad implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 广告id
     */
    @TableId(value = "ad_id")
    private String adId;

    /**
     * 广告类型
     */
    private String adTypeId;

    /**
     * 广告标题
     */
    private String adTitle;

    /**
     * 广告的url
     */
    private String adUrl;

    /**
     * 广告排序，越小越排在前面
     */
    private Integer adSort;

    /**
     * 广告开始时间
     */
    private LocalDateTime adBeginTime;

    /**
     * 广告结束时间
     */
    private LocalDateTime adEndTime;

    /**
     * 广告添加时间
     */
    private LocalDateTime adAddTime;


}
