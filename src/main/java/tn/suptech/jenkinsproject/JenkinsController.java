package tn.suptech.jenkinsproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JenkinsController {

        @RequestMapping("/")
        @ResponseBody
        String home() {
            return "Bonjour Tout le Monde ";
        }

        @RequestMapping("/test")
        @ResponseBody
        String test() {
            return "TestOk";
        }

        @RequestMapping("/test/{test1}")
        @ResponseBody
        String ok(@PathVariable String test1) {
            return test1 + "OK ";
        }

}
