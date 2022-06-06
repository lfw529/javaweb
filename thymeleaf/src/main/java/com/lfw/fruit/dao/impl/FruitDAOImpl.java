package com.lfw.fruit.dao.impl;

import com.lfw.fruit.dao.FruitDAO;
import com.lfw.fruit.pojo.Fruit;
import com.lfw.myssm.basedao.BaseDAO;

import java.util.List;

public class FruitDAOImpl extends BaseDAO<Fruit> implements FruitDAO {
    @Override
    public List<Fruit> getFruitList() {
        return super.executeQuery("select * from t_fruit");
    }
}
