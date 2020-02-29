package cn.luoyuequan.mqerp.service.impl;

import cn.luoyuequan.mqerp.entity.OrderInfo;
import cn.luoyuequan.mqerp.mapper.OrderInfoMapper;
import cn.luoyuequan.mqerp.service.IOrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单信息表 服务实现类
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements IOrderInfoService {

}
