package tr.gov.gib.nakitodeme.service;

import tr.gov.gib.nakitodeme.object.response.NakitResponse;

public interface NakitService {
    NakitResponse getNakitResponseById(String id);
    NakitResponse saveNakitResponse(NakitResponse nakitResponse);
    void deleteNakitResponseById(String id);
}