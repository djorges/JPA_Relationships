package com.example.relacionesexample.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ILibraryRepositoryTest {

    //Unit Tests
    @Test
    @DisplayName("😱")
    void itShouldMakeAddition(){
        //given
        int number1 = 20;
        int number2 = 40;

        //when
        int result  = new Calculator().add(number1, number2);

        //then
        assertEquals(result, 60);
    }
    static class Calculator{
        Calculator(){
        }
        int add(int i, int j){
            return i+j;
        }
    }

}