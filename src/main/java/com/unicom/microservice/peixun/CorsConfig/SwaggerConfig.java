package com.unicom.microservice.peixun.CorsConfig;
import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {



    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).produces(Sets.newHashSet("application/json"))
                .consumes(Sets.newHashSet("application/json")).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.unicom")).paths(PathSelectors.any()).build();
    }



    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("demo").version("1.0.0").build();
    }


}
