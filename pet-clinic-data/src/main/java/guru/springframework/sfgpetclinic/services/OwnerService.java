package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByID(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();

}
