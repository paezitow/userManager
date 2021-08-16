package com.dio.bootcamp.Manager.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class Swagger {
    @Bean
    public Docket apiAdmin(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(("com.dio.backend")))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo((apiInfo()))
                .globalOperationParameters(
                        Collections.singletonList(
                                new ParameterBuilder()
                                .name("Authorization")
                                .description("Header para Token JWT")
                                .modelRef(new ModelRef("String"))
                                .parameterType("Header")
                                .required(false)
                                .build()
                        )

                );
    }

    @Bean
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Cadastro de Colaboradores")
                .description("Api para gerenciamento de acesso")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENS-2.0")
                .contact(new Contact("Linkedin", "https://www.linkedin.com/in/hugo-porfirio-738649184/", "hugoporfirio16@gmail.com"))
                .build();
    }
}
