package org.james.springbootswagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/test", tags = "测试接口模块")
@RestController
@RequestMapping("/test")
public class TestSwaggerController {

  @ApiOperation(value = "展示首页信息value", notes = "展示首页信息notes")
  @ApiImplicitParam(name = "info", value = "信息", required = true, paramType = "path", dataType = "String")
  @GetMapping("/show/{info}")
  public String showInfo(@PathVariable String info) {
    return info;
  }

  @ApiOperation(value = "hello", notes = "hello")
  @ApiImplicitParam(name = "name", value = "名字", required = true, paramType = "path", dataType = "String")
  @GetMapping("/hello/{name}")
  public String hello(@PathVariable String name) {
    return "hello " + name;
  }
}
