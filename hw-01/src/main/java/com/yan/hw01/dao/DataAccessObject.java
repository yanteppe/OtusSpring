package com.yan.hw01.dao;

import java.util.List;

public interface DataAccessObject<T> {

   T getById(int id);

   List<T> getAll();
}
