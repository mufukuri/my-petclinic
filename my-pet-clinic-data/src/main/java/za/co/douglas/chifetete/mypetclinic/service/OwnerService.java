package za.co.douglas.chifetete.mypetclinic.service;

import za.co.douglas.chifetete.mypetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
