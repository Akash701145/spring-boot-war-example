package com.springhow.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloWorldApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class);
    }


    @RequestMapping("/")
    String helloWorld() {
        return """
        <html>
            <head>
                <title>Welcome</title>
                <style>
                    body { 
                        font-family: Arial, sans-serif; 
                        background-color: #f4f4f4; 
                        padding: 20px; 
                        color: #333; 
                    }
                    h1 { color: #2c3e50; }
                    p { font-size: 16px; line-height: 1.6; }
                    .highlight { color: #007acc; font-weight: bold; }
                </style>
            </head>
            <body>
                <h1>Hello from AKASH TOMER 👋</h1>
                <p>
                    Welcome to this Spring Boot application, a simple yet powerful web service demonstrating 
                    the integration of <span class='highlight'>Spring Boot</span>, 
                    <span class='highlight'>Tomcat</span>, <span class='highlight'>Maven</span>, and 
                    <span class='highlight'>Jenkins CI/CD</span>. This project serves as a practical example 
                    of modern DevOps practices in action.
                </p>
                <p>
                    Whether you're here to explore how deployments work, test WAR packaging, or simply 
                    admire the clean structure of a Spring Boot app — you've come to the right place. 
                    The goal is to bridge development and operations with efficiency, reliability, and clarity.
                </p>
                <p>
                    Feel free to expand this project, integrate APIs, or customize features to meet your needs.
                    Remember, every great product starts with a simple hello.
                </p>
                <hr/>
                <p>Powered by Spring Boot | Deployed by Jenkins | Managed with ❤️ by Akash Tomer</p>
            </body>
        </html>
        """;

    }

}
