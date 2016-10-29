package com.arch.demo.lambda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by chenxiaobian on 16/10/22.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String name;
    private int salary;
    private String office;
}
