package com.deblog.service.impl;

import com.deblog.entity.Link;
import com.deblog.mapper.LinkMapper;
import com.deblog.service.ILinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 友情链接表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-07-23
 */
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements ILinkService {

}
