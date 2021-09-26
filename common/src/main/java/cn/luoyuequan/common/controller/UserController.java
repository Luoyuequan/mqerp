package cn.luoyuequan.common.controller;

import cn.luoyuequan.common.entity.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author luoyuequan
 * @date 2021.9.25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/public/login")
    public Object login(@RequestBody Map<String, Object> params) {
        params.put("token", params.get("password"));
        params.put("user", params.get("username"));
        return new Response(1, "login success", params);
    }
}
