package tr.gov.gib.nakitodeme.service;

import tr.gov.gib.nakitodeme.object.request.NakitRequest;
import tr.gov.gib.nakitodeme.object.response.NakitResponse;

public interface NakitOdemeService {
    NakitResponse handlePayment(NakitRequest request);
}