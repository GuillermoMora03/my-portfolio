package com.porfolio.my_portfolio_backend.service;


import com.porfolio.my_portfolio_backend.model.Skill;
import com.porfolio.my_portfolio_backend.repository.ISkillRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SkillServiceImplTest {

    @Mock
    private ISkillRepository skillRepository;

    @InjectMocks
    private SkillServiceImpl skillService;

    @Test
    void testFindAllReturnsListOfSkills() {
        //Arrange
        List<Skill> mockSkills = Arrays.asList(new Skill(), new Skill());
        when(skillRepository.findAll()).thenReturn(mockSkills);

        //Act
        List<Skill> skills = skillService.findAll();

        //Assert
        assertNotNull(skills);
        assertEquals(2, skills.size());
        verify(skillRepository, times(1)).findAll();
    }

    // Con me método findById se le debe pasar un Optional en el .thenReturn
    @Test
    void testFindByIdReturnsSkillWhenFound() {
        Long id = 1L;
        Skill skillMock = new Skill();
        when( skillRepository.findById(id)).thenReturn(Optional.of(skillMock));

        Optional<Skill> skillOptional = skillService.findById(id);

        assertTrue(skillOptional.isPresent());
        assertEquals(skillMock, skillOptional.get());
        verify(skillRepository, times(1)).findById(id);
    }
}
