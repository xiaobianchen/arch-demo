package com.arch.demo;

import com.alibaba.fastjson.JSON;
import com.arch.demo.lambda.Employee;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by chenxiaobian on 16/10/29.
 */
public class FastJsonTest {

    public static List<Employee> generateData() {
        return Arrays.asList(new Employee("Matt", 5000, "New York"),
                new Employee("Steve", 6000, "London"),
                new Employee("Carrie", 10000, "New York"),
                new Employee("Peter", 7000, "New York"),
                new Employee("Alec", 6000, "London"),
                new Employee("Sarah", 8000, "London"),
                new Employee("Rebecca", 4000, "New York"),
                new Employee("Pat", 20000, "New York"),
                new Employee("Tammy", 9000, "New York"),
                new Employee("Fred", 15000, "Tokyo"));
    }

    public static Map<String, Integer> generateMapData() {
        Map<String, Integer> items = Maps.newHashMap();
        items.put("zhangsan", 10);
        items.put("lisi", 20);
        items.put("wangwu", 30);
        items.put("liumei", 40);
        items.put("zhanglimei", 50);
        items.put("chaochao", 60);

        return items;
    }

    @Test
    public void testFastJson(){
        System.out.println(">>>>>List 转化为 JSON>>>>");
        List<Employee> employeeList = generateData();
        String employJson =  JSON.toJSONString(employeeList);
        System.out.println(employJson);

        System.out.println(">>>>>MAP 转化为 JSON>>>>");
        Map<String,Integer> map_json = generateMapData();
        String empJson = JSON.toJSONString(map_json);
        System.out.println(empJson);

        System.out.println(">>>>>JSON 转化为 List>>>>");
        String json = "[{\"name\":\"Matt\",\"office\":\"New York\",\"salary\":5000},{\"name\":\"Steve\",\"office\":\"London\",\"salary\":6000},{\"name\":\"Carrie\",\"office\":\"New York\",\"salary\":10000},{\"name\":\"Peter\",\"office\":\"New York\",\"salary\":7000},{\"name\":\"Alec\",\"office\":\"London\",\"salary\":6000},{\"name\":\"Sarah\",\"office\":\"London\",\"salary\":8000},{\"name\":\"Rebecca\",\"office\":\"New York\",\"salary\":4000},{\"name\":\"Pat\",\"office\":\"New York\",\"salary\":20000},{\"name\":\"Tammy\",\"office\":\"New York\",\"salary\":9000},{\"name\":\"Fred\",\"office\":\"Tokyo\",\"salary\":15000}]\n";
        List<Employee> toEmployList = JSON.parseArray(json,Employee.class);
        System.out.println(toEmployList);

        System.out.println(">>>>>JSON 转化为 MAP>>>>");
        String json_ = "{\"liumei\":40,\"lisi\":20,\"zhangsan\":10,\"wangwu\":30,\"zhanglimei\":50,\"chaochao\":60}\n";
        Map<String,Object> toEmployMap = JSON.parseObject(json_);
        System.out.println(toEmployMap);

    }
}
