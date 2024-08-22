package tr.gov.gib.nakitodeme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.gov.gib.nakitodeme.entity.NakitOdeme;

public interface NakitRepository extends JpaRepository<NakitOdeme, String> {
}