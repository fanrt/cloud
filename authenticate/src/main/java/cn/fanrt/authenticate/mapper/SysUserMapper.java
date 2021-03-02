package cn.fanrt.authenticate.mapper;

import cn.fanrt.authenticate.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author fanrt
 * @
 * @date 2021-03-02 14:45
 **/
@Mapper
public interface SysUserMapper {

    /**
     * 获取所有用户
     *
     * @return List<SysUser>
     */
    List<SysUser> findAll();

    @Select("select * from sys_user where user_id = #{userId}")
    SysUser findSysUserById(Long userId);
}
