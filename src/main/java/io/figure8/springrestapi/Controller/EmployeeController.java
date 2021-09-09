package io.figure8.springrestapi.Controller;

import io.figure8.springrestapi.Model.Employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Value("${spring.application.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/version")
    public String getAppDetails (){
        return appName+"-"+appVersion;
    }

    //localhost:8080/employees GET
    @GetMapping("/employees")
    public String getEmployees(){
        return "displaying the list of employees";
    }
    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable("id") Long id){
        return "Fetching the employee details for the id  "+id;

    }
    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        return "Saving the employee details to the database" + employee;
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee employee){
        System.out.println("updating the employee data for the id " + id);
        return employee;
    }
    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam("id")Long id) {
        return "Deleting the employee details for the id " + id;
    }


}
