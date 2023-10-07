package com.example.relacionesexample.repository;

import com.example.relacionesexample.entity.DomainType;
import com.example.relacionesexample.entity.LibraryEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ILibraryRepositoryTest {

    @Autowired
    private ILibraryRepository repository;

    private List<LibraryEntity> libraries;

    @BeforeEach
    public void setup(){
        //given
        if(libraries == null){
            libraries = new ArrayList<>();
            libraries.add(new LibraryEntity(null,"Center Library","4444445", DomainType.PRIVATE,null));
            libraries.add(new LibraryEntity(null,"Leaf Library","4444444", DomainType.PRIVATE,null));
            libraries.add(new LibraryEntity(null,"Manson Library","4447445", DomainType.PUBLIC,null));
            repository.saveAll(libraries);
        }
    }

    @Test
    @DisplayName("test if all libraries exists")
    void testIfLibrariesExists() {

        //when
        List<LibraryEntity> entities = repository.findAll();

        //then
        assertNotNull(entities);
        assertEquals(entities.size(), 2);
    }

    @Test
    @DisplayName("test if library is updated")
    void testUpdateLibrary() {
        //when
        LibraryEntity library = repository.findById(0L).get();
        library.setName("Harvard Library");
        library.setDomainType(DomainType.PUBLIC);
        LibraryEntity updatedLibrary = repository.save(library);

        //then
        assertEquals(updatedLibrary.getName(), "Harvard Library");
        assertEquals(updatedLibrary.getDomainType(), DomainType.PUBLIC);
    }

    @Test
    @DisplayName("test if library is deleted")
    void testDeleteLibrary() {
        //when
        repository.deleteById(0L);
        Optional<LibraryEntity> library = repository.findById(0L);

        //then
        assertTrue(library.isEmpty());
    }
    @Test
    @DisplayName("test if library exists by name")
    void testLibraryExistsByName(){
        //when
        List<LibraryEntity> entities = repository.findByName("Center Library");

        //then
        assertNotNull(entities);
    }

    @Test
    @DisplayName("test if library exists by domain type")
    void testLibraryExistsByDomainType(){
        //when
        List<LibraryEntity> entities = repository.findByDomainType(DomainType.PRIVATE);

        //then
        assertNotNull(entities);
    }
}