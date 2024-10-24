package com.nica.services;

import com.nica.domain.Panel;
import com.nica.exceptions.ObjectNotFoundException;
import com.nica.ports.in.PanelService;
import com.nica.ports.out.PanelRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PanelServiceUseCase implements PanelService {

    private final PanelRepositoryPort panelRepositoryPort;

    @Override
    public Panel findById(Long id) {
        return panelRepositoryPort.findById(id).orElseThrow(() -> new ObjectNotFoundException("Panel not found"));
    }
}
