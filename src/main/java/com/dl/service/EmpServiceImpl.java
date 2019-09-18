package com.dl.service;

import com.dl.dao.EmpDAO;
import com.dl.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDAO empDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> searchAll() {
        return empDAO.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Emp search(Emp emp) {
        return empDAO.select(emp);
    }

    @Override
    public void add(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
        empDAO.insert(emp);
    }

    @Override
    public void modify(Emp emp) {
        empDAO.update(emp);
    }

    @Override
    public void remove(Emp emp) {
        empDAO.delete(emp);
    }
}
