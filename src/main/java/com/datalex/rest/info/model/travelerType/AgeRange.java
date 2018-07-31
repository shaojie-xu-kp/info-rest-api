
package com.datalex.rest.info.model.travelerType;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AgeRange {

    @SerializedName("default")
    private Long defaultAge;

    @Expose
    private Long from;

    @Expose
    private Long to;

    public Long getDefaultAge() {
        return defaultAge;
    }

    public void setDefaultAge(Long defaultAge) {
        this.defaultAge = defaultAge;
    }

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

}
