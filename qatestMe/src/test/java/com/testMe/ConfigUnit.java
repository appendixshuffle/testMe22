package com.testMe;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class ConfigUnit {
    //@Before trzeba było zamienic na JUpiter 5 czyli @BeforeEach, bo mam extends do klasy, która woła JUpiter5
    @BeforeEach //wykonuje przed cały
    public void setUp() {
        System.out.println("*********** @Before ***************");
    }
    //j.w. @After Junit4 == @AfterEach JUpiter5
    @AfterEach // wykonuje po wykonaniu czegos
    public void setupAfter() {
        System.out.println("*********** @SetupAfter ***************");
    }
}