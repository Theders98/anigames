package com.nica.adapters;

import com.nica.domain.Character;
import com.nica.ports.out.CharacterRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterRepositoryAdapter implements CharacterRepositoryPort {

    @Override
    public List<Character> findAllCharacters() {

        return List.of();
    }

}