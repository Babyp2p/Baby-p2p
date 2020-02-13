package cn.babyp2p.service;

import cn.babyp2p.dao.user.UserMapper;
import cn.babyp2p.entity.TUserAccount;
import cn.babyp2p.entity.TUserWallet;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public TUserAccount UserLogin(String username, String password) throws Exception {
        TUserAccount fig = userMapper.UserLogin(username,password);
        return fig;
    }

    @Override
    public int Userlast_login(Date last_login, String id) {
        return userMapper.Userlast_login(last_login,id);
    }

    @Override
    public TUserWallet UserWalle(String id) {
        return userMapper.UserWalle(id);
    }

}
