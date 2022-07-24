package com.deblog.dto.user;

import com.deblog.dto.base.BasePageDto;
import lombok.Data;

/**
 * @Author: Dem
 * @Email：2669498105@qq.com
 * @Date: 2022/7/24 23:46
 */
@Data
public class UserListPageDto extends BasePageDto {
    private String userName;
}
