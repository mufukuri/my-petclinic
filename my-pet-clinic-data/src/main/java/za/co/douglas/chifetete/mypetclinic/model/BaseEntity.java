package za.co.douglas.chifetete.mypetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
}
