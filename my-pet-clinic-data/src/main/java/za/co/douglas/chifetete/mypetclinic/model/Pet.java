package za.co.douglas.chifetete.mypetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private PetType pettype;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPettype() {
        return pettype;
    }

    public void setPettype(final PetType pettype) {
        this.pettype = pettype;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(final Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(final LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
