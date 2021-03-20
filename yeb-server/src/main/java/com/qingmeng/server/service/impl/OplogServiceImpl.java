package com.qingmeng.server.service.impl;

import com.qingmeng.pojo.Oplog;
import com.qingmeng.mapper.OplogMapper;
import com.qingmeng.service.IOplogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qingmeng
 * @since 2021-03-20
 */
@Service
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
