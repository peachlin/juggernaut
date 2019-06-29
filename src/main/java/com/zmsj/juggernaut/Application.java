package com.zmsj.juggernaut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wangk
 */
@EnableSwagger2
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2).select().apis(
        RequestHandlerSelectors.basePackage("com.zmsj.juggernaut"))
        .paths(PathSelectors.any()).build()
        .apiInfo(new ApiInfoBuilder().title("禁毒可视化系统").description("禁毒可视化系统")
            .version("1.0").build());
  }
}
