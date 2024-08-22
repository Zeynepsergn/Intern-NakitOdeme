package tr.gov.gib.nakitodeme.object.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class NakitResponse {
    private String oid;
    private Integer odemeId;
    private Date optime;
    private Short durum;

}