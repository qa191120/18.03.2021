package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@ToString
public class Person {
    protected String m_name;
    protected LocalDateTime m_birthdate;
    protected int m_age;
}
