package com.yijian.gulimall.product;

import com.yijian.gulimall.product.entity.BrandEntity;
import com.yijian.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("牛");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
        brandService.updateById(brandEntity);

    }

}
