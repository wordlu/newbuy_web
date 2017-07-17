package com.xoqao.web.dao;

import com.xoqao.web.bean.shop.Shop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: lcy
 * Created by win8.1 on 2017/7/10.
 */
@Service
public interface ShopMapper {
    List<Shop> findAllShops()throws Exception;
    Shop saveShops(Shop shop)throws Exception;
    Shop updateShop(@Param("stel")String stel)throws Exception;
    Shop selectShopBynickname(@Param("nickname")String nickname)throws Exception;
    Shop selectShopBysid(@Param("sid")int sid)throws Exception;

}
