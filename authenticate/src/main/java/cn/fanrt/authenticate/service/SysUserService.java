package cn.fanrt.authenticate.service;

import cn.fanrt.authenticate.entity.SysUser;
import cn.fanrt.authenticate.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fanrt
 * @
 * @date 2021-03-02 14:49
 **/
@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 获取所有用户
     *
     * @return List<SysUser>
     */
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }

    /**
     * 根据用户ID获取用户
     *
     * @return SysUser
     */
    public SysUser findSysUserById(Long userId) {
        return sysUserMapper.findSysUserById(userId);
    }
}
