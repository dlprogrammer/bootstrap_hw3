package com.dl.service;

import com.dl.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> searchAll();

    Dept search(Dept dept);

    void add(Dept dept);

    void modify(Dept dept);

    void remove(Dept dept);
}
