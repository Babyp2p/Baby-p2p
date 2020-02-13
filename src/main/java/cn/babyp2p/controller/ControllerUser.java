package cn.babyp2p.controller;

import cn.babyp2p.consts.MD5;
import cn.babyp2p.consts.UserSession;
import cn.babyp2p.entity.TUserAccount;
import cn.babyp2p.entity.TUserWallet;
import cn.babyp2p.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class ControllerUser {
    @Resource
    private UserService userService;

    private String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
    //登录
    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> Login(String username,String password) throws Exception {
        System.out.println("yoghurt吗"+username+"哈哈"+password);
        Map<String,Object> hh =  new HashMap<>();
        //登录
        TUserAccount userAccount  = userService.UserLogin(username,MD5.toMD5(password));
        if (userAccount!=null) {
            TUserWallet userWallet = userService.UserWalle(userAccount.getId());
            userAccount.setLastLoginTime(new Date());
            userService.Userlast_login(userAccount.getLastLoginTime(),userAccount.getId());
            hh.put("code","200");
            hh.put("msg","登录成功");
            hh.put("data",userAccount);
        }else{
            hh.put("code","202");
            hh.put("msg","登录失败");
        }
        return  hh;
    }


}
