package com.qingmeng.server.service.impl;

import com.qingmeng.server.pojo.MailLog;
import com.qingmeng.server.mapper.MailLogMapper;
import com.qingmeng.server.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
