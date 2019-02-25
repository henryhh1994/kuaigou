package cn.henry.kuaigou.controller;

import cn.henry.kuaigou.domain.Employee;
import cn.henry.kuaigou.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
//    RequestBody:用于接收页面请求体中的对象值，绑定到一个对象上
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.getAjax().setMsg("登陆成功");
        }else {
            return AjaxResult.getAjax().setSuccess(false).setMsg("登录失败");
        }
    }
}
