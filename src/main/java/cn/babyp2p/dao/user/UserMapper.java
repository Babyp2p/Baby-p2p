package cn.babyp2p.dao.user;

import cn.babyp2p.entity.TUserAccount;
import cn.babyp2p.entity.TUserWallet;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface UserMapper {
    /**
     * 登录方法
     * @param username 用户名
     * @param password 密码
     * @return
     */
    public TUserAccount UserLogin(@Param("username") String username,@Param("password") String password) throws Exception ;

    /**
     * 修改最后登录时间
     * @param last_login  最新登录时间
     * @param id  登录的用户ID
     * @return
     */
    public int Userlast_login(@Param("last_login")Date last_login,@Param("id")String id);

    /**
     * 注册用户方法
     * @param username 用户名
     * @param password 密码
     * @return
     */
    public int UserInsert(@Param("username")String username,@Param("password")String password);

    /**
     * 用户信誉及可用余额查询
     * @param id 用户iD
     * @return
     */
    public TUserWallet UserWalle(@Param("id")String id);
}
