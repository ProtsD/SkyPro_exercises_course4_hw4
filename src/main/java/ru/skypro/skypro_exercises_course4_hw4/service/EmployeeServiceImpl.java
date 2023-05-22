package ru.skypro.skypro_exercises_course4_hw4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.skypro.skypro_exercises_course4_hw4.entity.Employee;
import ru.skypro.skypro_exercises_course4_hw4.repository.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public void addEmployees(Employee[] employee) {
        employeeRepository.addEmployees(employee);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    /*    @Override
        public void putEmployee(Map<String, String> params) {
    //        int id = Integer.parseInt(params.get("id"));
            employeeRepository.putEmployee(params);
        }*/
    @Override
    public void putEmployee(Integer id, Employee employee) {
//        int id = Integer.parseInt(params.get("id"));
        employeeRepository.putEmployee(id, employee);
    }

    public Employee getEmployee(Integer id) {
        return employeeRepository.getEmployee(id);
    }

    public void delEmployee(Integer id) {
        employeeRepository.delEmployee(id);
    }

    public List<Employee> getEmployeeWithSalaryHigherThan(int salary) {
        return employeeRepository.getsalaryHigherThan(salary);
    }

    public int getSize() {
        return employeeRepository.getSize();
    }
}
