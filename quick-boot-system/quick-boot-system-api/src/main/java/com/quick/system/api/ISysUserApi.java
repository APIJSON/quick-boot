package com.quick.system.api;

import com.quick.common.api.ISysUserBaseApi;
import com.quick.common.constant.CommonConstant;
import com.quick.common.vo.Result;
import com.quick.system.api.dto.SysUserApiDTO;
import com.quick.system.api.dto.SysUserRoleApiDTO;
import com.quick.system.api.factory.SysUserApiFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Component
@FeignClient(contextId = "ISysUserApi", value = CommonConstant.SERVICE_SYSTEM, fallbackFactory = SysUserApiFactory.class)
public interface ISysUserApi extends ISysUserBaseApi {
    @GetMapping("/user/api/findByUsername")
    Result<SysUserApiDTO> findByUsername(@RequestParam(value = "username") String username);

    @GetMapping("/user/api/getUserRole")
    @Override
    Result<List<String>> getUserRole(@RequestParam(value = "userId") String userId);

    @GetMapping("/user/api/getUserRolePermission")
    @Override
    Result<List<String>> getUserRolePermission(@RequestParam(value = "roleId") String roleId);
}
