package com.nica.adapters;

import com.nica.api.CharactersApi;
import com.nica.mappers.CharacterDTOMapper;
import com.nica.model.CharacterItem;
import com.nica.ports.in.CharacterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@Slf4j
public class CharacterControllerAdapter extends CharactersApi {

    private final CharacterDTOMapper characterDTOMapper;
    private final CharacterService characterService;

    public CharacterControllerAdapter(CharacterDTOMapper characterDTOMapper, CharacterService characterService) {
        this.characterDTOMapper = characterDTOMapper;
        this.characterService = characterService;
    }

    @Override
    public List<CharacterItem> findAllCharacters() {

        var characters = characterService.findAllCharacters();
        return characterDTOMapper.fromList(characters);
    }

}
