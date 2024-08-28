package tr.gov.gib.nakitodeme.service;

import org.springframework.stereotype.Service;
import tr.gov.gib.gibcore.object.request.GibRequest;
import tr.gov.gib.gibcore.object.response.GibResponse;
import tr.gov.gib.nakitodeme.object.request.NakitRequest;
import tr.gov.gib.nakitodeme.object.response.NakitResponse;

@Service
public interface NakitOdemeService {
    GibResponse<NakitResponse> handlePayment(GibRequest<NakitRequest> request);
}