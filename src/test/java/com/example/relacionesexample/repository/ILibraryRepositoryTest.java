package com.example.relacionesexample.repository;

import com.example.relacionesexample.entity.LibraryEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ILibraryRepositoryTest {

    @Autowired
    private ILibraryRepository repository;

    @Test
    @DisplayName("it should check if library exists by name")
    void itShouldCheckIfLibraryExistsByName(){

        List<LibraryEntity> libraries = new ArrayList<>();
        libraries.add(new LibraryEntity(0L,"Centre Library",null));
        repository.saveAll(libraries);

        LibraryEntity entities = repository.findByName("Centre Library");
        assertNotNull(entities);
    }




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