package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    @DisplayName("Name")
    void getNameBirthYear() {
        Person person = new Person("테스트", 2000);

        assertEquals("테스트", person.getName());
        assertEquals(2000, person.getBirthYear());
    }

    @Test
    void getAge() {
        Person person = new Person("테스트", 2000);

        int birthYear = person.getBirthYear();
        int year = LocalDate.now().getYear();
        int age = year - birthYear;
        assertEquals(age, person.getAge());
    }
}