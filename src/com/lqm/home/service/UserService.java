package com.lqm.home.service;

import java.util.List;

import com.lqm.home.po.Friend;
import com.lqm.home.po.LoginReturnData;
import com.lqm.home.po.Post;
import com.lqm.home.po.User;
import com.lqm.home.utils.ResultData;

public interface UserService {


    /**
     * 检查用户名是否存在
     *
     * @param username 用户名
     * @return
     */
    ResultData<User> checkUsername(String username) throws Exception;

    /**
     * 登录
     *
     * @param session
     * @param username  用户名
     * @param password  密码
     * @param checkCode 验证码
     * @return
     * @throws Exception
     */
    ResultData<LoginReturnData> login(String accid, String password) throws Exception;

    /**
     * 注册
     *
     * @param session
     * @param username 用户名
     * @param password 密码
     * @param nickName 昵称
     * @return
     */
    ResultData<User> register(int homeid, String phone, String password, String accid, String username, String userphoto, String sex, String birthday,
                              String address, String describe) throws Exception;

    /**
     * update 昵称和头像
     *
     * @param accid     用户名
     * @param username
     * @param userphoto
     * @return
     * @throws Exception
     */
    ResultData<User> updateNicknameAndPhoto(String accid, String username,String password, String userphoto) throws Exception;

    /**
     * 判断乡吧号是否已经被注册了
     *
     * @param accid
     * @return
     */
    Boolean isAlreadyRegistered(String accid);

    int update(User user);

}
