package com.entity;

import lombok.Data;

import java.math.BigDecimal;
import javax.persistence.*;

/**
 * Created by Administrator on 2018/11/5.
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private BigDecimal balance;
}
