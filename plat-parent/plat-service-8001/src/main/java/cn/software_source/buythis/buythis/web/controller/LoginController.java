package cn.software_source.buythis.buythis.web.controller;

import cn.software_source.buythis.buythis.domain.Employee;
import cn.software_source.buythis.buythis.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("admin".equals(employee.getUsername())&&"123456".equals(employee.getPassword()))
            return AjaxResult.getAjax().setSuccess(true).setMessage("登陆成功");
        return AjaxResult.getAjax().setSuccess(false).setMessage("登录失败,用户名或密码错误");
    }
}
