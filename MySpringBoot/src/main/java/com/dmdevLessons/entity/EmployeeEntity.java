package com.dmdevLessons.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String firstName;

    private  String lastName;

    //название по конвенции преобразуется к birth_day и другие поля тоже
    private LocalDate birthDay;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyEntity company;
}
