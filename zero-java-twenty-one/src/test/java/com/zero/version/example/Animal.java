package com.zero.version.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal implements Serializable {

    private static final long serialVersionUID = -8041599049250916662L;

    private String name;
    private int age;

}
