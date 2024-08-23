package tr.gov.gib.nakitodeme.object.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class NakitRequest implements Serializable {

    private String oid;
    private Integer odemeOid;
    private BigDecimal odenecekMiktar;
}