package com.nica.ports.out;

import com.nica.domain.Character;

import java.util.List;

public interface CharacterRepositoryPort {
    List<Character> findAllCharacters();

}
