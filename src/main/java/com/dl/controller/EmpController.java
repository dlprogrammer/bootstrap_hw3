package com.dl.controller;

import com.dl.entity.Emp;
import com.dl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("showAll")
    public List<Emp> empShowAll() {
        List<Emp> emps = empService.searchAll();
        return emps;
    }

    @RequestMapping("show")
    public Emp show(Emp emp) {
        return empService.search(emp);
    }

    @RequestMapping("insert")
    public Map<String, String> insert(Emp emp) {
        empService.add(emp);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "ok");
        return map;
    }

    @RequestMapping("update")
    public void update(Emp emp) {
        empService.remove(emp);

    }

    @RequestMapping("delete")
    public void delete(Emp emp) {
        empService.remove(emp);
    }
}
