package cn.fanrt.authenticate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author fanrt
 * @
 * @date 2021-03-02 14:36
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUser {

    /**
     * 用户ID
     */
    private Long userId;
    /** 角色ID */
    private Long roleId;
    /** 姓名 */
    private String name;
    /** 账号 */
    private String account;
    /** 密码 */
    private String password;
    /** 邮箱 */
    private String email;
    /** 手机号码 */
    private String phone;
    /** 创建时间 */
    private Date createTime;
    /** 是否有效 */
    private String validFlag;
}
