package tr.gov.gib.nakitodeme.object.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class NakitResponse  implements Serializable {
    private String oid;
    private Integer odemeId;
    private Short durum;
}