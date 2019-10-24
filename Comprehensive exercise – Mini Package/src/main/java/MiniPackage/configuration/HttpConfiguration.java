//package MiniPackage.configuration;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//
//@Configuration
//@EnableWebMvc
//public class HttpConfiguration implements WebMvcConfigurer {
//
//
//    @Override
//    public void addCordMappings(CorsRegistry registry){
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .exposedHeaders("Content-Disposition")
//                .allowCredentials(true)
//                .allowedMethods("PUT", "POST", "GET", "DELETE", "OPTIONS");
//    }
//}
