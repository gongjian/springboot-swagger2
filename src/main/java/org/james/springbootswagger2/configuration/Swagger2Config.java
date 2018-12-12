package org.james.springbootswagger2.configuration;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

  public Docket docket() {
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(
        RequestHandlerSelectors.basePackage("org.james.springbootswagger2.controller"))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("swagger-api文档")
        .description("swagger接入教程")
        //服务条款网址
        .termsOfServiceUrl("http://www.baidu.com")
        .version("1.0")
        .contact(new Contact("James Gong", "http://www.baidu.com", "1@2.com"))
        .build();
  }
}
