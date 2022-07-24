package com.deblog.dto.base;

import lombok.Data;

/**
 * @Author: Dem
 * @Email：2669498105@qq.com
 * @Date: 2022/7/24 23:44
 */
@Data
public class BasePageDto {
    /**
     * 当前页码
     */
    private Integer pageNumber = 1;
    /**
     * 当页条目数
     */
    private Integer pageSize = 20;
}
