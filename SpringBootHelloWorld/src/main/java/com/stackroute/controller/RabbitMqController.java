package com.stackroute.controller;
//import com.stackroute.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.stackroute.model.Employee;
import com.stackroute.service.RabbitMqService;
@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class RabbitMqController {
    @Autowired
    RabbitMqService rabbitMqService;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("msg") String msg) {
//
//        Employee emp=new Employee();
////     emp.setEmpId(empId);
////        emp.setEmpName(empName);
//        emp.setMsg(msg);
       rabbitMqService.send(msg);

        return "message sent";
    }
}
