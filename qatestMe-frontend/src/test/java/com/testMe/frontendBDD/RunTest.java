package com.testMe.frontendBDD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//opcje cucumbera - zawsze w nawiasach okraglych
@CucumberOptions(
        features = "src/test/resources/features", // szukaj w testowych resourcach scenariuszy BDD
        glue     = "classpath:com.testMe" ,     //tu mnasz szukac stepów ( katalogu steps ) i wskazujemy classpath do klasy
        plugin   =  {"html:target/cucumber-html-report","rerun:target/return.txt"}, //plugin do raportowania-zapis genberuje jako html do target stworz katalog cucumber-html-report
        tags     = {
                "@wordpress",
//                "@login" //maven clean install -D cucumber.option ="tags @wordpress"

        }           // odwołamy sie po tagach do danych testów
)//opcje cucumbera end


//klasa uruchamiajaca testy cucmbera
public class RunTest {


}
