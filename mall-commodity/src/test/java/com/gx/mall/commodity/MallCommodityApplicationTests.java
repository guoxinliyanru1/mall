package com.gx.mall.commodity;

import com.gx.mall.commodity.dao.BrandDao;
import com.gx.mall.commodity.entity.BrandEntity;
import com.gx.mall.commodity.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MallCommodityApplicationTests {
    @Resource
    BrandService brandService;
    @Test
    void contextLoads() {
        /*BrandEntity brand = new BrandEntity();
        brand.setBrandId(1l);
        brand.setName("华为");

        brandService.updateById(brand);

        System.out.println("修改成功！");*/

        System.out.println(brandService.removeById(1l) ? "删除成功":"删除失败");
    }

}
