package com.testMe;

import org.junit.Assert;
//import org.junit.jupiter.api.AssertSame;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("all")
@DisplayName("JUpiter Test class")  // dzieki JUpiter widac w test result nasze displayName'y - to jest Imie Klasy
public class JUpiterTest extends ConfigUnit {

    @Nested
    @DisplayName("JUpiter Nested")
    public class JUpiterNestedClass {
        @Test
        @DisplayName("Test for checking string test")
        public void firstNestedTest () {

            String testowyString = "firstTest";

            assertTrue(true);
            Assert.assertTrue("message from assertTrue- wynik sie nie zgadza", 5 == 2 + 3);
            assertFalse("message when True", 6 == 1 + 3);

            // Assertions.assertFalse("message from asset True", testowyString.equals("Adam"));
            Assert.assertThat(testowyString, is("firstTest"));
            assertEquals(testowyString, "firstTest");
            // Assert.assertSame(testowyString, "firstTest");
            //assertThat(testowyString, containString ("first"));

            // zaokraglenia sa zawsze probleme :)
            System.out.println(0.2 * 0.2);
            assertFalse(0.2 * 0.2 == 0.04);
            assertTrue(new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue() == 0.04);

        }

    }


    @Test
    @DisplayName("Test for checking string test")
    public void firstTest () {

        String testowyString = "firstTest";

        assertTrue(true);
        Assert.assertTrue("message from assertTrue- wynik sie nie zgadza", 5 == 2 + 3);
        assertFalse("message when True", 6 == 1 + 3);

        // Assertions.assertFalse("message from asset True", testowyString.equals("Adam"));
        Assert.assertThat(testowyString, is("firstTest"));
        assertEquals(testowyString, "firstTest");
        // Assert.assertSame(testowyString, "firstTest");
        //assertThat(testowyString, containString ("first"));

        // zaokraglenia sa zawsze probleme :)
        System.out.println(0.2 * 0.2);
        assertFalse(0.2 * 0.2 == 0.04);
        assertTrue(new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue() == 0.04);

    }

}


