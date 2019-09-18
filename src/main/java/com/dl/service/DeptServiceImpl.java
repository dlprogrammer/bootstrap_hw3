package com.dl.service;

import com.dl.dao.DeptDAO;
import com.dl.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDAO deptDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Dept> searchAll() {
        return deptDAO.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Dept search(Dept dept) {
        return deptDAO.select(dept);
    }

    @Override
    public void add(Dept dept) {
        dept.setId(UUID.randomUUID().toString());
        deptDAO.insert(dept);
    }

    @Override
    public void modify(Dept dept) {
        deptDAO.update(dept);
    }

    @Override
    public void remove(Dept dept) {
        deptDAO.delete(dept);
    }
}
