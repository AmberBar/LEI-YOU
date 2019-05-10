package com.leyou.item.bean;

import io.swagger.annotations.ApiOperation;
import lombok.Data;

import javax.persistence.*;

@Table(name = "tb_brand")
@Entity
@Data
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String image;
    private Character letter;
}
