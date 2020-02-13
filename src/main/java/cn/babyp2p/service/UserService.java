package cn.babyp2p.service;

import cn.babyp2p.entity.TUserAccount;
import cn.babyp2p.entity.TUserWallet;

import java.util.Date;

public interface UserService {
    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return
     */
    public TUserAccount UserLogin(String username, String password) throws Exception;

    /**
     * 修改最后登录时间
     * @param last_login  最新登录时间
     * @param id  登录的用户ID
     * @return
     */
    public int Userlast_login(Date last_login, String id);


    /**
     * 用户信誉及可用余额查询
     * @param id 用户iD
     * @return
     */
    public TUserWallet UserWalle(String id);
}
