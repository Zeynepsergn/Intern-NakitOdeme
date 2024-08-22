package tr.gov.gib.nakitodeme.object.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class NakitRequest {
    private String oid;
    private Integer odemeId;
    private Date optime;
    private Short durum;
}