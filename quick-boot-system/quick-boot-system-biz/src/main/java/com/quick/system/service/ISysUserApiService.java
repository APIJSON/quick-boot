package com.quick.system.service;

import com.quick.system.entity.SysUser;

import java.util.List;

public interface ISysUserApiService {
    SysUser findByUsername(String username);
    List<String> getUserRole(String userId);
    List<String> getUserRolePermission(String roleId);
}
