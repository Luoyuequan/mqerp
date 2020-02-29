package cn.luoyuequan.mqerp.service.impl;

import cn.luoyuequan.mqerp.entity.Product;
import cn.luoyuequan.mqerp.mapper.ProductMapper;
import cn.luoyuequan.mqerp.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品 服务实现类
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
