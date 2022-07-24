package com.deblog.service.impl;

import com.deblog.entity.Ad;
import com.deblog.mapper.AdMapper;
import com.deblog.service.IAdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 广告表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-07-23
 */
@Service
public class AdServiceImpl extends ServiceImpl<AdMapper, Ad> implements IAdService {

}
