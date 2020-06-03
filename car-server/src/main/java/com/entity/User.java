package com.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import javax.persistence.*;

/**
 * Created by Administrator on 2018/11/5.
 */
//@Entity
@Data
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @Column
    private String username;
//    @Column
    private String name;
//    @Column
    private Integer age;
//    @Column
    private BigDecimal balance;
}
