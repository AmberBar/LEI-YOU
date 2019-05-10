package com.leyou.item.bean;


import lombok.Data;

import javax.persistence.*;

@Table(name = "tb_category")
@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long parent_id;
    private Boolean is_parent;
    private Integer sort;
}
