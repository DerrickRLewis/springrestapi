package io.figure8.springrestapi.Controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    //localhost:8080/employees GET
    @GetMapping("/employees")
    public String getEmployees(){
        return "displaying the list of employees";
    }
    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable("id") Long id){
        return "Fetching the employee details for the id  "+id;

    }
    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam("id")Long id) {
        return "Deleting the employee details for the id " + id;
    }


}
