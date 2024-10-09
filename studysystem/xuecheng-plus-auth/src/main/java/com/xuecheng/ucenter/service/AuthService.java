package com.xuecheng.ucenter.service;

import com.xuecheng.ucenter.model.dto.AuthParamsDto;
import com.xuecheng.ucenter.model.dto.XcUserExt;

/**
 * @author Mr.Tan
 * @version 1.0
 * @description 统一的认证接口
 * @date 2024/5/24 11:55
 */
public interface AuthService {

 /**
  * @description 认证方法
  * @param authParamsDto 认证参数
  * @return com.xuecheng.ucenter.model.po.XcUser 用户信息
  * @author Mr.Tan
  * @date 2024/5/29 12:11
  */
 XcUserExt execute(AuthParamsDto authParamsDto);

}
