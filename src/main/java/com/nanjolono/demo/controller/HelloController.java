package com.nanjolono.demo.controller;


import com.nanjolono.demo.dto.StaffDto;
import com.nanjolono.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class HelloController {

    @Autowired
    StaffService staffService;

    @GetMapping("/echo")
    public String sayHello() {
        return "Hello World";
    }

    @PostMapping("/add")
    @ResponseBody
    public String add(@RequestBody StaffDto staffDto) {
        staffService.add(staffDto);
        return "Success";
    }

    @PostMapping("/delete")
    @ResponseBody
    public String delete(@RequestBody StaffDto staffDto) {
        staffService.delete(staffDto);
        return "Success";
    }

    @PostMapping("/edit")
    @ResponseBody
    public String update(@RequestBody StaffDto staffDto) {
        staffService.edit(staffDto);
        return "Success";
    }

    @PostMapping("/list")
    @ResponseBody
    public List<StaffDto> list(@RequestBody StaffDto staffDto) {
        return staffService.list(staffDto);
    }
}
