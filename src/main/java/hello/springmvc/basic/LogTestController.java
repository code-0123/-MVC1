package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController //return
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(LogTestController.class);
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";
        System.out.println("name=" + name);

//        log.trace("trace log={}, {}", name, name2) //여러개 있으면 순서대로 치환된다
        log.info(" info log="+name); //이렇게 사용하면 안된다

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}" , name);
        log.warn(" warn log={}" , name);
        log.error(" error log={}" , name);


        return "ok";
    }
}
