package com.atguigu.gmall.ums.api;

import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.ums.entity.MemberEntity;
import com.atguigu.gmall.ums.entity.MemberReceiveAddressEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: Qiao
 * @Description
 * @Date Created in 15:48 2020/5/7
 * @Version 1.0
 */
public interface GmallUmsApi {

    @GetMapping("ums/member/info/{id}")
    public Resp<MemberEntity> queryMemberById(@PathVariable("id") Long id);

    @GetMapping("ums/member/query")
    public Resp<MemberEntity> queryUser(@RequestParam("username")String username, @RequestParam("password")String password);

    @GetMapping("ums/memberreceiveaddress/{userId}")
    public Resp<List<MemberReceiveAddressEntity>> queryAddressesByUserId(@PathVariable("userId")Long userId);
}
