package com.example;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

        @RequestMapping("/read")
        @PreAuthorize("#oauth2.hasScope('cloud_controller.read')")
        public String read() {
                return "your user has read access";
        }
 
        @RequestMapping("/admin")       
        @PreAuthorize("#oauth2.hasScope('cloud_controller.admin')")
        public String admin() {
             return "your user has admin access";
        }

}
