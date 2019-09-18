package com.dl.dao;

import java.util.List;

public interface BaseDAO<T> {
    List<T> selectAll();

    T select(T t);

    void insert(T t);

    void update(T t);

    void delete(T t);
}
