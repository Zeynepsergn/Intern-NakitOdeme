package tr.gov.gib.nakitodeme.service.impl;

import org.springframework.stereotype.Service;
import tr.gov.gib.nakitodeme.entity.Durum;
import tr.gov.gib.nakitodeme.entity.NakitOdeme;
import tr.gov.gib.nakitodeme.object.request.NakitRequest;
import tr.gov.gib.nakitodeme.object.response.NakitResponse;
import tr.gov.gib.nakitodeme.repository.NakitRepository;
import tr.gov.gib.nakitodeme.service.NakitOdemeService;

@Service
public class NakitOdemeServiceImpl implements NakitOdemeService {

    private final NakitRepository nakitRepository;

    public NakitOdemeServiceImpl(NakitRepository nakitRepository) {
        this.nakitRepository = nakitRepository;
    }

    @Override
    public NakitResponse handlePayment(NakitRequest request) {
        NakitOdeme nakitOdeme = new NakitOdeme();
        nakitOdeme.setOid(request.getOid());
        nakitOdeme.setOdemeId(request.getOdemeId());
        nakitOdeme.setOptime(request.getOptime());
        nakitOdeme.setDurum(Durum.valueOf(request.getDurum().name()));

        nakitOdeme = nakitRepository.save(nakitOdeme);

        NakitResponse response = new NakitResponse();
        response.setOid(nakitOdeme.getOid());
        response.setOdemeId(nakitOdeme.getOdemeId());
        response.setOptime(nakitOdeme.getOptime());
        response.setDurum(nakitOdeme.getDurum());

        return response;
    }
}