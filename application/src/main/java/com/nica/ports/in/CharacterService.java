package com.nica.ports.in;

import com.nica.domain.Character;

import java.util.List;

public interface CharacterService {
    List<Character> findAllCharacters();
}
