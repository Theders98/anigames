package com.nica.services;

import com.nica.domain.Character;
import com.nica.ports.in.CharacterService;
import com.nica.ports.out.CharacterRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CharacterServiceUseCase implements CharacterService {

    private final CharacterRepositoryPort characterRepositoryPort;

    @Override
    public List<Character> findAllCharacters() {
        return characterRepositoryPort.findAllCharacters();
    }
}
