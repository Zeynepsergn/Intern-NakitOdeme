package tr.gov.gib.nakitodeme.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "nakit_odeme", schema = "gsths")
public class NakitOdeme {
    @Id
    @Size(max = 10)
    @Column(name = "oid", nullable = false, length = 10)
    private String oid;

    @Column(name = "odeme_id")
    private Integer odemeId;

    @Column(name = "optime")
    private Date optime;

    @Column(name = "durum")
    private Short durum;

}