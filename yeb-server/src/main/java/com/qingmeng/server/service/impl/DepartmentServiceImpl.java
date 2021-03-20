package com.qingmeng.server.service.impl;

import com.qingmeng.pojo.Department;
import com.qingmeng.mapper.DepartmentMapper;
import com.qingmeng.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
