package com.qsy.sell.repository;




import com.qsy.sell.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class ProductCategoryRepositoryTest {

    @Autowired
    private  ProductCategoryRepository repository;

    @Test
    public  void  findOneTest(){
    }

    @Test
 //   @Transactional
    public  void  save(){
        ProductCategory productCategory = new ProductCategory("123",1);
        repository.save(productCategory);
    }
}
