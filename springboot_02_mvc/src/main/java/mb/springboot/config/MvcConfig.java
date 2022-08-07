package mb.springboot.config;

import mb.springboot.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author mabo
 * @Date 2022/8/7 12:55
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor myInterceptor ;

    /**
     *     /**  拦截当前目录及子目录下的所有路径 /user/**   /user/findAll  /user/order/findAll
     *     /*   拦截当前目录下的以及子路径   /user/*     /user/findAll
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}
