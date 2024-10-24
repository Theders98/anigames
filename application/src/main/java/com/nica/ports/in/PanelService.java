package com.nica.ports.in;

import com.nica.domain.Panel;

//EL contrato
public interface PanelService {
    Panel findById(Long id);
}
