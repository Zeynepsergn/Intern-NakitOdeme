package tr.gov.gib.nakitodeme.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "nakit_odeme", schema = "gsths")
public class NakitOdeme {
    @Id
    @Size(max = 20)
    @SequenceGenerator(name = "nakit_odeme_id_gen", sequenceName = "odeme_odeme_id_seq", allocationSize = 1)
    @Column(name = "oid", nullable = false, length = 20)
    private String oid;

    @Column(name = "odeme_id")
    private Integer odemeId;

    @Column(name = "optime")
    private Date optime;

    @Column(name = "durum")
    private Short durum;

}