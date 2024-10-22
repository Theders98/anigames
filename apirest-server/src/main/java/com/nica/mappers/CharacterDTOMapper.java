package com.nica.mappers;

import com.nica.domain.Character;
import com.nica.model.CharacterItem;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class CharacterDTOMapper {

    public abstract CharacterItem from(Character character);
    public abstract List<CharacterItem> fromList(List<Character> characters);
}
