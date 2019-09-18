package com.dl.service;

import com.dl.entity.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> searchAll();

    Emp search(Emp emp);

    void add(Emp emp);

    void modify(Emp emp);

    void remove(Emp emp);
}
