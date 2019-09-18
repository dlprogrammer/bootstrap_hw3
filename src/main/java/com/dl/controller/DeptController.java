package com.dl.controller;

import com.dl.entity.Dept;
import com.dl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("showAll")
    public List<Dept> showAll() {
        return deptService.searchAll();
    }

    @RequestMapping("show")
    public Dept show(Dept dept) {
        return deptService.search(dept);
    }

    @RequestMapping("insert")
    public void insert(Dept dept) {
        deptService.add(dept);
    }

    @RequestMapping("update")
    public void update(Dept dept) {
        deptService.remove(dept);
    }

    @RequestMapping("delete")
    public void delete(Dept dept) {
        deptService.remove(dept);
    }


}
