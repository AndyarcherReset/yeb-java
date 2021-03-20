package com.qingmeng.server.service.impl;

import com.qingmeng.pojo.Employee;
import com.qingmeng.mapper.EmployeeMapper;
import com.qingmeng.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
