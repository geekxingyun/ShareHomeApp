package com.xingyun.sharehomeapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig extends WebMvcConfigurationSupport {

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Share Home App Restful API")
                .description("share home app restful api")
                .termsOfServiceUrl("http://127.0.0.1:8080")
                .contact(new Contact("星云","",""))
                .version("1.0")
                .build();
    }

    @Bean
    public Docket createHomeInfoRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("租个家API")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xingyun"))
                .paths(PathSelectors.any())
                .build();
    }

//    @Bean
//    public Docket createFindJobAPIRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .groupName("找工作API")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.xingyun.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    @Bean
//    public Docket createJoinFriendAPIRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .groupName("交朋友API")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.xingyun.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    @Bean
//    public Docket createPersonalInfoRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .groupName("我的API")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.xingyun.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
