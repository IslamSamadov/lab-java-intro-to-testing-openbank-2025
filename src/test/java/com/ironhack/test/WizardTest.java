package com.ironhack.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class WizardTest {
    @Mock
    private SpellLibrary spellLibrary;

    @Test
    public void castRandomSpellCallsLibrary(){
        Wizard wizard = new Wizard(60,30,1,"Lightning",spellLibrary);

        when(spellLibrary.getRandomSpell()).thenReturn("Fireball");

        String result = wizard.castRandomSpell();
        assertEquals("Casting Fireball",result);
        verify(spellLibrary, times(1)).getRandomSpell();
    }
}
