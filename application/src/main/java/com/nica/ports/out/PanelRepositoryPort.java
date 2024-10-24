package com.nica.ports.out;

import com.nica.domain.Panel;

import java.util.Optional;

//Coge el valor de la base de datos
public interface PanelRepositoryPort {
    Optional<Panel> findById(Long id);

}
