package com.jpa.entity.onetomany;

import javax.persistence.*;

/**
 * @Description: 一对多关系实体类
 * @Author: Alex McAvoy
 * @Date: 2022/3/11 10:54
 * @Version: 1.0
 **/
@Table(name = "cars")
@Entity
public class Car {
    @GeneratedValue
    @Id
    private Integer id;
    @Column(name = "car_name")
    private String carName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
