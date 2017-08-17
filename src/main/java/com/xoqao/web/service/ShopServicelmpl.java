package com.xoqao.web.service;

import com.xoqao.web.bean.shop.Shop;
import com.xoqao.web.dao.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: lcy
 * Created by win8.1 on 2017/7/10.10
 */
@Service
public class ShopServicelmpl implements ShopService{

    @Autowired
    private ShopMapper shopMapper;

    public List<Shop> findAllShops() throws Exception {
        List<Shop> allShops = shopMapper.findAllShops();
        return allShops;
    }

    public Shop saveShops(Shop shop)throws Exception{
        return shopMapper.saveShops(shop);
    }
    public void updateShop(Shop shop)throws Exception{
         shopMapper.updateShop(shop);
    }
    public Shop selectShopBybid(Integer bid)throws Exception{
        return shopMapper.selectShopBybid(bid);
    }
    public Shop selectShopBysid(Integer sid)throws Exception{
        return shopMapper.selectShopBysid(sid);
    }
}