package com.example.visitorlog.Java.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitor {
    private Long id;
    private String name;
    private String company;
    private String purpose;
}
