package tr.gov.gib.nakitodeme.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.gov.gib.gibcore.object.request.GibRequest;
import tr.gov.gib.gibcore.object.response.GibResponse;
import tr.gov.gib.nakitodeme.object.request.NakitRequest;
import tr.gov.gib.nakitodeme.object.response.NakitResponse;
import tr.gov.gib.nakitodeme.service.NakitOdemeService;

@RestController
@RequestMapping("/api/nakit-odeme")
public class NakitOdemeController {

    private final NakitOdemeService nakitOdemeService;

    public NakitOdemeController(NakitOdemeService nakitOdemeService) {
        this.nakitOdemeService = nakitOdemeService;
    }

    @PostMapping("/odeme-al")
    public ResponseEntity<GibResponse<NakitResponse>> handlePayment(@RequestBody GibRequest<NakitRequest> request) {
        GibResponse<NakitResponse> gibResponse = nakitOdemeService.handlePayment(request);
        return new ResponseEntity<>(gibResponse, HttpStatus.OK);
    }

}