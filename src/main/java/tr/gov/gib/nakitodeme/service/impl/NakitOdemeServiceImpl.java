package tr.gov.gib.nakitodeme.service.impl;

import org.springframework.stereotype.Service;
import tr.gov.gib.gibcore.object.enums.FposSposNakitDurum;
import tr.gov.gib.gibcore.object.request.GibRequest;
import tr.gov.gib.gibcore.object.response.GibResponse;
import tr.gov.gib.gibcore.util.ServiceMessage;
import tr.gov.gib.nakitodeme.entity.NakitOdeme;
import tr.gov.gib.nakitodeme.object.request.NakitRequest;
import tr.gov.gib.nakitodeme.object.response.NakitResponse;
import tr.gov.gib.nakitodeme.repository.NakitRepository;
import tr.gov.gib.nakitodeme.service.NakitOdemeService;

import java.util.Date;
@Service
public class NakitOdemeServiceImpl implements NakitOdemeService {

    private final NakitRepository nakitRepository;

    public NakitOdemeServiceImpl(NakitRepository nakitRepository) {
        this.nakitRepository = nakitRepository;
    }

    @Override
    public GibResponse  handlePayment(GibRequest<NakitRequest> request) {

        //payment process
         NakitRequest nakitRequest = request.getData();
        System.out.println("odemeRequest: " + nakitRequest);
        NakitResponse response = new NakitResponse();
        response.setOid(nakitRequest.getOid());
        response.setOdemeOid(nakitRequest.getOdemeOid());
        response.setDurum(FposSposNakitDurum.BASARILI_ODEME.getSposFposNakitDurumKodu());

        // saveToDatabase
        NakitOdeme nakitOdeme = new NakitOdeme();
        nakitOdeme.setOid(nakitRequest.getOid());
        nakitOdeme.setOdemeId(nakitRequest.getOdemeOid());
        nakitOdeme.setOptime(new Date());
        nakitOdeme.setDurum(FposSposNakitDurum.BASARILI_ODEME.getSposFposNakitDurumKodu());
        nakitRepository.save(nakitOdeme);

        return GibResponse.builder().service(ServiceMessage.OK).data(response).build();
    }
}