package com.example.projectsforfun.firstproject.restendpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sf.MultiInstanceBean;

@RestController
public class SameBeanController {

   private MultiInstanceBean bean1,bean2;

    public SameBeanController(MultiInstanceBean bean1, MultiInstanceBean bean2) {
        this.bean1 = bean1;
        this.bean2 = bean2;
    }

    @GetMapping("/sameBean")
    String isSameBean(){

        return String.valueOf(bean1==bean2);
    }

}
