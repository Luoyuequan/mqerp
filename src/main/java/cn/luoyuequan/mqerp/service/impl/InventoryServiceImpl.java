package cn.luoyuequan.mqerp.service.impl;

import cn.luoyuequan.mqerp.entity.Inventory;
import cn.luoyuequan.mqerp.mapper.InventoryMapper;
import cn.luoyuequan.mqerp.service.IInventoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 库存清单 服务实现类
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Service
public class InventoryServiceImpl extends ServiceImpl<InventoryMapper, Inventory> implements IInventoryService {

}
