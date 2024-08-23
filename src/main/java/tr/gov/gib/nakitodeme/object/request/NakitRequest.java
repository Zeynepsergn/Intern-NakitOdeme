package tr.gov.gib.nakitodeme.object.request;

import tr.gov.gib.nakitodeme.entity.Durum;

import java.util.Date;

public class NakitRequest {
    private String oid;
    private Integer odemeId;
    private Date optime;
    private Durum durum;

    // Getters
    public String getOid() {
        return oid;
    }

    public Integer getOdemeId() {
        return odemeId;
    }

    public Date getOptime() {
        return optime;
    }

    public Durum getDurum() {
        return durum;
    }
}