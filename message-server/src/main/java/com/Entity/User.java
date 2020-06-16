package com.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/10/29.
 */
//@Entity
@Data
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//    @Column
    private String username;
//    @Column
    private String name;
//    @Column
    private BigDecimal balance;
}
