package cn.fanrt.authenticate.controller;

import cn.fanrt.authenticate.entity.SysUser;
import cn.fanrt.authenticate.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fanrt
 * @
 * @date 2021-03-02 14:50
 **/
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/findAll")
    public List<SysUser> findAll(){
        return sysUserService.findAll();
    }

    @RequestMapping("/findSysUserById")
    public SysUser findSysUserById(Long userId){
        return sysUserService.findSysUserById(userId);
    }
}
