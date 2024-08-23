package tr.gov.gib.nakitodeme.object.response;

import tr.gov.gib.nakitodeme.entity.Durum;

import java.util.Date;

public class NakitResponse {
    private String oid;
    private Integer odemeId;
    private Date optime;
    private Durum durum;

    // Getters and Setters
    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Integer getOdemeId() {
        return odemeId;
    }

    public void setOdemeId(Integer odemeId) {
        this.odemeId = odemeId;
    }

    public Date getOptime() {
        return optime;
    }

    public void setOptime(Date optime) {
        this.optime = optime;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }
}