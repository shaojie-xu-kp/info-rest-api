
package com.datalex.rest.info.model.travelerType;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Type {

    @Expose
    private String agePromt;
    @Expose
    private AgeRange ageRange;
    @Expose
    private String code;
    @Expose
    private List<Description> description;
    @Expose
    private GroupRef groupRef;
    @Expose
    private String id;
    @Expose
    private Boolean qualified;
    @Expose
    private Quantity quantity;
    @Expose
    private String uri;

    public String getAgePromt() {
        return agePromt;
    }

    public void setAgePromt(String agePromt) {
        this.agePromt = agePromt;
    }

    public AgeRange getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(AgeRange ageRange) {
        this.ageRange = ageRange;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Description> getDescription() {
        return description;
    }

    public void setDescription(List<Description> description) {
        this.description = description;
    }

    public GroupRef getGroupRef() {
        return groupRef;
    }

    public void setGroupRef(GroupRef groupRef) {
        this.groupRef = groupRef;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getQualified() {
        return qualified;
    }

    public void setQualified(Boolean qualified) {
        this.qualified = qualified;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

}
