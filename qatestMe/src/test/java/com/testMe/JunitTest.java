package com.testMe;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class JunitTest {

    @Test
    public void firstTest() {

        String testowyString = "firstTest";

        assertTrue(true);
        assertTrue("message from assertTrue- wynik sie nie zgadza", 5 == 2 + 3);
        assertFalse("message when True", 6 == 1 + 3);
        assertFalse("message from asset True", testowyString.equals("Adam"));
        assertThat(testowyString, is("firstTest"));
        assertEquals(testowyString, "firstTest");
        assertSame(testowyString, "firstTest");
        //assertThat(testowyString, containString ("first"));

        // zaokraglenia sa zawsze probleme :)
        System.out.println(0.2 * 0.2);
        assertFalse(0.2 * 0.2 == 0.04);
        assertTrue(new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue() == 0.04);
    }
    @Test
           public void arraysTest(){
                List<Integer> list1 = Arrays.asList(1,2,3,4,5);
                List<Integer> list1a = Arrays.asList(1,2,3,4,5);
                List<String> list2 = Arrays.asList("Ewa","Adam","Iwona","Robert","Tomek");
                List<String> list2a = Arrays.asList("Ewa","Adam","Iwona");
                List<String> list3 = new ArrayList<>();

                assertArrayEquals(list1.toArray(),list1a.toArray());

                assertThat(list2,hasSize(5));
                assertThat(list1, not(containsInAnyOrder(1,2,3,4))); //list1 zawiera 5 elementow, a sprawdzam, czy ma 4
                assertThat(list3,IsEmptyCollection.empty());
                //assertThat(list2,IsEmptyCollection.empty()); //nie wykona sie
                //assertTrue(list2.contains(list2a)); // tutaj asercja nie przejdzie, bo listy roznia siel od siebie

    }






}

