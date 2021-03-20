package com.qingmeng.server.service.impl;

import com.qingmeng.pojo.Admin;
import com.qingmeng.mapper.AdminMapper;
import com.qingmeng.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
