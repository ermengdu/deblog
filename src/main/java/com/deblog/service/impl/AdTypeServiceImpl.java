package com.deblog.service.impl;

import com.deblog.entity.AdType;
import com.deblog.mapper.AdTypeMapper;
import com.deblog.service.IAdTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 广告类型表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-07-23
 */
@Service
public class AdTypeServiceImpl extends ServiceImpl<AdTypeMapper, AdType> implements IAdTypeService {

}
