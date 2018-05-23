package com.testMe.parametrized;

import com.testMe.ConfigUnit;
import com.testMe.GamePlay;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
@Tag("all")
@DisplayName("Parametrized test with Junit 5")
public class ParametrizedJUpiterTest extends ConfigUnit {

    @ParameterizedTest
    //@CsvSource({"Hello,5", "JUnit 5, 7", "'Hello,Junit 5',15"}) teraz sie wywali, bo w drugim argumencie w param1 nie ma hello
    @CsvSource({"Hello,5", "Hello JUnit 5, 7", "'Hello,Junit 5',15"})
    public void parameterizedFirstTest(String param1, int param2) {
        assertTrue(param1.contains("Hello"));
    }

    @DisplayName("Check if it contains Hello for string param")
    @ParameterizedTest
    @CsvSource({"Hello,5", "Hello JUnit 5, 7", "'Hello,Junit5',15"})
    public void parameterizedFirstTestOneParam(String param2) {
        assertTrue(param2.contains("Hello"));
    }

    /*@DisplayName("Parametrized test with Junit 5")
    @ParameterizedTest
    @CsvSource({"15","25","35"})
    public void parameterizedFirstTestOneParam(int param2) {
        assertTrue(param2 % 5 == 0);

    }*/

    @DisplayName("Check if it contains Hello for integer paramn")
    @ParameterizedTest
    @CsvSource({"15","25","35"})
    public void parameterizedFirstTestOneParam( int param) {
        assertTrue(param % 5 == 0);
    }
    // ta klasa korzysta juz z pliku csv i wyswietla display
    @DisplayName("Check if file contains params")
    @ParameterizedTest
    @CsvFileSource(resources = "/plik.csv")
    public void parameterizedFirstTestCsvFile(String name, int age) {
        assertTrue(name.contains("Hello"));
        assertTrue(age % 5 == 0);
    }

    GamePlay gamePlay = new GamePlay();

    @Test
    @DisplayName("Test for checking if was throw exception")
    public void exceptionTest() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    gamePlay.play(0);
                }
            );

    }

}
