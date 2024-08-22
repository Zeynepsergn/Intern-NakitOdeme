package tr.gov.gib.nakitodeme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.gov.gib.nakitodeme.entity.NakitOdeme;
import tr.gov.gib.nakitodeme.repository.NakitRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nakit")
public class NakitServisController {

    @Autowired
    private NakitRepository nakitRepository;

    @GetMapping
    public List<NakitOdeme> getAllNakitOdeme() {
        return nakitRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NakitOdeme> getNakitOdemeById(@PathVariable String id) {
        Optional<NakitOdeme> nakitOdeme = nakitRepository.findById(id);
        return nakitOdeme.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public NakitOdeme createNakitOdeme(@RequestBody NakitOdeme nakitOdeme) {
        return nakitRepository.save(nakitOdeme);
    }

    @PutMapping("/{id}")
    public ResponseEntity<NakitOdeme> updateNakitOdeme(@PathVariable String id, @RequestBody NakitOdeme nakitOdeme) {
        if (!nakitRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        nakitOdeme.setOid(id);
        NakitOdeme updatedNakitOdeme = nakitRepository.save(nakitOdeme);
        return ResponseEntity.ok(updatedNakitOdeme);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNakitOdeme(@PathVariable String id) {
        if (!nakitRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        nakitRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}