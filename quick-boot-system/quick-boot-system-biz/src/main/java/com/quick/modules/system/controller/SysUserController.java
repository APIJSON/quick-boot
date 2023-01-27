package com.quick.modules.system.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.quick.common.vo.Result;
import com.quick.modules.system.entity.SysUser;
import com.quick.modules.system.service.ISysUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/SysUser")
@RequiredArgsConstructor
@Tag(name = "用户信息")
public class SysUserController {
    private final ISysUserService sysUserService;


    @PostMapping(value = "/page")
    @Operation(summary = "分页", description = "根据用户账号查询用户")
    public Result<IPage<SysUser>> page(@RequestBody Page<SysUser> page) {
        return Result.success(sysUserService.page(page));
    }
}
