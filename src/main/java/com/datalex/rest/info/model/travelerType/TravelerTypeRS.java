
package com.datalex.rest.info.model.travelerType;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class TravelerTypeRS {

    @Expose
    private List<Object> error;
    @Expose
    private Expiration expiration;
    @Expose
    private String languageCode;
    @Expose
    private String pos;
    @Expose
    private Types types;
    @Expose
    private String userSessionId;
    @Expose
    private List<Warning> warning;

    public List<Object> getError() {
        return error;
    }

    public void setError(List<Object> error) {
        this.error = error;
    }

    public Expiration getExpiration() {
        return expiration;
    }

    public void setExpiration(Expiration expiration) {
        this.expiration = expiration;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    public String getUserSessionId() {
        return userSessionId;
    }

    public void setUserSessionId(String userSessionId) {
        this.userSessionId = userSessionId;
    }

    public List<Warning> getWarning() {
        return warning;
    }

    public void setWarning(List<Warning> warning) {
        this.warning = warning;
    }

}
